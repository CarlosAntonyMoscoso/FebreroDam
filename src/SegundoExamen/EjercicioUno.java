package SegundoExamen;

import java.util.Arrays;
import java.util.Scanner;

public class EjercicioUno {

	public static void main(String[] args) {

		Scanner ent = new Scanner(System.in);
		int fila = 0, columna = 0;
		
		
		System.out.println("introduce la dimesion de la fila");
		fila = ent.nextInt();
		System.out.println("introduce la dimesion de la columna");
		columna = ent.nextInt();

		int[][] matriz1 = new int[fila][columna];

		rellenar(matriz1);
		for (int i = 0; i < matriz1.length; i++) {

			System.out.println(Arrays.toString(matriz1[i]));

		}

	}

	public static void rellenar(int n[][]) {

		int cont = n.length * n[0].length;

		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n[i].length; j++) {

				n[i][j] = cont;
				cont --;
			}
		}
	}

}
