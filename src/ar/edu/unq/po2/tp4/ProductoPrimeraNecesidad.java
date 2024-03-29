package ar.edu.unq.po2.tp4;

public class ProductoPrimeraNecesidad extends Producto {
	private double descuentoAAplicar;

	public ProductoPrimeraNecesidad(String nombre, double precio, boolean precioCuidado, double descuentoAplicar) {
		super(nombre, precio, precioCuidado);
		this.setDescuentoAAplicar(descuentoAplicar);
	}

	@Override
	public double getPrecio() {
		return super.getPrecio() * (1- this.getDescuentoAAplicar()/100);
	}

	public double getDescuentoAAplicar() {
		return descuentoAAplicar;
	}

	public void setDescuentoAAplicar(double descuentoAAplicar) {
		this.descuentoAAplicar = descuentoAAplicar;
	}

}
