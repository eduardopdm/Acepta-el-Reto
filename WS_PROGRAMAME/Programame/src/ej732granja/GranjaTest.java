package ej732granja;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GranjaTest {

	@Test
	void testCalcularPuertas1() {

		assertTrue(GranjaPeano.calcularPuertas(new int[] { 0, 2 }, new int[] { 2, 2 }) == 0);
	}

	@Test
	void testCalcularPuertas2() {

		assertTrue(GranjaPeano.calcularPuertas(new int[] { 2, 2 }, new int[] { 0, 2 }) == 0);
	}

	@Test
	void testCalcularPuertas3() {

		assertTrue(GranjaPeano.calcularPuertas(new int[] { 1, 7 }, new int[] { 6, 7 }) == 0);
	}

	@Test
	void testCalcularPuertas4() {

		assertTrue(GranjaPeano.calcularPuertas(new int[] { 7, 1 }, new int[] { 7, 6 }) == 0);
	}
}
