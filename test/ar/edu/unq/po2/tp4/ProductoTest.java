package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductoTest {
	private Producto arroz;
	private Producto leche;
	
	@BeforeEach
		public void setUp() {
		arroz = new Producto("Arroz", 10.0, true);
		leche = new Producto("Leche", 150.0, true);
	}
	
	@Test
	void testConstructor() {
		assertEquals("Arroz", arroz.getNombre());
		assertEquals("Leche",leche.getNombre());
		assertTrue(arroz.isPrecioCuidado());
	}
	@Test
	void testCalcularDescuentoAPrecioCuidado() {
		arroz.getPrecio();
		assertEquals(arroz.getPrecio(), 10.0);
		arroz.aumentarPrecio(1.0);
		assertEquals(arroz.getPrecio(), 11.0);
	}
}
