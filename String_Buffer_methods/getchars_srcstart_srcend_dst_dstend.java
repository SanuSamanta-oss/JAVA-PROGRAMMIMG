public class getchars_srcstart_srcend_dst_dstend {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        char [] dst = new char[5];
        sb.getChars(0, 5, dst, 0);
        System.out.println(new String (dst)); // Hello
    }
}
