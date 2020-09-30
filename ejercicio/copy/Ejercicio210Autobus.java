package ejercicio.copy;

import java.util.Scanner;

public class Ejercicio210Autobus {

	private static final int MINIMO_PERSONAS = 20;
	private static final int COSTO_A = 2;
	private static final float COSTO_B = 2.5f;
	private static final int COSTO_C = 5;
	private static final String BUS_A = "A";
	private static final String BUS_B = "B";
	private static final String BUS_C = "C";

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese cantidad de personas");
		int personas = sc.nextInt();

		// solicitar cant d km
		System.out.println("Ingrese cantidad de km");
		int km = sc.nextInt();
		// solicitar tipo de autobus
		System.out.println("Ingrese tipo de autobus (A, B, C)");
		String tipo = sc.next();

		int totalPersonas = MINIMO_PERSONAS;

		// calcular costo del transporte

		if (personas > MINIMO_PERSONAS) {
			totalPersonas = personas;

		}
		int costoTotal = totalPersonas * km;

		float totalGrupal = 0;

		switch (tipo.toUpperCase()) {
		case BUS_A:
			totalGrupal = costoTotal * COSTO_A;
			break;

		case BUS_B:
			totalGrupal = costoTotal * COSTO_B;
			break;
		case BUS_C:
			totalGrupal = costoTotal * COSTO_C;
			break;

		}

		System.out.println("El total grupal es" + totalGrupal);
		sc.close();

	}
}
