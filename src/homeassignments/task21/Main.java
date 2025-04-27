package homeassignments.task21;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        System.out.println(localDateToString());
        System.out.println(localDateTimeToString());

        String str1 = "2023-03-19 : 10:12:24 AM";
        System.out.println(stringToLocalDateTime1(str1));

        String str2 = "пн 20.03.23 г. время: 15:07:28";
        System.out.println(stringToLocalDateTime2(str2));

        System.out.println(localDateTimeToStringAdv());
    }

    public static String localDateToString() {
        LocalDate date = LocalDate.now();
        String formattedDate = date.format(DateTimeFormatter.ofPattern("dd MMMM yyyy"));
        return formattedDate;
    }

    public static String localDateTimeToString() {
        LocalDateTime dateTime = LocalDateTime.now();
        String formattedDateTime = dateTime.format(DateTimeFormatter.ofPattern("dd MMMM yyyy, HH:mm:ss a"));
        return formattedDateTime;
    }

    public static LocalDateTime stringToLocalDateTime1(String str) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd : HH:mm:ss a");
        LocalDateTime dateTime = LocalDateTime.parse(str, formatter);
        return dateTime;
    }

    public static LocalDateTime stringToLocalDateTime2(String str) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("пн dd.MM.yy г. время: HH:mm:ss");
        LocalDateTime dateTime = LocalDateTime.parse(str, formatter);
        return dateTime;
    }

    public static String localDateTimeToStringAdv() {
        LocalDateTime dateTime = LocalDateTime.now();
        String formattedDateTime = dateTime.format(DateTimeFormatter.ofPattern("EEEE dd MMMM yyyy время: HH.mm.ss a"));
        return formattedDateTime;
    }
}