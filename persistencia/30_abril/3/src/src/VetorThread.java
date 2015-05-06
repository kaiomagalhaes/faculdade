package src;

public class VetorThread extends Thread {

	private static Integer[] vetor = new Integer[1000];

	public void run() {
		System.out.println("teste");
		for (Integer i = 0; i < 1000; i++) {
			synchronized(i) {
				if (vetor[i] == null) {
					vetor[i] = i;
					System.out.println(i);
				}
			}

		}
	}


}
