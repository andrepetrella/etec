import java.util.Scanner;
public class AtvNove
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        double number_1, number_2, result;
        char operator;
        boolean resultAvaliable = false;

        System.out.print("Enter the first number: ");
        number_1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        number_2 = scanner.nextDouble();

        System.out.print("Enter the operator (+, -, / or *): ");
        operator = scanner.nextLine().charAt(0);

        switch (operator)
        {
            case '+' -> {
                result = number_1 + number_2;
                resultAvaliable = true;
            }
            case '-' -> {
                result = number_1 - number_2;
                resultAvaliable = true;
            }
            case '/' -> {
                if (number_2 != 0)
                {
                    result = number_1 / number_2;
                    resultAvaliable = true;
                }
                else
                {
                    System.out.println("Cannot divide by 0.");
                }
            }
            case '*' -> {
                result = number_1 * number_2;
                resultAvaliable = true;
            }
            default -> {
                System.out.println("Invalid operator.");
            }
        }

        if (resultAvaliable)
        {
            System.out.println("Result: " + result);
        }
        else
        {
            System.out.println("No result.");
        }

        scanner.close();
    }
}