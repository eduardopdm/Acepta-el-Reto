package ej634bandurria;

import java.util.Scanner;

public class BandurriaHero {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < n; i++) {

			char[] array = sc.nextLine().toCharArray();

			int puntuacion = 0;
			int combo = 1;

			for (char c : array) {
				if (c == 'O') {
					puntuacion += combo * 10;
					combo++;
				} else {
					combo = 1;
				}
			}
			System.out.println(puntuacion);
		}

	}

}
