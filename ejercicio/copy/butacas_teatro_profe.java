package ejercicio.copy;

import java.util.Scanner;

public class butacas_teatro_profe {

	private static final int TOTAL_BUTACAS = 50;

	public static void main(String[] args) {

		int butacas[] = new int[TOTAL_BUTACAS];

		for (int i = 0; i < TOTAL_BUTACAS; i++) {
			butacas[i] = 0;

		}
		int numeroAsiento;

		System.out.println("Bienvenida al sistema de venta de boletos");
		System.out.println("========================");
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("Ingrese el numero de asiento. 99 para salir");
		numeroAsiento = sc.nextInt();

		while (numeroAsiento != 99) {

			switch (numeroAsiento / 10) {
			case 0:
				System.out.println("Costo $100");
				break;
			case 1:
				System.out.println("Costo $80");
				break;
			case 2:
				System.out.println("Costo $120");
				break;
			case 3:
				System.out.println("Costo $40");
				break;
			case 4:
				System.out.println("numero invalido");
				break;
			default:
			}
			if (numeroAsiento < 0 || numeroAsiento > TOTAL_BUTACAS - 1) {
				System.out.println("Butaca " + numeroAsiento + "=" + butacas[numeroAsiento]);
				if (butacas[numeroAsiento] == 0) {
					butacas[numeroAsiento] = 1;
					System.out.println("Butaca ya vendida. Seleccione otra ubicación");
				} else {
					System.out.println("Butaca ya vendida. seleccione otra ubicacion");
				}

			}
			System.out.println("Ingrese numero de asiento");
			numeroAsiento = sc.nextInt();
		}
		sc.close();
		int contador = 0;
		System.out.println("Mostrar butacas vendidas");

		for (int i = 0; i < butacas.length; i++) {
			if (butacas[i] == 1) {
				System.out.println("Butaca" + i);
				contador++;
			}
		}
		System.out.println("Butacas vendidas" + contador);
		dibujarButacas(butacas);
	}

	private static void dibujarButacas(int[] butacas) {

		for (int i = 0; i < butacas.length; i++) {
			if (butacas[i] == 0) {
				System.out.print(" _ ");
			} else {
				System.out.print(" X ");
			}
			if ((i + 1) % 10 == 0) {
				System.out.println();
			}
		}

	}
}
