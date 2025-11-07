import java.util.Arrays;

public class MaxMin{
    public static void main(String[] args) {
        int[] arr = {1,3,23,9,18};
        System.out.println(Arrays.toString(arr));
        System.out.println("Maximum value: "+max(arr));
        System.out.println("Minimum value: "+min(arr));
    }

    static int max(int[] arr){
        int maxVal = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

    static int min(int[] arr){
        int minVal = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(arr[i]<minVal){
                minVal = arr[i];
            }
        }
        return minVal;
    }
}