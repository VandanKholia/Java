
import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter marks of sub1:");
        int sub1 = sc.nextInt();
        
        System.out.print("Enter marks of sub2:");
        int sub2 = sc.nextInt();
        
        System.out.print("Enter marks of sub3:");
        int sub3 = sc.nextInt();
        
        System.out.print("Enter marks of sub4:");
        int sub4 = sc.nextInt();
        
        System.out.print("Enter marks of sub5:");
        int sub5 = sc.nextInt();

        double per = ((sub1+sub2+sub3+sub4+sub5)/500)*100;

        if(per>=60) {
            System.out.println("First division");
        }
        else if(per>=50) {
            System.out.println("Second division");
        }
        else if(per>=40) {
            System.out.println("Third division");
        }
        else{
            System.out.println("Fail");
        }
    }
}
