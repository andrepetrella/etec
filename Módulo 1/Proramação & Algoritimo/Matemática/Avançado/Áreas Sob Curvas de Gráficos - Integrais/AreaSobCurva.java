import java.util.Scanner;
public class AreaSobCurva {
    static String tipo;
    static String grafia;
    static double potencia = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double limA = 0.0;
        System.out.print("intervalo a: ");
        limA = sc.nextDouble();
        double limB = 0.0;
        System.out.print("intervalo b: ");
        limB = sc.nextDouble();
        int rets = 1;
        System.out.print("numero de retângulos: ");
        rets = sc.nextInt();

        double res = rien(limA, limB, rets);
        double n = 1;

        double aprox = 0.0;

        if (tipo.equals("exp")) {
            n = potencia + 1;
        }
        else if (tipo.equals("add")) {
            n = 2;
        }

        if (tipo.equals("cos")) {
            aprox = 0.0;
        }
        else {
            aprox = (Math.pow(limA, n) / n) + (Math.pow(limB, n) / n);
        }

        System.out.println("\npara " + grafia + ":");
        System.out.println("area sob a curva ~= " + res);
        System.out.println("onde r -> infinito, a -> " + aprox);
        sc.close();
    }

    

    public static double rien(double a, double b, int r) {
        double lar = (b-a)/r;
        double area = 0.0;
        for (int i = 0; i < r; i++) {
            double x = a + i * lar;
            area += f(x) * lar;
        }
        return area;
    }

    public static double f(double x) {
        grafia = "f(x) = x^9";
        potencia = 9;
        tipo = "exp";
        return Math.pow(x, 9);
    }
}