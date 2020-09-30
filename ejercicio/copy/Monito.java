package ejercicio.copy;

//Piensa en un número de dos dígitos. Por Ejemplo 43.
//Ahora suma ambos números. Por ejemplo 4+3=7
//Luego resta ese número al que elegiste originalmente. Por ejemplo 43-7=36
//Por último, mira el símbolo que está junto al número y recuérdalo
//numeros del 0-95 con 30 simbolos diferentes
//intento uno elefante
//intento dos mariposa
//hormiga
//
public class Monito {
	private static char mostrarSimbolo;

	public static void main(String[] args) {

		int numeros = 95;
		char simbolos = 30;

		System.out.println("*****************************************");
		System.out.println("Bienvenidos al juego del monito adivinador");
		System.out.println("*****************************************");
		System.out.println("Piensa en un número de dos dígitos. Por Ejemplo 43");
		System.out.println("*****************************************");
		System.out.println("Ahora suma ambos números. Por ejemplo 4+3=7");
		System.out.println("*****************************************");
		System.out.println("Luego resta ese número al que elegiste originalmente. Por ejemplo 43-7=36");
		System.out.println("*****************************************");
		System.out.println("Por último, mira el símbolo que está junto al número y recuérdalo");

		// si yo tengo dos digitos es del 10 al 95, cuyas sumas son 1+0=1; 1+1=2; 1+2=
		// 3;
		// 1+4 =5, 1+5=6
		// 1+7=8, 1+8=9 1+9=10, 2+9=11, 3+9 =12, 4+9=13,
		/// 5+9=14, 6+9=15, 7+9=16, 8+9=17, 9+9=18
		for (int i = 0; i <= 18; i++) {
			if (numeros <= 95) {
				simbolos = mostrarSimbolo;
			}

		}

	}

}
