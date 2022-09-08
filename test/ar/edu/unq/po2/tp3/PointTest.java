package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PointTest {

	@Test
	void testPoint() {
		Point punto = new Point();
		assertEquals(punto.getX(),0);
		assertEquals(punto.getY(),0);
	}
	
	@Test
	void testPointConPArametro() {
		Point punto = new Point(2, 3);
		assertEquals(punto.getX(),2);
		assertEquals(punto.getY(),3);

}
	@Test
	void testMoverPunto() {
		Point punto = new Point(2, 3);
		assertEquals(punto.getX(),2);
		assertEquals(punto.getY(),3);
		punto.moverPunto(5, 6);
		assertEquals(punto.getX(),5);
		assertEquals(punto.getY(),6);
	}
	@Test
	void testSumarDosPuntos() {
		Point punto1 = new Point(4,2);
		Point punto2 = new Point(2, 3);
		
		assertEquals(punto1.sumarPuntos(punto2).getX(),6 );
		assertEquals(punto1.sumarPuntos(punto2).getY(),5 );
		
			
	}
}
