import java.util.Scanner;
public class AtvSete
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        double salary = 2000;
        int cars_sold;

        System.out.print("Cars sold: ");
        cars_sold = scanner.nextInt();

        for (int i = 0; i < cars_sold; i++)
        {
            salary += 100; // Adds 100 to each car sold
        }

        System.out.printf("Salary: $%,.2f", salary);

        scanner.close();
    }
}