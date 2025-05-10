// 4500 / month + 250 for each bug
import java.util.Scanner;
public class AtvSeis
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int bugs_resolved, salary = 4500; // Initial

        System.out.print("Enter the amount of bugs resolved: ");
        bugs_resolved = scanner.nextInt();

        for (int i = 0; i < bugs_resolved; i++)
        {
            salary += 200;
        }

        System.out.printf("Salary: $%,d", salary);

        scanner.close();
    }
}