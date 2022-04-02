package lesson08_lab02;

public class Tiger extends Animal{

    final static int Tiger_MAX_SPEED = 100;

    public Tiger() {
//        super();
        speed = generateRandomSpeed(Tiger_MAX_SPEED);
        System.out.println("Tiger: " +speed);
    }
}
