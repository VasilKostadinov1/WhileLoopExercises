package BASIC.WhileLoopExercises_Difficult;

import java.util.Scanner;

public class Vacation2_03 {
    public static void main(String[] args) {               // my solution 100/100
        Scanner scanner = new Scanner(System.in);
        double moneyNeeded = Double.parseDouble(scanner.nextLine());
        double moneyHas = Double.parseDouble(scanner.nextLine());
        int countTotal = 0;
        int countSpend = 0;

        while (moneyNeeded > moneyHas && countSpend < 5) {  // 77/100 without spend<5
            String saveSpend = scanner.nextLine();      //"spend" и "save"
            double sum = Double.parseDouble(scanner.nextLine());   //•	Сумата, която ще спести/похарчи
            if (saveSpend.equals("spend")) {
                moneyHas -= sum;
                if (sum > moneyHas) {
                    moneyHas = 0;
                }
                countTotal++;
                countSpend++;
            } else if (saveSpend.equals("save")) {
                moneyHas += sum;
                countTotal++;
                countSpend = 0;
            }
            if (countSpend == 5) {
                System.out.println("You can't save the money.");
                System.out.printf("%d", countTotal);
            }
        }
        if (moneyNeeded <= moneyHas) {  // !!! = otherwise will not print if needed=has
            System.out.printf("You saved the money for %d days.", countTotal);
        }


    }
}
