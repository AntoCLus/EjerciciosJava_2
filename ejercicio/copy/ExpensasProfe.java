package ejercicio.copy

/*Se desea calcular el total de expensas a pagar de un edificio de 4 pisos 
 * que tiene un departamento por piso desde planta baja hasta el último piso. 
 * Se deben ingresar los valores de cada departamento y luego informar el importe de expensas promedio
 */

import java.util.Scanner;

public class ExpensasProfe {

	private static final int CANT_DEPARTAMENTOS = 4;

	public static void main(String[] args) {

		float totalExpensas = 0;

		darBienvenida("BIENVENIDA AL SISTEMA DE CARGA DE EXPENSAS");

		System.out.print("¿Desea cargar las expensas de cada departamento? (S/N): ");
		Scanner sc = new Scanner(System.in);
		String validacion = sc.next();
		if (validacion.equalsIgnoreCase("s")) {

			for (int i = 0; i < CANT_DEPARTAMENTOS; i++) {
				System.out.print("Ingrese el valor a abonar del departamento " + (i + 1) + ": ");
				float dptoExpensas = sc.nextInt();
				totalExpensas = totalExpensas + dptoExpensas;

			}

			System.out.println("El monto total a abonar de expesas es de " + totalExpensas + "$");
			System.out.println("El monto promedio de expensas es " + (totalExpensas / CANT_DEPARTAMENTOS) + "$");

		} else {
			System.out.println("¡Que tengas un buen día!");
		}
	}

	private static void darBienvenida(String mensajeBienvenida) {
		dibujarDivisor(mensajeBienvenida.length(), "=");
		System.out.println(mensajeBienvenida.toUpperCase());
		dibujarDivisor(mensajeBienvenida.length(), "=");
		System.out.println();
	}

	private static void dibujarDivisor(int longitud, String simbolo) {
		for (int i = 0; i < longitud; i++) {
			System.out.print(simbolo);
		}
		System.out.println();

	}

	}

	private static final int CANT_DEPARTAMENTOS = 4;

	public static void main(String[] args) {

			float totalExpensas = 0;

			darBienvenida("BIENVENIDA AL SISTEMA DE CARGA DE EXPENSAS");

			System.out.print("¿Desea cargar las expensas de cada departamento? (S/N): ");
			Scanner sc = new Scanner(System.in);
			String validacion = sc.next();
			if (validacion.equalsIgnoreCase("s")) {

				for (int i = 0; i < CANT_DEPARTAMENTOS; i++) {
					System.out.print("Ingrese el valor a abonar del departamento " + (i + 1) + ": ");
					float dptoExpensas = sc.nextInt();
					totalExpensas = totalExpensas + dptoExpensas;

				}

				System.out.println("El monto total a abonar de expesas es de " + totalExpensas + "$");
				System.out.println("El monto promedio de expensas es " + (totalExpensas / CANT_DEPARTAMENTOS) + "$");

			} else {
				System.out.println("¡Que tengas un buen día!");
			}
		}

	private static void darBienvenida(String mensajeBienvenida) {
			dibujarDivisor(mensajeBienvenida.length(), "=");
			System.out.println(mensajeBienvenida.toUpperCase());
			dibujarDivisor(mensajeBienvenida.length(), "=");
			System.out.println();
		}

	private static void dibujarDivisor(int longitud, String simbolo) {
			for (int i = 0; i < longitud; i++) {
				System.out.print(simbolo);
			}
			System.out.println();

		}

}

}
