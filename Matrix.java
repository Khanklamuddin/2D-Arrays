import java.util.*;
public class Matrix{
    // 2D ARRAYS 
    public static boolean search(int matrix[][], int key) {
        // search for cell using function
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                if(matrix[i][j]==key){
                    System.out.println("found at index (" + i +","+"j)");
                    return true;
                    
                }
            }
        }
        System.out.println("not found key");
        return false;
    }


    public static void main(String args[]) {
        int matrix[][] = new int[3][3];
      int n = matrix.length, m = matrix[0].length;

        Scanner sc = new Scanner(System.in);
        // n row ka lenght hai
        for(int i=0; i<n; i++) {
            // j colum ka lenght hai
            for(int j=0; j<m; j++){
            matrix[i][j] = sc.nextInt();
        }
        
        }
        // output 
        // pahle hum row wise travel karenge phir column wise 
         for(int i=0; i<n; i++) {
            // j colum ke liye hai 
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j] + " ");
            matrix[i][j] = sc.nextInt();
        }
        System.out.println();
        
        }
       search(matrix,5);
    }
}
