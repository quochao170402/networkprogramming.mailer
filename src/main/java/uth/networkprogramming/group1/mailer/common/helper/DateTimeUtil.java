package uth.networkprogramming.group1.mailer.common.helper;

import lombok.experimental.UtilityClass;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@UtilityClass
public class DateTimeUtil {
    public static final String DATETIME_FORMAT = "dd-MM-yyyy HH:mm:ss";
    public static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern(DATETIME_FORMAT);
    public static String now() {
        return LocalDateTime.now().format(DATE_TIME_FORMATTER);
    }
}