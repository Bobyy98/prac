import java.util.Scanner;

public class ComplexNoCalcVar1 {
    double real;
    double imag;

    ComplexNoCalcVar1(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    ComplexNoCalcVar1 add(ComplexNoCalcVar1 other) {
        double newReal = this.real + other.real;
        double newImag = this.imag + other.imag;
        return new ComplexNoCalcVar1(newReal, newImag);
    }

    ComplexNoCalcVar1 sub(ComplexNoCalcVar1 other) {
        double newReal = this.real - other.real;
        double newImag = this.imag - other.imag;
        return new ComplexNoCalcVar1(newReal, newImag);
    }

    ComplexNoCalcVar1 mul(ComplexNoCalcVar1 other) {
        double newReal = this.real * other.real - this.imag * other.imag;
        double newImag = this.real * other.imag + this.imag * other.imag;
        return new ComplexNoCalcVar1(newReal, newImag);
    }

    ComplexNoCalcVar1 div(ComplexNoCalcVar1 other) {
        double den = other.real * other.real + other.imag * other.imag;
        double newReal = (this.real * other.real + this.imag * other.imag) / den;
        double newImag = (this.imag * other.real - this.real * other.imag) / den;
        return new ComplexNoCalcVar1(newReal, newImag);
    }

    void display() {
        if (imag >= 0) {
            System.out.println(real + " + " + imag + "i");
        } else {
            System.out.println(real + " - " + (-imag) + "i");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1st complex number (real imaginary): ");
        double real1 = scanner.nextDouble();
        double imag1 = scanner.nextDouble();
        ComplexNoCalcVar1 num1 = new ComplexNoCalcVar1(real1, imag1);

        System.out.println("Enter 2nd complex number (real imaginary): ");
        double real2 = scanner.nextDouble();
        double imag2 = scanner.nextDouble();
        ComplexNoCalcVar1 num2 = new ComplexNoCalcVar1(real2, imag2);

        ComplexNoCalcVar1 sum = num1.add(num2);
        ComplexNoCalcVar1 diff = num1.sub(num2);
        ComplexNoCalcVar1 prod = num1.mul(num2);
        ComplexNoCalcVar1 quo = num1.div(num2);

        System.out.print("\n1st complex number: ");
        num1.display();

        System.out.print("2nd complex number: ");
        num2.display();

        System.out.println("\nAddition: ");
        sum.display();

        System.out.println("\nSubtraction: ");
        diff.display();

        System.out.println("\nMultiplication: ");
        prod.display();

        System.out.println("\nDivision: ");
        quo.display();

        scanner.close();
    }
}
