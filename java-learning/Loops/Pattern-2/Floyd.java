import java.util.*;
public class Floyd {

    public static void floyds(int n){
        int number = 1;
        for(int line = 1 ; line <= n ; line++){
            for(int num = 1 ; num<=line; num++){
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines: ");
        int n = sc.nextInt();
        floyds(n);

    }
    
    
}
