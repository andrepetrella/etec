import java.util.Scanner;
public class AtvCinco
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        // BMI -> Body Mass Index
        double weight, height, bmi;

        System.out.print("Enter weight (kg): ");
        weight = scanner.nextDouble();

        System.out.print("Etner height (meters): ");
        height = scanner.nextDouble();

        if (height > 0 && weight > 0)
        {
            bmi = calculateBmi(weight, height);
            System.out.printf("BMI: %.2f", bmi);
        }
        else
        {
            System.out.println("Invalid values.");
        }
        scanner.close();
    }

    static double calculateBmi(double weight, double height)
    {
        return (weight / (Math.pow(height, 2)));
    }
}