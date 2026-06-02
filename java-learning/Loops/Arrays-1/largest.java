import java.util.*;
public class largest {
    public static int getlargest(int numbers[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0 ; i<numbers.length; i++){
            if(largest< numbers[i]){
                largest = numbers[i];
            }
        }
        return largest;

    }
    public static void main(String[] args){
        int numbers[] = {2,4,5,7,9,17,27};
        System.out.println("Largest number is : " + getlargest(numbers));
        


    }
    
}
