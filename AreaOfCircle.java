import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius");
        int r = sc.nextInt();
        System.out.println("Area:"+(3.14*r*r));
    }
}
