import java.util.*;
public class Inbuiltsortreverse {
    public static void inbuiltsortreverse(Integer array[]){
        Arrays.sort(array, Collections.reverseOrder());
    }

    // for a specific range we can use Arrays.sort(array, startindex , endingindex , Collections.reverseOrder());

    public static void inbuiltsortrangereverse(Integer arr[]){
        Arrays.sort(arr , 0 , 3 , Collections.reverseOrder() );
    }
    public static void printarr(Integer array[]){
        for(int i = 0 ; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        Integer array[] = {8,5,4,9,2};
        Integer arr[] = {3,6,1,4,2,5};
        inbuiltsortreverse(array);
        printarr(array);
        inbuiltsortrangereverse(arr);
        printarr(arr);

    }
    
}
