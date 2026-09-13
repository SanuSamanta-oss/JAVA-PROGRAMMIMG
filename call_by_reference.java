public class call_by_reference {
    String name;
    call_by_reference(String name){
        this.name = name;
    }

    static void swap(call_by_reference a, call_by_reference b){
        
        call_by_reference temp = a;
        a = b;
        b = temp;
    }

    public static void main(String[] args) {
        call_by_reference Redcar = new call_by_reference("red");
        call_by_reference BlueCar = new call_by_reference("Blue");

        swap(Redcar , BlueCar);

        System.out.println("Colour of the first car: "+ Redcar.name);
        System.out.println("Colour of the second car: " + BlueCar.name);

    }
}
