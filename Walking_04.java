package BASIC.WhileLoopExercises_Difficult;

import java.util.Scanner;

public class Walking_04 {
    public static void main(String[] args) {           // RESOLVE it
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int summedSteps = 0;
        boolean success = false;

        while (!input.equals("Going home")) {
            int currentSteps = Integer.parseInt(input);
            summedSteps += currentSteps;
            if (summedSteps >= 10000) {
                success = true;
                break;
            }
            input = scanner.nextLine();
        }
        if (input.equals("Going home")){
            int stepsAddToHome= Integer.parseInt(scanner.nextLine());
            summedSteps+=stepsAddToHome;
        }
        if (success || summedSteps>=10000){                // !!! without >=10000, gives 80/100
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!", Math.abs(summedSteps-10000));
        } else {
            System.out.printf("%d more steps to reach goal.", Math.abs(summedSteps-10000));
        }
    }
}
