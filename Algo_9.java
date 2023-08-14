import java.util.Scanner;

public class Algo_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Hi user if you input your single word? please give :");
        String input = scanner.nextLine();
        // System.out.println(input);
        if (input.contains(" ")) {
            System.out.println("[PLEASE ENTER A VALID INPUT]");
        } else {
            System.out.println("input is :" + input);
        }
       
        if (isPalindrome(input)) {
            System.out.println("The word \"" + input + "\" is a palindrome.");
        } else {
            System.out.println("The word \"" + input + "\" is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String s) { // we want to check our our input is palindrome or not
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;

    }
}
