
import java.util.*;

public class call_by_value {
    
    static void swap(int a, int b){
        System.out.println("Before swapping: " );
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping: " );
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter your second number: ");
        int num2 = sc.nextInt();

        swap(num1,num2);
        sc.close();
        
    }
}
