import java.util.ArrayList;

public class Main {


	public static void main(String[] args) {
		final Frog frog1 = new Frog("1-frog");
		final Frog frog2 = new Frog("2-frog");

		Race race = new Race(new ArrayList<Frog>() {{
			add(frog1);
			add(frog2);
		}});
		race.init();
	}

}