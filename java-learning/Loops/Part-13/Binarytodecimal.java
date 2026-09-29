import java.util.*;
public class Binarytodecimal {

    public static void bintodec(int bin){
        int mynum = bin;
        int decnum = 0;
        int power = 0;
        while(bin>0){
            int lastdigit = bin%10;
            decnum = decnum + lastdigit * (int)Math.pow(2, power);
            power++;
            bin = bin/10;

        }
        System.out.println("Decimal number of " + mynum + " is:  " + decnum);

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int bin = sc.nextInt();
        bintodec(bin);

    }
}
