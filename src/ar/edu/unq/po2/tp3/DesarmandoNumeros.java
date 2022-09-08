package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class DesarmandoNumeros {
	
	public List<Integer> numeroDesarmado(int numero) {

		List<Integer> lista = new ArrayList<Integer>();
		while (numero > 0) {
			lista.add(numero % 10);
			numero = numero / 10;
		}

		return lista;
	}

	
	public Integer obtenerNumeroConMayorCantDigitosPares(List<Integer> listaNumeros) {
		int nroConMayorCantPares = listaNumeros.get(0);
		for (int i = 1; i < listaNumeros.size(); i++) {
			nroConMayorCantPares = nroConMasParesEntre(nroConMayorCantPares, listaNumeros.get(i));
		}
		return nroConMayorCantPares;
	}
	
	

	private int nroConMasParesEntre(int nro1, Integer nro2) {
		int mayor = nro1;
		if (digitosParesEn(nro2) > digitosParesEn(mayor)) {
			mayor = nro2;
		}
		return mayor;
	}

	private int digitosParesEn(int numero) {
		Counter contador = new Counter();
		contador.addAllNumero(numeroDesarmado(numero));
		return contador.contarPares();
	}

}
