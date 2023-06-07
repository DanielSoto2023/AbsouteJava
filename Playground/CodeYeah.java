import java.util.Scanner;

/**
 * CodeYeah
 */
public class CodeYeah {
    final static double ARTIFICAL_SWEETNER = 0.001;
    public static void main(String[] args) {
// Variables
double mLethalDose;
double mWeight;
double targetWeight;
double dietSodaOK;

// Scanner for input
Scanner keyboard = new Scanner(System.in);

// Prompt user for input
System.out.print("Please enter lethal dose of artificial sweetener for mouse: ");
    mLethalDose = keyboard.nextDouble();
System.out.print("Please enter weight of mouse: ");
    mWeight = keyboard.nextDouble();
System.out.print("Please enter your desired weight: ");
    targetWeight = keyboard.nextDouble();

// Do calculations
dietSodaOK = (mLethalDose/mWeight) * targetWeight/ARTIFICAL_SWEETNER;

// Print results
System.out.println("Allowed liters of diet soda: " + dietSodaOK);

    }
}