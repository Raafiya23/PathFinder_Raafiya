import java.util.Scanner;

public class CharIncreasePattern{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        for (int i=1; i<=n; i++) {
            char currentChar='A';
            for(int j=1; j<=i; j++){
                System.out.print(currentChar);
                currentChar++;
            }
            System.out.println();
        }
    }
}