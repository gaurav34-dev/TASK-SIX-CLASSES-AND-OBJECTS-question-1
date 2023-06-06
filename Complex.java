import java.util.Scanner;

class Complex {
    private double real;
    private double imaginary;

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex add(Complex num) {
        double realSum = this.real + num.real;
        double imaginarySum = this.imaginary + num.imaginary;
        return new Complex(realSum, imaginarySum);
    }

    public Complex subtract(Complex num) {
        double realDiff = this.real - num.real;
        double imaginaryDiff = this.imaginary - num.imaginary;
        return new Complex(realDiff, imaginaryDiff);
    }

    public Complex multiply(Complex num) {
        double realProduct = (this.real * num.real) - (this.imaginary * num.imaginary);
        double imaginaryProduct = (this.real * num.imaginary) + (this.imaginary * num.real);
        return new Complex(realProduct, imaginaryProduct);
    }

    @Override
    public String toString() {
        return "(" + real + " + " + imaginary + "i)";
    }
}

public class ComplexOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the first complex number from the user
        System.out.print("Enter the real part of the first complex number: ");
        double real1 = scanner.nextDouble();
        System.out.print("Enter the imaginary part of the first complex number: ");
        double imaginary1 = scanner.nextDouble();
        Complex num1 = new Complex(real1, imaginary1);

        // Read the second complex number from the user
        System.out.print("Enter the real part of the second complex number: ");
        double real2 = scanner.nextDouble();
        System.out.print("Enter the imaginary part of the second complex number: ");
        double imaginary2 = scanner.nextDouble();
        Complex num2 = new Complex(real2, imaginary2);

        // Calculate and print the sum, difference, and product
        Complex sum = num1.add(num2);
        Complex difference = num1.subtract(num2);
        Complex product = num1.multiply(num2);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
    }
}