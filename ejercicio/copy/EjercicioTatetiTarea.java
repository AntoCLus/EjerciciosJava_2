package ejercicio.copy;

import java.util.Scanner;

/*
 * TATETI:
 * Un tablero de 3 x 3 matriz [fila][columna]
 * Dos jugadores que ingresan las coordenadas de cada ficha por teclado
 * Una vez que tengo fila y columna de la ficha, muestro el tablero con X o 0
 * Verificar si es posible la posicion de la ficha y ver si hay ganador
 * Mientras no haya ganador continua el siguiente jugador
 * 
 *    |   |
 * ---|---|---
 *    |   | X  -> tablero[1][2]
 * ---|---|----
 *    |   | */

public class EjercicioTatetiTarea {
	private static int FILAS = 3;
	private static int COLS = 3;

	public static void main(String[] args) {

		char[][] tablero = new char[FILAS][COLS];
		for (int i = 0; i < FILAS; i++) {
			for (int j = 0; j < COLS; j++) {
				tablero[i][j] = 'x';

			}
		}

		imprimirArray(tablero);
		System.out.println("==============================");
		System.out.println("Bienvenido al juego de TaTeTi");
		System.out.println("==============================");
		System.out.println(" ");

		// definir jugador. turnos
		int jugador = 2;
		int contador = 0;
		boolean ganador = false;
		int turno = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Ingrese numero de fila");
		int jugada = sc.nextInt();
		System.out.println("Ingrese numero de columna");
		int jugada2 = sc.nextInt();

		while (!ganador && contador < 9) {
			// JUGAR FICHA
			contador++;
			turno = contador % 2;
//				ganador = jugarFicha(turno, tablero);
			jugarFicha(turno, tablero);
			imprimirArray(tablero);
			ganador = hayGanador(tablero);
			if (ganador) {
				System.out.println("GANASTE!!! JUGADOR " + (turno + 1));
			}
		}
	}

	private static void jugarFicha(int turno, char[][] tablero) {
		Scanner sc = new Scanner(System.in);
		System.out.println("JUGADOR " + (turno) + " Ingrese fila : ");
		int fila = sc.nextInt();
		System.out.println("Ingrese columna: ");
		int columna = sc.nextInt();
//				boolean ganador = false;
		if (tablero[fila][columna] == 'X' || tablero[fila][columna] == 'O') {
			System.out.println("Jugada no valida");
		} else {
			if (turno == 0) {
				tablero[fila][columna] = 'X';
			} else {
				tablero[fila][columna] = 'O';
			}

		}

	}

	private static boolean hayGanador(char[][] tablero) {
		boolean cond1 = tablero[0][0] == tablero[0][1] && tablero[0][0] == tablero[0][2]
				&& (tablero[0][0] == 'X' || tablero[0][0] == 'O');
		boolean cond2 = tablero[1][0] == tablero[1][1] && tablero[1][0] == tablero[1][2]
				&& (tablero[1][0] == 'X' || tablero[1][0] == 'O');
		boolean cond3 = tablero[2][0] == tablero[2][1] && tablero[2][0] == tablero[2][2]
				&& (tablero[2][0] == 'X' || tablero[2][0] == 'O');

		boolean cond4 = tablero[0][0] == tablero[1][0] && tablero[0][0] == tablero[2][0]
				&& (tablero[0][0] == 'X' || tablero[0][0] == 'O');
		boolean cond5 = tablero[0][1] == tablero[1][1] && tablero[0][1] == tablero[2][1]
				&& (tablero[0][1] == 'X' || tablero[0][1] == 'O');
		boolean cond6 = tablero[0][2] == tablero[1][2] && tablero[0][2] == tablero[2][2]
				&& (tablero[0][2] == 'X' || tablero[0][2] == 'O');

		boolean cond7 = tablero[0][0] == tablero[1][1] && tablero[0][0] == tablero[2][2]
				&& (tablero[0][0] == 'X' || tablero[0][0] == 'O');
		boolean cond8 = tablero[0][2] == tablero[1][1] && tablero[0][2] == tablero[2][0]
				&& (tablero[0][2] == 'X' || tablero[0][2] == 'O');

		return cond1 || cond2 || cond3 || cond4 || cond5 || cond6 || cond7 || cond8;
	}

	private static void imprimirArray(char[][] tablero) {
		for (int i = 0; i < FILAS; i++) {
			for (int j = 0; j < COLS; j++) {

				System.out.print(tablero[i][j]);
			}
			System.out.println("");
		}

	}

}
