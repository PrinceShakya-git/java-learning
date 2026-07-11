import java.util.Scanner;

public class Factorialnumber {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);


        //FACTORIAL OF A NUMBER



       System.out.println("Enter Your Number:");
       int n = sc.nextInt();
       int fact = 1;
       for(int i = 1; i<=n; i++ ){
        fact *= i;
       }
       System.out.println("Your Factorial is:" + fact);
}
}