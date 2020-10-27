package julenmartin.pojo;

public class servicioTienda extends Servicio {
	private String empleado;

	public servicioTienda() {
		super();
		this.empleado = "";
	}

	public servicioTienda(String referencia, float precio, int codigo, int minimoHoras, String empleado) {
		super(referencia, precio, codigo, minimoHoras);
		this.empleado = empleado;
	}

	public String getEmpleado() {
		return empleado;
	}

	public void setEmpleado(String empleado) {
		this.empleado = empleado;
	}

}
