package lesson3;

// Написать программу, в которой в консоль будет выводится название месяца и сезон,
// к которму этот месяц относится (написать с помощью switch).

import java.util.Scanner;

public class monthAndSeasonSwitch {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter month number");
        int monthNumber = console.nextInt();

        switch (monthNumber) {
            case 1 -> System.out.println("January winter month");
            case 2 -> System.out.println("February winter month");
            case 3 -> System.out.println("March spring month");
            case 4 -> System.out.println("April spring month");
            case 5 -> System.out.println("May spring month");
            case 6 -> System.out.println("June summer month");
            case 7 -> System.out.println("July summer month");
            case 8 -> System.out.println("August summer month");
            case 9 -> System.out.println("September autumn month");
            case 10 -> System.out.println("October autumn month");
            case 11 -> System.out.println("November autumn month");
            case 12 -> System.out.println("December winter month");
            default -> System.out.println("number entered incorrectly");
        }
    }
}
