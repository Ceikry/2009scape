package org.rs09.client.net

import org.runite.jagex.Class3_Sub13_Sub34
import java.io.InputStream

class DummyInputStream : InputStream() {
    override fun read(): Int {
        Class3_Sub13_Sub34.sleep(30000L)
        return -1
    }
}