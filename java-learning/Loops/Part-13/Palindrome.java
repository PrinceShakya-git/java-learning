import java.util.*;

public class Palindrome {
    public static boolean isPalindrome(int n){
        int original = n;
        int reverse = 0;
        while(n>0){
            int lastdigit = n%10;
            reverse = reverse*10 + lastdigit;
            n = n/10;
        }
        if (original != reverse){
            return false;
        }else{
            return true;
        }
            
        }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number: ");
        int n = sc.nextInt();
        if(isPalindrome(n)){
            System.out.println(n + " is a Palindrome Number");
        }else{
            System.out.println(n + " is not a Palindrome Number");
        }
    }
    
}



    
    

