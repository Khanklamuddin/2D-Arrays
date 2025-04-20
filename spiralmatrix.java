import java.util.*;
public class spiralmatrix{
    
    public static void printSpiral(int matrix[][]) {
        // 4 variable define karenge
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1; // (n-1) endrow
        int endCol = matrix[0].length-1; // (m-1) endcolumn

        while(startRow <= endRow && startCol <=endCol) {
            //top ko print karenge 
            for(int j=startCol; j<=endCol; j++){ // j is used for column
                System.out.print(matrix[startRow][j]+ " ");
            }
            // right boundry ko print karenge 
            for(int i=startRow+1; i<=endRow; i++) {
                System.out.print(matrix[i][endCol]+ " ");
            }

            // bottom boundry ko print karenge 
            for(int j=endCol-1; j>=startCol; j--) {
                if(startRow == endRow) {
                    break;
                }
                System.out.print(matrix[endRow][j]+ " ");
            }
            // left boundry ko print karenge 
            for(int i= endRow-1; i>= startRow+1; i--) {
                if(startCol == endCol){
                    break;
                }
                System.out.print(matrix[i][startCol]+ " ");
            }

            startCol++;
            startRow++;
            endCol--;
            endRow--;

        }
        System.out.println();
    }


    public static void main(String args[]) {
        int matrix[][] = {{1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12},
                          {13,14,15,16}};

            printSpiral(matrix);
        
    }
}