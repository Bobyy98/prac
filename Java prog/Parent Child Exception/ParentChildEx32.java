// Parent class with exception
class ParentClass32 {
    // Method that throws an exception
    void divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        int result = a / b;
        System.out.println("Result of division: " + result);
    }
}

// Child class inheriting from ParentClass32
class ChildClass32 extends ParentClass32 {
    // Method that overrides the parent's method and handles the exception
    void divide(int a, int b) {
        try {
            super.divide(a, b); // Call the parent's method
        } catch (ArithmeticException e) {
            System.out.println("Exception caught in ChildClass: " + e.getMessage());
        }
    }
}

public class ParentChildEx32 {
    public static void main(String[] args) {
        ParentClass32 parent = new ParentClass32();
        ChildClass32 child = new ChildClass32();

        // Attempt division by zero in ParentClass32
        try {
            parent.divide(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }

        // Attempt division by zero in ChildClass32
        child.divide(20, 0);
    }
}
