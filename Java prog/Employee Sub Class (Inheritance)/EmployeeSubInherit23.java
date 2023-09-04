class Employee23 {
    private String name;
    private int employeeId;
    private double baseSalary;

    public Employee23(String name, int employeeId, double baseSalary) {
        this.name = name;
        this.employeeId = employeeId;
        this.baseSalary = baseSalary;
    }

    public double calculateSalary() {
        // Base salary remains the same for all employees
        return baseSalary;
    }

    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }
}

class Manager23 extends Employee23 {
    private double bonus;

    public Manager23(String name, int employeeId, double baseSalary, double bonus) {
        super(name, employeeId, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        // Manager's salary includes a bonus
        return super.calculateSalary() + bonus;
    }
}

class Developer extends Employee23 {
    private int linesOfCode;

    public Developer(String name, int employeeId, double baseSalary, int linesOfCode) {
        super(name, employeeId, baseSalary);
        this.linesOfCode = linesOfCode;
    }

    @Override
    public double calculateSalary() {
        // Developer's salary is based on the number of lines of code written
        return super.calculateSalary() + (linesOfCode * 0.01); // Assuming 1% per line of code
    }
}

public class EmployeeSubInherit23 {
    public static void main(String[] args) {
        Manager23 manager = new Manager23("John Doe", 101, 50000, 10000);
        Developer developer = new Developer("Alice Smith", 102, 60000, 5000);

        System.out.println("Manager's Salary: $" + manager.calculateSalary());
        System.out.println("Developer's Salary: $" + developer.calculateSalary());
    }
}
