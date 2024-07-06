
    import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter fahrenhiet:");
        float f = sc.nextFloat();
        System.out.println("c="+((f-32)*5/9));
    }
}


