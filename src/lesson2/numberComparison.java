package lesson2;

/*
 * Написать программу, результатом работы которой будет
 * вывод результата сравнения двух введенных чисел.
 */

import java.util.Scanner;


public class numberComparison {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Enter nember a");
        String a = terminal.nextLine();
        System.out.println("Enter number b");
        String b = terminal.nextLine();

        int x = Integer.parseInt(a);
        int y = Integer.parseInt(b);

        if (x < y) {
            System.out.println("a < b");
        } else if (x > y) {
            System.out.println("a > b");

        } else {
            System.out.println("a = b");
        }
    }
}
