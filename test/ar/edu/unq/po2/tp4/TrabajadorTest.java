package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TrabajadorTest {

	
	@Test
	void testMontoTotalpercibido() {
	
		var trabajador = new Trabajador();
		assertEquals(trabajador.getTotalPercibido(), 0);
		
		trabajador.agregarIngreso(1,"haberes",100);
		 
	}

}
