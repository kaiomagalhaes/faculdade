package Ex3;

import Ex2.Ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class TesteContador {

    public static void main(String[] args) {

        Thread t = new Thread(new Contador());
        Thread t1 = new Thread(new Contador());
        t.start();
        t1.start();

    }

}
