import java.util.List;

public class Race {

	private List<Frog> frogs;
	public static int distance = 200;

	Race(List<Frog> frogs) {
		this.frogs = frogs;
	}

	public void init(){
		for(Frog frog: frogs){
			frog.start();
		}
	}

}
