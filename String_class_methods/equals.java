public class equals{
    public static void main(String[] args) {
        String s1 = "apple";
        String s2 = "guava";
        String s3 = "apple";

        System.out.println(s1.equals(s2));// false
        System.out.println(s1.equals(s3));// true
        System.out.println(s2.equals(s3));// false
    }
}