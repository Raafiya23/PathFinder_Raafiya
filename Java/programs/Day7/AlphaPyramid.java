import java.util.Scanner;

public class AlphaPyramid{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row: ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            
            char currentChar='A';
            for(int k=1; k<=i; k++){
                System.out.print(currentChar);
                currentChar++;
            }

            currentChar-=2;
            for(int k=1; k<=i-1; k++){
                System.out.print(currentChar);
                currentChar--;
            }
            System.out.println();
        }
    }
}