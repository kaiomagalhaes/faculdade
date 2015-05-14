package Ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main {

    private final static int matrizSize = 2;

    public static void main(String[] args) throws Exception {
        final int[][] matriz = getMatriz();
        List<Ex2> threads = new ArrayList<Ex2>() {{
            Ex2 t1 = new Ex2(matriz, 0, 2);
            Ex2 t2 = new Ex2(matriz, 1,2);
            add(t1);
            add(t2);
        }};

        ThreadPoolExecutor p = new ThreadPoolExecutor(5, 10, 1, TimeUnit.DAYS, new ArrayBlockingQueue<Runnable>(10));
        for (Thread t : threads) {
            p.submit(t);
        }

        p.shutdown();
        p.awaitTermination(1, TimeUnit.DAYS);


        for (Ex2 t : threads) {
            System.out.println(t.getSum());
        }
    }

    private static int[][] getMatriz() {
        int[][] matriz = new int[matrizSize][matrizSize];
        for (int i = 0; i < matrizSize; i++) {
            for (int j = 0; j < matrizSize; j++) {
                matriz[i][j] = 5;
            }
        }
        return matriz;
    }

}
