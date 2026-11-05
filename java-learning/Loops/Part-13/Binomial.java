import java.util.*;

public class Binomial {

    public static int factorial(int num){
        int fact = 1;
        for(int i = 1 ; i <=num ; i++){
             fact*= i ;
        }
        return fact;

    }

    // Binomial Coeffcient = n! / (r! * (n-r)!)

    public static int binomialcoefficient(int n , int r){
        int ret = factorial(n) / (factorial(r) * factorial(n-r));
        return ret;
    }


    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println("Binomial Coefficient is : " + binomialcoefficient(n , r));
        
    }
}
