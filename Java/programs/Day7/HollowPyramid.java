import java.util.Scanner;

public class HollowPyramid{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row: ");
        int n = sc.nextInt();

        for(int i = 1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            if(i==1) {
                System.out.println("*");
            }

            else if (i==n) {
                for (int k=1; k<=2*n-1; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            else {
                System.out.print("*");  
                for (int s=1; s<=(2*i-3); s++) {
                    System.out.print(" ");
                }
                System.out.print("*");  
                System.out.println();
            }
        }  
    }
}