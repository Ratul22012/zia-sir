interface Barkable {
    void bark();
}

interface Playable {
    void play();
}

class Dog implements Barkable, Playable {
    public void bark() {
        System.out.println("Dog is barking...");
    }

    public void play() {
        System.out.println("Ratul is playing...");
    }
}

public class multipleInterface {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();
        d.play();
    }
}
