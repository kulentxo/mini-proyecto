package julenmartin.pojo;

public class Servicio extends Producto {
	private int codigo;
	private int minimoHoras;

	public Servicio() {
		super();
		this.codigo = 0;
		this.minimoHoras = 0;
	}

	public Servicio(String referencia, float precio, int codigo, int minimoHoras) {
		super(referencia, precio);
		this.codigo = codigo;
		this.minimoHoras = minimoHoras;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getMinimoHoras() {
		return minimoHoras;
	}

	public void setMinimoHoras(int minimoHoras) {
		this.minimoHoras = minimoHoras;
	}

}
