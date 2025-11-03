import java.util.Scanner;

public class School{
    String passorfail(int score){
        if(score < 35){
            return "Fail";
        }else{
            return "Pass";
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter mark: ");
        int tot_marks = sc.nextInt();
        School obj = new School();
        String result = obj.passorfail(tot_marks);
        System.out.println(result);
    }
}