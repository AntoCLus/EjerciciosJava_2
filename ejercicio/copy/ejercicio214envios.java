package ejercicio.copy;

import java.util.Scanner;

public class Ejercicio214envios {

	/*
	 * Una compa��a de paqueter�a internacional tiene servicio en algunos pa�ses de
	 * Am�rica del Norte, Am�rica Central, Am�rica del Sur, Europa y Asia. El costo
	 * por el servicio de paqueter�a se basa en el peso del paquete y la zona a la
	 * que va dirigido. Lo anterior se muestra en la siguiente tabla: Parte de su
	 * pol�tica implica que los paquetes con un peso superior a 5 kg no son
	 * transportados, esto por cuestiones de log�stica y de seguridad. Realice un
	 * algoritmo para determinar el cobro por la entrega de un paquete o, en su
	 * caso, el rechazo de la entrega; repres�ntelo mediante diagrama de flujo y
	 * pseudoc�digo.
	 */

	// definmos zona como float

	private static final float zona_1 = 11;
	private static final float zona_2 = 10;
	private static final float zona_3 = 12.9f;
	private static final float zona_4 = 24;
	private static final float zona_5 = 27;

	public static void main(String[] args) {
		Scanner usa = new Scanner(System.in);
		float peso = usa.nextFloat();

		System.out.println("Ingrese peso");
		float totalPeso = 0;

		System.out.println("Ingrese zona");
		float zona = usa.nextFloat();

		if (peso > 0 && peso <= 5000) {
			// switch (zona)
			//

		}
	}
}
