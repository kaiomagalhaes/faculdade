import java.util.Random;

public class Frog extends Thread {

	private String frogName;
	private int distanceTraveled = 0;

	public Frog(String frogName) {
		this.frogName = frogName;
	}

	public void run() {
		while (distanceTraveled < Race.distance) {
			Random gerador = new Random();
			int tamanho = gerador.nextInt(10);
			distanceTraveled += tamanho;
			System.out.println("Frog " + frogName + " traveled " + distanceTraveled);
		}
	}
}