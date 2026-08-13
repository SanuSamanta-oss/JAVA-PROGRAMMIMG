import java.util.*;

public class Odd_or_Even {
    public static void main(String[] args) {
        System.out.println("Want to show what is even and odd");
        int num1, num2;
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter your first number: ");
        num1 = sc.nextInt();

        System.out.print("Enter your second number: ");
        num2 =  sc.nextInt();

        if (num1 % 2 == 0 ){
            System.out.printf("%d is Even number !!",num1);
        }else if(num2 % 2 == 0){
            System.err.println(num2+"is even number !!");
        }else{
            System.out.println("both are odd number !");
        }

    }
    
}
