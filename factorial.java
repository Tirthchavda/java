import java.util.Scanner;

public class factorial {
    public static int computeFactorial(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        System.out.println("Factorial of " + num + " is " + computeFactorial(num));
        scanner.close();
    }
}
