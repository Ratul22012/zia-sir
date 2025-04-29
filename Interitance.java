class Student {
    protected String type = "Ratul";

    void display() {
        System.out.println("I am a student");
    }
}

class Teacher extends Student {
    void urgue() {
        System.out.println(type + " is a backbencher");
    }
}

class Inheritance {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.display();
        t.urgue();
    }
}
