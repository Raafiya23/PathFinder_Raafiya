import java.util.Scanner;

public class Find{

    void evenorodd(int num){
       if(num%2==0){
        System.out.println(num+" is even");
       }
       else{
        System.out.println(num+" is odd");
       }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int number = sc.nextInt();
        Find obj = new Find();
        obj.evenorodd(number);
    }
}