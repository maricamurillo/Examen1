package PruebasCovic;

import Pacientes.Paciente;

final class TecnicaPCR implements PruebaCovic19{
	private Paciente paciente;
	
	public TecnicaPCR(Paciente p){
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
