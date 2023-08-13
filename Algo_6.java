import java.util.Scanner;

public class Algo_6 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a sentence: ");
        String input = scanner.nextLine();

        if (input.trim().isEmpty()) {
            System.out.println("Input cannot be empty.");
        } else {
            String[] words = input.split(" ");

            System.out.print("Inverted sentence: ");
            for (int i = words.length - 1; i >= 0; i--) {
                System.out.print(words[i] + " ");
            }
        }
    }
}
