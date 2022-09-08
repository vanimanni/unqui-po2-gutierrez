package ar.edu.unq.po2.tp3;

public class Multiplos {

	public int elMultiploMayorEntre(int nro1, int nro2) {
	
		int multiploMasAlto = -1;
		for (int i = 1; i <= 1000; i++) {
			if ((i % nro1 == 0 )&& (i % nro2 == 0)) {
				multiploMasAlto = i;
			}
		}
		return multiploMasAlto;
	}
}


/*
 Realice una funci�n que reciba dos valores X e Y, y devuelva el n�mero m�s alto entre 0 y 1000, 
 que sea m�ltiplo simult�neamente de X e Y. Si no existe, 
 devolver -1. Por ejemplo si se ingresa 3 y 9, la funci�n debe
devolver 999.
 */
