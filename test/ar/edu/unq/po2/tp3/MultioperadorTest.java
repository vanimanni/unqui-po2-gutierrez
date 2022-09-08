package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class MultioperadorTest {

	@Test
	void testSumador() {
		Multioperador sumador = new Multioperador();
		List<Integer> listaNum = new ArrayList<>();
		listaNum.add(3);
		listaNum.add(3);
		listaNum.add(3);
		listaNum.add(3);

		assertEquals(sumador.suma(listaNum), 12);
	}
	@Test
	void testMultiplicar() {
		Multioperador multiplicar = new Multioperador();
		List<Integer> listaNum = new ArrayList<>();
		listaNum.add(3);
		listaNum.add(3);
		
		assertEquals(multiplicar.multiplicar(listaNum), 9);
	}
	@Test
	void testRestar() {
		Multioperador restar = new Multioperador();
		List<Integer> listaNum = new ArrayList<>();
		listaNum.add(13);
		listaNum.add(1);
		
		assertEquals(restar.restar2(listaNum),12);
				
	}
}
