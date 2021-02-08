package RecuperacionPrimerExamen;

public class RecuperacionTres {

	public static void main(String[] args) {
		
		String parking = "planta primera", parking2 = "planta segunda", parking3 = "planta tercera";
		int kg = 450;
		int p1=50, p2=50, p3=49;
		int totalPlazas= p1+p2+p3;
				
		if (totalPlazas < 150) {
			
			System.out.println("continue");
			
			if (kg > 500 && p3<50) {
				System.out.println("Puede aparcar en  la " + parking3);
			}if (kg <= 500 && p1 <50) {
				System.out.println("Puede aparcar en  la " + parking);	
			}if (kg <= 500 && p2<50) {
				System.out.println("Puede aparcar en  la " + parking2);
			}
			
		}else {
			System.out.println("no hay sitio, vayase");
		}
	}

}
