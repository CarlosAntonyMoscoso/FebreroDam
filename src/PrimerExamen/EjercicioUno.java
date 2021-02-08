package PrimerExamen;

public class EjercicioUno {

	public static void main(String[] args) {
		
		String frase = "los murcielagos estaban anclados en el techo sedientos de sangre";
		int contador = 0;

		for (int i = 0; i < frase.length(); i++) {

			if ((frase.charAt(i) == 'a') || (frase.charAt(i) == 'e') || (frase.charAt(i) == 'i')
					|| (frase.charAt(i) == 'o') || (frase.charAt(i) == 'u')) {
				contador++;

			}
		}
		System.out.println("La frase " + frase + " tiene " + contador + " vocales");
	}

}
