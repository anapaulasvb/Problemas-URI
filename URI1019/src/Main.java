import java.util.Scanner;

// Conversão de Tempo

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int segundos = N % 60;
		int minutos = (N % 3600) / 60;
		int horas = (N - segundos - (60 * minutos)) / 3600;

		System.out.println(horas + ":" + minutos + ":" + segundos);

		sc.close();

	}

}
