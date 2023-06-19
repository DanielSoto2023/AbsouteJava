// Still need to make some changes
import java.util.Scanner;
public class PP_03ChildHight {
    public static void main(String[] args) {
        String continueChecker = "y", feetAndInchesChecker, genderChecker;
        Scanner keyboard = new Scanner(System.in);
        final int FEET_TO_INCHES = 12;
        int motherHightFeet, motherHightInches, fatherHightFeet, fatherHightInches, maleChildHightInches, maleChildHightFeet, femaleChildHightInches, femaleChildHightFeet;
        boolean genderFailLoop = true;
        while (continueChecker == "y" || continueChecker == "Y")
        {
            System.out.println("Would you like to input the height in feet and inches or just inches: Y for Feet N for Inches");
            feetAndInchesChecker = keyboard.nextLine();
            if (feetAndInchesChecker.equals("Y") || feetAndInchesChecker.equals("y"))
            {
                genderFailLoop = true;
                System.out.println("Please enter the mothers hight in feet then inches");
                motherHightFeet = keyboard.nextInt();
                motherHightInches = keyboard.nextInt();
                System.out.println("Please enter the fathers hight in feet then inches");
                fatherHightFeet = keyboard.nextInt();
                fatherHightInches = keyboard.nextInt();

                fatherHightInches = (fatherHightFeet * FEET_TO_INCHES) + fatherHightInches;
                motherHightInches = (motherHightFeet * FEET_TO_INCHES) + motherHightInches;
                
                while (genderFailLoop == true)
                {
                System.out.println( "Please enter the gender of your child, M for male F for female");
                genderChecker = keyboard.nextLine();
                keyboard.nextLine();
                if (genderChecker.equals("M") || genderChecker.equals("m"))
                    {
                        maleChildHightInches = ((motherHightInches * 13/12) + fatherHightInches);
                        maleChildHightFeet = maleChildHightInches/12;
                        maleChildHightInches =  maleChildHightInches % 12;
                        System.out.println("Your child's hight is");
                        System.out.println("Feet: " + maleChildHightFeet);
                        System.out.println("Inches: " + maleChildHightInches);
                        genderFailLoop = false;
                        
                    }
                else if (genderChecker.equals("F") || genderChecker.equals("f"))
                    {
                        femaleChildHightInches = ((fatherHightInches * 12/13) + motherHightInches);
                        femaleChildHightFeet = femaleChildHightInches/12;
                        femaleChildHightInches =  femaleChildHightInches % 12;
                        System.out.println("Your child's hight is");
                        System.out.println("Feet: " + femaleChildHightFeet);
                        System.out.println("Inches: " + femaleChildHightInches);
                        genderFailLoop = false;
                    }
                else
                    {
                        System.out.println("Lets try that again");
                    }            
                }
            }
            else if (feetAndInchesChecker == "N" || feetAndInchesChecker == "n")
            {
                genderFailLoop = true;
                System.out.println("Please enter the mothers in inches");
                motherHightInches = keyboard.nextInt();
                System.out.println("Please enter the fathers hight in inches");
                fatherHightInches = keyboard.nextInt();

                
                while (genderFailLoop == true)
                {
                System.out.println( "Please enter the gender of your child, M for male F for female");
                genderChecker = keyboard.nextLine();
                keyboard.nextLine();
                if (genderChecker == "M" || genderChecker == "m")
                    {
                        maleChildHightInches = ((motherHightInches * 13/12) + fatherHightInches);
                        System.out.println("Your child's hight is");
                        System.out.println("Inches: " + maleChildHightInches);
                        genderFailLoop = false;
                        
                    }
                else if (genderChecker == "F" || genderChecker == "f")
                    {
                        femaleChildHightInches = ((fatherHightInches * 12/13) + motherHightInches);
                        System.out.println("Your child's hight is");
                        System.out.println("Inches: " + femaleChildHightInches);
                        genderFailLoop = false;
                    }
                else
                    {
                        System.out.println("Lets try that again");
                    }
                }
            }
        }
        keyboard.close();
    }
}
