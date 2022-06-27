package lesson3;

 // Написать 5 способов создания/получения строки.


public class creatingString {
    public static void main(String[] args) {
        String str1 = "String";
        String str2 = new String("String");
        String str3 = new String(new char[] {'s', 't', 'r', 'i', 'n', 'g'});
        String str4 = str2 + str3;
        int variable = 5;
        String str5 = Integer.toString(variable);
    }
}
