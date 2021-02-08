package RecuperacionPrimerExamen;

public class RecuperacionDos {

	public static void main(String[] args) {
		
		String linea ="";
		for (int i=1 ; i<=5 ; i++) {
			linea = "";
			for (int j=1 ; j <=5 ; j++) {
				if (i == j) {
					linea += " * ";
				}else {
					linea += " + ";
				}
				
			}
			System.out.println(linea );
			}
	}

}
