import java.util.*;


public class switch_case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //// using if-elseif-else 
        // System.out.println("Welcome Home !!\nThere present three buttons...\nWhich one are you clicking? : ");
        // int button = sc.nextInt();

        // if ( button == 1 ){
        //     System.out.println("HELLO !!");
        // }else if ( button == 2 ){
        //     System.out.println("NAMASTE !!");
        // }else if ( button == 3 ){
        //     System.out.println("BONJOUR !!");
        // }else{
        //     System.out.println("Input is invalid !");
        // }
        System.out.println("Welcome Home !!\nThere present three buttons...\nWhich one are you clicking? : ");
        int button = sc.nextInt();
        switch ( button ){
            case 1:
                System.out.println("HELLO !!");
                break;
            case 2:
                System.out.println("NAMASTE !!");
                break;
            case 3:
                System.out.println("BONJOUR !!");
                break;
            default:
                System.out.println("INVALID!");
        }   
    }
}
