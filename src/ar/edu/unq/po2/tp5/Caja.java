package ar.edu.unq.po2.tp5;

import java.util.List;

public class Caja {

	public double registrarCompra(List<Producto> productos) {
		double precioTotal = 0;
		for (Producto producto : productos) {
			precioTotal += producto.getPrecioFinal();
			producto.disminuirStock();
		}
		return precioTotal;
	}

}
