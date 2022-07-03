package lesson4;

/*
Написать частотный словарь - посчитать сколько раз каждое слово
встречается в предложении и вывести результат в консоль.
 */

import java.util.Scanner;

public class FrequencyDictionary {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter text.");
        String phrase = console.nextLine();
        phrase = phrase.toLowerCase();

        String[] arraySize;
        String spase = " ";
        arraySize = phrase.split(spase);
        for (int i = 0; i < arraySize.length; i++) {
            int counter = 1;
            for (int j = i + 1; j < arraySize.length; j++) {
                if (arraySize[i].equals(arraySize[j])) {
                    counter++;
                    arraySize[j] = "";
                }

            }
            if (!arraySize[i].equals("")) {
                System.out.println(arraySize[i] + " - quantity " + counter);

            }

        }

    }

}


//        int arraySize = 0;
//
//        for (int i = 0; i < phrase.length(); i++) {
//            if (!Character.isLetter(phrase.charAt(i))){
//                arraySize++;
//            }
//        }
//        String[] array = new String[arraySize];
//
//        for (int i = 0; i < array.length; i++) {
//            String result = "";
//
//            for (int j = 0; j < phrase.length(); j++) {
//
//                result += phrase.charAt(j);
//            }
//
//            array[i] = result;
//            System.out.println(array[i]);
//        }
//.substring(?)