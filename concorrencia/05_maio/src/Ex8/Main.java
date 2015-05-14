package Ex8;


import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {

        final Race race = new Race();
        List<Hare> hares = new ArrayList<Hare>() {{
            for (int i = 0; i < 5; i++) {
                add(new Hare("Hare-" + (i + 1), race));
            }
        }};
        race.setHares(hares);
        race.start();

    }


}
