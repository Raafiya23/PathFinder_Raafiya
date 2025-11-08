import java.util.Scanner;

public class SecondLargest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter elements: ");
        int[] nums = new int[5];
        int first, second;
        first = second = -1; 
        for(int i = 0; i<nums.length; i++){
            nums[i] = sc.nextInt();
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > first) {
                second = first;  
                first = nums[i]; 
            }
            else if (nums[i] > second && nums[i] != first) {
                second = nums[i];
            }
        }

        System.out.println("Second largest element = " + second);

    }
}