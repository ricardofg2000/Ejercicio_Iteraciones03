package unico;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		/*
		 * Realizar un aplicación que genere un número aleatorio entre 1 y 100. El
		 * jugador debe ir probando números tratando de acertarlo. El programa debe
		 * indicar "mayor" o "menor" según el número secreto sea mayor o menor que el
		 * introducido por el usuario. El proceso finaliza cuando el usuario acierta o
		 * cuando se rinde (introduciendo un -1).
		 */

		Scanner leer = new Scanner(System.in);
		Random aleatorio = new Random();
		int num = aleatorio.nextInt(100 - 0);
		String mensaje;
		int respuesta = 0;
		final int RENDIRSE = -1;

		System.out.println("Intente acertar el número: ");
		respuesta = Integer.parseInt(leer.nextLine());

		while (respuesta != num && respuesta != RENDIRSE) {
			System.out.println("No es ese número :D");
			mensaje = (respuesta < num) ? "El número que he pensado es mayor" : "El número que he pensado es menor";
			System.out.println(mensaje);
			System.out.println("Intente acertar de nuevo [Escriba -1 para rendirse]");
			respuesta = Integer.parseInt(leer.nextLine());

		}

		mensaje = (respuesta == num) ? "¡Has acertado, enhorabuena!" : "Más suerte para la proxima";

	}
}
