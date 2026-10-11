import java.util.*;
public class Linearsearch {
    public static int linearsearch(int numbers[] , int key){
        for(int i = 0 ; i<numbers.length; i++ ){
            if(numbers[i] == key){
                return i;
            }
        }
        return -1;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numbers[] = {2,3,4,5,10,12,14,9,8};
        System.out.println("Enter the key to search : ");
        int key = sc.nextInt();
        int index = linearsearch(numbers, key);
        if(index == -1){
            System.out.println("Key is not found in the array");   
        } else {
            System.out.println("Key is found at index: " + index);
        }
    }
    
}
