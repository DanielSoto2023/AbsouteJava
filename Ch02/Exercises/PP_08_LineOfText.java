package Ch02.Exercises;

import java.util.Scanner;

public class PP_08_LineOfText {
    public static void main(String[] args) {
        Scanner keyboard  = new Scanner(System.in);

        System.out.println("Please input a string of text");
        String stringOfText = keyboard.nextLine();
        stringOfText = stringOfText.toUpperCase();
        System.out.println("The string fully uppercase");
        System.out.println(stringOfText);
        stringOfText = stringOfText.toLowerCase();
        System.out.println("The string fully lowercase");
        System.out.println(stringOfText);

        
    }
}
