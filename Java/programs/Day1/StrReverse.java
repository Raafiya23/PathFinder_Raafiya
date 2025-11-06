import java.util.Scanner;

public class StrReverse{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        StringBuilder rev = new StringBuilder(str);
        System.out.println("Reversed String: "+ rev.reverse());
    }
}