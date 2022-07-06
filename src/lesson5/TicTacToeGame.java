package lesson5;

import java.util.Random;
import java.util.Scanner;

public class TicTacToeGame {
    public static void main(String[] args) {
        String[][] playingField = {{"1", "2", "3"},
                                  {"4", "5", "6"},
                                  {"7", "8", "9"}};


        Random computer = new Random();

        Scanner console = new Scanner(System.in);

        String x = "x";
        String o = "o";

        boolean exit = false;

        int i = 0;
        while (!exit) {

            System.out.println(playingField[0][0] + " " + playingField[0][1] + " " + playingField[0][2]);
            System.out.println(playingField[1][0] + " " + playingField[1][1] + " " + playingField[1][2]);
            System.out.println(playingField[2][0] + " " + playingField[2][1] + " " + playingField[2][2]);
            System.out.println("Enter a number from 1 to 9");
            int player = console.nextInt();

            switch (player) {
                case 1 -> playingField[0][0] = x;
                case 2 -> playingField[0][1] = x;
                case 3 -> playingField[0][2] = x;
                case 4 -> playingField[1][0] = x;
                case 5 -> playingField[1][1] = x;
                case 6 -> playingField[1][2] = x;
                case 7 -> playingField[2][0] = x;
                case 8 -> playingField[2][1] = x;
                case 9 -> playingField[2][2] = x;
            }
            i++;
            if (i == 5){
                break;
            }
            boolean computerQueue = false;
             while (!computerQueue){

                int randomX = computer.nextInt(0, playingField.length);
                int randomY = computer.nextInt(0, playingField.length);
                if (!playingField[randomX][randomY].equals(x) && !playingField[randomX][randomY].equals(o)) {
                    playingField[randomX][randomY] = o;
                    computerQueue = true;

                }

             }

             if (playingField[0][0].equals(playingField[0][1]) && playingField[0][1].equals(playingField[0][2]) ||
                    playingField[1][0].equals(playingField[1][1]) && playingField[1][1].equals(playingField[1][2]) ||
                    playingField[2][0].equals(playingField[2][1]) && playingField[2][1].equals(playingField[2][2]) ||

                    playingField[0][0].equals(playingField[1][0]) && playingField[1][0].equals(playingField[2][0]) ||
                    playingField[0][1].equals(playingField[1][1]) && playingField[1][1].equals(playingField[2][1]) ||
                    playingField[0][2].equals(playingField[1][2]) && playingField[1][2].equals(playingField[2][2]) ||

                    playingField[0][0].equals(playingField[1][1]) && playingField[1][1].equals(playingField[2][2]) ||
                    playingField[2][0].equals(playingField[1][1]) && playingField[1][1].equals(playingField[0][2])){

                 exit = true;

             }
        }

        System.out.println(playingField[0][0] + " " + playingField[0][1] + " " + playingField[0][2]);
        System.out.println(playingField[1][0] + " " + playingField[1][1] + " " + playingField[1][2]);
        System.out.println(playingField[2][0] + " " + playingField[2][1] + " " + playingField[2][2]);
        System.out.println("End Game");

    }
}