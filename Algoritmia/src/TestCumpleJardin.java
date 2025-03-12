import org.junit.Test;

import java.util.Scanner;

public class TestCumpleJardin {

    @Test
    public void testLectura1() {
        System.out.println(CumpleJardin727.leerDatos(new Scanner("4\n" +
                "1 1\n" +
                "2 2 3\n" +
                "3 5 1 4")));
    }

    @Test
    public void testLectura2() {
        System.out.println(CumpleJardin727.leerDatos(new Scanner("2\n" +
                "1 1")));
    }

    @Test
    public void testLectura3() {
        System.out.println(CumpleJardin727.leerDatos(new Scanner("4\n" +
                "1 1\n" +
                "1 2\n" +
                "0")));
    }
}
