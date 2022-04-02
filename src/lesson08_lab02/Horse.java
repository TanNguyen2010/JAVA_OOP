package lesson08_lab02;

public class Horse extends Animal{

    final static int HORSE_MAX_SPEED = 75;

    public Horse() {
//        super();
        speed = generateRandomSpeed(HORSE_MAX_SPEED);
        System.out.println("Horse: " +speed);
    }
}
