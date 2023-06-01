public class Exercise_01_04_GovernmentLab {
    public static void main(String[] args) {
        double SweetenerToKillPerKgInGrams = 1;
        double SweetenerInSoda = 0.001;
        double TargetedWieghtOfDieterKg = 10;
        double HowManyCans = (SweetenerToKillPerKgInGrams * TargetedWieghtOfDieterKg) / SweetenerInSoda;
        System.out.println("The amount of soda cans your friend can drink is: " + HowManyCans);

    }
}
