import java.util.Scanner;

/* Número Perfeito
 * Na matemática, um número perfeito é um número inteiro para o qual a soma de todos os seus divisores positivos próprios (excluindo ele mesmo) é igual ao próprio número.
 */
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			int X = sc.nextInt();
			numeroPerfeito(X);
		}

		sc.close();

	}

	public static void numeroPerfeito(int value) {

		int soma = 0;

		for (int i = 1; i < value; i++) {
			if (value % i == 0) {
				soma = soma + i;
			}
		}
		if (soma == value) {
			System.out.println(value + " eh perfeito");
		} else {
			System.out.println(value + " nao eh perfeito");
		}
	}

}
