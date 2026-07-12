import java.util.Scanner;

public class Reverseofnumber {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);




       //REVERSE OF A NUMBER 

       int n =27651;
       while(n >0){
       int lastdigit = n%10;
       System.out.print(lastdigit + " ");
       n = n/10; 
       }
       System.out.println();
}
}