import java.util.Scanner;

public class Halfpyramid {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);




        //HALF NUMBER PYRAMID




        int enter = sc.nextInt();

        for(int line = 1; line <= enter; line ++){
            for(int number = 1; number <= line; number++){
                System.out.print(number);
            }
            System.out.println();
        }





        


        //REVERSE HALF PYRAMID



        int enterN = sc.nextInt();
        for(int line = 1; line <=enterN; line ++){
            for(int number = 1; number<=enterN - line + 1 ; number++){
                System.out.print(number);
            }
            System.out.println();
        }
       
}
}