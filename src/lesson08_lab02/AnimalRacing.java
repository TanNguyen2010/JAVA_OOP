package lesson08_lab02;

import java.util.ArrayList;
import java.util.List;

public class AnimalRacing {
    public Animal getWinnerAnimal(List<Animal> animalList){
        Animal winner = null;
        for (Animal animal : animalList) {
            if (winner == null){
                winner = animal;
            }else  if (animal.getSpeed() > winner.getSpeed()){
                winner = animal;
            }
        }
        return winner;
    }
    public static void main(String[] args) {
    List<Animal> animalList = new ArrayList<>();
    animalList.add(new Horse());
    animalList.add(new Tiger());
    animalList.add(new Dog());

    Animal winner = new AnimalRacing().getWinnerAnimal(animalList);

    System.out.printf("Winner is %s, with speed %d",winner.getClass().getSimpleName(),winner.speed);

    }
}
