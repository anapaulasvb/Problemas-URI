import java.util.Scanner;

// Soma de Impares Consecutivos I

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int X = sc.nextInt();
		int Y = sc.nextInt();

		int inicio;
		int soma = 0;

		if (X < Y) {
			if (X % 2 == 0) {
				inicio = X + 1;
			} else {
				inicio = X + 2;
			}
			for (int i = inicio; i < Y; i = i + 2) {
				soma = soma + i;
			}
		}
		
		else {
			if (Y % 2 == 0) {
				inicio = Y + 1;
			} else {
				inicio = Y + 2;
			}
			for (int i = inicio; i < X; i = i + 2) {
				soma = soma + i;
			}
		}

		System.out.println(soma);

		sc.close();

	}

}
