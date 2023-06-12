package Ch02.Exercises;
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
       String hateInput = fileIn.nextLine();
       System.out.println(hateInput);
       fileIn.close();
       
    }


}
