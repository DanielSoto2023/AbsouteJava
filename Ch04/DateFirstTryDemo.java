public class DateFirstTryDemo {
    /**
     * DateFirstTry
     */
    public static class DateFirstTry {
        public String month;
        public int day;
        public int year;

        public void writeOutput()
        {
            System.out.println(month + " " + day + " " + year);
        }   
    }

    public static void main(String[] args) {
        DateFirstTry date1;
        date1 = new DateFirstTry();
        date1.day = 12;
        date1.month = "julyy";
        date1.year = 5555;

    }
}
