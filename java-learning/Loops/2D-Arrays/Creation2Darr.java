import java.util.*;
public class Creation2Darr {                        // Function to search for a key in the 2D array
    public static boolean search(int Matrix[][] , int key){
        for(int i = 0 ; i < Matrix.length ; i++){
            for(int j = 0 ; j<Matrix[0].length ; j++){
                if(Matrix[i][j] == key){
                    System.out.println("Key Found at cell (" + i + "," + j + ")");
                    return true;
                }
            }
        }
        System.out.println("Key Not Found");
        return false;
    }
    public static void main(String[] args){        //Function to create 2D array and take input from user
        int Matrix[][] = new int [3][3];
        Scanner sc = new Scanner(System.in);
        int n = Matrix.length; int m = Matrix[0].length;
        for(int i = 0 ; i<n; i++){
            for(int j = 0 ; j<m; j++){
                Matrix[i][j] = sc.nextInt();
            }
        }
        for(int i = 0 ; i<n; i++){
            for(int j = 0 ; j<m; j++){
                System.out.print(Matrix[i][j] + " " );
            }
            System.out.println();
        }
        System.out.print("Enter the key to search: ");
        int key = sc.nextInt();
        search(Matrix, key);
    }
}

