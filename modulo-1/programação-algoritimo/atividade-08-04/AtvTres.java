import java.util.Scanner;
public class AtvTres
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        int birth_year, current_year, estimated_age;
        current_year = 2025;

        System.out.print("Enter your birth year: ");
        birth_year = scanner.nextInt();

        if (birth_year < 1800 || birth_year > 2025)
        {
            System.out.println("Insert a valid age...");
        }
        else if (birth_year == 2025)
        {
            System.out.println("You have just been born.");
        }
        else
        {
            estimated_age = current_year - birth_year;
            System.out.println("Estimated age: " + (estimated_age - 1) + " - " + estimated_age);
        }
        scanner.close();
    }
}