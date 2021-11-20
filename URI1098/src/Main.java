// Sequencia IJ 4

import java.util.Locale;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		for (double i = 0.0; i <= 2.0; i = i + 0.2) {
			for (double j = 1.0; j <= 3.0; j++) {
				if (i == 0.0 || i == 1.0 || i >= 1.9) {
					System.out.println("I=" + Math.round(i) + " J=" + Math.round(j+i));
				} else {
					System.out.printf("I=%.1f J=%.1f%n", i, (j + i));
				}
			}
			
		}
	}

}
