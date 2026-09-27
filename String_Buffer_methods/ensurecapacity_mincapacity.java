public class ensurecapacity_mincapacity {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println(sb.capacity()); // 21 
        sb.ensureCapacity(50);
        System.out.println(sb.capacity()); // 50
    }
}
