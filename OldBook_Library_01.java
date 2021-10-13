package BASIC.WhileLoopExercises_Difficult;

import java.util.Scanner;

public class OldBook_Library_01 {
    public static void main(String[] args) {        // RESOLVE it
        Scanner scanner = new Scanner(System.in);
        String book = scanner.nextLine();        // book we are searching

        boolean isFound = false;    //т.е. книгата не е открита
        int bookCounter = 0;
        String currentBook = scanner.nextLine();  // current book

        while (!currentBook.equals("No More Books")) {  //Книгите в библиотеката са свършили щом получите текст "No More Books".

            if (currentBook.equals(book)){   //или не провери всички книги
                isFound=true;
                break;
            }
            bookCounter++;
            currentBook = scanner.nextLine();
        }
        if (isFound){
            System.out.printf("You checked %d books and found it.",bookCounter);
        } else  {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.", bookCounter);
        }

    }
}
