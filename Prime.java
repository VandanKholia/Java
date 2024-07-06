import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.:");
        int num = sc.nextInt();
        int count=0;
        for(int i=0; i<=num/2; i++) {
            if(num%i==0) {
                count++;
            }
        }
        
        
    }
}
