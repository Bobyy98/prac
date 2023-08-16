class Student35
{
    private String name;
    private int age;

    // Default Constructor
    public Student35()
    {
        this.name = "Erling Haaland";
        this.age = 22;
    }

    // Parameterized Constructor
    public Student35(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    // Copy Constructor
    public Student35(Student35 other)
    {
        this.name = other.name;
        this.age = other.age;
    }

    // Constructor Chaining
    public Student35(String name)
    {
        this(name, 22); // Call parameterized constructor with default age
    }

    public void display()
    {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class ConstructorStudent35
{
    public static void main(String[] args)
    {
        Student35 defaultStudent = new Student35();
        Student35 parameterizedStudent = new Student35("Mbappe", 24);
        Student35 copyStudent = new Student35(parameterizedStudent);
        Student35 chainingStudent = new Student35("Kane");

        System.out.println("Default Student: ");
        defaultStudent.display();

        System.out.println("Parameterized Student: ");
        parameterizedStudent.display();

        System.out.println("Copy Student: ");
        copyStudent.display();

        System.out.println("Chaining Student: ");
        chainingStudent.display();
    }
}
