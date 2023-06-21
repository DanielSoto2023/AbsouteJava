import java.util.Scanner;

public class PP_06Fibonacci {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int crudInitialPounds, day5, fibonacciNumberOne = 0,fibonacciNumberTwo = 1, fibonacciNumberThree, days, crudFinalPounds = 0;
        System.out.println("How many days do you want to run the simulation");
        days = keyboard.nextInt();
        System.out.println("Input the intial weight of the cruds in pounds");
        crudInitialPounds = keyboard.nextInt();
        if (days <= 0)
        {
            crudFinalPounds = crudInitialPounds;
        }
        else
        {
            while (days > 0)
            {
                day5 = days % 5;
                if (day5 == 0)
                {
                    fibonacciNumberThree = fibonacciNumberOne + fibonacciNumberTwo;
                    fibonacciNumberOne = fibonacciNumberTwo;
                    fibonacciNumberTwo = fibonacciNumberThree;
                    crudFinalPounds =  crudInitialPounds * fibonacciNumberTwo;
                }
                --days;
            }
        }
        System.out.println("The weight of the cruds is now: " + crudFinalPounds + " pounds");


        keyboard.close();
    }
}
