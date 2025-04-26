import java.util.Scanner;
public class AtvDez
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        double liters, mililiters;
        int choice;

        System.out.println("1 - Convert mL to L\n2 - Convert L to mL: ");
        choice = scanner.nextInt();

        switch (choice)
        {
            case 1 ->
            {
                System.out.print("Mililiters (mL): ");
                mililiters = scanner.nextDouble();
                liters = convertL(mililiters);

                System.out.printf("\nLiters: %.2f L", liters);
            }
            case 2 ->
            {
                System.out.print("Liters (L): ");
                liters = scanner.nextDouble();
                mililiters = convertML(liters);

                System.out.printf("\nMililiters: %.2f mL", mililiters);
            }
            default ->
            {
                System.out.println("Invalid input.");
            }
        }

        scanner.close();
    }

    static double convertL(double mililiters)
    {
        double liters = mililiters / 1000;
        return liters;
    }

    static double convertML(double liters)
    {
        double mililiters = liters * 1000;
        return mililiters;
    }
}