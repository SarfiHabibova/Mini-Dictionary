package MiniDictionary;

import MiniDictionary.Admin;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the dictionary");
        System.out.println("Choose one choice.");
        Scanner scanner = new Scanner(System.in);
        Dict dictionary = new Dict();

        while (true) {
            System.out.println("1. MiniDictionary.Admin");
            System.out.println("2. MiniDictionary.User");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    Admin.Admin1(dictionary);
                    break;
                case 2:
                    User.userMenu(dictionary);
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please, try again.");
            }
        }
    }
}