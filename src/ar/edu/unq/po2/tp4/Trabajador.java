package ar.edu.unq.po2.tp4;

import java.util.ArrayList;
import java.util.List;

public class Trabajador {

	private List<Ingreso> ingresos = new ArrayList<Ingreso>();

	public double getTotalPercibido() {
		double total = 0;
		for (Ingreso ingreso : ingresos) {

			total = total + ingreso.getMonto();

		}
		return total;
	}

	public void agregarIngreso(int mes, String concepto, double monto) {
		this.ingresos.add(new Ingreso(mes, concepto, monto));
	}
	
	public void agregarIngresoHorasExtras(int mes, String concepto, double monto) {
		this.ingresos.add(new IngresoPorHorasExtras(mes, concepto, monto));
	}

	public double montoImponible() {

		double total = 0;
		for (Ingreso ingreso : ingresos) {

			total = total + ingreso.getMontoImponible();

		}
		return total;
	}

	public double getImpuestoAPagar() {
		return montoImponible() * 0.02d ;
	}

}
