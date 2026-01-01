import java.util.Scanner;

public class NeonNum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int square = n*n;
        int sum = 0;
        
        while(square>0){
            int r = square%10;
            sum = sum+r;
            square = square/10;
        }

        if(sum == n){
            System.out.println("The given number is a Neon number");
        }
        else{
            System.out.println("The given number is not a Neon number");
        }
    }
}