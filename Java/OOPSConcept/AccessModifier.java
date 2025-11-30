class Person{
    public String name;
    protected int age;
    private String socialSecurityNum;
    String address;
    Person(String name, int age, String ssn, String addr){
        this.name=name;
        this.age=age;
        this.socialSecurityNum=ssn;
        this.address=addr;
    }
} 

class Employee extends Person{

    public Employee(String name, int age, String ssn, String addr) {
        super(name, age, ssn, addr);
        System.out.println("Hello Employee");
    }
    
}
public class AccessModifier{
    public static void main(String[] args) {
        Employee e1 = new Employee("John", 23, "xyz", "Chennai") ;
        System.out.println(e1.name);
        System.out.println(e1.age);
        //System.out.println(e1.ssn);
        System.out.println(e1.address);
    }
}