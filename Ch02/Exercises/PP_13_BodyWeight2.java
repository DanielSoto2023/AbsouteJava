import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class PP_13_BodyWeight2 {
    public static void main(String[] args) {
        Scanner fileIn = null;
        try {
            fileIn = new Scanner(
                    new FileInputStream("Weight.txt"));
        } catch (FileNotFoundException e) {
            // TODO: handle exception
            System.out.println("File Not Found");
            System.exit(0);
        }
        String tomAtto, eatonWright, caryOki;
        int tomAttoFeet, eatonWrightFeet, caryOkiFeet, tomAttoInches, eatonWrightInches, caryOkiInches;
        tomAtto = fileIn.nextLine();
        tomAttoFeet = fileIn.nextInt();
        tomAttoInches = fileIn.nextInt();
        fileIn.nextLine();

        eatonWright = fileIn.nextLine();
        eatonWrightFeet = fileIn.nextInt();
        eatonWrightInches= fileIn.nextInt();
        fileIn.nextLine();

        caryOki  = fileIn.nextLine();
        caryOkiFeet = fileIn.nextInt();
        caryOkiInches = fileIn.nextInt();
        fileIn.close();

        tomAttoFeet -= 5;
        eatonWrightFeet  -= 5;
        caryOkiFeet  -= 5;

        tomAttoInches = (tomAttoFeet * 12) + tomAttoInches;
        eatonWrightInches = (eatonWrightFeet * 12) + eatonWrightInches;
        caryOkiInches = (caryOkiFeet * 12) + caryOkiInches;

        int tomAttoWeight = tomAttoInches * 5, eatonWrightWeight = eatonWrightInches * 5, caryOkiWeight = caryOkiInches * 5;

        System.out.println("Tom Atto's ideal weight is: " + tomAttoWeight);
        System.out.println("Eaton Wright's ideal weight is: " + eatonWrightWeight);
        System.out.println("Cari Oki's ideal weight is: " + caryOkiWeight);
    }
    }
    /* Output
     * Tom Atto's ideal weight is: 75
    Eaton Wright's ideal weight is: 25
    Cari Oki's ideal weight is: 55
     */
