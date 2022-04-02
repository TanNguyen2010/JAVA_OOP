package lesson08_lab02;

import java.security.SecureRandom;

public class Animal {

    protected int speed;

    public Animal() {
    }

    public int getSpeed() {
        return speed;
    }
    protected int generateRandomSpeed(int maxSpeed){
        return new SecureRandom().nextInt(maxSpeed);
    }

}
