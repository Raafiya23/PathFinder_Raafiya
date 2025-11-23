import java.util.Scanner;

public class AlternateTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int value = (i % 2 == 1) ? 1 : 0;  
            for (int j = 1; j <= i; j++) {
                System.out.print(value);
                value = 1 - value;  
            }
            System.out.println();
        }
    }
}
