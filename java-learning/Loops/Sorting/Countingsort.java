import java.util.*;
public class Countingsort {
    public static void Countingsort(int array[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0 ; i<array.length; i++){
            largest = Math.max(largest, array[i]);
        }
        int count[] = new int[largest+1];
        for(int i = 0; i<array.length; i++){
            count[array[i]]++;
        }
        int j = 0 ; 
        for(int i = 0 ; i<count.length; i++){
            while(count[i] > 0){
                array[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    public static void printarr(int array[]){
        for(int i = 0 ; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int array[] = {1,4,1,2,7,5,2};
        Countingsort(array);
        printarr(array);
    }
    
}
