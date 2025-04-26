import java.util.Scanner;
public class AtvDoze
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        double kilometers, meters;
        int choice;

        System.out.println("1 - Convert km to meters\n2 - Convert meters to km: ");
        choice = scanner.nextInt();

        switch (choice)
        {
            case 1 ->
            {
                System.out.print("Kilometers (km): ");
                kilometers = scanner.nextDouble();
                meters = convertMeter(kilometers);

                System.out.printf("\nMeters: %.2f m", meters);
            }
            case 2 ->
            {
                System.out.print("Meters (m): ");
                meters = scanner.nextDouble();
                kilometers = convertKM(meters);

                System.out.printf("\nKilometers: %.2f km", kilometers);
            }
            default ->
            {
                System.out.println("Invalid input.");
            }
        }

        scanner.close();
    }

    static double convertMeter(double km)
    {
        double meters = km / 1000;
        return meters;
    }

    static double convertKM(double meters)
    {
        double km = meters * 1000;
        return km;
    }
}