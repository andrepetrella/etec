import java.util.Scanner;
public class AtvQuatro
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        double weight, amount_of_water;

        System.out.print("Enter you weight (kg): ");
        weight = scanner.nextDouble();

        amount_of_water = weight * 0.04;
        System.out.printf("You should drink %.2f L of water a day.", amount_of_water);
        scanner.close();
    }
}