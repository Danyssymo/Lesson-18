package academy.olga.practika3.zoo;

import java.util.Objects;

public class Elephant {

    private String name;
    private int age;
    private int energy = 100;

    public Elephant(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println("Whoooo");
        energy = energy - 15;
    }

    public void eat() {
        System.out.println("Слон поел и пополнил свою энергию на 15");
        energy = energy + 15;
    }

    public void eat(int value) {
        System.out.println("Слон поел и пополнил свою энергию на " + value);
        energy = energy + value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Elephant elephant = (Elephant) o;
        return age == elephant.age && energy == elephant.energy && Objects.equals(name, elephant.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, energy);
    }
}
