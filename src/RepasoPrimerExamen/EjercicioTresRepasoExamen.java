package RepasoPrimerExamen;

public class EjercicioTresRepasoExamen {

	public static void main(String[] args) {
		//con for el factorial
				/*int res = 1, num= 5;
				
				for (int x=1;x<=num;x++) {
					  res = res * x;
				
			      
				}
				
				System.out.println("El factorial del número " + num +  " es " + res);*/
				
				//con do  while
				
				int num = 7, contador = 1, res = 1;
				
				do {
					res = res * contador;
					contador++;
					
				}while (contador <=num);
				
						System.out.println("El factorial de " + num + " es " + res);
	}

}
