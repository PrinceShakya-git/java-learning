import java.util.*;
public class Decimaltobinary {

    public static void dectobin(int n){
        int mynum = n;
        int power = 0;
        int bin = 0;
        while(n>0){
            int rem = n%2;
            bin = bin + rem * (int)Math.pow(10,power);
            power++;
            n = n/2;
        }
        System.out.println("Binary number of " + mynum + " is : " + bin);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dectobin(n);


    }
    
}
