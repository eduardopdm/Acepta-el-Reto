import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumeroNoConsecutivo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        int casos = sc.nextInt();
//
//        for (int i = 0; i < casos; i++) {
//
//        int n = sc.nextInt();
//
//        List<Integer> numeros = new ArrayList<>();
//
//        for (int j = 0; j < n; j++) {
//            numeros.add(sc.nextInt());
//        }

        System.out.println(buscar(new int[]{1, 2, 3, 6, 7, 8}));
    }

    public static int buscar(int[] numeros) {
        return comprobarMitad(numeros, 0, numeros.length - 1);
    }

    public static int comprobarMitad(int[] numeros, int ini, int fin) {

        if (ini == fin) {
            if (estaEnSuSitio(numeros, ini))
                return numeros[ini] + 1;
            else return ini + numeros[0];
        }

        int mitad = (ini + fin) / 2;

        if (estaEnSuSitio(numeros, mitad)) {
            return comprobarMitad(numeros, mitad + 1, fin);
        } else {
            return comprobarMitad(numeros, ini, mitad);
        }
    }

    private static boolean estaEnSuSitio(int[] numeros, int pos) {
        return numeros[pos] == pos + numeros[0];
    }
//    }
}
