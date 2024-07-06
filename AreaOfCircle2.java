import java.util.Scanner;



class Area {
    int r;

    double calcArea(int a){
        double ans;
        ans=3.14*a*a;
        return ans;
    }
}

public class AreaOfCircle2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        Area obj = new Area();
       double a1 = obj.calcArea(x);
    
        System.out.println(a1);
    }
  
    
}
