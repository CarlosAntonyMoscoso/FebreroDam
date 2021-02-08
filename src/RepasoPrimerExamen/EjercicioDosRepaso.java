package RepasoPrimerExamen;

public class EjercicioDosRepaso {

	public static void main(String[] args) {

		float Peso = 95.5f, altura = 1.55f, IMC = Peso / (altura * altura);

		System.out.println("Su IMC es de " + IMC);
		if (IMC <= 18.5) {
			System.out.println("Necesita comer mas");
		}
		if ((IMC >= 18.5 && IMC <= 24.9)) {
			System.out.println("Normal");
		}
		if (IMC >= 25 && IMC <= 30) {
			System.out.println("obesida");
		}
		if (IMC >= 30) {
			System.err.println("Obesida morbida");
		}
	}

}
