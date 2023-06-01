public class Exercise_01_01_MetabolicRates {
    public static void main(String[] args) {
        /*
         * Running 6 MPH : 10 Mets
         * Basketballl: 8 Mets
         * Sleeping 1 :Met
         * Sleep w/o eating to become ULTRA SLIM!
         * kilos = 150.0; it defaults as double?
         */
        float calories;
        float pounds = (float)150.0;
        float kilograms = (pounds)/((float)2.2);
        float mets = ((float)10.0 * 30) + ((float)8.0 * 30) + (float)360.0;
        calories = ((float)0.0175) * mets * kilograms;
        System.out.println(calories);
    }
}
