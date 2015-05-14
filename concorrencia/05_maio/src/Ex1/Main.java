package Ex1;

public class Main {

    public static void main(String[] args) {
        Thread t;
        for (int i = 0; i < 10; i++) {
            t = new Ex1();
            t.setName("Nome-" + i);
            t.start();
        }
    }

}
