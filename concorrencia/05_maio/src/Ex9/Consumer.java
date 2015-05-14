package Ex9;

public class Consumer extends Thread {

    private Mailbox mailbox;

    public Consumer(Mailbox mailbox) {
        this.mailbox = mailbox;
    }

    public void run() {
        for(int i = 0; i < 10; i++) {
            try {
                System.out.println("Iniciando Retrieve");
                mailbox.retrieveMessage();
                System.out.println("buscou");
                notifyAll();
            } catch (Exception e) {

            }
        }
    }

}
