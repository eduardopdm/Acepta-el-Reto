import java.util.*;

public class CumpleJardin727 {

    public static void main(String[] args) {

    }

    public static void repartir(HashMap<Character, TreeMap<Integer, Character>> map) {


    }

    public char colTocol(char origin, Map<Character, SortedMap<Integer, Character>> map) {
        char current = origin;

        int level = 0;

        while (!map.get(current).tailMap(level).isEmpty()) {

        }

        return current;
    }

    public static Map<Character, SortedMap<Integer, Character>> leerDatos(Scanner sc) {
        int cols = Integer.parseInt(sc.nextLine());

        Map<Character, SortedMap<Integer, Character>> map = new HashMap<>();

        for (char current = 'A'; current < 'A' + cols - 1; current++) {

            SortedMap<Integer, Character> bridges = map.getOrDefault(current, new TreeMap<>());
            SortedMap<Integer, Character> toLeft = new TreeMap<>();

            int[] linea = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            for (int i = 1; i < linea.length; i++) {
                bridges.put(linea[i], (char) (current + 1));
                toLeft.put(linea[i], current);
            }
            map.put(current, bridges);
            map.put((char) (current + 1), toLeft);
        }

        return map;
    }
}
