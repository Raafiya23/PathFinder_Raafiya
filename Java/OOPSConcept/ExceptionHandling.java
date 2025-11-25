class DivisionExample{
    void divideNumbers(int num, int den){
        try {
            int result = num/den;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
    }
}
public class ExceptionHandling{
    public static void main(String[] args) {
        DivisionExample div1 = new DivisionExample();
        div1.divideNumbers(12, 3);

       // DivisionExample div2 = new DivisionExample();
        //div2.divideNumbers(10, 0);
    }
}