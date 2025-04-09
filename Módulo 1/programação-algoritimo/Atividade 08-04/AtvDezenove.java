import java.util.Scanner;
public class AtvDezenove
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        double bank_account = 20000;
        int withdraw_option;

        System.out.print("Enter 1 to withdraw: ");
        withdraw_option = scanner.nextInt();

        if (withdraw_option == 1)
        {
            double withdraw_amount;

            System.out.print("Enter the amount to withdraw ($): ");
            withdraw_amount = scanner.nextDouble();

            if (withdraw_amount > 0 && withdraw_amount < bank_account)
            {
                bank_account -= withdraw_amount;
                System.out.println("You have just withdraw $" + withdraw_amount + "\nNew balance: $" + bank_account);
            }
            else
            {
                System.out.println("Invalid number.");
            }
        }
        else
        {
            System.out.println("No withdraw then.");
        }
        
        scanner.close();
    }
}