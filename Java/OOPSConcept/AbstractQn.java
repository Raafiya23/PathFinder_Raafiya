abstract class Animals{
    String name;
    Animals(String name){
        this.name=name;
    }
    abstract void makesSound();
}

class Dogs extends Animals{
    Dogs(String name){
        super(name);
    }

    void makesSound(){
        System.out.println("Bow bow....");
    }
}

class Cats extends Animals{
    Cats(String name){
        super(name);
    }

    void makesSound(){
        System.out.println("Meow meow....");
    }
}

public class AbstractQn{
    public static void main(String[] args) {
        Dogs d1 = new Dogs("Fudge");
        System.out.println(d1.name);
        d1.makesSound();

        Cats c1 = new Cats("Angela");
        System.out.println(c1.name);
        c1.makesSound();        
    }
}