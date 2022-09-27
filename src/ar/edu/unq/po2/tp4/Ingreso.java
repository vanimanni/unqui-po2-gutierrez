package ar.edu.unq.po2.tp4;

public class Ingreso {

	private int mes;
	private String concepto;
	private double monto;
	
	
	
	public Ingreso(int mes, String concepto, double monto) {
		super();
		this.mes = mes;
		this.concepto = concepto;
		this.monto = monto;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public String getConcepto() {
		return concepto;
	}
	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}
	public double getMonto() {
		return monto;
	}
	public void setMonto(double monto) {
		this.monto = monto;
	}
}
