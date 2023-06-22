import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class DateSecondTry {


    private String month;
    private int day;
    private int year; // a four diget number

    public void writeOutput()
    {
        System.out.println(month + " " + day + ", " + year);
    }

    public void setDate(int newMonth, int newDay, int newYear)
    {
        month = monthString(newMonth); // help
        day = newDay;
        year = newYear;
    }
    
    public void readInput()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter month, day, and year.");
        System.out.println("DO not use a comma.");
        month = keyboard.next();
        day = keyboard.nextInt();
        year = keyboard.nextInt();
    }

    public int getDay()
    {
        return day;
    }

    public int getYear()
    {
        return year;
    }

    public int getMonth()
    {
        if (month.equalsIgnoreCase("January"))
            return 1;
        else if (month.equalsIgnoreCase("February"))
            return 2;
        else if (month.equalsIgnoreCase("March"))
            return 2;
        else if (month.equalsIgnoreCase("April"))
            return 2;
        else if (month.equalsIgnoreCase("May"))
            return 2;
        else if (month.equalsIgnoreCase("June"))
            return 2;
        else if (month.equalsIgnoreCase("July"))
            return 2;
        else if (month.equalsIgnoreCase("August"))
            return 2;
        else if (month.equalsIgnoreCase("September"))
            return 2;
        else if (month.equalsIgnoreCase("October"))
            return 2;
        else if (month.equalsIgnoreCase("November"))
            return 2;
        else if (month.equalsIgnoreCase("December"))
            return 2;
        else 
        {
            System.out.println("Fatal Error");
            System.exit(0);
            return 0; //Needed to keep the compiler happy
        }

        
    }
    public void happyGreeting()
    {

        while (day > 0)
        {
            System.out.println("Happy Days!");
            --day;
        }

    }
}
