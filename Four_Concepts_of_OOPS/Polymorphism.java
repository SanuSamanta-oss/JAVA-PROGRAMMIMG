class Animal{
    void sound(){
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal{
    @Override 
    void sound(){
        System.out.println("Dog Barks");
    }
}
class Cat extends Animal{
    @Override 
    void sound(){
       System.out.println("Cat Meows"); 
    }
}


public class Polymorphism {
    public static void main(String[] args) {
        Animal d = new Dog();
        Animal c = new Cat();

        d.sound();
        c.sound();
    }
}
