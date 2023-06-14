
import java.util.Scanner;
public class PP_11_ClassroomExercies {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String nameOfExercise1, nameOfExercise2, nameOfExercise3;
        int scoreRecivedOne, scoreRecivedTwo, scoreRecivedThree, totalScore, totalMaxScore;
        int maxPointsOne, maxPointsThree, maxPointsTwo;
        System.out.println("Name of exercise 1");
        nameOfExercise1 = keyboard.nextLine();
        System.out.println("Score received for exercise 1");
        scoreRecivedOne = keyboard.nextInt();
        System.out.println("Total points possible for exercise 1:");
        maxPointsOne = keyboard.nextInt();
        keyboard.nextLine();
        System.out.println("Name of exercise 2");
        nameOfExercise2 = keyboard.nextLine();
        System.out.println("Score received for exercise 2");
        scoreRecivedTwo = keyboard.nextInt();
        System.out.println("Total points possible for exercise 2:");
        maxPointsTwo = keyboard.nextInt();
        keyboard.nextLine();
        System.out.println("Name of exercise 3");
        nameOfExercise3 = keyboard.nextLine();
        System.out.println("Score received for exercise 3");
        scoreRecivedThree = keyboard.nextInt();
        System.out.println("Total points possible for exercise 3:");
        maxPointsThree = keyboard.nextInt();
        keyboard.nextLine();
        totalScore = scoreRecivedOne + scoreRecivedTwo + scoreRecivedThree;
        totalMaxScore = maxPointsOne + maxPointsTwo + maxPointsThree;
        float totalpercent = ((float)totalScore/(float)totalMaxScore) * 100;
        String exercises = "Exercise", score = "Score", totalPossible = "Total Possible", total = "Total", percentSign = "%";

        System.out.printf("%-20s %-10s %-10s",exercises,score,totalPossible); 
        System.out.println();
        System.out.printf("%-20s %-10d %-10d", nameOfExercise1, scoreRecivedOne,maxPointsOne);
        System.out.println();
        System.out.printf("%-20s %-10d %-10d", nameOfExercise2, scoreRecivedTwo,maxPointsTwo);
        System.out.println();
        System.out.printf("%-20s %-10d %-10d", nameOfExercise3, scoreRecivedTwo,maxPointsThree);
        System.out.println();
        System.out.printf("%-20s %-10d %-10d", total,totalScore,totalMaxScore);
        System.out.println();
        System.out.printf("Your total is " + totalScore + " out of " + totalMaxScore + ", or %2.2f%s",totalpercent, percentSign  );

        /** 
         *  Output
        Name of exercise 1
        Math Homework
        Score received for exercise 1
        23
        Total points possible for exercise 1:
        30
        Name of exercise 2
        English Homework
        Score received for exercise 2
        11
        Total points possible for exercise 2:
        20
        Name of exercise 3
        Biology Homework
        Score received for exercise 3
        32
        Total points possible for exercise 3:
        40
        Exercise             Score      Total Possible
        Math Homework        23         30
        English Homework     11         20
        Biology Homework     11         40
        Total                66         90
        Your total is 66 out of 90, or 73.33%
        */

    }
}
