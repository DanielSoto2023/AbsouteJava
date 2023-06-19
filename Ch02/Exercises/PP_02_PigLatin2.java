

public class PP_02_PigLatin2 {
    public static void main(String[] args) {
        String first = "daniel";
        String last = "soto";
        String firstFirstLetter;
        String firstLastLetter;
        String pigLatinEnding = "ay";
        last = last.substring(1,4) + last.substring(0, 1) + pigLatinEnding;
        first = first.substring(1,6) + first.substring(0, 1) + pigLatinEnding;
        firstFirstLetter = first.substring(0, 1);
        firstFirstLetter = firstFirstLetter.toUpperCase();
        first = firstFirstLetter + first.substring(1, 8);
        firstLastLetter = last.substring(0,1);
        firstLastLetter = firstLastLetter.toUpperCase();
        last = firstLastLetter +  last.substring(1, 6);
        System.out.println(first);
        System.out.println(last);
    }
}
