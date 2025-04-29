interface Animal {
    void sound();
}

class Cow implements Animal {
    public void sound() {
        System.out.println("Hamba");
    }
}

public class InterfaceCode {
    public static void main(String[] args) {
        Cow d = new Cow();
        d.sound();
    }
}
