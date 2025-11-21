import java.util.Scanner;

public class AlternateTriangle{
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter row: ");
            int n = sc.nextInt();;
            for (int i = 1; i <= n; i++) {
                int value;
                if (i % 2 == 1) {
                    value = 1;   
                } else {
                    value = 0;   
                }

                for (int j = 1; j <= i; j++) {
                    System.out.print(value);
                    if (value == 1) {
                        value = 0;
                    } else {
                        value = 1;
                    }
                }
                System.out.println();
            }
    }
}