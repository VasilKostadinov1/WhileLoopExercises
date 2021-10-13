package BASIC.WhileLoopExercises_Difficult;

import java.util.Scanner;

public class Walking2_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);    // my solution 100/100!
        String input = scanner.nextLine();
        int goal = 10000;

        while (!input.equals("Going home")) {
            int steps = Integer.parseInt(input);  // not scanner.nextLine !!! as we'll miss the 1st input- see in Debug
            goal -= steps;
            if (goal <= 0) {
                System.out.println("Goal reached! Good job!");
                System.out.printf("%d steps over the goal!", Math.abs(goal));
                break;
            }
            input = scanner.nextLine();
        }
        if (input.equals("Going home")) {
            int lastSteps = Integer.parseInt(scanner.nextLine());  // ще въведе стъпките, които е извървяла докато се прибира.
            goal -= lastSteps;
            if (goal <= 0) {
                System.out.println("Goal reached! Good job!");
                System.out.printf("%d steps over the goal!", Math.abs(goal));

            } else {
                System.out.printf("%d more steps to reach goal.", Math.abs(goal));
            }

        }
    }
}
