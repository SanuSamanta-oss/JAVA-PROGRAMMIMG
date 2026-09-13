public class String_Mutable{
    public static void main (String [] args){
        StringBuilder sb = new StringBuilder("Apple");
        System.out.println("Original String: "+sb);
        sb.append(" Banana");
        System.out.println("After Appending: "+sb);
        sb.replace(0, 5, "Hi ");
        System.out.println("After Replacing: "+sb);
        sb.insert(3, "Programming ");
        System.out.println("After Inserting: "+sb);
        sb.delete(0,3);
        System.out.println("After Deleting: "+sb);
    }
}