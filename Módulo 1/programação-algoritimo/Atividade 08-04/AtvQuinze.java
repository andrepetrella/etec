import java.util.Scanner;
public class AtvQuinze
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        double minutes, hours;
        int choice;

        System.out.println("1 - Convert minutes to hours\n2 - Convert hours to minutes: ");
        choice = scanner.nextInt();

        switch (choice)
        {
            case 1 ->
            {
                System.out.print("Minutes: ");
                minutes = scanner.nextDouble();
                hours = convertMeter(minutes);

                System.out.printf("\nHours: %.2fh", hours);
            }
            case 2 ->
            {
                System.out.print("Hours: ");
                hours = scanner.nextDouble();
                minutes = convertMinute(hours);

                System.out.printf("\nMinutes: %.2f min", minutes);
            }
            default ->
            {
                System.out.println("Invalid input.");
            }
        }

        scanner.close();
    }

    static double convertHour(double min)
    {
        double hour = min / 60;
        return hour;
    }

    static double convertMinute(double hours)
    {
        double min = hours * 60;
        return min;
    }
}