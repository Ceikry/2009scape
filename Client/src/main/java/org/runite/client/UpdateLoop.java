package org.runite.client;

final class UpdateLoop implements Runnable {

    static boolean aBoolean346;
    static Class64 aClass64_351;
    static UpdateLoop aUpdateLoop_2613;
    volatile boolean aBoolean345 = false;
    Signlink aClass87_350;
    volatile Class155[] aClass155Array352 = new Class155[2];
    volatile boolean aBoolean353 = false;

    /*
     *  Ceikry says to call this an "update loop"
     */
    public final void run() {
        try {
            this.aBoolean353 = true;

            try {
                while (!this.aBoolean345) {
                    for (int var1 = 0; var1 < 2; ++var1) {
                        Class155 var2 = this.aClass155Array352[var1];
                        if (var2 != null) {
                            var2.method2153();
                        }
                    }

                    TimeUtils.sleep(10L);
                    GameShell.awtSystemEventQueue(this.aClass87_350, null);
                }
            } catch (Exception var7) {
                ClientErrorException.method1125(null, var7);
            } finally {
                this.aBoolean353 = false;
            }

        } catch (RuntimeException var9) {
            throw ClientErrorException.clientError(var9, "cj.run()");
        }
    }

}
