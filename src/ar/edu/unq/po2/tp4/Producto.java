package ar.edu.unq.po2.tp4;

public class Producto {
	private String nombre;
	private double precio;
	private boolean precioCuidado = false;

	public Producto(String nombre, double precio, boolean precioCuidado) {
		super();
		this.setNombre(nombre);
		this.setPrecio(precio);
		this.setPrecioCuidado(precioCuidado);
	}

	public boolean isPrecioCuidado() {
		return precioCuidado;
	}

	public void setPrecioCuidado(boolean precioCuidado) {
		this.precioCuidado = precioCuidado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public void aumentarPrecio(double precioAAumentar) {
		this.setPrecio(this.getPrecio() + precioAAumentar);
	}

}
