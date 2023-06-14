
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PP_12_HateLoveFile {
    public static void main(String[] args) {
       Scanner fileIn = null; //Initializes filein to empty
       try {
        fileIn = new Scanner(
                    new FileInputStream("hateprogramming.txt"));
       } catch (FileNotFoundException e) {
        System.out.println("File Not Found");
        System.exit(0);
       }
       String LineOfTextInput = fileIn.nextLine();
       fileIn.close();
    int PositionOfHate = LineOfTextInput.indexOf("hate",1);
    int LengthOfTextInput = LineOfTextInput.length();
    String LineOfTextInputPreHate = LineOfTextInput.substring(0, PositionOfHate);
    PositionOfHate += 4;
    String LineOfTextInputPostHate = LineOfTextInput.substring(PositionOfHate , LengthOfTextInput);
    String AddedLove = LineOfTextInputPreHate + "love";
    String RepairedLineOfText = AddedLove + LineOfTextInputPostHate;
    System.out.println(RepairedLineOfText);
     /*Output
      I love programming!
     */  
    }


}
