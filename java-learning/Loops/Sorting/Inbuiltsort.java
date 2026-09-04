import java.util.*;
public class Inbuiltsort {
    public static void inbuiltsort(int array[]){
        Arrays.sort(array);

    }

    // for a specific range of array we can use Arrays.sort(array, startindex , endingindex);

public static void inbuiltsortrange(int arr[]){
    Arrays.sort(arr, 0 , 4);
}
    public static void printarr(int array[]){
        for(int i = 0 ; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        int array[] = {7,9,8,2,4,5,2,1};
        int arr[] = {9,3,6,5,2,8,1,4};
        inbuiltsort(array);
        printarr(array);
        inbuiltsortrange(arr);
        printarr(arr);
    }
    
}
