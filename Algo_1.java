import java.util.Scanner;

public class Algo_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        do {
            System.out.print("Enter your positive number please.. :");

            while (!scanner.hasNextInt()) {
                // check the positive int
                System.out.println("Invalid input...! ");
                System.out.print("Enter your positive number :");
                scanner.next();
            }
            num = scanner.nextInt();

        } while (num <= 0);

        int a = 0;
        int b = 1;
        int tot;

        System.out.println("Fibonacci sequence is: " + num + " : " + a);
        System.out.println();

        System.out.print(a + "," + b);

        while (b <= num) {
            tot = a + b; // 2-> 0,1,1
            a = b;
            b = tot;
            System.out.print("," + "" + b);
        }

    }
}