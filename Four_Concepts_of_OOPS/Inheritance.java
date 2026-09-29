class Animal{
    void eats(){
        System.out.println("Animal eats");
    }
}

class Dog extends Animal{
    void sound(){
        System.out.println("Dog Barks");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Dog d = new Dog();

        d.eats();
        d.sound();
    }
    
}
