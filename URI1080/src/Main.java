import java.util.Scanner;

/* Maior e Posição
 * 
 * Leia 100 valores inteiros. Apresente então o maior valor lido e a posição dentre os 100 valores lidos.
 * 
 */

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] vet = new int[100];
		int maior = 0;
		int posicaoMaior = 0;

		for (int i = 0; i < 100; i++) {
			vet[i] = sc.nextInt();
			if (vet[i] > maior) {
				posicaoMaior = i;
				maior = vet[i];
			}
		}

		System.out.println(maior);
		System.out.println(posicaoMaior + 1);

		sc.close();

	}

}
