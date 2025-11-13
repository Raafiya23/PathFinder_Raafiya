import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int mid = (n/2)+1; 
        for (int i = 1; i<=mid; i++){
            for (int j = 1; j<=mid-i; j++){
                System.out.print(" ");
            }
            for (int k = 1; k<=(2*i-1); k++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = mid-1; i>=1; i--){
            for (int j = 1; j<=mid-i; j++){
                System.out.print(" ");
            }
            for (int k = 1; k<=(2*i-1); k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
