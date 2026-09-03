import java.util.*;
public class Insertionsort {
    public static void Insertionsort(int array[]){
        for(int i = 1; i<array.length; i++){
            int current = array[i];
            int prev = i-1;
            while(prev>=0 && array[prev] > current){
                array[prev+1] = array[prev];
                prev--;
            }
            array[prev+1] = current;
        }
    }
    public static void printarr(int array[]){
        for(int i = 0 ; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int array[] = {6,8,9,3,5,7};
        Insertionsort(array);
        printarr(array);
    }
}

    

