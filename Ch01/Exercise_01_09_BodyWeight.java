public class Exercise_01_09_BodyWeight {
    public static void main(String[] args) {
        int Feet = 10, Inchs = 10, Pounds = 110;
        Feet -= 5;
        Inchs = Inchs + (Feet * 12);
        Pounds = Pounds + Inchs * 5;
        System.out.println("Your ideal body weight is " + Pounds);
        

    }
}
