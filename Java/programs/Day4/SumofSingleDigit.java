//import java.util.Scanner;

public class SumofSingleDigit{
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //System.out.printl("Enter elements: ");
        int[] arr = {1,2,5,6,7};
        int n = arr.length;
        int max = arr[0];
        int min = arr[0];
        for(int i = 0; i<n-1; i++){
            if(arr[i]<min){
                min = arr[i];
            }
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.print("Missing numbers: ");
        for(int num = min; num<=max; num++){
            boolean found = false;
            for(int j = 0; j<n; j++){
                if(arr[j]==num){
                    found = true;
                    break;
                }
            }
            if(found==false){
                System.out.print(","+num);
            }
        }
    }
}