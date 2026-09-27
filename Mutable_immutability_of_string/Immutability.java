public class Immutability {
    public static void main(String[] args) {
        String s = "Hello";
        String new_s = s + " World";

        System.out.println(s); // Hello
        System.out.println(new_s); // Hello World
    }
}
