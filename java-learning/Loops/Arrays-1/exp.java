import java.util.*;
public class exp {
    public static int linearsearch(String menu[] , String key){
        for(int i = 0; i<menu.length; i++){
            if(menu[i].equals(key)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String menu[] = {"Pizza", "Burger" , "Dosa" , "Paneer" , "Samosa"};
        System.out.println("Enter the key to search in the menu : ");
        String key = sc.nextLine();
        int found = linearsearch(menu, key);
        if(found != -1){
            System.out.println("Key is found in the menu at index " + found);
        } else {
            System.out.println("Key is not found in the menu");
        }



    }
    
}
