package Ex5;

public class Ex5 extends Thread {

    private Object output;
    private int times;
    private int sleep;

    public Ex5(Object output, int times, int sleep) {
        this.output = output;
        this.times = times;
        this.sleep = sleep;
    }

    public void run() {
        for (int i = 0; i < times; i++) {
            System.out.println(output);
            try {
                sleep(sleep * 1000);
            } catch (Exception e) {
            }
        }
    }

}
