package lesson3;

/*
 * Написать программу, которая приветствует
 * пользователя в зависимости от его пола и возраста
 * (имя, пол и возраст задаются при старте программы).
 */

import java.util.Scanner;

public class genderAndAge {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Enter your gender: male/female");
        String gender = console.nextLine();

        System.out.println("Enter your age");
        int age = console.nextInt();

        if (gender.equals("female") && age < 20){
            System.out.println("Hello girl");

        } else if (gender.equals("female") && age > 20){
            System.out.println("Hello Ms.");

        } else if (gender.equals("male") && age < 20) {
            System.out.println("Hello boy");
        }else if (gender.equals("male") && age > 20) {
            System.out.println("Hello Mister");
        }
    }
}
