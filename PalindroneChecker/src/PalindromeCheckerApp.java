import java.util.Scanner;

public class PalindromNAVEENeCheckerApp {

    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println("   Welcome to Palindrome Checker App   ");
        System.out.println("         Version : 1.0 (UC3)           ");
        System.out.println("=======================================");

        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string to check: ");
        String original = scanner.nextLine();

        // Reverse using for loop
        String reversed = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        // Compare original and reversed string
        if (original.equals(reversed)) {
            System.out.println("Result: The given string IS a Palindrome.");
        } else {
            System.out.println("Result: The given string is NOT a Palindrome.");
        }

        scanner.close();
    }
}