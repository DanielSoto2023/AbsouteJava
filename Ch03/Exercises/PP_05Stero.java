public class PP_05Stero {
    public static void main(String[] args) {
        double intrest = .015, monthlyPayment = 50, steroSystemCost = 1000, intrestPaid = 0, leftoverCash;
        int monthCounter = 0;

        while(steroSystemCost > 0)
        {
        monthlyPayment = 50;
        intrestPaid = (intrest * steroSystemCost) + intrestPaid;
        monthlyPayment = monthlyPayment - (intrest * steroSystemCost);
        steroSystemCost = steroSystemCost - monthlyPayment;
        ++monthCounter;
        }
        System.out.println("It took "+ monthCounter + " months to finish paying");
        System.out.printf("The amount of total intrest paid was $%.2f",intrestPaid);




    }
}
