package ejercicio.copy;

import java.util.Scanner;

public class butacas_conmetodos {
	private static final int CANT_BUTACAS = 50;

	public static void main(String[] args) {
		darBienvenida();
		int butacas[] = inicializarButacas();
		int contador = venderButacas(butacas);
		mostrarButacas(contador, butacas);

	}

	private static void darBienvenida() {
		System.out.println("Bienvenide al sistema de venta de boletos");
		System.out.println("============================");
		System.out.println();
	}

	private static int[] inicializarButacas() {
		int butacas[] = new int[CANT_BUTACAS];
		for (int i = 0; i < butacas.length; i++) {
			butacas[i] = 0;
		}
		return butacas;
	}

	private static int venderButacas(int[] butacas) {
		int solicitudAsiento;

		int contador = 0;

		System.out.println("Ingrese el número de butaca que desea adquirir");
		Scanner sc = new Scanner(System.in);
		solicitudAsiento = sc.nextInt();

		while (solicitudAsiento != 99/* falta validacion */) {

			if (butacas[solicitudAsiento - 1] == 0) {
				butacas[solicitudAsiento - 1] = 1;
				contador += 1;
				System.out.println("Butaca disponible. Venta confirmada");

			} else {
				System.out.println("Butaca no disponible. Seleccione otra ubicación");
			}

			System.out.println("Ingrese el número de butaca que desea adquirir");
			solicitudAsiento = sc.nextInt();
		}
		sc.close();
		return contador;

	}

	/*
	 * private static boolean validar(int solicitudAsiento) { boolean validacion; if
	 * (solicitudAsiento>0 && solicitudAsiento<50) {
	 * 
	 * return validacion;
	 * 
	 * }
	 */
	private static boolean esValido(int solicitudAsiento) {
		boolean valido = (solicitudAsiento - 1 >= 0 && solicitudAsiento - 1 < (CANT_BUTACAS));

		return valido;
	}

	private static void mostrarButacas(int contador, int[] butacas) {
		System.out.println("Butacas vendidas:" + contador);
		for (int j = 0; j < butacas.length; j++) {
			if (butacas[j] == 1) {
				System.out.println("Butaca: " + j);
			}
		}

	}
}
