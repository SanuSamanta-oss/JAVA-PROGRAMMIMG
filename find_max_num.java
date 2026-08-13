import java.util.*;

public class find_max_num {
    public static void main(String[] args) {
        System.out.println("Wanna find max number between three numbers ?");
        System.out.println("Follow me ...!!");
        int num1 , num2 , num3 ;

        try(Scanner sc = new Scanner(System.in)){

        System.out.print("Enter your first number: ");
        num1 = sc.nextInt();

        System.out.print("Enter your second number: ");
        num2 = sc.nextInt();

        System.out.print("Enter your third number: ");
        num3 = sc.nextInt();
        int largest = Math.max(num1 , Math.max(num2 , num3));

        System.out.printf("\nLargest number is %d", largest);
        }

    }
}
