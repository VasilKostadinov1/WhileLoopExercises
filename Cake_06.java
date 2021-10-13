package BASIC.WhileLoopExercises_Difficult;

import java.util.Scanner;

public class Cake_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int totalCakeNumbers = width * length;

        String input = scanner.nextLine();

        while (!input.equals("STOP") ) {
            int countCakes = Integer.parseInt(input);  // not scanner.nextLine !!! as we'll miss the 1st input- see in Debug
            totalCakeNumbers -= countCakes;            //we do not want to read new scanner, but use the 1st input number =20
            if (totalCakeNumbers < 0) {
                System.out.printf("No more cake left! You need %d pieces more.", Math.abs(totalCakeNumbers));
                break;    //до получаване на командата "STOP" или !!!!! докато не свърши тортата; 44/100 without "break"
            }
            input = scanner.nextLine();
        }
        if (input.equals("STOP")){
            System.out.printf("%d pieces are left.", Math.abs(totalCakeNumbers));
        }

    }
}
