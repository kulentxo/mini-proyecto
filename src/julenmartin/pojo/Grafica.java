package julenmartin.pojo;

public class Grafica extends Producto {

	private int memoria;
	private String conexion;

	public Grafica() {
		super();
		this.conexion = "";
		this.memoria = 0;
	}

	public Grafica(String referencia, float precio, int memoria, String conexion) {
		super(referencia, precio);
		this.conexion = conexion;
		this.memoria = memoria;
	}

	public int getMemoria() {
		return memoria;
	}

	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}

	public String getConexion() {
		return conexion;
	}

	public void setConexion(String conexion) {
		this.conexion = conexion;
	}

	@Override
	public String toString() {
		return "Grafica [referencia=" + getReferencia() + ", precio=" + getPrecio() + ", memoria=" + memoria
				+ ", conexion=" + conexion + "]";
	}

}
