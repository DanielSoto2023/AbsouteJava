public class Exercise_01_03_PigLatin {
    public static void main(String[] args) {
        String first = "daniel";
        String last = "soto";
        String PigLatinEnding = "ay";
        last = last.substring(1,4) + last.substring(0, 1) + PigLatinEnding;
        first = first.substring(1,6) + first.substring(0, 1) + PigLatinEnding;
        System.out.println(first);
        System.out.println(last);
    }
    
}