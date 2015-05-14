package Ex6;

public class Ex6 extends Thread {

    private char letter;

    public Ex6(char letter) {
        this.letter = letter;
    }

    public void run() {
        System.out.println(letter);
    }

}
