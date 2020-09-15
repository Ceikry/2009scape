package org.rs09.client.net

import org.runite.jagex.TimeUtils
import java.io.InputStream

class DummyInputStream : InputStream() {
    override fun read(): Int {
        TimeUtils.sleep(30000L)
        return -1
    }
}