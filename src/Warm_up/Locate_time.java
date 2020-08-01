package Warm_up;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class Locate_time {
    public static void main(String[] args) {
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("EEEE, hh:mm a, MMM/dd/yyyy");
        LocalDateTime today=LocalDateTime.now();
        System.out.println(today);
        System.out.println(today.format(dtf));
        int[] array={4,6,24,675,35};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

    }
}
