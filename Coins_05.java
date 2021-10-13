package BASIC.WhileLoopExercises_Difficult;

import java.util.Scanner;

public class Coins_05 {
    public static void main(String[] args) {       // 90/100  time limit
        Scanner scanner = new Scanner(System.in);

        double exchange = Double.parseDouble(scanner.nextLine());
        double exchangeIn100 = exchange * 100;
        double counter = 0;

        while (exchangeIn100 > 0) {
            counter++;
            if (exchangeIn100 >= 200) {
                exchangeIn100 -= 200;
            } else if (exchangeIn100 >= 100 ) {
                exchangeIn100 -= 100;
            } else if (exchangeIn100 >= 50 ) {
                exchangeIn100 -= 50;
            } else if (exchangeIn100 >= 20 ) {
                exchangeIn100 -= 20;
            } else if (exchangeIn100 >= 10 ) {
                exchangeIn100 -= 10;
            } else if (exchangeIn100 >= 5 ) {
                exchangeIn100 -= 5;
            } else if (exchangeIn100 >= 2 ) {
                exchangeIn100 -= 2;
            } else if (exchangeIn100 >= 1) {
                exchangeIn100 -= 1;
            }
        }
        System.out.printf("%.0f",counter);


    }
}
