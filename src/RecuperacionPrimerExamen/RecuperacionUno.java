package RecuperacionPrimerExamen;

public class RecuperacionUno {

	public static void main(String[] args) {
		
		String frase ="los murcielagos estaban anclados en el techo sedientos de sangre";
		int ascii = 0;
		
		
		for(int i=0; i<frase.length(); i++) {
			ascii = frase.charAt(i) ;
			System.out.println(frase.charAt(i) + " Tiene el codigo ascii "  + ascii);
			
		}
	}

}
