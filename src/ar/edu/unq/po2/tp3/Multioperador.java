package ar.edu.unq.po2.tp3;

import java.util.List;

public class Multioperador {
	public int suma(List<Integer> listaNumeros) {
		int sumador = 0;
		for (Integer nro : listaNumeros) {
			sumador += nro;
		} 
		return sumador;
		}
	public int multiplicar(List<Integer> listaNumeros) {
		int total = 1;
		for (Integer nro : listaNumeros) {
			total *= nro;
		} 
		return total;
		}
	public int restar(List<Integer> listaNumeros) {
		int total = 0;
		for (Integer nro : listaNumeros) {
			total -= nro;
		} 
		return total;
		}
	
	
	public int restar2(List<Integer> numeros) {
		int result = 0;
		if (!numeros.isEmpty()) {
			result = numeros.get(0);
			for (int i = 1; i < numeros.size(); i++) {
				result -= numeros.get(i);
			}
		}
		return result;
	}
	
	} 
