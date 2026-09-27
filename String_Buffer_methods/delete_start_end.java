public class delete_start_end {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello World");
        System.out.println(sb.delete(5,11)); // Hello 
        int len = sb.length();
        System.out.println(sb.delete(5,len)); // Hello 
    }
}
