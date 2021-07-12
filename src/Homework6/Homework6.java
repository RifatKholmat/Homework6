package Homework6;

public class Homework6 {
    public static void main (String[] args) {
        Animal[] animals = {
                new Cat("Barsik", 100, 50),
                new Dog("Bobik", 150, 30)
        };
        for (int i = 0; i < animals.length; i++) {
            animals[i].run();
            animals[i].swim();
        }

    }
}
