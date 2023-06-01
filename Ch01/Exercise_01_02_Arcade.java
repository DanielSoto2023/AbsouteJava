
public class Exercise_01_02_Arcade {
    public static void main(String[] args) {
        int Coupon = 109;
        int LeftOverCoupons = Coupon % 10;
        int Candybars = Coupon / 10;
        int Gumballs = LeftOverCoupons / 3;
        System.out.println("The amount of candy bars you recive is: " + Candybars);
        System.out.println("The amoung of gumballs you recive is: " + Gumballs);
    }

    
}
