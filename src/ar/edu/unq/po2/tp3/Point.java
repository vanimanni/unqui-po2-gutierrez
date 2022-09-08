package ar.edu.unq.po2.tp3;

public class Point {
	private  int x;
	private int y;
	
	public Point(int x, int y) {
	super();
	this.setXeY(x,y);
	}
	
	
	private void setXeY(int x, int y) {
		this.setX(x);
		this.setY(y);
		
	}
	public Point() {
		this(0,0);
	}
	public void moverPunto(int x, int y) {
		this.setXeY(x, y);
		
	}
	
	public Point sumarPuntos(Point puntoASumarse) {
		return new Point(this.getX() + puntoASumarse.getX(), this.getY() + puntoASumarse.getY());
	}

	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
}


/*1. Debe ser posible crearse indicando como referencia los valores x e y
2. También debe ser posible crear un punto directamente sin enviarles parámetros, en este caso el punto
debe crearse en las coordenadas (0,0).
3. Debe ser posible mover un punto a otra posición.
4. Sumarse con otro punto y como resultado obtener un nuevo punto con las valores de x e y sumados.
*/