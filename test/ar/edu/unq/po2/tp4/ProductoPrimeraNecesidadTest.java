package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductoPrimeraNecesidadTest {
	private ProductoPrimeraNecesidad arroz;
	private ProductoPrimeraNecesidad leche;
	
	@BeforeEach
		public void setUp() {
		arroz = new ProductoPrimeraNecesidad("Arroz", 10.0, true);
		leche = new ProductoPrimeraNecesidad("Leche", 150.0, true);
	}
	
	@Test
	void testDescuentoPrimeraNecesidad() {
		assertEquals(arroz.getPrecio(), 9.0);
	}

}
