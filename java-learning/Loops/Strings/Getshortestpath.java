import java.util.*;
public class Getshortestpath {
    public static float Getshortest(String path){
        int x = 0 ;
        int y = 0;
        for(int i = 0 ; i<path.length(); i++){
            char dir = path.charAt(i);
            if(dir=='N'){
                y++;
            }
            else if(dir=='S'){
                y--;
            }
            else if(dir=='E'){
                x++;
            }
            else if(dir=='W'){
                x--;
            }
            }
            int x2 = x*x;
            int y2 = y*y;
            float distance = (float)Math.sqrt(x2+y2);
            return distance;
        }
        
    public static void main(String[] args){
        String path = "WNEENESENNN";
        System.out.println(Getshortest(path));
    }
}
    

