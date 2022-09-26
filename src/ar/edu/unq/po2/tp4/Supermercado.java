package ar.edu.unq.po2.tp4;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {
	private String nombre;
	private String direccion;
	private List<Producto> productos = new ArrayList<Producto>();

	public Supermercado(String nombre, String direccion) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public int cantidadTotalProductos() {
		return this.getProductos().size();
	}

	public void agregarProducto(Producto producto) {
		productos.add(producto);
	}

	public double sumaTotalDeProductos() {
		return this.getProductos().stream().mapToDouble(elem -> elem.getPrecio()).sum();
	}

}
