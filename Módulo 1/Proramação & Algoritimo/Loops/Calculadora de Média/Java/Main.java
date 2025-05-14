import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);		

		double soma_das_notas = 0.0;
		double media = 0.0;
		String situacao = "";
		
		for (int i = 0; i < 4; i++) {
			double nota = 0.0;
			System.out.print("\nInsira a nota " + (i + 1) + ": ");
			nota = scanner.nextDouble();
			
			if (nota <= 10 && nota > 0) {
				soma_das_notas += nota;
			}
			else {
				System.out.println("Erro. Insira um número válido...");
				i -= 1;
			}
		}

		media = soma_das_notas / 4;
		if (media >= 7) {
			situacao = "Aprovado";
		}
		else {
			situacao = "Reprovado";
		}

		// Output
		System.out.println("\nMédia final: " + media);
		System.out.println("\nSituação: " + situacao);

		scanner.close();
	}
}