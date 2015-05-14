package Ex6;

import Ex5.Ex5;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {

        List<Thread> threads = getThreads();

        while(true){
            for(Thread t : threads){
                t.start();
                while(t.isAlive()){}
            }
            threads = getThreads();
        }

    }

    private static List<Thread> getThreads(){
        return new ArrayList<Thread>(){{
            add(new Ex6('A'));
            add(new Ex6('B'));
            add(new Ex6('C'));
        }};
    }

}
