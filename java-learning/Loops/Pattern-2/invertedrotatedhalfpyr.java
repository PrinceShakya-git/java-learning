import java.util.*;

public class invertedrotatedhalfpyr {

    public static void inverted_rotated_half_pyramid(int n){
        for(int line = 1; line<=n; line++){
            for(int space = 1; space<=n-line; space++){
                System.out.print(" ");
            }
            for(int star = 1; star<=line; star++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of lines: ");
            int n = sc.nextInt();
            inverted_rotated_half_pyramid(n);
        }
    }
    
}
