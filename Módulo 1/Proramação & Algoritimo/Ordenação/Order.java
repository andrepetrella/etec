import java.util.Scanner;
public class Order {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.println("Número 1: ");
        a = sc.nextInt();
        System.out.println("Número 2: ");
        b = sc.nextInt();
        System.out.println("Número 3: ");
        c = sc.nextInt();

        // a = 1 -- b = 1 -- c = 2
        if ((a < b || a == b) && (a < c || a == c)) {
            if (b > c) {
                if (a == c) {
                    System.out.println(a + " " + c + " " + b);
                }
                else {
                    System.out.println(a + " " + c + " " + b);
                }
            }
            else if (c > b) {
                if (a == b) {
                    System.out.println(a + " " + b + " " + c);
                }
                else {
                    System.out.println(a + " " + b + " " + c);
                }
            }
            else {
                System.out.println(a + " " + b + " " + c);
            }
        }
        else if ((b < a || b == a) && (b < c || b == c)) {
            if (a > c) {
                if (b == c) {
                    System.out.println(b + " " + c + " " + a);
                }
                else {
                    System.out.println(b + " " + c + " " + a);
                }
            }
            else if (a < c) {
                if (b == a) {
                    System.out.println(b + " " + a + " " + c);
                }
                else {
                    System.out.println(b + " " + a + " " + c);
                }
            }
            else {
                System.out.println(a + " " + b + " " + c);
            }
        }
        else if ((c < a || c == a) && (c < b || c == b)) {
            if (a > b) {
                if (c == a) {
                    System.out.println(c + " " + b + " " + a);
                }
                else {
                    System.out.println(c + " " + b + " " + a);
                }
            }
            else if (a < b) {
                if (c == b) {
                    System.out.println(c + " " + a + " " + b);
                }
                else {
                System.out.println(c + " " + a + " " + b);
                }
            }
            else {
                System.out.println(a + " " + b + " " + c);
        }

        sc.close();
    }
}
}