import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Mejillones502 {
    public static void main(String[] args) {

        Scanner sc = new Scanner("5\n" +
                "3 4 5 5 5");

        int n = sc.nextInt();

        List<Integer> torres = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int mejillon = sc.nextInt();

//            int pos = 0;
//            while (torres.size() > pos && torres.get(pos) <= mejillon) pos++;
//
//            if (torres.size() == pos) torres.add(mejillon);
//            else torres.set(pos, mejillon);

            if (torres.isEmpty()) {

                torres.add(mejillon);

            } else {
                boolean added = false;

                for (int j = 0; j < torres.size(); j++) {

                    if (mejillon < torres.get(j)) {
                        torres.set(j, mejillon);
                        added = true;
                        break;
                    }
                }
                if (!added) torres.add(mejillon);
            }
        }

        System.out.println(torres.size());
    }
}