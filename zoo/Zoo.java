package academy.olga.practika3.zoo;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    List<Object> animals = new ArrayList<>();

    public void addAnimal(Object animal){
        animals.add(animal);
    }

public void dayRoutine(){
    for (Object animal : animals) {
        if (animal instanceof Lion){
            ((Lion) animal).makeSound();
        } else if (animal instanceof Elephant) {
            ((Elephant) animal).makeSound();
        } else if (animal instanceof Monkey){
            ((Monkey) animal).makeSound();
        }
    }
}

}
