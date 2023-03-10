import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeUtils
{
    public static String formatFullDateTime(LocalDateTime localDateTime, String pattern)
    {
        return localDateTime.format(formatter(pattern));
    }

    public static String formatTime(LocalTime localTime)
    {
        return localTime.format(formatter("hh:mm a"));
    }

    private static DateTimeFormatter formatter(String pattern)
    {
    return DateTimeFormatter.ofPattern(pattern);
    }
}
