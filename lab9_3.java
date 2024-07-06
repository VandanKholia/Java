import java.util.Scanner;

class RowSumThread extends Thread {
    private int[] row;
    private int sum;

    public RowSumThread(int[] row) {
        this.row = row;
        this.sum = 0;
    }

    public int getSum() {
        return sum;
    }

    public void run() {
        for (int value : row) {
            sum += value;
        }
    }
}

public class lab9_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows:");
        int m = scanner.nextInt();

        int[][] matrix = new int[m][];

        System.out.println("Enter the elements of the matrix row by row:");

        for (int i = 0; i < m; i++) {
            System.out.println("Enter row " + (i + 1) + " elements separated by spaces:");
            String[] elements = scanner.next().split(" ");
            matrix[i] = new int[elements.length];
            for (int j = 0; j < elements.length; j++) {
                matrix[i][j] = Integer.parseInt(elements[j]);
            }
        }

        RowSumThread[] threads = new RowSumThread[m];

        for (int i = 0; i < m; i++) {
            threads[i] = new RowSumThread(matrix[i]);
            threads[i].start();
        }

        try {
            for (int i = 0; i < m; i++) {
                threads[i].join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Sum of each row:");

        for (int i = 0; i < m; i++) {
            System.out.println("Row " + (i + 1) + ": " + threads[i].getSum());
        }
    }
}
