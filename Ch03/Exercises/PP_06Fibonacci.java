import java.util.Scanner;

public class PP_06Fibonacci {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int crud, day5, fibonacciNumberOne = 0,fibonacciNumberTwo = 1, fibonacciNumberThree, days;
        System.out.println("How many days do you want to run the simulation");
        days = keyboard.nextInt();
        System.out.println("Input the intial weight of the cruds in pounds");
        crud = keyboard.nextInt();

        while (days > 0)
        {
            day5 = days % 5;
            if (day5 == 0)
            {
                fibonacciNumberThree = fibonacciNumberOne + fibonacciNumberTwo;
                fibonacciNumberOne = fibonacciNumberTwo;
                fibonacciNumberTwo = fibonacciNumberThree;
                crud =  crud * fibonacciNumberTwo;
            }
            --days;
        }
        System.out.println("The weight of the cruds is now: " + crud);


        keyboard.close();
    }
}
