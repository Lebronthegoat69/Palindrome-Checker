import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Palindrome Checker");
        System.out.println("------------------");

        System.out.print("Enter a word or phrase: ");
        String originalInput = scanner.nextLine();

        String lowercaseInput = originalInput.toLowerCase();

        StringBuilder cleanedBuilder = new StringBuilder();

        for (int i = 0; i < lowercaseInput.length(); i++) {
            char currentChar = lowercaseInput.charAt(i);

            if (Character.isLetterOrDigit(currentChar)) {
                cleanedBuilder.append(currentChar);
            }
        }

        String cleanedText = cleanedBuilder.toString();

        StringBuilder reversedBuilder = new StringBuilder(cleanedText);
        String reversedText = reversedBuilder.reverse().toString();

        System.out.println();
        System.out.println("Original input: " + originalInput);
        System.out.println("Cleaned text: " + cleanedText);
        System.out.println("Reversed text: " + reversedText);

        if (cleanedText.equals(reversedText)) {
            System.out.println("Result: This is a palindrome.");
        } else {
            System.out.println("Result: This is not a palindrome.");
        }

        scanner.close();
    }
}