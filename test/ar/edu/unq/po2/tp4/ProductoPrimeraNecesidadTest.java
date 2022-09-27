package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductoPrimeraNecesidadTest {
	private ProductoPrimeraNecesidad arroz;
	private ProductoPrimeraNecesidad leche;
	
	@BeforeEach
		public void setUp() {
		arroz = new ProductoPrimeraNecesidad("Arroz", 10.0, true,11.0);
		leche = new ProductoPrimeraNecesidad("Leche", 150.0, true,8.0);
	}
	
	@Test
	void testDescuentoPrimeraNecesidad() {
		assertEquals(arroz.getPrecio(), 8.9);
	}

}
