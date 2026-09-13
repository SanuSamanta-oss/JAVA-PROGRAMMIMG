import java.util.*;


public class prime_num{


    // function for input

    static int input(){
        try(Scanner sc =  new Scanner(System.in)){

        System.out.print("Enter the number to check prime or not: ");
        int n = sc.nextInt();

        
        return n;

        }
    }


    // function for the logic
    static void isprime(int n){

        boolean prime = true;
        
        if(n <= 1){
            prime = false;
        }
        else{
            for (int i = 2; i < n; i++){
                if(n % i == 0){
                    prime = false;
                    break;
                }
            }
        }
        if(prime){
            System.out.println(n + "is a Prime number");
        }
        else{
            System.out.println(n + "isn't a prime number");
        }
    }
    public static void main(String[] args) {
        int number = input();
        isprime(number);
    }
}
