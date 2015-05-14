package Ex9;

public class Producer extends Thread {

    private Mailbox mailbox;

    public Producer(Mailbox mailbox) {
        this.mailbox = mailbox;
    }

    public void run() {
        for(int i = 0; i < 10; i++) {
            try {
                System.out.println("Iniciando Store");
                mailbox.storeMessage("mensagem");
                System.out.println("Armazenou");
                notifyAll();
            } catch (Exception e) {

            }
        }
    }

}
