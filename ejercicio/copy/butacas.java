package ejercicio.copy;

import java.util.Scanner;

public class butacas {
	private static final int CANT_BUTACAS = 50;

	public static void main(String[] args) {

		int butacas[] = new int[CANT_BUTACAS];
		for (int i = 0; i < butacas.length; i++) {
			butacas[i] = 0;
		}
		int solicitudAsiento;

		int contador = 0;

		System.out.println("Bienvenida al sistema de venta de boletos");
		System.out.println("============================");
		System.out.println();
		System.out.println("Ingrese el número de butaca que desea adquirir");
		Scanner sc = new Scanner(System.in);
		solicitudAsiento = sc.nextInt();
		while (solicitudAsiento != 99) {
			System.out.println("Butaca: " + (solicitudAsiento) + " " + (butacas[solicitudAsiento]));
			if (butacas[solicitudAsiento] == 0) {
				butacas[solicitudAsiento] = 1;
				contador += 1;
				System.out.println("Butaca disponible. Venta confirmada");

			} else {
				System.out.println("Butaca no disponible. Seleccione otra ubicación");
			}

			System.out.println("Ingrese el número de butaca que desea adquirir");
			solicitudAsiento = sc.nextInt();
		}

		System.out.println("Butacas vendidas:" + contador);
		for (int i = 0; i < butacas.length; i++) {
			if (butacas[i] == 1) {
				System.out.println("Butaca: " + i);
				contador = contador + 1;

			}
		}

		sc.close();
	}

}
