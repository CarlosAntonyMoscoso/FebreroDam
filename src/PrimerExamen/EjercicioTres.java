package PrimerExamen;

public class EjercicioTres {
	public static void main(String[] args) {
		
		int cant= 0;
		float precio = 0.0f, precioT = 0.0f, totalCompra =0.0f;
		String dto = "0%";
		
		
		for (int i=1 ; i<=5 ; i++) {
		cant = (int)(Math.random() * 5 + 1); // se suma +1 para que tenga 5 articulos/ 
		precio = (float)(Math.random() * 20 + 0.10f);// se suma 0,10 para llegar a 20,09€
		
		
		if (precio <= 10  ) { // esto sirve para aplicar descuento dependiendo del precio que teng
			dto = "0%";
			precioT = cant * precio;

		}else if (precio >10 && precio <=15) {
			dto ="5%";
			precioT =(cant * (precio - (precio *0.05f)));

		}else if (precio >15) {
			dto ="15%";
			precioT =(cant * (precio - (precio *0.1f)));

		}
		
		totalCompra += precioT;
		
		System.out.println("Articulo " + i + " " + cant + " " + precio + " " + dto);
	}
	
	System.out.println("El precio total es " + totalCompra);
		
	}
}
