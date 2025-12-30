import java.util.Scanner;

public class PyramidNum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            for(int k=i;k<=2*i-1;k++){
                System.out.print(k+" ");
            }

            for(int k=2*i-2;k>=i;k--){
                System.out.print(k+" ");
            }

            System.out.println();
        }
    }
}

