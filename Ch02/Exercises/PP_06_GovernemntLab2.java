package Ch02.Exercises;

import java.util.Scanner;

public class PP_06_GovernemntLab2 {
 public static void main(String[] args) {
    double SweetenerToKillPerKgInGrams = 1;
        double SweetenerInSoda = 0.001;
        double TargetedWieghtOfDieterKg = 10;
        Scanner keyboard  = new Scanner(System.in);
        
        System.out.println("Please print the weight of the mouse");
        double MouseWeight = keyboard.nextDouble();
        System.out.println("Please print the amount of sweetener to kill the mouse");
        double SweetenerToKillMouse = keyboard.nextDouble();
        System.out.println("Please print your desired weight");
        TargetedWieghtOfDieterKg = keyboard.nextDouble();
        double WeightToSweetener = SweetenerToKillMouse/MouseWeight;
        double SweetenertoKillPerson = TargetedWieghtOfDieterKg / SweetenerInSoda;



        double HowManyCans = (WeightToSweetener * SweetenertoKillPerson);
        System.out.println("The amount of soda cans your friend can drink is: " + HowManyCans);
 }   
}
