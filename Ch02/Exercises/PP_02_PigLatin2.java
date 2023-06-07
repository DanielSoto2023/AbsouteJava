package Ch02.Exercises;

public class PP_02_PigLatin2 {
    public static void main(String[] args) {
        String first = "daniel";
        String last = "soto";
        String FirstFirstLetter;
        String FirstLastLetter;
        String PigLatinEnding = "ay";
        last = last.substring(1,4) + last.substring(0, 1) + PigLatinEnding;
        first = first.substring(1,6) + first.substring(0, 1) + PigLatinEnding;
        FirstFirstLetter = first.substring(0, 1);
        FirstFirstLetter = FirstFirstLetter.toUpperCase();
        first = FirstFirstLetter + first.substring(1, 8);
        FirstLastLetter = last.substring(0,1);
        FirstLastLetter = FirstLastLetter.toUpperCase();
        last = FirstLastLetter +  last.substring(1, 6);
        System.out.println(first);
        System.out.println(last);
    }
}
