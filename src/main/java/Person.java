public class Person{
    // characteristics
    private String gender;
    private String name;
    protected Integer age;
    private int weight;
    private static int eyeCount = 2;


    // method -> Return type -> void
    int eat() {

        return 1;
    }

    void breath() {
        System.out.println("Hello World");
        if (true) {
            return;
        } else {
            System.out.println("asd");
        }
    }

    void walk() {
        System.out.println(name+ " is Walking");
    }

    // Access Modifiers -> public , private , protected
    public static void main(String[] args) {
        Person person = new Person(); // Object creation
        person.name = "Ashray";
        person.age = 12;
        person.gender = "MALE";
        person.walk();


        Person person1 = new Person(); // Object creation
        person1.name = "Ashim";
        person1.age = 21;
        person1.gender = "MALE";
        person1.walk();
    }
}

// JVM -> Thread (Main Thread) -> main method
