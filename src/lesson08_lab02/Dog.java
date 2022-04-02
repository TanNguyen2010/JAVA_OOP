package lesson08_lab02;

public class Dog extends Animal{

    final static int Dog_MAX_SPEED = 60;

    public Dog() {
//        super();
        speed = generateRandomSpeed(Dog_MAX_SPEED);
        System.out.println("Dog: " +speed);
    }

}
