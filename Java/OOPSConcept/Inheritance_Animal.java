class Animal{
    String name;
    int age;
    void makeSound(){
        System.out.println("Animal makes sound..");
    }
}

class Dog extends Animal{
    String breed;

    @Override
    void makeSound(){
        System.out.println("Dog barks..");
    }
    void fetch(){
        System.out.println("Dog is fetching..");
    }
}

class Cat extends Animal{
    String color;
    
    @Override
    void makeSound(){
        System.out.println("Cat meows..");
    }
    void climb(){
        System.out.println("Cat is climbing..");
    }
}

public class Inheritance_Animal{
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name="Tommy";
        dog.age=2;
        dog.breed="Golden";
        dog.makeSound();
        dog.fetch();
        System.out.println("-----------");
        Cat cat = new Cat();
        cat.name="Tiger";
        cat.age=2;
        cat.color="White";
        cat.makeSound();
        cat.climb();
    }
}