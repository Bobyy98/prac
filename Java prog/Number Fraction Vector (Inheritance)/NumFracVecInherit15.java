import java.util.Scanner;

class Number15 {
    protected int a;
    protected int b;

    public Number15(int a, int b) {
        this.a = a;
        this.b = b;
    }
}

class Fraction15 extends Number15 {
    public Fraction15(int numerator, int denominator) {
        super(numerator, denominator);
    }

    public Fraction15 add(Fraction15 other) {
        int newNumerator = (this.a * other.b) + (other.a * this.b);
        int newDenominator = this.b * other.b;
        return new Fraction15(newNumerator, newDenominator);
    }

    public Fraction15 subtract(Fraction15 other) {
        int newNumerator = (this.a * other.b) - (other.a * this.b);
        int newDenominator = this.b * other.b;
        return new Fraction15(newNumerator, newDenominator);
    }
}

class Vector15 extends Number15 {
    protected int k;

    public Vector15(int i, int j, int k) {
        super(i, j);
        this.k = k;
    }

    public Vector15 add(Vector15 other) {
        int newI = this.a + other.a;
        int newJ = this.b + other.b;
        int newK = this.k + other.k;
        return new Vector15(newI, newJ, newK);
    }

    public Vector15 subtract(Vector15 other) {
        int newI = this.a - other.a;
        int newJ = this.b - other.b;
        int newK = this.k - other.k;
        return new Vector15(newI, newJ, newK);
    }
}

public class NumFracVecInherit15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for fraction 1
        System.out.print("Enter numerator for Fraction 1: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter denominator for Fraction 1: ");
        int den1 = scanner.nextInt();
        Fraction15 fraction1 = new Fraction15(num1, den1);

        // Input for fraction 2
        System.out.print("Enter numerator for Fraction 2: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter denominator for Fraction 2: ");
        int den2 = scanner.nextInt();
        Fraction15 fraction2 = new Fraction15(num2, den2);

        // Input for vector 1
        System.out.print("Enter i for Vector 1: ");
        int i1 = scanner.nextInt();
        System.out.print("Enter j for Vector 1: ");
        int j1 = scanner.nextInt();
        System.out.print("Enter k for Vector 1: ");
        int k1 = scanner.nextInt();
        Vector15 vector1 = new Vector15(i1, j1, k1);

        // Input for vector 2
        System.out.print("Enter i for Vector 2: ");
        int i2 = scanner.nextInt();
        System.out.print("Enter j for Vector 2: ");
        int j2 = scanner.nextInt();
        System.out.print("Enter k for Vector 2: ");
        int k2 = scanner.nextInt();
        Vector15 vector2 = new Vector15(i2, j2, k2);

        scanner.close();

        // Perform operations and display results
        Fraction15 sumFraction = fraction1.add(fraction2);
        Fraction15 diffFraction = fraction1.subtract(fraction2);
        Vector15 sumVector = vector1.add(vector2);
        Vector15 diffVector = vector1.subtract(vector2);

        System.out.println("Sum of fractions: " + sumFraction.a + "/" + sumFraction.b);
        System.out.println("Difference of fractions: " + diffFraction.a + "/" + diffFraction.b);
        System.out.println("Sum of vectors: (" + sumVector.a + ", " + sumVector.b + ", " + sumVector.k + ")");
        System.out.println("Difference of vectors: (" + diffVector.a + ", " + diffVector.b + ", " + diffVector.k + ")");
    }
}
