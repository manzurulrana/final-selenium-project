package javaCodes.HomeworkCodes.Loops;

import java.util.Scanner;

public class GradeCalculation {
    public static void main(String[] args) {

        int totalCorrect;
        int totalQuestions;

        Scanner userInput = new Scanner(System.in);
        System.out.println("How many questions were on the exam?");
        totalQuestions = userInput.nextInt();
        System.out.println("How many questions did the student get correct?");
        totalCorrect = userInput.nextInt();
        double percentage = (totalCorrect*100/totalQuestions);

        if (percentage >= 90 && percentage <= 100) {
            System.out.println("You got an: A");
        } else if (percentage >= 80 && percentage <= 89) {
            System.out.println("You got an: B");
        } else if (percentage >= 70 && percentage <= 79) {
            System.out.println("You got an: C");
        } else if (percentage >= 60 && percentage <= 69) {
            System.out.println("You got an: D");
        } else if (percentage >= 0 && percentage <= 59) {
            System.out.println("You got an: F");
            System.out.println();
        }
    }
}
