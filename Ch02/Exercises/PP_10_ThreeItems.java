package Ch02.Exercises;

import java.util.Scanner;

public class PP_10_ThreeItems {
    public static void main(String[] args) {
     
        Scanner keyboard = new Scanner(System.in);
        String nameItemOne, nameItemTwo, nameItemThree;
        int quantityItemOne, quantityItemThree, quantityItemTwo;
        double priceItemOne, priceItemThree, priceItemTwo,salesTax = 0.0625, totalItemOne, totalItemTwo, totalItemThree, totalSalesTax, totalShoppingList, subTotal;
        System.out.println("Input name of item 1:");
        nameItemOne = keyboard.nextLine();
        System.out.println("Input quantity of item 1:");
        quantityItemOne = keyboard.nextInt();
        System.out.println("Input price of item 1:");
        priceItemOne = keyboard.nextDouble();
        keyboard.nextLine();
        System.out.println("Input name of item 2:");
        nameItemTwo = keyboard.nextLine();
        System.out.println("Input quantity of item 2:");
        quantityItemTwo = keyboard.nextInt();
        System.out.println("Input price of item 2:");
        priceItemTwo = keyboard.nextDouble();
        keyboard.nextLine();
        System.out.println("Input name of item 3:");
        nameItemThree = keyboard.nextLine();
        System.out.println("Input quantity of item 3:");
        quantityItemThree = keyboard.nextInt();
        System.out.println("Input price of item 3:");
        priceItemThree = keyboard.nextDouble();
        keyboard.nextLine();
        totalItemOne = quantityItemOne * priceItemOne;
        totalItemTwo = quantityItemTwo * priceItemTwo;
        totalItemThree = quantityItemThree * priceItemThree;
        subTotal = totalItemOne + totalItemTwo + totalItemThree;
        totalSalesTax = (totalItemOne + totalItemTwo + totalItemThree) * salesTax;
        totalShoppingList = totalSalesTax + subTotal;
        String item = "item", quantity = "Quantity", price = "Price", total = "Total", subtotal = "Subtotal", salesTaxoutput = "6.25% sales tax", empty = "";
        System.out.println("Your bill:");
        System.out.printf("%-20s %-10s %-10s %s",item,quantity,price,total);
        System.out.println();
        System.out.printf("%-20s %-10d %-10.2f %.2f", nameItemOne, quantityItemOne,priceItemOne,totalItemOne);
        System.out.println();
        System.out.printf("%-20s %-10d %-10.2f %.2f", nameItemTwo, quantityItemTwo,priceItemTwo,totalItemTwo);
        System.out.println();
        System.out.printf("%-20s %-10d %-10.2f %.2f", nameItemThree, quantityItemThree,priceItemThree,totalItemThree);
        System.out.println();
        System.out.printf("%-20s %-10s %-10s %.2f", subtotal,empty,empty, subTotal);
        System.out.println();
        System.out.printf("%-20s %-10s %-10s %.2f", salesTaxoutput,empty,empty, totalSalesTax);
        System.out.println();
        System.out.printf("%-20s %-10s %-10s %.2f", total,empty,empty, totalShoppingList);
        //i know same name variables but capital but its been 30+ mins on this single problem

        // d = int, f = float/double

        /*
         * Your bill:
           Item                 Quantity        Price        Total
           lollipops            10              0.50         5.00
           diet soda            3               1.25         3.75
           chocolate bar        20              0.75         15.00
           Subtotal                                          23.75
           6.25% sales tax                                   1.48
           Total                                             25.23
         */
        
    }
}
