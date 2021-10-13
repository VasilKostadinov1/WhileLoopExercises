package BASIC.WhileLoopExercises_Difficult;

import java.util.Scanner;

public class ExamPreparation_02 {
    public static void main(String[] args) {            // RESOLVE it
        Scanner scanner = new Scanner(System.in);
        //String input = scanner.nextLine();
        int failedThreshold = Integer.parseInt(scanner.nextLine());

        boolean isFailed = true;
        int failedCounter = 0;
        int solvedCounter = 0;
        double sumGrades = 0;
        String lastProblem = "";

        while (failedCounter < failedThreshold) {
            String problemName = scanner.nextLine();

            if (("Enough").equals(problemName)) {
                isFailed = false;
                break;
            }
            int grade = Integer.parseInt(scanner.nextLine());
            if (grade <= 4) {
                failedCounter++;
            }
            sumGrades += grade;
            solvedCounter++;
            lastProblem = problemName;

        }
        if (isFailed) {
            System.out.printf("You need a break, %d poor grades.", failedThreshold);
        } else {
            System.out.printf("Average score: %.2f%n", (sumGrades / solvedCounter));
            System.out.printf("Number of problems: %d%n", solvedCounter);
            System.out.printf("Last problem: %s%n", lastProblem);

        }
    }

}
