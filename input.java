import java.util.*;//a library or module  to help taking inputs

public class input {
    
    public static void main (String args[]){
        try (Scanner sc = new Scanner (System.in)) {
            // String name = sc.next();// using next it will take only one token at a time eg. tony stark it will take only "tony" 
            // System.out.println("the name is " + name);// one kind of concatination
            
            // taking a full sentence 
            String name1 = sc.nextLine();// nextLine will take a full sentence  
            System.out.println("the name is " + name1);// one kind of concatination


            //nextInt() - use to take integer type input 
            //nestFloat() - use to take floating type numbers
            //nextDouble() - use to take double type number
            //nextLong() - use to take long type number
        }

    }
}
