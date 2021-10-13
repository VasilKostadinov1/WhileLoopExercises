package BASIC.WhileLoopExercises_Difficult;

import java.util.Scanner;

public class ExamPreparation_2ndSol_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int poorGradeLimit = Integer.parseInt(scanner.nextLine());

        String name = scanner.nextLine();
        int poorGradeCount = 0;    // needed for print
        boolean isPoor = false;
        int countAllGrades = 0;
        double sumGrades = 0;      // needed for print
        String lastProblem = "";  // needed for final print

        while (!name.equals("Enough")) {  //Програмата трябва да приключи прочитането на данни при команда "Enough"
            int grade = Integer.parseInt(scanner.nextLine()); // !!! sc.nextLine - because we read input in pairs
            lastProblem = name;
            sumGrades += grade;
            countAllGrades++;
            if (grade <= 4) {
                poorGradeCount++;   //Незадоволителна е всяка оценка, която е по-малка или равна на 4.
            }
            if (poorGradeLimit == poorGradeCount) {   //приключи ...или ако Марин получи определеният брой незадоволителни оценки.
                isPoor = true;
                break;
            }
            name = scanner.nextLine();
        }
        if (isPoor) {
            System.out.printf("You need a break, %d poor grades.", poorGradeCount);
        } else {
            System.out.printf("Average score: %.2f%n", sumGrades / countAllGrades);
            System.out.printf("Number of problems: %d%n", countAllGrades);
            System.out.printf("Last problem: %s%n", lastProblem);

        }
    }
}
