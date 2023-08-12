import java.util.Scanner;

public class Algo_5 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your ASCII :");
        String s = scanner.nextLine();

        char[] charA = s.toCharArray();
        System.out.println(charA.length);

        int a = 0;
        int b = charA.length - 1;

        while (a < b) {
            char temp = charA[a];
            charA[a] = charA[b];
            charA[b] = temp;
            a++;
            b--;
}

        for (char c : charA) {
            System.out.print(c + " ");

        }
    }
}
