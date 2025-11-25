import java.util.Scanner;

class InvalidAgeException extends Exception{
    public InvalidAgeException(String s){
        super(s);
    }
}

class AgeValidator{
    void checkAge(int age){
        try {
            if(age<0 || age>150){
                throw new InvalidAgeException("Age is invalid");
            }else{
                System.out.println("Valid age");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
public class CustomException{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int age = sc.nextInt();
       AgeValidator a1 = new AgeValidator();
       a1.checkAge(age);
    }
}