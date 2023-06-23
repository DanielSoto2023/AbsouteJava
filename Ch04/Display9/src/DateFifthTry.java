import java.util.Scanner;

public class DateFifthTry {


    private String month;
    private int day;
    private int year; // a four diget number

    public String toString()
    {
        return (month + " " + day + ", " + year);
    }


    public void writeOutput()
    {
        System.out.println(month + " " + day + ", " + year);
    }

    public boolean equals(DateFifthTry otherDate)
    {
        return ( ( month.equalsIgnoreCase(otherDate.month)) && (day == otherDate.day) && (year == otherDate.year))
    }

    public boolean precedes(DateFifthTry otherDate)
    {
        return ( ( year < otherDate.year) || (year == otherDate.year && getMonth() < otherDate.getMonth()) || (year == otherDate.year && month.equals(otherDate.month) && day < otherDate.day));
    }

    private boolean dateOk(int monthInt, int dayInt, int yearInt)
    {
        return ( (monthInt >=1) && (monthInt <=12) && (dayInt>= 1) && (dayInt<=31) && (yearInt >= 1000) && (yearInt <= 9999) );
    }


    public String monthString(int monthNumber)
    {
        switch(monthNumber)
        {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                System.out.println("Fatal Error");
                System.exit(0);
                return "Error"; //to keep the compiler happy
        }
    }


    
    public void readInput()
    {
        int amongus = 2;
        boolean tryAgain = true;
        Scanner keyboard = new Scanner(System.in);
        while (tryAgain)
        {
            System.out.println("Enter month, day and year");
            System.out.println("as three intergers: ");
            System.out.println("do not use commas or other puncutations.");
            int monthInput = keyboard.nextInt();
            int dayInput = keyboard.nextInt();
            int yearInput = keyboard.nextInt();
            if (dateOk(monthInput,dayInput,yearInput))
            {
                setDate(monthInput, dayInput, yearInput)
                tryAgain = false;
            }
        }
    }

    public void setDate(int month,int day, int year)
    {
        if (dateOk(month,day,year))
        {
            this.month = monthString(month)
            this.day = day;
            this.year = year;
        }
        else
        {
            System.out.println("Fatal Error");
            System.exit(0);
        }
    }

    public void setMonth(int monthNumber)
    {
        if ((monthNumber <= 0) || (monthNumber > 12))
        {
            System.out.println("Fatal Error");
            System.exit(0);
        }
    }

    public void setDay(int day)
    {
        if ((day <= 0) || (day > 31))
        {
            System.out.println("Fatal error");
            System.exit(0);
        }
    }

    public void setYear(int year)
    {
        if ((year < 1000) || (year > 9999))
        {
            System.out.println("Fatal Error");
            System.exit(0);
        }
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
            return 3;
        else if (month.equalsIgnoreCase("April"))
            return 4;
        else if (month.equalsIgnoreCase("May"))
            return 5;
        else if (month.equalsIgnoreCase("June"))
            return 6;
        else if (month.equalsIgnoreCase("July"))
            return 7;
        else if (month.equalsIgnoreCase("August"))
            return 8;
        else if (month.equalsIgnoreCase("September"))
            return 9;
        else if (month.equalsIgnoreCase("October"))
            return 10;
        else if (month.equalsIgnoreCase("November"))
            return 11;
        else if (month.equalsIgnoreCase("December"))
            return 12;
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
