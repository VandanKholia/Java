
public class CountObj {
   static int a;
    CountObj() {
        a++;
        System.out.println(a);
    }
    public static void main(String[] args) {
        CountObj o1 = new CountObj();
        CountObj o2 = new CountObj();
    }
}
