package ejercicio.copy;

import java.util.Scanner;

public class BandaAncha {
	// Una empresa de comunicaciones ofrece servicio de telefon�a,
	// banda ancha y tv digital. Cada uno de los servicios tiene
	// un precio diferente (Telefon�a: 10, Banda ancha: 15, TV, 20).
	// Se desea contar cu�ntos clientes optan por cada servicio para
	// luego conocer la facturaci�n de cada uno de los servicios.
	// Se deben ingresar los clientes por n�mero (cliente = 0 para finalizar)
	public static void main(String[] args) {

		System.out.println("Bienvenida/o al servicio de comunicaciones");
		System.out.println("=========================");

		Scanner sc = new Scanner(System.in);

		System.out.println();
		System.out.println("Ingrese el n�mero de servicio a contratar 1 telefonia, 2 banda ancha, 3 TV Y O PARA SALIR");
		int solicitudServicio = sc.nextInt();

		while (solicitudServicio != 0) {

			switch (solicitudServicio) {
			case 0:
				System.out.println("usted eligio salir del men�");
				break;
			case 1:
				System.out.println("eligio telefono");
				break;
			case 2:
				System.out.println("eligio banda ancha");
				break;
			case 3:
				System.out.println("eligio TV");
				break;
			case 4:
				System.out.println("numero invalido");
				break;

			}
		}
	}
}
/*
 * if (solicitudServicio[solicitudServicio] == 0) { servicio[solicitudServicio]
 * = 1; contador += 1;
 * System.out.println("Butaca disponible. Venta confirmada");
 * 
 * } else {
 * System.out.println("Butaca no disponible. Seleccione otra ubicaci�n"); }
 * 
 * System.out.println("Ingrese el n�mero de butaca que desea adquirir");
 * solicitudServicio = sc.nextInt(); } int servicios = 0;
 * System.out.println("Mostrando servicios seleccionados");
 * 
 * 
 * }
 * 
 * 
 * }
 * 
 * 
 * }
 */
