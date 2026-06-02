import java.util.*;
public class Smallest {
    public static int getSmallestIndex(int numbers[]){
        int smallest = Integer.MAX_VALUE;
        int index = -1;
        for(int i = 0 ; i<numbers.length ; i++){
            if(smallest> numbers[i]){
                smallest = numbers[i];
                index = i;
            }
        }
        return index;

    }
    public static void main(String[] args){
        int numbers[] = {7,9,12,27,4,2};
        System.out.println("Smallest number is : " + numbers[getSmallestIndex(numbers)]);
        System.out.println("Index of Smallest number is : " + getSmallestIndex(numbers));
        


    }
    
}
