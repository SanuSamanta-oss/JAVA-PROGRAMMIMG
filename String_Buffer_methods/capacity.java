public class capacity {
    public static void main(String[] args) {
        
        StringBuffer sb = new StringBuffer(); // By default '16'
        StringBuffer bs = new StringBuffer("Hello"); // default + 5(for 'Hello') = 16 + 5 =21

        System.out.println(sb.capacity());
        System.out.println(bs.capacity());
    }

}
