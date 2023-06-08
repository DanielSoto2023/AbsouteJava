package Ch02.Exercises;

import java.util.Scanner;

public class PP_09_HateAndLove2 {
    public static void main(String[] args) {
        Scanner keyboard  = new Scanner(System.in);
        System.out.println("Enter a line of text containing the word \"hate\"");
        String LineOfTextInput = keyboard.nextLine();
        int PositionOfHate = LineOfTextInput.indexOf("hate",1);
        int LengthOfTextInput = LineOfTextInput.length();
        String LineOfTextInputPreHate = LineOfTextInput.substring(0, PositionOfHate);
        PositionOfHate += 4;
        String LineOfTextInputPostHate = LineOfTextInput.substring(PositionOfHate , LengthOfTextInput);
        String AddedLove = LineOfTextInputPreHate + "love";
        String RepairedLineOfText = AddedLove + LineOfTextInputPostHate;
        System.out.println(RepairedLineOfText);
    }
}
