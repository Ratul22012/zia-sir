abstract class Creature {
    abstract void makeSound();

    void run() {
        System.out.println("Running.......");
    }
}

class Goat extends Creature {
    void makeSound() {
        System.out.println("Maaaa--aaa.....");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Goat g = new Goat();
        g.makeSound();
        g.run();
    }
}