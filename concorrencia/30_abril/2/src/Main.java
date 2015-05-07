public class Main {

	public static void main(String[] args){

		VetorThread.init();

		for(int i = 0;i<4;i++){
			new VetorThread().start();
		}


	}

}
