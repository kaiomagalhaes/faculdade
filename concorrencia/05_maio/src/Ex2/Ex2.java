package Ex2;

public class Ex2 extends Thread {

    private int[][] matriz;
    private int columnIndex;
    private int columnSize;
    private int sum;

    public Ex2(int[][] matriz, int columnIndex, int columnSize) {
        this.matriz = matriz;
        this.columnIndex = columnIndex;
        this.columnSize = columnSize;
    }

    public void run() {
        System.out.println("Thread");
        for (int i = 0; i < columnSize; i++) {
            sum += matriz[i][columnIndex];
        }
    }

    public int getSum() {
        return sum;
    }
}
