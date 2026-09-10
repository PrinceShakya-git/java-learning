import java.util.*;
public class largest {
    public static int getlargest(int numbers[]){
        int largest = Integer.MIN_VALUE;
        int index = -1;
        for(int i = 0 ; i<numbers.length; i++){
            if(largest< numbers[i]){
                largest = numbers[i];
                index = i;
            }
        }
        return index;

    }
    public static void main(String[] args){
        int numbers[] = {2,4,5,7,9,17,27};
        System.out.println("Largest number is : " + numbers[getlargest(numbers)]);
        System.out.println("Index of largest number is : " + getlargest(numbers));
        


    }
    
}
