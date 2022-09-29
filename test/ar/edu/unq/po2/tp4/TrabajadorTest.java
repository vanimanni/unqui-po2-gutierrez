package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TrabajadorTest {

	
	@Test
	void testMontoTotalpercibido() {
	
		var trabajador = new Trabajador();
		assertEquals(trabajador.getTotalPercibido(), 0);
		
		trabajador.agregarIngreso(1,"haberes",100);
		trabajador.agregarIngreso(1,"haberes",230);

		assertEquals(trabajador.getTotalPercibido(),330);
				 
	}
	
	@Test 
	void testMontoImponible() {
		var trabajador = new Trabajador();
		trabajador.agregarIngreso(1,"haberes",100);
		trabajador.agregarIngresoHorasExtras(1,"extras",230);
		assertEquals(trabajador.montoImponible(), 100);
	}
	
	@Test
	void testImpuestoAPagar() {
		var trabajador = new Trabajador();
		trabajador.agregarIngreso(1,"haberes",100);
		trabajador.agregarIngresoHorasExtras(1,"extras",230);
		assertEquals(trabajador.getImpuestoAPagar(), 2);
	}

}
