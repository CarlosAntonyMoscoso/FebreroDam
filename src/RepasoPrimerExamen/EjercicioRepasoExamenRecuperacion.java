package RepasoPrimerExamen;

public class EjercicioRepasoExamenRecuperacion {

	public static void main(String[] args) {
		String frase = "los murcielagos estaban anclados en el techo sedientos de sangre";
		int contador = 0, contador2 = 0, contador3 = 0, contador4 = 0, contador5 = 0;
		
		
		for(int i=0; i<frase.length(); i++) {
		  
			if ((frase.charAt(i+i)=='a')) {
				contador++;
			}if ((frase.charAt(i)=='e')){
				contador2++;
			}if ((frase.charAt(i)=='i')) {
				contador3++;
			
			}if ((frase.charAt(i) == 'o')) {
				contador4++;
			}if ((frase.charAt(i)=='u')) {
				contador5++;
			}
			
			
			
			}
			System.out.println("La frase " + frase + " tiene " + contador + " a");
			System.out.println("La frase " + frase + " tiene " + contador2 + " e");
			System.out.println("La frase " + frase + " tiene " + contador3 + " i");
			System.out.println("La frase " + frase + " tiene " + contador4 + " o");
			System.out.println("La frase " + frase + " tiene " + contador5 + " u");
			System.out.println("La vocal que más aparace es la" + " e");
	}

}
