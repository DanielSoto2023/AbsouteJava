package Ch03;

import java.util.Scanner;

public class Display2IceCreamSwitches {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter number of ice cream flavors:");
        int numberOfFlavors = keyboard.nextInt();

        switch(numberOfFlavors)
        {
            case 32:
            System.out.println("Nice Selection.");
            break;

            case 1:
                System.out.println("I bet it's vanilla.");
            case 2:
            case 3: //in tihs case case 2 activates case 3 and 3 activates 4 because there is no break;
            case 4:
                System.out.println(numberOfFlavors +" flavors");
                System.out.println("is acceptable");
                break;
            default:
                System.out.println("I didn't plan for");
                System.out.println(numberOfFlavors + " flavors.");
                break;

        }
    }  
}
