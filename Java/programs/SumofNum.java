import java.util.Scanner;

public class SumofNum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int N = sc.nextInt();
        int sum = N * (N+1)/2;
        System.out.println("Sum first n numbers: "+sum);
    }
}