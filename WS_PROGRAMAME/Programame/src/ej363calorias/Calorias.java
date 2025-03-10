package ej363calorias;

import java.util.Scanner;

public class Calorias {

//	static Scanner sc = new Scanner(
//			"100\r\n" + "3\r\n" + "100 100 101\r\n" + "100\r\n" + "2\r\n" + "500 700\r\n" + "0\r\n");

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		while (casoPrueba())
			;
	}

	public static boolean casoPrueba() {

		int caloriasEntrenamiento = sc.nextInt();

		if (caloriasEntrenamiento == 0) {
			return false;
		}

		int numComidas = sc.nextInt();

		int sumaComidas = 0;

		for (int i = 0; i < numComidas; i++) {
			sumaComidas += sc.nextInt();
		}

		System.out.println((int) (Math.ceil((double) sumaComidas / caloriasEntrenamiento)));

		return true;

	}
}
