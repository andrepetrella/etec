import java.util.Scanner;
public class NegSqrt {
    public static void main(String[] args) {
        int neg_number;
        double positive_number;
        double sqrt_number;
        boolean isPerfectSquare = false;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the negative number to be square rooted: ");
        neg_number = scanner.nextInt();

        if (neg_number > 0) {
            System.out.println("Error: number has to be negative (below 0)...");
        } else {
            positive_number = neg_number * (-1);
            for (int i = 0; i * i <= positive_number; i++) {
                if (i * i == positive_number) {
                    isPerfectSquare = true;
                    break;
                }
            }

            if (isPerfectSquare) {
                sqrt_number = Math.sqrt(positive_number);
                System.out.println("Result: " + (int) sqrt_number + "i");
            } else {
                sqrt_number = Math.sqrt(positive_number);
                System.out.printf("Result: =~ %.2f" + "i", sqrt_number);
            }
        }

        scanner.close();
    }
}