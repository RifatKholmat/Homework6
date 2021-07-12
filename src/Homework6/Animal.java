package Homework6;

public class Animal {
    public String name;
    protected int runDistance;
    protected int swimDistance;

    public Animal(String name, int runDistance, int swimDistance) {
        this.name = name;
        this.runDistance = runDistance;
        this.swimDistance = swimDistance;
    }

    public void run() {
        System.out.printf("%s бежит %d метров\n", this.name, this.runDistance);
    }
    public void swim () {
        System.out.printf("%s плывёт %d метров\n", this.name, this.swimDistance);
    }
}
