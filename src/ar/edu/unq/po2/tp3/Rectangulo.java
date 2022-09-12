package ar.edu.unq.po2.tp3;

import java.util.function.BooleanSupplier;

public class Rectangulo {
	private Point verticeSupIzq;
	private Point verticeInfIzq;
	private Point verticeSupDer;
	private Point verticeInfDer;

	public Rectangulo(Point punto, int ancho, int alto) {
		this.setVerticeInfIzq(punto);
		this.setVerticeSupIzq(new Point(punto.getX(), punto.getY() + alto));
		this.setVerticeInfDer(new Point(punto.getX() + ancho, punto.getY()));
		this.setVerticeSupDer(new Point(punto.getX() + ancho, punto.getY() + alto));

	}

	public Point getVerticeSupIzq() {
		return verticeSupIzq;
	}

	public void setVerticeSupIzq(Point verticeSupIzq) {
		this.verticeSupIzq = verticeSupIzq;
	}

	public Point getVerticeInfIzq() {
		return verticeInfIzq;
	}

	public void setVerticeInfIzq(Point verticeInfIzq) {
		this.verticeInfIzq = verticeInfIzq;
	}

	public Point getVerticeSupDer() {
		return verticeSupDer;
	}

	public void setVerticeSupDer(Point verticeSupDer) {
		this.verticeSupDer = verticeSupDer;
	}

	public Point getVerticeInfDer() {
		return verticeInfDer;
	}

	public void setVerticeInfDer(Point verticeInfDer) {
		this.verticeInfDer = verticeInfDer;
	}

	public Integer getArea() {
		return this.getAncho()* this.getAlto();
	}

	private int getAlto() {
		return this.getVerticeSupIzq().getY() - this.getVerticeInfIzq().getY();
	}

	private int getAncho() {
		return this.getVerticeInfDer().getX() - this.getVerticeInfIzq().getX();
	}

	public Integer getPerimetro() {
		return (getAncho() + getAlto()) * 2;
	}

	public Boolean esHorizontal() {
		return getAncho() > getAlto();
	}

	public Boolean esVertical() {
		return getAlto() > getAncho();
	}

}
