package ejercicio.copy;

import java.util.Scanner;

public class Menu {
	private static final int MAX_OPCION = 3;
	private static final int DIAS = 5;

	private static float[] recaudacion = new float[DIAS];
	private static String[] nombreDia = new String[DIAS];

	public static void main(String[] args) {
		// cargar dias
		cargarDias();

		// mostrar menu de opciones
		int prueba = 0;
		int opcion = menuOpciones();

		// mientras opcion sea diferente de cero
		while (opcion != 0) {
			// segun la opcion seleccionada hacer operacion
			switch (opcion) {
			case 1:
				agregarRecaudacion();
				break;
			case 2:
				listarRecaudacion();
				break;
			case 3:
				modificarRecaudacion();
				break;
			}

			opcion = menuOpciones();

		}

	}

	private static void cargarDias() {
		nombreDia[0] = "Lunes";
		nombreDia[1] = "Martes";
		nombreDia[2] = "Miercoles";
		nombreDia[3] = "Jueves";
		nombreDia[4] = "Viernes";

	}

	private static void agregarRecaudacion() {

		Scanner sc = new Scanner(System.in);

		for (int dia = 0; dia < DIAS; dia++) {
			System.out.println("Ingrese monto de dia " + nombreDia[dia] + ": ");
			recaudacion[dia] = sc.nextFloat();
			System.out.println();
		}

		System.out.println("Semana cargada exitosamente!");
		System.out.println();

	}

	private static void listarRecaudacion() {
		System.out.println();
		for (int i = 0; i < DIAS; i++) {
			System.out.println("Dia " + nombreDia[i] + ": " + recaudacion[i]);
		}

		System.out.println();
	}

	private static void modificarRecaudacion() {
		System.out.println("Ingrese numero de dia a modificar: (0.lun | 1.mar | 2.mie | 3.jue | 4.vie ");
		Scanner sc = new Scanner(System.in);
		int dia = sc.nextInt();

		System.out.println("Valor actual: " + recaudacion[dia]);

		System.out.println();
		System.out.println("Ingrese nuevo valor: ");
		float nuevaRecaudacion = sc.nextFloat();

		recaudacion[dia] = nuevaRecaudacion;

		System.out.println();
		System.out.println("Recaudacion modificada!");
		System.out.println();

	}

	private static int menuOpciones() {
		System.out.println("Menu opciones");
		System.out.println("=============");
		System.out.println();
		System.out.println(" 1 - Ingresar recaudacion");
		System.out.println(" 2 - Listar recaudaciones");
		System.out.println(" 3 - Modificar recaudacion");
		System.out.println(" 0 - Salir");
		System.out.println();
		System.out.println("Ingrese opcion: ");

		Scanner scanner = new Scanner(System.in);
		int opcion = scanner.nextInt();

		if (opcion < 0 || opcion > MAX_OPCION) {
			System.out.println("Opcion Invalida");
			System.out.println();
		}

//		scanner.close();
		return opcion;
	}

}
