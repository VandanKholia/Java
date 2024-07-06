class Even extends Thread {

    public void run() {
        try {
            for(int i = 0; i<21; i++) {
                if(i%2==0) {
                    System.out.println(i);
                    Thread.sleep(1000);
                }
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}
class Odd extends Thread {
    public void run() {
        try {
            for(int i = 0; i<21; i++) {
                if(i%2!=0) {
                    System.out.println(i);
                    Thread.sleep(1000);

                }
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}

public class Lab9_2 {
    public static void main(String[] args) {
        Thread t1 = new Even();
        Thread t2 = new Odd();
        t1.start();
        t2.start();
    }
}
