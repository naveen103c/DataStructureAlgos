package Java8;

import java.time.*;

//How will you get the current date and time using Java 8 Date and Time API
public class CurrentDateTime {
    public static void main(String[] args) {
        System.out.println("Current Time is :" +LocalTime.now());
        System.out.println("Current Date is :" +LocalDate.now());
        System.out.println("Current Date and Time is :" +LocalDateTime.now());
    }
}
