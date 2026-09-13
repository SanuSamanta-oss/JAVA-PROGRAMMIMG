class Pen{
    String Colour;
    String type;

    public void write(){
        System.out.println("Write something");
    }
    public void printColour(){
        System.out.println(this.Colour);
    }
    public void printtype(){
        System.out.println(this.type);
    }
}
public class OOPS{
    public static void main(String[] args) {
    Pen pen1 = new Pen();
    pen1.Colour = "Blue";
    pen1.type = "Gel";


    Pen pen2 = new Pen();
    pen2.Colour = "Black";
    pen2.type = "Ballpoint";

    pen1.printColour();
    pen1.write();

    pen2.printColour();
    pen2.write();
    }

}
