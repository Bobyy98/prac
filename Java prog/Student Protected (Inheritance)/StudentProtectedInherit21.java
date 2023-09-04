class Person21 {
    // Protected property
    protected String name;

    // Constructor for the Person class
    public Person21(String name) {
        this.name = name;
    }

    // Getter for the name property
    protected String getName() {
        return name;
    }
}

public class StudentProtectedInherit21 extends Person21 {
    // Additional property for Student class
    private int studentId;

    // Constructor for the Student class
    public StudentProtectedInherit21(String name, int studentId) {
        super(name); // Call the constructor of the base class (Person)
        this.studentId = studentId;
    }

    // Getter for the studentId property
    public int getStudentId() {
        return studentId;
    }

    // Method to access the protected property 'name' from the base class
    public String getPersonName() {
        return getName();
    }

    public static void main(String[] args) {
        // Create a Person object
        Person21 person = new Person21("John");

        // Attempting to access the protected property 'name' directly from outside the class
        // This will result in a compilation error because 'name' is protected and cannot be accessed directly.
        // System.out.println(person.name);

        // Create a Student object
        StudentProtectedInherit21 student = new StudentProtectedInherit21("Alice", 12345);

        // Accessing the protected property 'name' using a getter method in the subclass
        String studentName = student.getPersonName();
        System.out.println("Student Name: " + studentName);

        // Accessing the 'studentId' property
        int studentId = student.getStudentId();
        System.out.println("Student ID: " + studentId);
    }
}
