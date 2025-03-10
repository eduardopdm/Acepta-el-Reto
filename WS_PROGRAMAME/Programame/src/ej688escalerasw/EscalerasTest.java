package ej688escalerasw;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EscalerasTest {

	@Test
	void test1() {
		assertTrue(Escaleras688.comprobarEscaleras(1, 10, new int[] { 100, 120, 141, 161, 180 }));
	}

	@Test
	void test2() {
		assertFalse(Escaleras688.comprobarEscaleras(1, 3, new int[] { 0, 1, 3, 6, 10, 15 }));
	}

	@Test
	void test3() {
		assertFalse(Escaleras688.comprobarEscaleras(1, 10,
				new int[] { 90, 100, 111, 123, 136, 150, 165, 181, 198, 216, 235, 255, 276 }));
	}

	void leerDatos(){
		System.out.println();
	}
}
