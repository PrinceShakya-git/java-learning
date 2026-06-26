import java.util.*;
public class Reversearray {
    public static void reverse(int numbers[]){
        int first = 0 ; int last = numbers.length-1;
        while(first<last){
            int temporary = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temporary;
            first++;
            last--;
        }
        for(int i = 0 ; i<numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

    }
    public static void main(String[] args){
        int numbers[] = {2,4,6,8,10};
        reverse(numbers);

    }
    
}
