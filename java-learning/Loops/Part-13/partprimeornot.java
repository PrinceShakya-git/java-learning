import java.util.*;

public class partprimeornot {

    public static boolean isPrime(int num){
        if(num ==2){
            return true;
        }
        for(int i = 2; i<Math.sqrt(num); i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;




    }
    public static void main(String[]args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(isPrime(num) ==true){
            System.out.println(num +" Is a Prime Number");
        }else{
            System.out.println(num + " Is Not A Prime Number");
        }

    }
}

