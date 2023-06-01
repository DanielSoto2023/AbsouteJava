
public class Exercise_01_07_TimeKeeper {
    public static void main(String[] args) {
        int seconds = 51820;
        int minuets = seconds / 60; 
        int hours = minuets/60;
        seconds = seconds % 60;
        minuets = minuets % 60;
        System.out.println("Seconds: " + seconds);
        System.out.println("Minuets: " + minuets);
        System.out.println("Hours: " + hours);
    }
}
