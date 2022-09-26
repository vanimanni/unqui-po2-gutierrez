package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SupermercadoTest {
	private Producto arroz;
	private Producto leche;
	private Supermercado vital = new Supermercado("vital", "quilmes");

	@BeforeEach
	public void setUp() {
		arroz = new Producto("Arroz", 10.0, true);
		leche = new Producto("Leche", 150.0, true);
	}

	@Test
	void testCantidadTotalDeProductoEnSupermercado() {
		vital.agregarProducto(arroz);
		vital.agregarProducto(leche);
		assertEquals(vital.cantidadTotalProductos(), 2);
	}

	@Test
	void testPrecioTotalProductos() {
		vital.agregarProducto(arroz);
		vital.agregarProducto(leche);
		assertEquals(vital.sumaTotalDeProductos(), 160.0);
	}

}
