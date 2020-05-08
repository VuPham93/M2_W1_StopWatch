import java.text.SimpleDateFormat;
import java.util.Date;

public class StopWatch {
    private static long startTime, endTime;

    public static String getStartTime() {
        return (new SimpleDateFormat("hh:mm:ss:SSS")).format(new Date(startTime));
    }

    public static String getEndTime() {
        return (new SimpleDateFormat("hh:mm:ss:SSS")).format(new Date(endTime));
    }

    public static void start() {
        startTime = System.currentTimeMillis();
    }

    public static void end() {
        endTime = System.currentTimeMillis();
    }

    public static String getElapsedTime() {
        return (new SimpleDateFormat("mm:ss:SSS")).format(new Date(endTime - startTime));
    }
}
