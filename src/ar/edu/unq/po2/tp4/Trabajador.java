package ar.edu.unq.po2.tp4;

import java.util.ArrayList;
import java.util.List;

public class Trabajador {

	private List<Ingreso> ingresos = new ArrayList<Ingreso>();

	public Integer getTotalPercibido() {
		return 0;
	}

	public void agregarIngreso(int mes, String concepto, double monto) {
		this.ingresos.add(new Ingreso(mes, concepto, monto));
	}
	

}
