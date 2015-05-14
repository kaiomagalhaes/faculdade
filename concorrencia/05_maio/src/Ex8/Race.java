package Ex8;

import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Race {

    private int distance = 20;
    private List<Hare> hares;
    private Hare winner;

    public Race(List<Hare> hares) {
        this.hares = hares;
    }

    public Race() {
    }

    public void setHares(List<Hare> hares) {
        this.hares = hares;
    }


    public int getDistance() {
        return this.distance;
    }

    public void setWinner(Hare hare) {
        if (winner == null && hare.getDistanceTraveled() >= distance) {
            this.winner = hare;
        }
    }

    public void start() throws Exception {
        ThreadPoolExecutor p = new ThreadPoolExecutor(5, 10, 1, TimeUnit.DAYS, new ArrayBlockingQueue<Runnable>(10));
        for (Thread t : hares) {
            p.submit(t);
        }

        p.shutdown();
        p.awaitTermination(1, TimeUnit.DAYS);
        System.out.println("Hare winner:" + winner.getName());
    }

}
