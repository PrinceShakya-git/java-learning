import java.util.*;
public class Subarrayssum {
    public static void subarrayssum(int numbers[]){
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;

        for(int i = 0 ; i<numbers.length; i++){
            int start = i;
            for(int j = i ; j<numbers.length ; j++){
                int end = j;
                currsum = 0;
                for(int k = start ; k<=end ; k++){
                    System.out.print(numbers[k] + " ");
                    currsum += numbers[k];
                }
                System.out.println();
                System.out.println("Current sum: " + currsum);
                if(maxsum<currsum){
                maxsum = currsum;
            }
            }
        }
        System.out.println("Your max sum is : " + maxsum);


    }
    public static void main(String[] args){
        int numbers[] = {-1,2,4,6,-3};
        subarrayssum(numbers);

    }
    
}
