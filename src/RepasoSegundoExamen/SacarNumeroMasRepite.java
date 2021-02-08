package RepasoSegundoExamen;

import java.util.Random;

public class SacarNumeroMasRepite {

	

	public static void main(String[] args) {
		Random aleatori = new Random();
		int Mida = 10;
		int i, k;

		int[] t = new int[Mida];

		for (i = 0; i < Mida; i++) {
			t[i] = aleatori.nextInt(10);

			System.out.println("Index[" + i + "]" + ":=" + t[i]);

		}

		int NUM = 0, c;
		int VECES = 0;
		c = 0;
		for (i = 0; i <= 9; i++) {
			c = 0;
			for (k = 0; k < Mida; k++) {

				if (i == t[k]) {
					c = c + 1;
				}

			}

			if (i == 0) {
				VECES = c;
				NUM = i;
			} else {
				if (VECES < c) {
					VECES = c;
					NUM = i;
				}
			}
		}
		System.out.println("Mayor=" + NUM + "  Veces " + VECES);
	}

}
