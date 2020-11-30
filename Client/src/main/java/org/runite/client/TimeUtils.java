package org.runite.client;

import java.util.Calendar;
import java.util.Date;

public final class TimeUtils {

    private static long correction;
    private static long previous;

    public static synchronized long time() {
        long time = System.currentTimeMillis();
        if (time < previous) {
            correction += previous + -time;
        }

        previous = time;
        return correction + time;
    }

    public static void sleep(long millis) {
        if (0L < millis) {
            if (0L == millis % 10L) {
                sleepWrapped(millis + -1L);
                sleepWrapped(1L);
            } else {
                sleepWrapped(millis);
            }
        }
    }

    private static void sleepWrapped(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException var4) {
        }
    }

    static RSString date(long var0) {
        try {
            Class3_Sub28_Sub5.aCalendar3581.setTime(new Date(var0));
            int var3 = Class3_Sub28_Sub5.aCalendar3581.get(Calendar.DAY_OF_WEEK);//Day of the week
            int var4 = Class3_Sub28_Sub5.aCalendar3581.get(Calendar.DATE);
            int var5 = Class3_Sub28_Sub5.aCalendar3581.get(Calendar.MONTH);
            int var6 = Class3_Sub28_Sub5.aCalendar3581.get(Calendar.YEAR);
            int var7 = Class3_Sub28_Sub5.aCalendar3581.get(Calendar.HOUR_OF_DAY);
            int var8 = Class3_Sub28_Sub5.aCalendar3581.get(Calendar.MINUTE);
            int var9 = Class3_Sub28_Sub5.aCalendar3581.get(Calendar.SECOND);
            return RSString.stringCombiner(new RSString[]{TextCore.DaysOfTheWeek[var3 + -1], TextCore.aClass94_3145, RSString.stringAnimator(var4 / 10), RSString.stringAnimator(var4 % 10), TextCore.aClass94_2025, TextCore.MonthsOfTheYear[var5], TextCore.aClass94_2025, RSString.stringAnimator(var6), TextCore.aClass94_465, RSString.stringAnimator(var7 / 10), RSString.stringAnimator(var7 % 10), TextCore.char_colon, RSString.stringAnimator(var8 / 10), RSString.stringAnimator(var8 % 10), TextCore.char_colon, RSString.stringAnimator(var9 / 10), RSString.stringAnimator(var9 % 10), TextCore.timeZone});
        } catch (RuntimeException var10) {
            throw ClientErrorException.clientError(var10, "cj.F(" + var0 + ')');
        }
    }
}
