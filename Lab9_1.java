class Morning implements Runnable {
   
    public void run() {
        try {
            while(true) {
               
                System.out.println("Good morning");
               // Thread.sleep(1000);
            }
        } 
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}
class Night implements Runnable {
    public void run() {
        try {
          while(true){
            System.out.println("Good night");
           // Thread.sleep(3000);
          }

        } 
        catch(Exception e) {
            e.printStackTrace();

        }
    }
}

public class Lab9_1 {
    public static void main(String[] args) {
        Runnable r1 = new Morning();
        Runnable r2 = new Night();

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();
    }
}
