package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RectanguloTest {

	@Test
	void testRectangulo() {
		Rectangulo rectangulo = new Rectangulo(new Point(1, 3), 3, 2);
		assertEquals(rectangulo.getVerticeInfIzq().getX(), 1);
		assertEquals(rectangulo.getVerticeInfIzq().getY(), 3);
		assertEquals(rectangulo.getVerticeSupIzq().getX(), 1);
		assertEquals(rectangulo.getVerticeSupIzq().getY(), 5);
		assertEquals(rectangulo.getVerticeInfDer().getX(), 4);
		assertEquals(rectangulo.getVerticeInfDer().getY(), 3);
		assertEquals(rectangulo.getVerticeSupDer().getX(), 4);
		assertEquals(rectangulo.getVerticeSupDer().getY(), 5);
	}

	@Test
	void testRectanguloArea() {
		Rectangulo rectangulo = new Rectangulo(new Point(1, 3), 3, 2);
		assertEquals(rectangulo.getArea(), 6);
	}
	@Test
	void testRectanguloPerimetro() {
		Rectangulo rectangulo = new Rectangulo(new Point(1, 3), 3, 2);
		assertEquals(rectangulo.getPerimetro(), 10);
	}
	@Test
	void testRectanguloEsHorizontal() {
		Rectangulo rectangulo = new Rectangulo(new Point(1, 3), 3, 2);
		assertTrue(rectangulo.esHorizontal());
	}
	@Test
	void testRectanguloEsVertical() {
		Rectangulo rectangulo = new Rectangulo(new Point(1, 3), 2, 3);
		assertTrue(rectangulo.esVertical());
	}
}
