import java.util.*;
public class Compareto {
    public static void main (String [] args){
        try(Scanner sc = new Scanner (System.in);){
            System.out.print("Enter a Word: ");
            String s1 = sc.next();
            System.out.print("Enter another Word: ");
            String s2 = sc.next();
            System.out.print("Enter another Word: ");
            String s3 = sc.next();
            System.out.println("Applying .compareTo() method with word 1 and word 2: "+s1.compareTo(s2));
            System.out.println("Applying .compareTo() method with word 1 and word 3: "+s1.compareTo(s3));
            System.out.println("Applying .compareTo() method with word 2 and word 3: "+s2.compareTo(s3));
        }
    }
}
