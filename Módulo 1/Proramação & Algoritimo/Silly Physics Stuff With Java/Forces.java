import java.util.Scanner;
public class Forces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int what_to_find = 0;
            System.out.print("What do you want to find?\n1 - Normal Force\n2 - Average Speed\n3 - Acceleration\n4 - Density\nPressure");
            what_to_find = scanner.nextInt();

            if (what_to_find == 1) {

                System.out.print("There are two types of Normal Force:\n1 - Horizontal Normal Force\n2 - Inclined Normal Force\n\nChoose one: ");
                
                int choice = scanner.nextInt();
                if (choice == 1) {
                    double m, g, nF;
                    System.out.print("Enter the mass (kg): ");
                    m = scanner.nextDouble();
                    System.out.print("Enter the gravity acceleration (m/s²): ");
                    g = scanner.nextDouble();
                    
                    nF = m * g;
                    System.out.println("The normal force (m * g) is " + nF + "N.");
                }
                else if (choice == 2) {
                    double m, g, th, nF;
                    System.out.print("Enter the mass (kg): ");
                    m = scanner.nextDouble();
                    System.out.print("Enter the gravity acceleration (m/s²): ");
                    g = scanner.nextDouble();
                    System.out.print("Enter the theta angle (degrees): ");
                    th = scanner.nextDouble();

                    nF = m * g * Math.cos(th);
                    System.out.print("The normal force (m * g * cos(theta)) is " + nF + "N.");
                }
                else {
                    System.out.println("Error: " + choice + " is not a valid option.");
                }
            }
            else if (what_to_find == 2) {
                double d, t, aS;
                System.out.print("Enter the distance (km): ");
                d = scanner.nextDouble();
                System.out.print("Enter the time (hour): ");
                t = scanner.nextDouble();

                aS = d / t;
                System.out.println("The Average Speed (d / t) is " + aS + "km/h.");
            }
            else if (what_to_find == 3) {
                double v, u, t, a;
                System.out.print("Enter the final velocity (m/s): ");
                v = scanner.nextDouble();
                System.out.print("Enter the initial velocity (m/s): ");
                u = scanner.nextDouble();
                System.out.print("Enter the time (seconds): ");
                t = scanner.nextDouble();

                a = (v - u) / t;
                System.out.println("The acceleration ((v - u) / t) is " + a + "m/s^2.");
            }
            else if (what_to_find == 4) {
                double m, v, p;
                System.out.print("Enter the final mass (g): ");
                m = scanner.nextDouble();
                System.out.print("Enter the initial volume (cm^3): ");
                v = scanner.nextDouble();

                p = m/v;
                System.out.println("The desity (m/V) is " + p + "cm^3");
            }

        scanner.close();
    }
}