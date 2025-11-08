import java.util.Scanner;

public class SumofArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter elements: ");
        int[] nums = new int[5];
        int sum = 0;
        int i = 0;
        for(i = 0; i<nums.length; i++){
            nums[i] = sc.nextInt();
        }
        for(i = 0; i<nums.length; i++){
            sum = sum+nums[i];
        }
        System.out.println("Sum: "+sum);
    }
}