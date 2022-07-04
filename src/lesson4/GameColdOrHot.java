package lesson4;

import java.util.Scanner;
import java.util.Random;

/*
 * Написать игру в которой нужно угадать случайно выбранную букву (именно букву).При каждом вводе пользователем
 * программа долна говорить "warmly, hot" или "chilly, cold" в зависимости от того, как далеко буква пользователя от загаданной.
 */
public class GameColdOrHot {
    public static void main(String[] args) {

        Random random = new Random();
        int randomLetterIndex = random.nextInt(97, 122 + 1);
        System.out.println(randomLetterIndex);

        Scanner console = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println("Enter a letter");
            int consoleLetterIndex = console.nextLine().charAt(0);

            if (randomLetterIndex == consoleLetterIndex){
                System.out.println("You win!");
                exit = true;
                System.out.println("End Game!");
            } else if (randomLetterIndex - consoleLetterIndex < 4 && randomLetterIndex - consoleLetterIndex > -4) {
                System.out.println("Hot");
            } else if (randomLetterIndex - consoleLetterIndex < 6 && randomLetterIndex - consoleLetterIndex > -6) {
                System.out.println("Warmly");
            } else if (randomLetterIndex - consoleLetterIndex < 8 && randomLetterIndex - consoleLetterIndex > -8) {
                System.out.println("Chilly");
            } else {
                System.out.println("Cold");
            }

        }

    }

}
