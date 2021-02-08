package RepasoSegundoExamen;

public class TenerTablaLosDatos {

	public static void main(String[] args) {
		String nombres []={"Victor", "carlos","daniel","macarena"};
		 int edad []={25,30,19,22}; 
		char sexo []={'M','M','M','F'};
		 System.out.println("Datos de los usuarios"); System.out.println("NOMBRES EDAD SEXO");
		 System.out.println("------- ---- ----");
		 for (int u=0;u<nombres.length;u++){
		 System.out.println(nombres[u]+ "  "+ edad[u] + "      " + sexo[u]); 
		} 
	}

}
