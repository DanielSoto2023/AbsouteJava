import java.nio.charset.MalformedInputException;

public class Exercise_01_06_Bicyclists {
    public static void main(String[] args) {
        float DiamaterWheelInches = 100;
        float Pi = (float) 3.14;
        float FtInches = (float)1/12;
        float FtMiles = (float)1/5280;
        float MinHours = (float)60/1;

        float speed = DiamaterWheelInches * Pi * FtInches * FtMiles * MinHours;
        System.out.println(speed);


    }
    
}
