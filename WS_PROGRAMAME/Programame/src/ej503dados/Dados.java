package ej503dados;

import java.util.Scanner;

public class Dados {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

//		Scanner sc = new Scanner("2\r\n" + "6 6\r\n" + "4 6\r\n");

		int n = Integer.parseInt(sc.nextLine());

		int[] dados = new int[2];

		for (int i = 0; i < n; i++) {

			String s[] = sc.nextLine().split(" ");

			dados[0] = Integer.parseInt(s[0]);
			dados[1] = Integer.parseInt(s[1]);

			int n0 = dados[0] + 1;
			int n1 = dados[1] + 1;

			int min = Math.min(n0, n1);
			int max = Math.max(n0, n1);

			for (int j = min; j <= max; j++) {
				if (j != max) {
					System.out.print(j + " ");
				} else {
					System.out.println(j);
				}
			}
		}
	}

}
