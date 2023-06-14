
import java.util.Scanner;

public class PP_04_Automobile {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter the distance in miles you will commute");
        double DistanceMiles = keyboard.nextDouble();
        System.out.println("Enter the miles per gallon the car gets");
        double MilesPerGallon = keyboard.nextDouble();
        System.out.println("Enter the price of gas in 0.00");
        double PriceOfGas = keyboard.nextDouble();

        double AmountOfGasGallons = DistanceMiles / MilesPerGallon;
        PriceOfGas = PriceOfGas * AmountOfGasGallons;
        System.out.println(PriceOfGas);

        System.out.println("The cost of the commute is: $" + PriceOfGas);
        

    }
}
