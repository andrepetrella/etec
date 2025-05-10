import java.util.Scanner;
public class AtvUm
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, sum, mult;

        System.out.print("Enter first number: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        num2 = scanner.nextDouble();

        sum = num1 + num2;
        mult = num1 * sum;

        System.out.printf("Sum: %.2f\nMult: %.2f", sum, mult);
        scanner.close();
    }
}