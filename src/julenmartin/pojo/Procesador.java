package julenmartin.pojo;

public class Procesador extends Producto {

	private String modelo;
	private float velocidad;

	public Procesador() {
		super();
		this.modelo = "";
		this.velocidad = 0;
	}

	public Procesador(String referencia, float precio, String modelo, float velocidad) {
		super(referencia, precio);
		this.modelo = modelo;
		this.velocidad = velocidad;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public float getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(float velocidad) {
		this.velocidad = velocidad;
	}

	@Override
	public String toString() {
		return "Procesador [referencia=" + getReferencia() + ", precio=" + getPrecio() + ", modelo=" + modelo
				+ ", velocidad=" + velocidad + "]";
	}

}
