import java.util.Scanner;

public class Primenum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n <= 1) {
            System.out.println("Not a prime number");
            return;
        }

        int i;
        for (i = 2; i < n; i++) {
            if (n % i == 0)
                break;
        }

        if (i == n)
            System.out.println(n + " is a prime number.");
        else
            System.out.println(n + " is not a prime number.");
    }
}
