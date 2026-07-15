//question: find sum of two input integer numbers

import java.util.*;

public class Q_input {
    public static void main (String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your first number:");
            int a = sc.nextInt();
            System.out.println("Enter your second number:");
            int b = sc.nextInt();
            int sum = a + b;
            System.out.printf("Sum of %d and %d is :", a , b , sum);
            System.out.println(sum);
        }
    }
    
}
