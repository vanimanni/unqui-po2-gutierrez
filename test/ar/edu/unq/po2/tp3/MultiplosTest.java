package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MultiplosTest {

	@Test
	void testMutiplosMasAltoEntre0y1000() {
		Multiplos multiplo = new Multiplos();
		assertEquals(multiplo.elMultiploMayorEntre(3, 9), 999);
	}

}
