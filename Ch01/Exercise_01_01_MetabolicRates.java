public class Exercise_01_01_MetabolicRates {
    public static void main(String[] args) {
        /*
         * Running 6 MPH : 10 Mets
         * Basketballl: 8 Mets
         * Sleeping 1 :Met
         * Sleep w/o eating to become ULTRA SLIM!
         * kilos = 150.0; it defaults as double?
         * 
         * Calories/Minute = .0175 * MET * Kg
         * 
         * Calories = .0175 * MET * Kg * Minute
         * 
         */
        final float CONVERSION_METS = 0.0175f;
        final float CONVERSION_POUNDS_KILO = 2.2f;
        float calories;
        float pounds = 150;
        float kilograms = pounds/CONVERSION_POUNDS_KILO;
        float runningMets = 10;
        float basketBallMets = 8;
        float sleepingMets = 1;
        float timeRunning = 30;
        float timeBasketball = 30;
        float timeSleep = 360;
        calories = CONVERSION_METS * kilograms * (runningMets * timeRunning + basketBallMets*timeBasketball + sleepingMets * timeSleep);
        System.out.println(calories);
    }
}
