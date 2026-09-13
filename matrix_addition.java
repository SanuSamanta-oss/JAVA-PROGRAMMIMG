import java.util.*;

public class matrix_addition {
    public static void main(String[] args) {
        
    
    try{Scanner sc = new Scanner(System.in);

        int ROWS = 3;
        int COLS =  3;

        int [] [] matrix1 = new int[ROWS] [COLS];
        int [] [] matrix2 = new int[ROWS] [COLS];
        int [] [] sum_matrix = new int[ROWS] [COLS];

    
        System.out.println("Enter your elements for your first 3x3 matrix: ");
        for(int i = 0; i < 3 ; i++){
            for(int j = 0; j < 3 ; j++){
                System.out.println("element [" + i +"][" + j +"]");

                matrix1[i][j] = sc.nextInt();

            }
        }
        System.out.println("Enter your elements for your second 3X3 matrix: ");
        for( int i = 0;i<3;i++){
            for(int j = 0; j< 3;j++){
                System.out.println("Element [" + i +"][" + j + "]");
                matrix2[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter your elements for matrix sum: ");
        for( int i = 0;i<3;i++){
            for(int j = 0; j< 3;j++){
                sum_matrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println("Sum of the two matrixs: ");
        for(int i = 0; i<3; i++){
            for(int j = 0; j < 3;j++){
                System.out.println(sum_matrix[i][j] + " ");
            }
        }System.out.println();
    }
    
}

