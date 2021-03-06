package src;

public class VetorThread extends Thread {

	private static Integer[] vetor = new Integer[1000];
	private static int soma = 0;
	private Integer casaAtual = 0;

	public void run() {
		while (casaAtual < 1000) {
			synchronized (casaAtual) {
				soma += vetor[casaAtual];
				casaAtual += 1;
			}
		}
	}

	public static void init() {
		for (int i = 0; i < 1000; i++) {
			vetor[i] = i;
		}
	}

}
