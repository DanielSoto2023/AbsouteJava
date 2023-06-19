
import java.util.Scanner;
public class PP_03ChildHeight { //open 1
    public static void main(String[] args) { // open 2
        String continueChecker = "y", feetAndInchesChecker = "Y", genderChecker;
        Scanner keyboard = new Scanner(System.in);
        final int feetToInches = 12;
        int motherHeightFeet, motherHeightInches, fatherHeightFeet, fatherHeightInches, maleChildHeightInches, maleChildHeightFeet, femaleChildHeightInches, femaleChildHeightFeet;
        boolean genderFailLoop = true;
        while (continueChecker == "y" || continueChecker == "Y")
        { // while open 1
            System.out.println("Would you like to input the heights in feet and inches or just inches: Y for Feet N for Inches");
            feetAndInchesChecker = keyboard.next();
            keyboard.nextLine();
            if (feetAndInchesChecker.equals("y") || feetAndInchesChecker.equals("Y"))
            { // if [open 1
                genderFailLoop = true;
                System.out.println("Please enter the mothers height in feet then inches");
                motherHeightFeet = keyboard.nextInt();
                motherHeightInches = keyboard.nextInt();
                System.out.println("Please enter the fathers height in feet then inches");
                fatherHeightFeet = keyboard.nextInt();
                fatherHeightInches = keyboard.nextInt();

                fatherHeightInches = (fatherHeightFeet * feetToInches) + fatherHeightInches;
                motherHeightInches = (motherHeightFeet * feetToInches) + motherHeightInches;
                
                while (genderFailLoop == true)
                { // while open
                System.out.println( "Please enter the gender of your child, M for male F for female");
                genderChecker = keyboard.next();
                keyboard.nextLine();
                if (genderChecker.equals("M")|| genderChecker.equals("m"))
                    {
                        maleChildHeightInches = ((motherHeightInches * 13/12) + fatherHeightInches);
                        maleChildHeightFeet = maleChildHeightInches/12;
                        maleChildHeightInches =  maleChildHeightInches % 12;
                        System.out.println("Your child's height is");
                        System.out.println("Feet: " + maleChildHeightFeet);
                        System.out.println("Inches: " + maleChildHeightInches);
                        genderFailLoop = false;
                        
                    }
                else if (genderChecker.equals("f") || genderChecker.equals("F"))
                    {
                        femaleChildHeightInches = ((fatherHeightInches * 12/13) + motherHeightInches);
                        femaleChildHeightFeet = femaleChildHeightInches/12;
                        femaleChildHeightInches =  femaleChildHeightInches % 12;
                        System.out.println("Your child's height is");
                        System.out.println("Feet: " + femaleChildHeightFeet);
                        System.out.println("Inches: " + femaleChildHeightInches);
                        genderFailLoop = false;
                    }
                else
                    {
                        System.out.println("Lets try that again");
                    }
                } // while close
            } // if close 1]
            else if (feetAndInchesChecker.equals("N") || feetAndInchesChecker.equals("n"))
                { // if open
                    genderFailLoop = true;
                    System.out.println("Please enter the mothers height in inches");
                    motherHeightInches = keyboard.nextInt();
                    System.out.println("Please enter the fathers height in inches");
                    fatherHeightInches = keyboard.nextInt();

                    
                    while (genderFailLoop == true)
                    { // while open 2
                    System.out.println( "Please enter the gender of your child, M for male F for female");
                    genderChecker = keyboard.next();
                    keyboard.nextLine();
                    if (genderChecker.equals("M") || genderChecker.equals("m"))
                        {
                            maleChildHeightInches = ((motherHeightInches * 13/12) + fatherHeightInches);
                            System.out.println("Your child's height is");
                            System.out.println("Inches: " + maleChildHeightInches);
                            genderFailLoop = false;
                            
                        }
                    else if (genderChecker.equals("F")|| genderChecker.equals("f"))
                    {
                        femaleChildHeightInches = ((fatherHeightInches * 12/13) + motherHeightInches);
                        System.out.println("Your child's height is");
                        System.out.println("Inches: " + femaleChildHeightInches);
                        genderFailLoop = false;
                    }
                    else
                    {
                        System.out.println("Lets try that again");
                    }
                    } // while close 2


                } // if close
            System.out.println("Do you want to do this again?");
            System.out.println("Type Y for yes, anything else for no");
            continueChecker = keyboard.next();
            keyboard.nextLine();


        } //while open 1
        keyboard.close();
    }// open two      
}// open 1

//currently broken idk why
