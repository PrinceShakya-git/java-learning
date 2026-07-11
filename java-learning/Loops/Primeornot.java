import java.util.Scanner;

public class Primeornot {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);





       //A NUMBER IS PRIME OR NOT


       System.out.println("Enter Your Number: ");
       int n = sc.nextInt();
       if(n == 2){
        System.out.println("2 Is A Prime Number");
       }else{
       boolean isprime = true;
       
       for(int i = 2; i<Math.sqrt(n); i++){
        if(n % i == 0){
            isprime = false;
            break;
        }
        }

        if(isprime == true){
            System.out.println( n + "Is A Prime Number");
        }else{
            System.out.println( n + "Is Not A Prime Number");
        }}
}
}