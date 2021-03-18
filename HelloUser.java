package WelcomeUSer;
/*
 * -------------------------
 * Welcome user: HelloUSer
 * Type: Console App
 * Written by: sofoste
 * -------------------------
 */

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import static java.lang.Thread.sleep;

public class HelloUser {

    static String username;
    static String message = "Welcome into JavaWorld!";
    static LocalDate localDate;
    static LocalTime localTime;
    static DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    static DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
    static DateTimeFormatter getTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("\n------------------------------------------------------");
        System.out.println("\t\tHello User! "+message.toUpperCase());
        System.out.println("------------------------------------------------------\n");
        System.out.print("Enter your name: ");
        username = input.nextLine();
        System.out.println("\n");
        //set a timer
        int x = 93, y = 100;
        System.out.print("processing.");
        for (int i = x; i <= y ; i++) {
            //x = x + i;
            System.out.print(".."+ i +"%");
            try {
                sleep(750);
            } catch (InterruptedException e) {
                System.out.println("Program Interrupted! :(");
            }
        }
        System.out.println("\n");


        //set date & time
        localDate = LocalDate.now();
        localTime = LocalTime.now();

        System.out.println("------------------------------------------------------");
        System.out.println("Hello "+username+",\n");
        System.out.println("User: "+username.toUpperCase()+"\nDate: "+ localDate.format(dateFormat) +
                "\nTime: " + localTime.format(timeFormatter));
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println();

        System.out.println("Thanks for using the program\n" +
                "Date & Time: "+localDateTime.format(getTimeFormatter));
        System.out.println("------------------------------------------------------\n");

    }
}
