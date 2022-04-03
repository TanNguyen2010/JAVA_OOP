//package lesson09;
//
//import lesson08_lab02.Tiger;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class AnimalRacing {
//    public Animal getWinner(List<Animal> animalList){
//        Animal winner = null;
//        //Filter || !flyable
//        List<Animal> notFlyableAnimals = new ArrayList<>();
//        for (Animal animal : animalList) {
//            if (!animal.isFlyable()){
//                notFlyableAnimals.add(animal);
//            }
//        }
//        System.out.println(notFlyableAnimals);
//        //Racing
//        if (notFlyableAnimals.isEmpty()){
//            throw new RuntimeException("There is not any animal can join race");
//        } else if (notFlyableAnimals.size()==1){
//            return notFlyableAnimals.get(0);
//        } else {
//            for (Animal animal : notFlyableAnimals) {
//                if (winner==null){
//                    winner = animal;
//                } else if (animal.getSpeed() > winner.getSpeed()){
//                    winner = animal;
//                }
//            }
//
//        }
//        return winner;
//    }
//
//    public static void main(String[] args) {
//        Animal.Builder animal = new Animal.Builder();
//        List<Animal> animalList = new ArrayList<>();
//
//        animal.setName("Horse");
//        animal.setFlyable(false);
//        animal.setSpeed(100);
//        Animal animal1 = animal.build();
//
//        animalList.add(animal1);
//
//        animal.setName("Tiger");
//        animal.setFlyable(false);
//        animal.setSpeed(75);
//        Animal animal2 = animal.build();
//
//        animalList.add(animal2);
//
//        animal.setName("Cat");
//        animal.setFlyable(false);
//        animal.setSpeed(50);
//        Animal animal3 = animal.build();
//
//        animalList.add(animal3);
//
//        animal.setName("Bird");
//        animal.setFlyable(true);
//        animal.setSpeed(120);
//        Animal animal4 = animal.build();
//
//        animalList.add(animal4);
//        //Animal tiger = animal.setName("Tiger").setSpeed(75).setFlyable(false);
//        //animalList.add(tiger);
//
//        Animal winner = new AnimalRacing().getWinner(animalList);
//
//        System.out.printf("Winner is %s, with speed %d", winner.getName(),winner.getSpeed());
//
//    }
//}
