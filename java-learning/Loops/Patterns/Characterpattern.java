import java.util.Scanner;

public class Characterpattern {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        

        //CHARACTERS PATTERN 


        

        int n = 4;
        char ch = 'A';
        for(int i = 1 ; i<=n ; i++){
            for(int chars = 1; chars<=i ; chars++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
        






    }
}
