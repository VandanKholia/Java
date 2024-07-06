

import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first no:");
        int num1 = sc.nextInt();
         System.out.print("Enter second no:");
        int num2 = sc.nextInt();
         System.out.print("Enter third no:");
        int num3 = sc.nextInt();

        if(num1>num2) {
            if(num1>num3){
                System.out.println("Num1 is max");
            }
            else {
                System.out.println("Num3 is max");
            }
        }
        if(num2>num1) {
            if(num2>num3){
                System.out.println("Num2 is max");
            }
            else {
                System.out.println("Num3 is max");
            }
        }
    }
}
