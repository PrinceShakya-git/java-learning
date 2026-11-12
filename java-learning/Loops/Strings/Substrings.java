import java.util.*;
public class Substrings {
    public static void substring(String str, int si , int ei){
        String substr = "";
        for(int i = si ; i<ei ; i++){
            substr += str.charAt(i);                       //logic behind inbuilt substring mathod
        }
        System.out.println(substr);
    }
    public static void main(String[] args){
        String str = "Prince Shakya";
        substring(str , 0 , 5);
        System.out.println(str.substring(0,5));           //inbuilt substring meathod
    }
}
