package julenmartin.pojo;

public class discoDuro extends Producto {

	private int capacidad;
	private float velocidad;
	private boolean isSSD;

	public discoDuro() {
		super();
		this.capacidad = 0;
		this.velocidad = 0;
		this.isSSD = false;
	}

	public discoDuro(String referencia, float precio, int capacidad, float velocidad, boolean isSSD) {
		super(referencia, precio);
		this.capacidad = capacidad;
		this.velocidad = velocidad;
		this.isSSD = isSSD;

	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public float getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(float velocidad) {
		this.velocidad = velocidad;
	}

	public boolean isSSD() {
		return isSSD;
	}

	public void setSSD(boolean isSSD) {
		this.isSSD = isSSD;
	}

	@Override
	public String toString() {
		return "discoDuro [referencia=" + getReferencia() + ", precio=" + getPrecio() + ", capacidad=" + capacidad
				+ ", velocidad=" + velocidad + ", isSSD=" + isSSD + "]";
	}

}
