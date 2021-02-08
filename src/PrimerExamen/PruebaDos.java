package PrimerExamen;

import java.util.Scanner;

public class PruebaDos {// introducir n numero y sumarlos

	public static void main(String[] args) {
	    
		int tam,acum =0,num;
		
		Scanner ent = new Scanner(System.in);
		
		tam = 5;
		
		System.out.println("Intoduzca 100 numeros");
		
		for (int x = 0; x < tam; x++) {
			num = ent.nextInt();
			acum=num+acum;
		}
		System.out.println(acum);
	}

}
