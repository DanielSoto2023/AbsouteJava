
import java.util.Scanner;

public class PP_05_StraightLine {
    public static void main(String[] args) {
        double Depreciation, PurchasePrice, SalvageValue;
        int Years;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the purchase price of the item in 0.00");
        PurchasePrice =  keyboard.nextDouble();
        System.out.println("Input the expected salvage value in 0.00");
        SalvageValue = keyboard.nextDouble();
        System.out.println("Input the expected lifetime in years");
        Years = keyboard.nextInt();

        Depreciation = (PurchasePrice - SalvageValue) / Years;
        System.out.println("The Yearly depreciation is: $" + Depreciation);

        
    }
}
