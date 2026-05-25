import java.util.*;
public class productab {


    public static int multiply(int num1, int num2){
        int mul = num1*num2;
        return mul;
    }
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Product: " + multiply(a , b));



    }
}
