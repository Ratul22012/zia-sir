class Person {
    private String name;

    public void setName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }
}

public class accessModifiers {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Ratul");
        System.out.println(p.getName());
    }
}