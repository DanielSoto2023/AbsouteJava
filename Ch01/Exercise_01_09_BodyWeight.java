public class Exercise_01_09_BodyWeight {
    public static void main(String[] args) {
        int Feet = 10, Inchs = 10, Pounds = 110;
        Feet -= 5;
        Inchs = Inchs + (Feet * 12);
        Pounds = Pounds + Inchs * 5;
        System.out.println("Your ideal body weight is " + Pounds);double Time = 35.5 , Distance = 6.21, Pace = (Time / Distance);
        //Time is discribed in minuets, so this would be 35 minuets and 30 seconds.
        System.out.println("This program calculates your pace given a time and distance traveled.");
        System.out.println("Your pace is " + Pace + " miles per hour.");
        

    }
}
