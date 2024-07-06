import java.util.Scanner;
class Bank {
    int acNo;
    String userName;
    String email;
    String accountType;
    int balance;

   public void getDetails() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter acNO");
    acNo = sc.nextInt();
    System.out.println("userName");
     sc.nextLine();
    userName = sc.nextLine();
   
    System.out.println("Enter email");
    email = sc.nextLine();
    System.out.println("Enter ac Type");
    accountType = sc.nextLine();
    System.out.println("Enter balance");
    balance = sc.nextInt();
    sc.close();
   }
   public void printDet() {
    System.out.println(" ");
    System.out.println(acNo);
    System.out.println(userName);
    System.out.println(email);
    System.out.println(accountType);
    System.out.println(balance);
   }
}

public class Bank_Account {
    
   

    public static void main(String[] args) {
        Bank b1 = new Bank();
        b1.getDetails();
        b1.printDet();
     
    }

}