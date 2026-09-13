import java.util.*;
public class Charat {
    public static void main (String [] args){
        try(Scanner sc = new Scanner (System.in);){
            System.out.print("Enter a Text: ");
            String text = sc.nextLine();
            System.out.println("The Given Text is: "+text);
            System.out.print("Enter the index number which you want to find: ");
            int input = sc.nextInt();
            System.out.println("The character in the index number "+input+" is: "+text.charAt(input));
        }
    }
}
