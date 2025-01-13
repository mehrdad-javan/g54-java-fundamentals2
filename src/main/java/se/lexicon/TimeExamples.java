package se.lexicon;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeExamples {

    public static void main(String[] args) {

        // LocalDate:  represents a date (year, month, and day) in ISO format (2022-02-25)
        LocalDate currentDate = LocalDate.now(); // Gets the current date.
        System.out.println("currentDate = " + currentDate);

        // LocalTime: represents a time without date (hours, minutes, seconds, and nanoseconds)
        LocalTime currentTime = LocalTime.now();
        System.out.println("currentTime = " + currentTime);

        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("currentDateTime = " + currentDateTime); // 2022-02-25T10:24:07.046749900


        LocalDate specificDate = LocalDate.of(2023,12,25);
        LocalDate birthDate = LocalDate.parse("2022-02-25");
        System.out.println(birthDate.plusDays(1));

        LocalDate lectureDate = LocalDate.parse("2025-01-13");
        System.out.println("ISO Date Format (default) = " + lectureDate);
        // YYYYMMDD
       String basicISO = lectureDate.format(DateTimeFormatter.BASIC_ISO_DATE); // YYYYMMDD
        System.out.println("Basic ISO Format = " + basicISO);

        String custom = lectureDate.format(DateTimeFormatter.ofPattern("eeee dd MMM YYYY"));
        System.out.println("Custom Formatted Date:  = " + custom);
        // refer to the link to know more about pattern: https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
        // Period and Duration

    }

}
