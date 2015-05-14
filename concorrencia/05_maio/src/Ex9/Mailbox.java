package Ex9;

public class Mailbox {

    private String message = "";

    public void storeMessage(String message) throws Exception {
        if (!this.message.equals("")) {
            wait();
        }
        this.message = message;
    }

    public String retrieveMessage() throws Exception {
        if (this.message.equals("")) {
            wait();
        }

        String retrievedMessage = this.message;
        this.message = "";
        return retrievedMessage;
    }


}
