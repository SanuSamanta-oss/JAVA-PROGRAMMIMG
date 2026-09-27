public class insert_offset_value {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello World");
        sb.insert(5, ',');
        System.out.println(sb); // Hello, World
    }
}
