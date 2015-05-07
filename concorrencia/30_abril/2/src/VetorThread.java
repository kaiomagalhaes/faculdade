public class VetorThread extends Thread {

	private static Integer[] vetor = new Integer[1000];
	private static int soma = 0;
	private int casaAtual = 0;

	public void run() {
		while(casaAtual < 1000){
			some();
		}
	}

	private synchronized void some() {
		soma += vetor[casaAtual];
		casaAtual +=1;
	}

	public static void init() {
		for (int i = 0; i < 1000; i++) {
			vetor[i] = i;
		}
	}


}
