package org.runite.jagex;

import org.rs09.client.net.DummyInputStream;
import org.rs09.client.net.DummyOutputStream;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

final class IOHandler implements Runnable {

    private int anInt1230 = 0;
    private OutputStream outputStream;
    private InputStream inputStream;
    private byte[] outBuffer;
    private final Socket socket;
    private int anInt1236 = 0;
    private Class64 aClass64_1237;
    private final Signlink signlink;
    private boolean closed = false;
    private boolean aBoolean1243 = false;

    public final void run() {
        while (true) {
            try {
                label88:
                {
                    int var1;
                    int var2;
                    synchronized (this) {
                        if (this.anInt1230 == this.anInt1236) {
                            if (this.closed) {
                                break label88;
                            }

                            try {
                                this.wait();
                            } catch (InterruptedException var9) {
                            }
                        }

                        var2 = this.anInt1236;
                        if (this.anInt1230 < this.anInt1236) {
                            var1 = -this.anInt1236 + 5000;
                        } else {
                            var1 = this.anInt1230 - this.anInt1236;
                        }
                    }

                    if (0 >= var1) {
                        continue;
                    }

                    try {
                        this.outputStream.write(this.outBuffer, var2, var1);
                    } catch (IOException var8) {
                        this.aBoolean1243 = true;
                    }

                    this.anInt1236 = (var1 + this.anInt1236) % 5000;

                    try {
                        if (this.anInt1236 == this.anInt1230) {
                            this.outputStream.flush();
                        }
                    } catch (IOException var7) {
                        this.aBoolean1243 = true;
                    }
                    continue;
                }

                try {
                    if (null != this.inputStream) {
                        this.inputStream.close();
                    }

                    if (null != this.outputStream) {
                        this.outputStream.close();
                    }

                    if (this.socket != null) {
                        this.socket.close();
                    }
                } catch (IOException var6) {
                    var6.printStackTrace();
                }

                this.outBuffer = null;
            } catch (Exception var11) {
                Class49.method1125((String) null, var11, (byte) 103);
            }

            return;
        }
    }

    final void readBytes(byte[] out, int offset, int count) throws IOException {
        if (!this.closed) {
            while (count > 0) {
                int bytesRead = this.inputStream.read(out, offset, count);
                if (bytesRead <= 0) {
                    throw new EOFException();
                }

                offset += bytesRead;
                count -= bytesRead;
            }

        }
    }

    final int readByte() throws IOException {
        return !this.closed ? this.inputStream.read() : 0;
    }

    final void sendBytes(byte[] bytes, int length) throws IOException {
        if (!this.closed) {
            if (this.aBoolean1243) {
                this.aBoolean1243 = false;
                throw new IOException();
            } else {
                if (this.outBuffer == null) {
                    this.outBuffer = new byte[5000];
                }

                synchronized (this) {
                    for (int i = 0; i < length; ++i) {
                        this.outBuffer[this.anInt1230] = bytes[i];
                        this.anInt1230 = (this.anInt1230 + 1) % 5000;

                        if ((4900 + this.anInt1236) % 5000 == this.anInt1230) {
                            throw new IOException();
                        }
                    }

                    if (this.aClass64_1237 == null) {
                        this.aClass64_1237 = this.signlink.method1451(0, 3, this);
                    }

                    this.notifyAll();
                }
            }
        }
    }

    @Override
    public final void finalize() {
        this.close();
    }

    final int availableBytes() throws IOException {
        return this.closed ? 0 : this.inputStream.available();
    }

    final void method1466() {
        if (!this.closed) {
            if (this.aBoolean1243) {
                this.aBoolean1243 = false;
//               throw new IOException();
                System.err.println("new IOException(roar)");
            }
        }
    }

    final void method1467() {
        if (!this.closed) {
            this.inputStream = new DummyInputStream();
            this.outputStream = new DummyOutputStream();
        }
    }

    final void close() {
        if (!this.closed) {
            synchronized (this) {
                this.closed = true;
                this.notifyAll();
            }

            if (this.aClass64_1237 != null) {
                while (this.aClass64_1237.anInt978 == 0) {
                    Class3_Sub13_Sub34.sleep(1L);
                }

                if (this.aClass64_1237.anInt978 == 1) {
                    try {
                        ((Thread) this.aClass64_1237.anObject974).join();
                    } catch (InterruptedException var4) {
                        var4.printStackTrace();
                    }
                }
            }

            this.aClass64_1237 = null;
        }
    }

    public IOHandler(Socket socket, Signlink signlink) throws IOException {
        this.signlink = signlink;
        this.socket = socket;
        this.socket.setSoTimeout(30000);
        this.socket.setTcpNoDelay(true);
        this.inputStream = socket.getInputStream();
        this.outputStream = socket.getOutputStream();
    }

}
