import java.util.*;
public class updationarrays {
    public static void update(int marks[]){
        for(int i= 0; i<marks.length; i++ ){
            marks[i] = marks[i] + 1;
            System.out.print(marks[i] + " ");
        }
        System.out.println();

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[3];
        System.out.println("Enter the marks of Physics , Chemistry and Maths : ");
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        update(marks);
        
        System.out.println("Percentage = " + (marks[0] + marks[1] + marks[2])/3 + "%");
        System.out.println("Length of arrays is : " + marks.length);

    }
    
}
