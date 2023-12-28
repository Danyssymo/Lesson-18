package academy.olga.practika3.zoo;

import java.util.Objects;

public class Lion {

    private String name;
    private int age;
    private int energy = 100;

    public Lion(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println("Roaaar");
        energy = energy - 20;
    }

    public void eat() {
        System.out.println("Леф поел и пополнил свою энергию на 20");
        energy = energy + 20;
    }

    public void eat(int value) {
        System.out.println("Леф поел и пополнил свою энергию на " + value);
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
        Lion lion = (Lion) o;
        return age == lion.age && energy == lion.energy && Objects.equals(name, lion.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, energy);
    }
}
