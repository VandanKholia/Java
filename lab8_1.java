import java.util.Scanner;

public class lab8_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        try { 
            int x = Integer.parseInt(args[0]);
            int y = Integer.parseInt(args[1]);
            int z = 1;
            if(x ==0 && y ==0) {
                throw new Exception("Invalid input");
            }
        for(int i=0; i<=y; i++) {
           
            z = x*z;
        }
        }
        catch(NumberFormatException a) {
            a.printStackTrace();
        }
        catch(Exception a) {
            a.printStackTrace();
        }
    }    
}