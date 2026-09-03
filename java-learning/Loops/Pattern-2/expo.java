import java.util.*;
public class expo {
    public static void tri(int n){
        for(int line = 1; line<=n; line++){
            for(int star = 1; star<=n-line+1; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines: ");
        int n = sc.nextInt();
        tri(n);


    }
    
}
