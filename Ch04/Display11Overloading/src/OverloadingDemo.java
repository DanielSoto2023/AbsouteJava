public class OverloadingDemo {
    public static void main(String[] args) {
        DateSixthTry date1 = new DateSixthTry(), date2 = new DateSixthTry(), date3 = new DateSixthTry();
        date1.setDate(1,2,2008);
        date2.setDate("February", 2, 2008);
        date3.setDate(2008);
        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date3);
    }
}
