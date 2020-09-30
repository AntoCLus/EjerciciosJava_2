package ejercicio.copy;

import java.util.Scanner;

public class EjercicioAhorcado {
	public static void main(String[] args) {

		String palabra = generarPalabra();

		int puntaje = adivinar(palabra);

		mostrarPuntos(puntaje);

	}

	private static void mostrarPuntos(int puntaje) {
		System.out.println("Puntaje obtenido" + puntaje);
		// TODO Auto-generated method stub

	}

	private static int adivinar(String palabra) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese una letra");
		String letra = sc.next();

		int posicion = palabra.indexOf(letra);

		palabra.charAt(posicion);

		// TODO Auto-generated method stub
		sc.close();
		return 0;
	}

	private static String generarPalabra() {
		// TODO Auto-generated method stub
		return null;
	}

}
