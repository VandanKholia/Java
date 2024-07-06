import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1:");
        int num1 = sc.nextInt();
         System.out.print("Enter num2:");
        int num2 = sc.nextInt();
        System.out.println("Enter operator");
        char opt = sc.next().charAt(0);

        switch(opt) {
            case('+') : System.out.println(num1+num2);
            break;
             case('-') : System.out.println(num1-num2);
            break;
             case('*') : System.out.println(num1*num2);
            break;
             case('/') : System.out.println((double)num1/num2);
            break;
            default : System.out.println("not an operator");
            break;
        }
    }

}
