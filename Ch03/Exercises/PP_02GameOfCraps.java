package Ch03.Exercises;

import java.util.Random;


public class PP_02GameOfCraps {
    //first of all the house always wins if this is the correct version of craps
    // ironic how im doing this in a hotel with a casino.....
    public static void main(String[] args) {
        Random randomGenerator = new Random();
        int pointRoll, dieOne, dieTwo, rollLoopCounter = 1000, winsAmount= 0, losesAmount = 0, winsAmountTracker = 0, losesAmountTracker = 0, pointRollTracker;
        
        while(rollLoopCounter > 0)
        {
            dieOne = randomGenerator.nextInt(6) + 1;
            dieTwo = randomGenerator.nextInt(6) + 1;
            pointRoll = dieTwo + dieOne;
            //prob not the best way to do this
            pointRoll = dieTwo + dieOne;
            winsAmountTracker = winsAmount;
            losesAmountTracker = losesAmount;
            if (pointRoll == 7 || pointRoll == 11)
            {
                ++winsAmount;
            }
            else if (pointRoll == 2 || pointRoll == 3 || pointRoll == 12)
            {
                ++losesAmount;
            }
            
            else 
            {
              while(winsAmount == winsAmountTracker && losesAmount == losesAmountTracker)
              {
                dieOne = randomGenerator.nextInt(6) + 1;
                dieTwo = randomGenerator.nextInt(6) + 1;
                pointRollTracker = dieOne + dieTwo;
                if(pointRollTracker == pointRoll)
                {
                    ++winsAmount;
                }
                else if (pointRollTracker == 7)
                {
                    ++losesAmount;
                }
              }  
            }
            
            
            
            
            --rollLoopCounter;
        }
            System.out.println("Amount of wins: " + winsAmount);
            System.out.println("Amount of loses: " + losesAmount);
    }
}
