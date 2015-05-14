package Ex7;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Ex7 extends Thread {

    private int[] vetor;
    private int result = -1;
    private int searchFor;

    private Ex7(int[] vetor,int searchFor) {
        this.vetor = vetor;
        this.searchFor = searchFor;
    }

    public int getResult() {
        return result;
    }

    public void run() {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == searchFor) {
                result = searchFor;
            }
        }
    }

    public static int parallelSearch(int x, int[] A, int numEx7s) throws Exception {

        List<Ex7> threads = new ArrayList<Ex7>();

        int vetorSize = A.length / numEx7s;
        int actualIndex = 0;
        for (int i = 0; i < numEx7s; i++) {
            int[] parcialVetor = new int[vetorSize];
            for (int j = actualIndex; j < (vetorSize + actualIndex); j++) {
                parcialVetor[j] = A[j];
            }
            threads.add(new Ex7(parcialVetor,x));
        }

        ThreadPoolExecutor p = new ThreadPoolExecutor(5, 10, 1, TimeUnit.DAYS, new ArrayBlockingQueue<Runnable>(10));
        for (Ex7 t : threads) {
            p.submit(t);
        }

        p.shutdown();
        p.awaitTermination(1, TimeUnit.DAYS);

        int result = -1;
        for (Ex7 thread : threads) {
            if (thread.getResult() != -1)
                result = thread.getResult();
        }

        return result;
    }

}
