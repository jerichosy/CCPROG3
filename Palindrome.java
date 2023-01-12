import java.util.*;

/**
 * Checks if an input string is a Palindrome
 * Limitations: It does not filter out symbols and punctuations in the given string.
 * 
 * @author Matthew Jericho Go Sy
 */
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // INPUT
        System.out.print("\nInput string: ");
        String given = sc.nextLine();

        // FORMATTING: Remove spaces
        given = given.replaceAll("\\s","");  // More info: https://stackoverflow.com/questions/5455794/removing-whitespace-from-strings-in-java

        // Initialize variables used for processing
        String reversed;
        char reversedChar[] = new char[given.length()];

        // PROCESSING: Reverse the order
        for (int i = 0; i < given.length(); i++)
            reversedChar[given.length() - i - 1] = given.charAt(i);  // Builds the char array from given String one at a time

        // Convert char array to string
        reversed = String.valueOf(reversedChar);  // Same as toString() but checks if null

        // OUTPUT: Compare (ignoring case) and display the result
        // String result = (given.equalsIgnoreCase(reversed)) ? "The input string is a palindrome." : "The input string is NOT a palindrome.";
        // System.out.println(result);
        System.out.println("The input string is " + (given.equalsIgnoreCase(reversed) ? "" : "NOT ") + "a palindrome.");

        sc.close();
    }
}