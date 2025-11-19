class Animal{
    public void makesound(){
        System.out.println("Animal makes sound..");
    }
}

class Dog extends Animal{
    public void eats(){
        System.out.println("Dogs eats bone..");
    }
}

class Cat extends Dog{
    public void sound(){
        System.out.println("Cat makes sound meow meow..");
    }
}

public class Inheritance{
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makesound();
        System.out.println("-----------");
        Cat cat = new Cat();
        cat.sound();
        cat.eats();
    }
}