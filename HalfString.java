import java.util.Scanner;

public class HalfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string:");
        String str = sc.nextLine();
        System.out.println(str.length());
       
        for(int i=str.length()/2; i<str.length() ; i++) {
            System.out.print(str.charAt(i));
        }
    }
}
