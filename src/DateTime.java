// Before we use data and time, we need to import datetime class since java does not have it as its built-in

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class DateTime {
    public static void main(String[] args) {
        LocalDateTime obj=LocalDateTime.now();// use now method to get local date and time.
        DateTimeFormatter DTF=DateTimeFormatter.ofPattern("EEEE,MM-dd-yyyy, hh:mm:ss,a");// use of pattern method to get customized format of representing of date and time.
        System.out.println("This is the date and time without using DateTime formatter: "+obj.plusHours(2));
        System.out.println("This is the date and time using DateTime formatter: "+obj.format(DTF));
        System.out.println("This is the date and time using DateTime formatter: "+obj.plusHours(2).format(DTF));
        System.out.println("This is the date and time using DateTime formatter: "+obj.getDayOfMonth());

    }
}
