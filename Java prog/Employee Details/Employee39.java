public class Employee39 
{
    private int employeeId;
    private String name;
    private String designation;
    private double salary;
    private String department;

    public Employee39(int employeeId, String name, String designation, double salary, String department) {
        this.employeeId = employeeId;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.department = department;
    }

    public void displayDetails() 
    {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: $" + salary);
        System.out.println("Department: " + department);
    }

    public static void main(String[] args) 
    {
        Employee39 employee1 = new Employee39(101, "John Doe", "Software Engineer", 75000, "Development");
        Employee39 employee2 = new Employee39(102, "Jane Smith", "Senior Software Engineer", 95000, "Development");

        System.out.println("Employee 1 Details:");
        employee1.displayDetails();
        System.out.println();

        System.out.println("Employee 2 Details:");
        employee2.displayDetails();
    }
}
