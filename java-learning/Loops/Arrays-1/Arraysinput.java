import java.util.*;
public class Arraysinput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[100];
        System.out.println("Enter the marks of physics , chemistry and maths : ");
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println("physics = " + marks[0]);
        System.out.println("Chemistry = " + marks[1]);
        System.out.println("Maths = " + marks[2]);

        int percentage = (marks[0] + marks[1] + marks[2])/3;
        System.out.println("Percentage = " + percentage + "%");
        

        


    }
    
}
