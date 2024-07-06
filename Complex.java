import java.util.Scanner;

public class Complex {
   static int real;
    static int imaginary;
    
    Complex(int real,int imaginary) {
       this.real = real;
       this.imaginary = imaginary;
    }
    void sum(int a, int b) {
       
        System.out.println(a+"+"+b+"i");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int real1 = sc.nextInt();
        int imaginary1 = sc.nextInt();
        Complex num1 = new Complex(real1,imaginary1);
        
    }
}
