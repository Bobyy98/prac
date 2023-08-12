import java.util.Scanner;

class ComplexNo5 {
    double real;
    double imag;

    ComplexNo5(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    ComplexNo5 add(ComplexNo5 other) {
        double newReal = this.real + other.real;
        double newImag = this.imag + other.imag;
        return new ComplexNo5(newReal, newImag);
    }

    ComplexNo5 sub(ComplexNo5 other) {
        double newReal = this.real - other.real;
        double newImag = this.imag - other.imag;
        return new ComplexNo5(newReal, newImag);
    }

    ComplexNo5 mul(ComplexNo5 other) {
        double newReal = this.real * other.real - this.imag * other.imag;
        double newImag = this.real * other.real + this.imag * other.imag;
        return new ComplexNo5(newReal, newImag);
    }

    ComplexNo5 div(ComplexNo5 other) {
        double den = other.real * other.real + other.imag * other.imag;
        double newReal = (this.real * other.real + this.imag * other.imag) / den;
        double newImag = (this.imag * other.real - this.real * other.imag) / den;
        return new ComplexNo5(newReal, newImag);
    }

    ComplexNo5 conjugate() {
        return new ComplexNo5(this.real, -this.imag);
    }

    ComplexNo5 inverse() {
        double den = this.real * this.real + this.imag * this.imag;
        double newReal = this.real / den;
        double newImag = -this.imag / den;
        return new ComplexNo5(newReal, newImag);
    }

    PolarForm polarForm() {
        double magnitude = Math.sqrt(this.real * this.real + this.imag * this.imag);
        double angle = Math.atan2(this.imag, this.real);
        return new PolarForm(magnitude, angle);
    }

    void display() {
        if (imag >= 0) {
            System.out.println(real + " + " + imag + "i");
        } else {
            System.out.println(real + " - " + (-imag) + "i");
        }
    }
}

class PolarForm {
    double magnitude;
    double angle;

    PolarForm(double magnitude, double angle) {
        this.magnitude = magnitude;
        this.angle = angle;
    }

    void display() {
        System.out.println("Magnitude: " + magnitude);
        System.out.println("Angle: " + angle);
    }
}

public class ComplexNoCalcVar5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1st complex number (real imaginary): ");
        double real1 = scanner.nextDouble();
        double imag1 = scanner.nextDouble();
        ComplexNo5 num1 = new ComplexNo5(real1, imag1);

        System.out.println("Enter 2nd complex number (real imaginary): ");
        double real2 = scanner.nextDouble();
        double imag2 = scanner.nextDouble();
        ComplexNo5 num2 = new ComplexNo5(real2, imag2);

        ComplexNo5 sum = num1.add(num2);
        ComplexNo5 diff = num1.sub(num2);
        ComplexNo5 prod = num1.mul(num2);
        ComplexNo5 quo = num1.div(num2);

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

        System.out.println("\nConjugate of 1st number: ");
        num1.conjugate().display();

        System.out.println("\nConjugate of 2nd number: ");
        num2.conjugate().display();

        System.out.println("\nInverse of 1st number: ");
        num1.inverse().display();

        System.out.println("\nInverse of 2nd number: ");
        num2.inverse().display();

        System.out.println("\nPolar form of 1st number: ");
        num1.polarForm().display();

        System.out.println("\nPolar form of 2nd number: ");
        num2.polarForm().display();

        scanner.close();
    }
}
