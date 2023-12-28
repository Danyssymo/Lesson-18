package academy.olga.practika3.zoo;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        Lion lion = new Lion("Симба", 10);
        Elephant elephant = new Elephant("Тумба",5);
        Monkey monkey = new Monkey("Юмба",2);
        zoo.addAnimal(lion);
        zoo.addAnimal(elephant);
        zoo.addAnimal(monkey);
        zoo.dayRoutine();
        System.out.println(lion.getEnergy());
        System.out.println(elephant.getEnergy());
        System.out.println(monkey.getEnergy());
    }
}
