import java.util.*;
public class Stringscompare {
    public static void main(String[] args){
        String str1 = "Prince";
        String str2 = "Prince";
        String str3 = new String("Prince");
        if(str1==str2){
            System.out.println("str1 and str2 are same");
        }
        if(str1==str3){
            System.out.println("str1 and str3 are same");
        }else{
            System.out.println("str1 and str3 are not same");
        }
        // even if they are same they are showing that thwy are not the same because str3
        // is created using new keyword and str1 and str2 are created using string literal
        //so they are not in same memory location but they have same value


        // to check if they have same value we use .equals() meathod
        if(str1.equals(str3)){
            System.out.println("str1 and str3 have same value");
        }
        
    }
}
