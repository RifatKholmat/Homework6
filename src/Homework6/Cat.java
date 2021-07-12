package Homework6;

public class Cat extends Animal{
    public Cat (String name, int runDistance, int swimDistance) {
        super (name, runDistance, swimDistance);
    }

    @Override
    public void swim () {
        System.out.printf("Кот %s не умеет плавать\n", this.name);
    }

}
