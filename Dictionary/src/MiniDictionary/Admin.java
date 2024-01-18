package MiniDictionary;

import java.util.Scanner;

public class Admin {
    protected static void Admin1(Dict dictionary) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add a word");
            System.out.println("2. Save to file");
            System.out.println("3. Back to main menu");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the English word:");
                    String englishWord = scanner.next();

                    System.out.println("Enter Azerbaijani translation:");
                    String azerbTranslation = scanner.next();

                    dictionary.addWord(englishWord, azerbTranslation);
                    break;
                case 2:
                    System.out.println("Enter file name:");
                    String fileName = scanner.next();
                    System.out.println("Enter file path:");
                    String filePath = scanner.next();

                    dictionary.saveToFile(fileName, filePath);
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}