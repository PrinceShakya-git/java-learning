import java.util.Scanner;

public class Invertedstar {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        

        //INVERTED STAR PATTERN

        int n = 4;
        for(int line = 1 ; line <= 4 ; line ++){
            for(int stars = 1 ; stars<=n -line+1 ; stars++){
                System.out.print("*");
            }
            System.out.println();
        }

}
}