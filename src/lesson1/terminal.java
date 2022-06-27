package lesson1;

/*
 * Написать и скомпилировать в терминале/командной строке программу выполняющую
 * вывод приветственного сообщения вида: "Привет, {введенное имя}!"
 */

import java.util.Scanner;

public class terminal {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        String name = terminal.nextLine();
        System.out.println("Hello " + name);
    }
}
