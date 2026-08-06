import java.util.*;
public class Sumofdigits {
    public static int sumdigits(int n){
        int sum= 0;
        while(n>0){
            int lastdigit = n % 10;
            sum += lastdigit;
            n /= 10;

        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n = sc.nextInt();
        System.out.println("Sum of Digits: " + sumdigits(n));
        
    }
}
