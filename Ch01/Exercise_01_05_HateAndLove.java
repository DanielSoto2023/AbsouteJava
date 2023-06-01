public class Exercise_01_05_HateAndLove {
    public static void main(String[] args) {
        String LineOfTextInput = "I hate pugs.";
        int PositionOfHate = LineOfTextInput.indexOf("hate",1);
        int LengthOfTextInput = LineOfTextInput.length();
        String LineOfTextInputPreHate = LineOfTextInput.substring(0, PositionOfHate);
        PositionOfHate += 4;
        String LineOfTextInputPostHate = LineOfTextInput.substring(PositionOfHate , LengthOfTextInput);
        String AddedLove = LineOfTextInputPreHate + "love";
        String RepairedLineOfText = AddedLove + LineOfTextInputPostHate;
        System.out.println(RepairedLineOfText);
        
    }
    
}
