package academy.olga.practika3.zoo;

import java.util.Objects;

public class Monkey {

    private String name;
    private int age;
    private int energy = 100;

    public Monkey(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println("Uhuhuhaha");
        energy = energy - 10;
    }

    public void eat() {
        System.out.println("Обезьяна поела и пополнила свою энергию на 10");
        energy = energy + 10;
    }

    public void eat(int value) {
        System.out.println("Обезьяна поела и пополнила свою энергию на" + value);
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
        Monkey monkey = (Monkey) o;
        return age == monkey.age && energy == monkey.energy && Objects.equals(name, monkey.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, energy);
    }
}
