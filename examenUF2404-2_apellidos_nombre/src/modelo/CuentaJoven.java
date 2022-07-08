package modelo;

public class CuentaJoven extends Cuenta {

	// atributos
	private double bonificacion;
	private boolean estudiante;

	// constructores


	public CuentaJoven(Persona titular, double saldo, double bonificacion, boolean estudiante) {
		super(titular, saldo);
		this.bonificacion = bonificacion;
		this.estudiante = estudiante;
	}
	


	// getters y setters
	public double getBonificacion() {
		return bonificacion;
	}



	public void setBonificacion(double bonificacion) {
		this.bonificacion = bonificacion;
	}

	public boolean isEstudiante() {
		return estudiante;
	}

	public void setEstudiante(boolean estudiante) {
		this.estudiante = estudiante;
	}
	
	@Override
	public String toString() {
		return "CuentaJoven [bonificacion=" + bonificacion + ", estudiante=" + estudiante + "]";
	}

	@Override
	public double calculaIntereses() {

		return super.calculaIntereses();
	}

	@Override
	public boolean transferir(Cuenta cDestino, double cantidad) {

		return super.transferir(cDestino, cantidad);
	}

}
