import java.util.Scanner;

public class details {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name:");
        String name = sc.next();
        System.out.print("Enter rollno:");
        int rollno = sc.nextInt();
        System.out.print("Enter sem:");
        int sem = sc.nextInt();
        System.out.println("Sum:"+(rollno+sem));
    }
}
