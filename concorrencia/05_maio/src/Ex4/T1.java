package Ex4;

public class T1 extends Thread {

    private int id;

    public T1(int id){
        this.id = id;
    }

    public void run(){
        while(true){
            System.out.println("Thread " + id + "Executando");
        }
    }

}
