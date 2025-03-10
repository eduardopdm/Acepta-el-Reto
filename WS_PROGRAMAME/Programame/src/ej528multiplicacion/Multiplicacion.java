package ej528multiplicacion;

import java.util.Scanner;

public class Multiplicacion {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {

			int numero = Integer.parseInt(sc.nextLine());

//			int numero = sc.nextInt();

			if (numero == 0) {
				break;
			}

			int menor1 = 0;
			int mayor1 = 0;

			String[] array = sc.nextLine().split(" ");

			for (int i = 0; i < numero; i++) {

				double d = Double.parseDouble(array[i]);

//				double d = sc.nextDouble();

				if (0 < d && d < 1)
					menor1++;

				if (1 < d)
					mayor1++;
			}

			int n = (numero * (numero - 1)) / 2 - menor1 * mayor1;

			System.out.println(n);

		}
	}
}
