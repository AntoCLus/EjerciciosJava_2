package ejercicio.copy;

import java.util.Scanner;

public class Ejercicio_dos_ciudades {
	// TODO Auto-generated method stub
	// En un trayecto entre dos ciudades se deben realizar paradas intermedias.
	// Se desea conocer cuantas paradas
	// se van a realizar en el viaje y la longitud de los trayectos en kilometros.
	// Se desea conocer la longitud
	// promedio entre ciudades y
	// cuales son las paradas mas cercanas

	// inicio
	// *------- * ---------------- * ----- * ----------- *
	// 40 100 15 60

	public static void main(String[] args) {
		System.out.println("Bienvenido");
		System.out.println("===========");
		System.out.println();

		Scanner sc = new Scanner(System.in);

		System.out.println("Ingrese cantidad de intermedias: ");
		int totalEstaciones = sc.nextInt();

		System.out.println();

		int ciudades[] = new int[totalEstaciones];
		int acumulador = 0;

		for (int i = 0; i < ciudades.length; i++) {
			System.out.println("Ingrese los kilometros estacion " + (i + 1) + ": ");
			ciudades[i] = sc.nextInt();
			acumulador = acumulador + ciudades[i];

		}
		sc.close();
		System.out.println("la distancia promedio entre ciudades es: " + acumulador / totalEstaciones);

		for (int j = 0; j < totalEstaciones; j++) {
			dibujarTrayecto(ciudades[j]);

		}
	}

	private static void dibujarTrayecto(int distancia) {

		for (int i = 0; i < distancia; i++) {
			System.out.print(" - ");

		}
		System.out.print(" * ");
		// TODO Auto-generated method stub

	}

}
