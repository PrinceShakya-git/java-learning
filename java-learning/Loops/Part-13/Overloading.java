public class Overloading {

    public static int sum (int num1 , int num2){
        return num1+num2;
    }

    public static float sum (float num1 , float num2){
        return num1+num2;
    }

    public static int sum (int num1 , int num2 , int num3){
        return num1+num2+num3;
    }
    public static void main(String[] args) throws Exception{
        System.out.println(sum(3,7));
        System.out.println(sum (3.5f , 7.8f));
        System.out.println(sum(3,7,10));

    }
}
