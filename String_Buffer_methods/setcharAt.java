public class setcharAt {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.setCharAt(0, 'J');
        System.out.println(sb);// Jello
    }
}
