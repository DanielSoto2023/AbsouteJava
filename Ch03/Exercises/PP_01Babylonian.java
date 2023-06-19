package Ch03.Exercises;

import java.util.Scanner;

public class PP_01Babylonian {
  public static void main(String[] args) {
     double guess;
        double r;
        double n;
        int repeatSteps = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Insert a Number to square rootify ");
        n = keyboard.nextDouble();
        repeatSteps = 100;
        guess = n / 2;

        for (int i = 0; i <= repeatSteps; i++) {
            r = n / guess;
            guess = (guess + r) / 2;

        }
        System.out.printf("The square root is: %.2f", guess);

  }   
}
/*output
 * 
Insert a Number to square rootify 
32
The square root is: 5.66
google syas 5.65

 * output 2
 * 
 * Insert a Number to square rootify 
    12357
    The square root is: 111.16
    google says 111.16
 * 
 */