package SegundoExamen;

import java.util.Arrays;
import java.util.Scanner;

public class EjercicioTres {

	public static void main(String[] args) {
		
		// Declaración e instancia de objetos y variables 
		Scanner ent = new Scanner(System.in);
		String prod[]= {"manzanas", "leche", "pan","agua","aceite"};
		float prec[] = new float[] {0.70f,2.65f,1.00f,1.50f,4.85f};
		int cant[]= new int[prod.length];
		int pos=0;
		
		do {
			// Mostramos el menú de productos
			System.out.println("MENU: ");
			for(int i=0 ; i<prod.length;i++) {
				System.out.println( (i+1)+") "+ prod[i]+ "  --> " + prec[i]+" €");
			}
			// La opción de terminar la compra
			System.out.println("6) Salir");
			
			// Cada opción del menú se corresponde a la posición del array del producto menos una unidad
			pos = ent.nextInt() - 1;
			
			//Sólo si ha elegido un producto preguntamos por la cantidad a comprar
			if(pos >=0 && pos<=4) {
				System.out.println("Introduce cantida de " + prod[pos]);
				// Almacenamos en cant la cantidad escogida del producto en la posición pos de los arrays
				cant[pos] += ent.nextInt();
			}
			
		}while(pos !=5);
		
		//Llamada al método que calcula los totales
		totales(prod,prec,cant);

	}
	
	public static void totales(String prod[], float prec[], int cant[]) {
		
		// Declaramos una variable para acumular el total de la compra
		float total=0.0f;
		
		//Mostramos en el búcle los artículos con catidad comprada mayor que cero
		System.out.println("Articulo \t cantidad \t precio");
		for(int i=0 ; i<prod.length ; i++) {
			if(cant[i] > 0) {
				total += (prec[i] * cant[i]);
				System.out.println((i+1) + "º) " +prod[i] +"\t" +cant[i] +"\t" + (prec[i] * cant[i]));
			}			
		}
		
		System.out.println("----------------------------------" + total);
		
		// Llamada al método que calcula la vuelta a devolver al cliente
		System.out.println(calcVuelta(total));
	}
	
	public static String calcVuelta(float total) {
		// Declaramos las variables y objetos necesarios
		Scanner ent = new Scanner(System.in);
		String vuelta=""; // Cadena donde mostrar al usuario las monedas a devolverle
		
		// Lista de monedas 
		float monedas[] = {2.00f,1.00f,0.50f,0.20f,0.10f,0.05f,0.02f,0.01f};
		// Importe a recoger del usuario
		float pago = 0.0f;
		// Número de monedas de cada importe a devolver
		int numM = 0;
		// Flag para controlar si el pago es correcto
		boolean entrega=false;
		
		// Mientras la entrega de dinero no sea válida, pediremos el importe
		while(!entrega) {
			System.out.println("Introduzca el importe para la compra de " + total + "€");
			pago = ent.nextFloat();
			// A de darnos un valor mayor que la compra y multiplo de 5
			if(pago > total && (pago % 5) == 0) {
				entrega= true;
				pago = (pago - total) ;
				System.out.println("A devolver " + pago);
			}
		}
		
		// Recorremos las monedas existentes para calcular la vuelta
		for(int i=0 ; i < monedas.length ; i++) {
			// Obtenemos por cada moneda el número máximo que podemos devolver
			// Compra = 5,65 -> 5,65/2€ = 2 monedas de 2€
			numM = (int)(pago / monedas[i]);
			
			// Si tenemos monedas del importe a devolver lo guardamos 
			if(numM > 0) {
				vuelta += numM + " monedas de " + monedas[i] + "€"+"\n";
				pago -= (numM * monedas[i]);
			}
			
		}
		 // 
		// Devolvemos la cadena con las monedas a devolver 
		return vuelta;
	}
}
