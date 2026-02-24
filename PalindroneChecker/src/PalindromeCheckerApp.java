import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 1.0");
        System.out.println("System initialized successfully.");
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input text: ");
        String text = scanner.nextLine();

        String reversed = new StringBuilder(text).reverse().toString();
        boolean isPalindrome = text.equalsIgnoreCase(reversed);

        System.out.println("Is it a Palindrome? : " + isPalindrome);

        scanner.close();
    }
}