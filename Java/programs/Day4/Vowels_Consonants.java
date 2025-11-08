import java.util.Scanner;

public class Vowels_Consonants{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = sc.nextLine();
        int vowels = 0, consonants = 0;
        for(int i = 0; i<word.length(); i++){
            char ch = word.charAt(i);
            if(ch>='a' && ch<='z'){
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                    vowels++;
                }
                else{
                    consonants++;
                }
            }
        }
        System.out.println("Vowels count: "+vowels);
        System.out.println("Consonants count: "+consonants);
    }
}