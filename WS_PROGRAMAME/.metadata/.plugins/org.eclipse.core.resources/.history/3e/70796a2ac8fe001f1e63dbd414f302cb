package ej769alhambra;

import java.util.Scanner;

public class JardinesAlhambra {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		while (s.hasNext()) {
			int filas = s.nextInt();
			int columnas = s.nextInt();

			char[][] mapa = new char[filas][columnas];

			s.nextLine();

			for (int i = 0; i < filas; i++) {
				char[] linea = s.nextLine().toCharArray();
				for (int j = 0; j < columnas; j++) {
					mapa[i][j] = linea[j];
				}
			}

			int ans = 0;
			for (int i = 0; i < filas; i++) {
				for (int j = 0; j < columnas; j++) {
					if (mapa[i][j] == '#') {
						ans++;
						recorrerJardin(mapa, i, j);
					}
				}
			}
			System.out.println(ans);
		}
	}

	static void recorrerJardin(char[][] m, int i, int j) {
		if (i < 0 || i == m.length || j < 0 || j == m[i].length || m[i][j] != '#') {
			return;
		}

		// A MEDIDA QUE LO VAS RECORRIENDO, "ELIMINAS EL JARDIN" PARA NO VOLVER A
		// CONTARLO
		m[i][j] = '.';

		recorrerJardin(m, i + 1, j);
		recorrerJardin(m, i - 1, j);
		recorrerJardin(m, i, j + 1);
		recorrerJardin(m, i, j - 1);
	}

}
