abstract class Animal{
    //Abstarct method
    abstract void sound();
    //Normal method

    void eat(){
        System.out.println("Animal eats");
    }
}

class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Dog Barks");
    }
    
}


public class Abstraction {
    public static void main(String[] args) {
        Dog d = new Dog();

        d.sound();
        d.eat();
    }
}
