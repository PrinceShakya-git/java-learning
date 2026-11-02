import java.util.*;
public class forevenno {

    public static boolean isEven(int n){
        if(n%2!=0){
            return false;
        }else{
            return true;
        }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        if(isEven(n)){
            System.out.println(n + " is a Even Number");
        }else{
            System.out.println(n + " is a Odd Number");
        }


    }
}
