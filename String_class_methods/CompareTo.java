public class CompareTo{
    public static void main(String[] args) {
        String s1 = "Apple";
        String s2 = "Banana";
        String s3 = "Apple";

        System.out.println("Comparing s1 and s2: " + s1.compareTo(s2));// -1
        System.out.println("Comparing s1 and s3: " + s1.compareTo(s3));// 0
    }
}