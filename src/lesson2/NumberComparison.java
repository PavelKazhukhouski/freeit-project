package lesson2;

/*
 * Написать программу, результатом работы которой будет
 * вывод результата сравнения двух введенных чисел.
 */

import java.util.Scanner;


public class NumberComparison {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Enter nember a");
        int a = terminal.nextInt();
        System.out.println("Enter number b");
        int b = terminal.nextInt();


        if (a < b) {
            System.out.println("a < b");
        } else if (a > b) {
            System.out.println("a > b");

        } else {
            System.out.println("a = b");
        }
    }
}
