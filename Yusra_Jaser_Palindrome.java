import java.util.Scanner;

public class Yusra_Jaser_Palindrome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.println("Enter a phrase:");
        String phrase = scanner.nextLine();

        // Remove spaces and punctuation, and convert to lowercase
        String cleanPhrase = phrase.replaceAll("[^a-zA-Z]", "").toLowerCase();

        // Check if the clean phrase is a palindrome
        boolean isPalindrome = true;
        for (int i = 0; i < cleanPhrase.length() / 2; i++) {
            if (cleanPhrase.charAt(i) != cleanPhrase.charAt(cleanPhrase.length() - i - 1)) {
                isPalindrome = false;
                break;
            }
        }

        // Output result
        if (isPalindrome) {
            System.out.println("The phrase is a palindrome.");
        } else {
            System.out.println("The phrase is not a palindrome.");
        }
    }
}
