package SegundoExamen;

public class EjercicioDos {

	public static void main(String[] args) {

		String fecha = "";
		fecha = genFecha();

		System.out.println(fecha);

	}

	public static String genFecha() {

		String fecha = "";
		String mes = genMes();
		String dia = genDia(mes);
		fecha = dia + " de " + mes + " de 2021";
		
		return fecha;

	}

	public static String genDia(String mes) {

		String dia = "";

		if (mes.equalsIgnoreCase("Febrero")) {
			dia = Integer.toString((int) ((Math.random() * 28) + 1));

		} else if (mes.equalsIgnoreCase("Noviembre") || mes.equalsIgnoreCase("Abril") || mes.equalsIgnoreCase("Junio")
				|| mes.equalsIgnoreCase("Septiembre")) {
			dia = Integer.toString((int) ((Math.random() * 30) + 1));
		} else {

		}

		return dia;
	}

	public static String genMes() {
		String mes = "";
		int numMes = (int) ((Math.random() * 12) + 1);

		switch (numMes) {

		case 1:
			mes = "Enero";
			break;
		case 2:
			mes = "Febrero";
			break;
		case 3:
			mes = "Marzo";
			break;
		case 4:
			mes = "Abril";
			break;
		case 5:
			mes = "Mayo";
			break;
		case 6:
			mes = "Junio";
			break;
		case 7:
			mes = "Julio";
			break;
		case 8:
			mes = "Agosto";
			break;
		case 9:
			mes = "Septiembre";
			break;
		case 10:
			mes = "Octubre";
			break;
		case 11:
			mes = "Noviembre";
			break;
		case 12:
			mes = "Diciembre";
			break;

		}
		return mes;
	}
}
