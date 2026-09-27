public class Mutability{
    public static void main(String[] args) {
        // mutable StringBuffer

        StringBuffer sb = new StringBuffer("Hello");
        StringBuffer original = sb;
        sb.append(" World");
        System.out.println(original); // Hello World
        System.out.println(sb); //Hello World
    }
}
