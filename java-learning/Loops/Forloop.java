import java.util.Scanner;



public class Forloop {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        
        //FOR LOOP

        int n = sc.nextInt();
        int mul =1;
        for(int i = 1 ; i<=n;  i++){
            mul *= i;
        }
        System.out.println(mul);
        sc.close();
    
}
}