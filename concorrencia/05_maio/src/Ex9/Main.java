package Ex9;

public class Main {

    public static void main(String[] args) throws Exception {

        Mailbox mailbox = new Mailbox();
        Consumer c = new Consumer(mailbox);
        Producer p = new Producer(mailbox);

        c.start();
        p.start();

    }


}
