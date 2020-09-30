package ejercicio.copy;

import java.util.Scanner;

public class ejerciciolapices {
	private static final int PRECIO_NOMINA = 85;
	private static final int PRECIO_MAYOR = 90;
	private static final int CANT_LIMITE = 1000;

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		// de 1000 en adelante precio 85
		// sino precio es 90
		// solicitar cant de lapices
		// informar total

		Scanner sc = new Scanner(System.in);
		System.out.println("Bienvenido/a");
		System.out.println("Ingrese cantidad de lapices: ");
		sc.close();
		int total = 0;

		int lapices = 0;
		if (lapices < CANT_LIMITE) {
			total = lapices * PRECIO_NOMINA;

		} else {
			total = lapices * PRECIO_MAYOR;
			System.out.println("cantidad inválida");

		}
		sc.close();
		System.out.println("El costo total es: $" + total);

	}

}
