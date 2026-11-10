import java.util.*;
public class largeststring {
    public static void LARGESTSTRING(String fruits[]){
        String largest = fruits[0];
        for(int i = 0; i<fruits.length; i++){
            if(largest.compareToIgnoreCase(fruits[i])<0){
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
    public static void main(String[] args){
        String fruits[] = {"apple" , "banana" , "mango" , "grapes"};
        LARGESTSTRING(fruits);
    }
}
//compareToIgnoreCase() meathod is used to compare two strings lexicographically, ignoring case differences.
//compareToIgnoreCase() returns a negatuve integer if the first string is lexicographically less than the second string.
//and it returns a positive value if the first string is lexicographically greater than the second string.
//It returns 0 if two strings are equal ignoring case differences.



//compareTo() meathod is used to compare two strings lexicographically, but it keeps the case differences in mind.


