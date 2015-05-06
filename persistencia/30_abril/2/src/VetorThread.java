public class VetorThread extends Thread {

	private static Integer[] vetor = new Integer[1000];

	public void run() {
		for (int i = 0; i < 1000; i++) {
			adicione(i, i);
		}
	}

	private synchronized void adicione(int casa, int valor) {
		if (vetor[casa] == null) {
			vetor[casa] = valor;
			System.out.println(valor);
		}
	}


}
