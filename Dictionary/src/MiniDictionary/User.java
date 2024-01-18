package MiniDictionary;

import MiniDictionary.Dict;

import java.util.Scanner;

public class User {
    protected static void userMenu(Dict dictionary) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Search for a word");
            System.out.println("2. Back to main menu");

            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter the English word: ");
                String englishWord = scanner.next();

                String translation = dictionary.getTranslation(englishWord);

                if (translation != null) {
                    System.out.println("Azerbaijani translation: " + translation);
                } else {
                    System.out.println("Word not found in the dictionary.");
                }
            } else if (choice == 2) {
                break;
            } else {
                System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}

