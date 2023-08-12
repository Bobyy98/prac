import java.util.Scanner;

class ComplexNo 
{
    double real;
    double imag;

    ComplexNo(double r, double i) {
        real = r;
        imag = i;
    }

    ComplexNo add(ComplexNo other) {
        double newReal = real + other.real;
        double newImag = imag + other.imag;
        return new ComplexNo(newReal, newImag);
    }

    ComplexNo sub(ComplexNo other) {
        double newReal = real - other.real;
        double newImag = imag - other.imag;
        return new ComplexNo(newReal, newImag);
    }

    ComplexNo mul(ComplexNo other) {
        double newReal = real * other.real - imag * other.imag;
        double newImag = real * other.real + imag * other.imag;
        return new ComplexNo(newReal, newImag);
    }

    ComplexNo div(ComplexNo other) {
        double den = other.real * other.real + other.imag * other.imag;
        double newReal = (real * other.real + imag * other.imag) / den;
        double newImag = (imag * other.real - real * other.imag) / den;
        return new ComplexNo(newReal, newImag);
    }

    void display() {
        if (imag >= 0) {
            System.out.println(real + " + " + imag + "i");
        } else {
            System.out.println(real + " - " + (-imag) + "i");
        }
    }
}

public class ComplexNoCalcVar3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1st complex number (real imaginary): ");
        double real1 = scanner.nextDouble();
        double imag1 = scanner.nextDouble();
        ComplexNo num1 = new ComplexNo(real1, imag1);

        System.out.println("Enter 2nd complex number (real imaginary): ");
        double real2 = scanner.nextDouble();
        double imag2 = scanner.nextDouble();
        ComplexNo num2 = new ComplexNo(real2, imag2);

        ComplexNo sum = num1.add(num2);
        ComplexNo diff = num1.sub(num2);
        ComplexNo prod = num1.mul(num2);
        ComplexNo quo = num1.div(num2);

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
