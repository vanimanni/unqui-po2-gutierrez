package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class Counter {

	private ArrayList<Integer> numeros = new ArrayList<>();

	public int contarPares() {
		int total = 0;
		for (Integer nro : numeros) {
			if (nro % 2 == 0)
				total++;
		}
		return total;
	}

	public void addNumero(int i) {
		numeros.add(i);
	}

	public int contarImpares() {
		return numeros.size() - contarPares();
	}

	public int contarMultiplo(int nro) {
		return (int) numeros.stream().filter(i -> i % nro == 0).count();
	}
	
	public void addAllNumero(List<Integer> listnumeros) {
		this.numeros.addAll(listnumeros);
	}

	public void vaciarNumeros() {
		this.numeros = new ArrayList<Integer>();
		
	}

}