package BASIC.WhileLoopExercises_Difficult;

import java.util.Scanner;

public class Moving_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());

        int allSpace = width * length * height;
        String input = scanner.nextLine();
        boolean isFull = false;

        while (!input.equals("Done")) {
            int boxes = Integer.parseInt(input);
            allSpace -= boxes;
            if (allSpace <= 0) {
                System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(allSpace));
                isFull = true;
                break;
            }
            input = scanner.nextLine();
        }
        if (!isFull) {
            System.out.printf("%d Cubic meters left.", Math.abs(allSpace));
        }


    }
}
