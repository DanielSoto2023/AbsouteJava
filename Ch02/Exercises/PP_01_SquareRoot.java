package Ch02.Exercises;

import java.util.Scanner;

/**
 * PP_01_SquareRoot
 */
public class PP_01_SquareRoot {
    public static void main(String[] args) {
        double guess;
        double r;
        double n;
        int repeatSteps = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Insert a Number ");
        n = keyboard.nextDouble();
        System.out.println("Enter the amount of loops");
        repeatSteps = keyboard.nextInt();
        guess = n / 2;

        for (int i = 0; i <= repeatSteps; i++) {
            r = n / guess;
            guess = (guess + r) / 2;

        }
        System.out.println("The square root is: " + guess);

    }
    
}