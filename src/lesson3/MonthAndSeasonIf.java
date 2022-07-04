package lesson3;

/*
 * Написать программу, в которой в консоль будет выводится название месяца
 * и сезон, к которму этот месяц относится (написать с помощью if).
 */

import java.util.Scanner;

public class MonthAndSeasonIf {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("Enter month number");
        int monthNumber = console.nextInt();

        if (monthNumber == 1) {
            System.out.println("January winter month");
        } else if (monthNumber == 2) {
            System.out.println("February winter month");
        } else if (monthNumber == 3) {
            System.out.println("March spring month");
        } else if (monthNumber == 4) {
            System.out.println("April spring month");
        } else if (monthNumber == 5) {
            System.out.println("May spring month");
        } else if (monthNumber == 6) {
            System.out.println("June summer month");
        } else if (monthNumber == 7) {
            System.out.println("July summer month");
        } else if (monthNumber == 8) {
            System.out.println("August summer month");
        } else if (monthNumber == 9) {
            System.out.println("September autumn month");
        } else if (monthNumber == 10) {
            System.out.println("October autumn month");
        } else if (monthNumber == 11) {
            System.out.println("November autumn month");
        } else if (monthNumber == 12) {
            System.out.println("December a winter month");
        } else {
            System.out.println("number entered incorrectly");
        }


    }

}
