public class command_line_demo{
    public static void main(String[] args) {
        System.out.println("Count:" + args.length);
        for (String a : args) System.out.println(a); // count : 0
    }
}