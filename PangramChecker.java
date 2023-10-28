import java.util.Scanner;

public class PangramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence to check if it's a pangram: ");
        String input = scanner.nextLine();
        scanner.close();

        boolean isPangram = isPangram(input);

        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String input) {
        // Convert the input to lowercase to make the check case-insensitive
        input = input.toLowerCase();

        // Create a boolean array to track the presence of letters
        boolean[] lettersPresent = new boolean[26];

        // Iterate through the characters in the input
        for (char c : input.toCharArray()) {
            // Check if the character is a letter
            if (Character.isLetter(c)) {
                int index = c - 'a';
                lettersPresent[index] = true;
            }
        }

        // Check if all 26 letters are present
        for (boolean isPresent : lettersPresent) {
            if (!isPresent) {
                return false;
            }
        }

        return true;
    }
}
