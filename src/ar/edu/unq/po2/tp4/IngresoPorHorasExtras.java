package ar.edu.unq.po2.tp4;

public class IngresoPorHorasExtras extends Ingreso {

	public IngresoPorHorasExtras(int mes, String concepto, double monto) {
		super(mes, concepto, monto);
	}

	@Override
	public double getMontoImponible() {
		return 0;
	}

}
