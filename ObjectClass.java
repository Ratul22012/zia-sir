class ClassObject
{
    String name;
    int age;

    void display()
    {
        System.out.println("My name is Ratul. I read in MBSTU ICT department");
    }

}

public class ObjectClass {

    public static void main(String[] args) {
        ClassObject m1=new ClassObject();
        m1.name="Ratul";
        m1.age=22;
        m1.display();
    }
}
