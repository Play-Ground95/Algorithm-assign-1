import java.util.Scanner;

public class Algo_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a sentence: ");
        String input = scanner.nextLine();

        if (input.trim().isEmpty()) {
            System.out.println("Input cannot be empty.");
        } else {

            String[] words = input.split(" ");

            if (words.length > 0) {

                String max = words[0];
                String min = words[0];

                for (int i = 1; i < words.length; i++) {
                    if (words[i].length() > max.length()) {
                        max = words[i];
                    }
                    if (words[i].length() < min.length()) {
                        min = words[i];
                    }
                }
            } else {
                System.out.println("NO INPUT IS HERE");
            }

        }
    }
}
