package julenmartin.pojo;

public class servicioDomicilio extends Servicio {
	private float gastoAdicional;

	public servicioDomicilio() {
		super();
		this.gastoAdicional = 0;
	}

	public servicioDomicilio(String referencia, float precio, int codigo, int minimoHoras, float gastoAdicional) {
		super(referencia, precio, codigo, minimoHoras);
		this.gastoAdicional = gastoAdicional;
	}

	public float getGastoAdicional() {
		return gastoAdicional;
	}

	public void setGastoAdicional(float gastoAdicional) {
		this.gastoAdicional = gastoAdicional;
	}

}
