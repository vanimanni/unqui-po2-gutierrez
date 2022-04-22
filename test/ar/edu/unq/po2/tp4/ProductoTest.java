package ar.edu.unq.po2.tp4;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
@SuppressWarnings("removal")
public class ProductoTest {

	private Producto arroz;
	private Producto vino;

	@BeforeEach
	public void setUp() {
		arroz = new Producto("Arroz", 18.9d, true);
		vino = new Producto("Vino", 55d);
	}

	
	@Test
	public void testConstructor() {
		assertEquals("Arroz", arroz.getNombre());
		assertEquals(new Double(18.9), arroz.getPrecio(), 0);
		assertTrue(arroz.esPrecioCuidado());

		assertEquals("Vino", vino.getNombre());
		assertEquals(new Double(55), vino.getPrecio(), 0);
		assertFalse(vino.esPrecioCuidado());
	}

	@Test
	public void testAumentarPrecio() {
		arroz.aumentarPrecio(1.5);
		assertEquals(new Double(20.4), arroz.getPrecio());
	}
}
