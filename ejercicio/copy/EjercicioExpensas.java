package ejercicio.copy;

import java.util.Scanner;

/*Se desea calcular el total 
 * de expensas a pagar de un edificio
 *  de 4 pisos que tiene un departamento
 *   por piso desde planta baja hasta el
 *    último piso. Se deben ingresar los 
 *    valores de cada departamento y luego
 *     informar el importe de expensas promedio
 */
public class EjercicioExpensas {

	public static void main(String[] args) {

		System.out.println("Bienvenida/o al servicio de departamentos");
		System.out.println("=========================");

		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el numero de departamento ");
		System.out.println("=========================");

		double departamento1 = 0.0;
		double departamento2 = 0.0;
		double departamento3 = 0.0;
		double departamento4 = 0.0;

		double promedioExpensas = 0.0;

		System.out.println("Ingrese el valor de su expensa para departamento 1" + departamento1);

		System.out.println("Ingrese el valor de su expensa para departamento 2" + departamento2);
		System.out.println("Ingrese el valor de su expensa para departamento 3" + departamento3);
		System.out.println("Ingrese el valor de su expensa para departamento 4" + departamento4);
		promedioExpensas = (departamento1 + departamento2 + departamento3 + departamento4) / 4;

		System.out.println("promedioExpensas " + promedioExpensas);

		/*
		 * terminar
		 */

	}

}
