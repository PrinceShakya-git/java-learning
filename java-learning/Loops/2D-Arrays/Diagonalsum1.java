import java.util.*;
public class Diagonalsum1 {
    // Optimised approach
    public static void DiagonalSum(int matrix[][]){
        int sum = 0 ; 
        for(int i = 0 ; i<matrix.length; i++){
            // primary diagonal
            sum+= matrix[i][i];
            // secondary sum
            if(i != matrix.length-1-i){
                sum+= matrix[i][matrix.length-1-i];
            }
        }
        System.out.println("Diagonal sum : " + sum);
    }
    public static void main(String[] args){
        int matrix[][] = {{1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12},
                          {13,14,15,16}};
        DiagonalSum(matrix);
    }
    
    
}
