import java.util.*;

public class if_else_statements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ////CONCEPT: About using if-else statement with condition
        // System.out.println("Enter your actual age : ");
        // int age = sc.nextInt();

        // if (age >= 18){
        //     System.out.println("You are an adult.");
        // }
        // else{
        //     System.out.println("You are not an adult , you are a baccha.");
        // }

        ////QUESTION : Taking a number as input and check if the number is even or odd

        // System.out.println("Enter your desirable number: ");
        // int num = sc.nextInt();

        // if ( num % 2 == 0){
        //     System.out.println("Congrats!!\nYour number is even.");
        // }
        // else{
        //     System.out.println("Your number is damn odd.");
        // }

        ////QUESTION : Taking two input a and b andd check a=b / a>b /a<b

        System.out.println("Enter your first number: ");
        int a = sc.nextInt();
        System.out.println("Enter your second number: ");
        int b = sc.nextInt();

        if ( a== b){
            System.out.printf("NUM_01 = %d and NUM_02 = %d are equal", a , b);
        }else if ( a > b){
            System.out.printf("NUM_01 = %d is Greater than NUM_02 = %d", a , b);
        }
        else{
            System.out.printf("NUM_01 = %d is Less than NUM_02 = %d", a , b);
        }

    }
    
}

