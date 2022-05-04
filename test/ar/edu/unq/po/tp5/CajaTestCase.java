package ar.edu.unq.po.tp5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp5.Caja;
import ar.edu.unq.po2.tp5.Producto;
import ar.edu.unq.po2.tp5.ProductoCooperativa;

public class CajaTestCase {
	private List<Producto> listaDeProductos = new ArrayList<Producto>();

	@Test
	public void compraRealizada() {
		Caja cajaDeCobro = new Caja();

		Producto leche = new Producto(110d, 4);
		ProductoCooperativa azucar = new ProductoCooperativa(90, 10);
		listaDeProductos.add(leche);
		listaDeProductos.add(azucar);

		assertEquals(233, cajaDeCobro.registrarCompra(listaDeProductos));
		assertEquals(3, leche.getStock());
		assertEquals(9, azucar.getStock());

	}
}
