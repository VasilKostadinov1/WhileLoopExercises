package BASIC.WhileLoopExercises_Difficult;

import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);                    // 100/100
        double moneyNeeded = Double.parseDouble(scanner.nextLine());
        double moneyHas = Double.parseDouble(scanner.nextLine());

        int totalDays = 0;
        int spentDays = 0;

        while (moneyHas < moneyNeeded && spentDays < 5) {   // only < , not <= or throws exception !!!
            String saveOrSpend = scanner.nextLine();
            double sumSaveSpend = Double.parseDouble(scanner.nextLine());
            totalDays++;

            if (saveOrSpend.equals("spend")) {
                moneyHas -= sumSaveSpend;
                spentDays++;
                if (moneyHas <= 0) { //Ако иска да похарчи повече от наличните си пари, то тя ще похарчи всичките и ще ѝ останат 0 лева.
                    moneyHas = 0;
                }

            } else if (saveOrSpend.equals("save")) {
                moneyHas += sumSaveSpend;
                spentDays = 0;                  //•	Ако 5 последователни дни Джеси само харчи !!!
            }
        }
        if (moneyHas >= moneyNeeded) {
            System.out.printf("You saved the money for %d days.", totalDays);
        }
        if (spentDays == 5) {              //•	Ако 5 последователни дни Джеси само харчи
            System.out.println("You can't save the money.");
            System.out.println(totalDays);     // totalDays !!!, not savedDays or 77/100
        }


    }
}
