package lesson09;

import java.util.ArrayList;
import java.util.List;

public class AnimalRacing02 {
    public Animal getWinner(List<Animal> animalList){
        Animal winner = null;
        //Filter || !flyable
        List<Animal> notFlyableAnimals = new ArrayList<>();
        for (Animal animal : animalList) {
            if (!animal.isFlyable()){
                notFlyableAnimals.add(animal);
            }
        }
        System.out.println(notFlyableAnimals);
        //Racing
        if (notFlyableAnimals.isEmpty()){
            throw new RuntimeException("There is not any animal can join race");
        } else if (notFlyableAnimals.size()==1){
            return notFlyableAnimals.get(0);
        } else {
            for (Animal animal : notFlyableAnimals) {
                if (winner==null){
                    winner = animal;
                } else if (animal.getSpeed() > winner.getSpeed()){
                    winner = animal;
                }
            }

        }
        return winner;
    }

    public static void main(String[] args) {
        Animal.Builder animal = new Animal.Builder();
        List<Animal> animalList = new ArrayList<>();

        Animal horse = animal.setName("Horse").setSpeed(100).setFlyable(false).build();
        Animal tiger = animal.setName("Tiger").setSpeed(75).setFlyable(false).build();
        Animal cat = animal.setName("Cat").setSpeed(50).setFlyable(false).build();
        Animal eagle = animal.setName("Eagle").setSpeed(120).setFlyable(true).build();

        animalList.add(horse);
        animalList.add(tiger);
        animalList.add(cat);
        animalList.add(eagle);

        Animal winner = new AnimalRacing02().getWinner(animalList);

        System.out.printf("Winner is %s, with speed %d", winner.getName(),winner.getSpeed());

    }
}
