package PrimerExamen;

public class EjericicioDos {

	public static void main(String[] args) {
		
	int num = 8, contador = num, res = 1;
		
		
		while (contador >=1) {
			
			res = res* contador;
			contador--;
			
		}
		    System.out.println("El factorial de " + num + " es " + res);
	}

}
