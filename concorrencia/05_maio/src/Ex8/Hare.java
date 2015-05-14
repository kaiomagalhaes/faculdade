package Ex8;

import java.util.Random;

public class Hare extends Thread {

    protected String name;
    private int distanceTraveled = 0;
    private Race race;

    public Hare(String name, Race race) {
        this.name = name;
        this.race = race;
    }

    public int getDistanceTraveled() {
        return this.distanceTraveled;
    }

    public void jump() {
        this.distanceTraveled += new Random().nextInt(2) + 1;
    }

    public void run() {
        while (this.distanceTraveled < race.getDistance()) {
            jump();
            System.out.println("Hare:" + this.name + " traveled:" + this.distanceTraveled);
            yield();
        }
        race.setWinner(this);
    }

}
