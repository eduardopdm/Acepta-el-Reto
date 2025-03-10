package ej688escalerasw;

import java.util.Scanner;

public class Escaleras688 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		while (sc.hasNext()) {

			int c = sc.nextInt();

			int m = sc.nextInt();

			int n = sc.nextInt();

			int[] alturas = new int[n + 1];

			for (int i = 0; i < n + 1; i++) {
				alturas[i] = sc.nextInt();
			}


			if (comprobarEscaleras(c, m, alturas))
				System.out.println("Ok");
			else
				System.out.println("Tropiezo");
		}

	}

	static boolean comprobarEscaleras(int c, int m, int[] alturas) {

		int anterior = alturas[1] - alturas[0];

		int min = anterior;
		int max = anterior;

		for (int i = 2; i < alturas.length; i++) {

			int nuevo = alturas[i] - alturas[i - 1];

			if (Math.abs(nuevo - anterior) > c || max - nuevo > m || nuevo - min > m)
				return false;

			anterior = nuevo;
			if (nuevo > max)
				max = nuevo;
			else if (nuevo < min)
				min = nuevo;
		}
		return true;
	}
}
