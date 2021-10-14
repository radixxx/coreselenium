package utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateTimeUtils {

    public static String dateFormatUltimate = "yyyy-MM-dd'T'00:00:00.000+0000";
    public static String dateFormatUltimateExpire = "yyyy-MM-dd'T'23:59:59.000+0000";
    public static String dateFormatSimple = "yyyy-MM-dd";
    public static String dateFormatDay = "d";

    public static String getCurrentDate(String addDateFormat) {
        SimpleDateFormat formatter = new SimpleDateFormat(addDateFormat);
        Calendar cal = Calendar.getInstance();
        String currentDate = formatter.format(cal.getTime());

        return currentDate;
    }

    public static String getDateWithShift(String addDateFormat, int daysToShift) {
        SimpleDateFormat formatter = new SimpleDateFormat(addDateFormat);
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_MONTH, daysToShift);
        String currentDate = formatter.format(cal.getTime());

        return currentDate;
    }

    public static String getExpiredDate(String addDateFormat, int daysAmount) {
        SimpleDateFormat formatter = new SimpleDateFormat(addDateFormat);
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_MONTH, daysAmount);
        String expiredDate = formatter.format(cal.getTime());

        return expiredDate;
    }

    public static String getExpiredDateWithCalendarType(String addDateFormat, int calendarType, int duration) {
        SimpleDateFormat formatter = new SimpleDateFormat(addDateFormat);
        Calendar cal = Calendar.getInstance();
        cal.add(calendarType, duration);
        String expiredDate = formatter.format(cal.getTime());
        return expiredDate;
    }

    public static String getExpiredDateWithShift(String addDateFormat, int daysToShift, int daysAmount) {
        SimpleDateFormat formatter = new SimpleDateFormat(addDateFormat);
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_MONTH, daysToShift + daysAmount);
        String expiredDate = formatter.format(cal.getTime());

        return expiredDate;
    }

}
