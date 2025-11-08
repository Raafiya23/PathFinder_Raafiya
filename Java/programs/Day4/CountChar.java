import java.util.Scanner;

public class CountChar{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = sc.nextLine();
        int count = 0;
        for(int i = 0; i<word.length(); i++){
            char ch = word.charAt(i);
            if(ch>='a' && ch<='z'){
                count++;
            }
        }
        System.out.println("Count: "+count);
    }
}