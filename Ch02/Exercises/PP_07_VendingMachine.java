package Ch02.Exercises;

import java.util.Scanner;

public class PP_07_VendingMachine {
    public static void main(String[] args) {
        Scanner keyboard  = new Scanner(System.in);
        System.out.println("Please input price of item in cents from 25 to 100");
        int priceofitem = keyboard.nextInt();
        int Change = 100 - priceofitem;
        int Quarterchange = (int) (Change / 25.0);
        Change = Change - (25 * Quarterchange);
        int DimeChange = Change/ 10;
        Change = Change - (10 * DimeChange);
        int NickelChange = (Change/5);
        System.out.println("Your change is:");
        System.out.println(Quarterchange + " Quarters");
        System.out.println(DimeChange + " Dimes");
        System.out.println(NickelChange + " Nickels");


    }
}
