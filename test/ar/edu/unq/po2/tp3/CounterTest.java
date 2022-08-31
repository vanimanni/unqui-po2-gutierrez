package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CounterTest {
	
	@Test
	public void testContarPares() {
	Counter counter = new Counter();
	 assertEquals(counter.contarPares(), 0); 
	
	 counter.addNumero(2);
	 assertEquals(counter.contarPares(), 1);
	}
	
	@Test
	public void testContarImpares() {
		Counter counter = new Counter();
		assertEquals(counter.contarImpares(), 0);
		counter.addNumero(3);
		counter.addNumero(5);
		counter.addNumero(4);
		assertEquals(counter.contarImpares(), 2);
	}
	@Test
	public void testContarMultiplos() {
		Counter counter = new Counter();
		assertEquals(counter.contarMultiplo(8), 0);
		counter.addNumero(2);
		counter.addNumero(4);
		counter.addNumero(6);
		counter.addNumero(8);
		assertEquals(counter.contarMultiplo(8), 1);
	}
}
