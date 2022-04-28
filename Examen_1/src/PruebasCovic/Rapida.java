package PruebasCovic;
import Pacientes.Paciente;

final class Rapida implements PruebaCovic19 { // im=nmutabilidad
	
	private Paciente paciente;
	
	public Rapida(Paciente p){
		this.paciente = p;
	}

	@Override
	public Boolean isPositiveCase() {
		return null;
	}

	@Override
	public String getNombrePaciente() {
		return null;
	}
}
