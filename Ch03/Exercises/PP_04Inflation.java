import java.util.Scanner;

public class PP_04Inflation {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double inflation, itemPriceCurrent, itemPricePostInflation;
        int years;
        System.out.println("What is the current inflation rate in percent, like 5.6");
        inflation = keyboard.nextDouble();
        inflation = inflation * .01;
        inflation = inflation + 1;
        System.out.println("What is the current price of the item example 3.22");
        itemPriceCurrent = keyboard.nextDouble();
        System.out.println("How many years would you like to wait");
        years = keyboard.nextInt();

        while (years > 0)
        {
            itemPriceCurrent = itemPriceCurrent * inflation;
            --years;
        }

        System.out.printf("The estimated price is $%.2f",itemPriceCurrent);


        keyboard.close();
    }
}
