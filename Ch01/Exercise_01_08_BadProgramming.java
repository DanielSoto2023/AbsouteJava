public class Exercise_01_08_BadProgramming {
    public static void main(String[] args) {
        double Time = 35.5 , Distance = 6.21, Pace = (Time / Distance);
        //Time is discribed in minuets, so this would be 35 minuets and 30 seconds.
        System.out.println("This program calculates your pace given a time and distance traveled.");
        System.out.println("Your pace is " + Pace + " miles per hour.");
    }
}
