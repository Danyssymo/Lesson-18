package academy.olga.practika3.zoo;

import java.util.Objects;

public class Animal {

    private String name;
    private int age;
    private int energy = 100;

    public void makeSound() {
        energy--;
    }

    public void eat() {
        energy++;
    }

    public void eat(int value) {
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
        Animal animal = (Animal) o;
        return age == animal.age && energy == animal.energy && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, energy);
    }
}
