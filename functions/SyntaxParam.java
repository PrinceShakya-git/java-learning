import java.util.*;


//SYNTAX
//  return type name( type param 1 , type param 2){
//  //body
//  return statement;
// }



public static int calculateSUM(int num1 , int num2){    // Paramaters Or Formal Parametrs
        int sum = num1 + num2; 
        return sum;
    }

    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculateSUM( a , b );              // Arguments Or Actual Parameters
        System.out.println("Your Sum Is:" + sum);
    }
