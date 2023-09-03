import java.util.Scanner;

class Student11 {
    private String name;
    private int rollNumber;
    private double marks;

    public Student11(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public double getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nRoll Number: " + rollNumber + "\nMarks: " + marks;
    }
}

class Toppers11 {
    private Student11[] topStudents;

    public Toppers11() {
        topStudents = new Student11[] { new Student11("", 0, 0), new Student11("", 0, 0), new Student11("", 0, 0) };
    }

    public void addStudent(Student11 student) {
        if (student.getMarks() > getLowestTopperMarks()) {
            topStudents[2] = topStudents[1];
            topStudents[1] = topStudents[0];
            topStudents[0] = student;
        } else if (student.getMarks() > topStudents[1].getMarks()) {
            topStudents[2] = topStudents[1];
            topStudents[1] = student;
        } else if (student.getMarks() > topStudents[2].getMarks()) {
            topStudents[2] = student;
        }
    }

    private double getLowestTopperMarks() {
        return Math.min(Math.min(topStudents[0].getMarks(), topStudents[1].getMarks()), topStudents[2].getMarks());
    }

    public void displayTopStudents() {
        System.out.println("Top Three Students:");
        for (int i = 0; i < 3; i++) {
            if (topStudents[i] != null) {
                System.out.println("Rank " + (i + 1) + ":\n" + topStudents[i] + "\n");
            }
        }
    }
}

public class StudentTopper11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Toppers11 toppers = new Toppers11();

        for (int i = 0; i < 4; i++) {
            System.out.println("Enter details for Student " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Roll Number: ");
            int rollNumber = scanner.nextInt();
            System.out.print("Marks: ");
            double marks = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline character

            Student11 student = new Student11(name, rollNumber, marks);
            toppers.addStudent(student);
        }

        toppers.displayTopStudents();

        // Close the scanner to release resources
        scanner.close();
    }
}
