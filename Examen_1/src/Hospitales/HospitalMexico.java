package Hospitales;

import OMS.OMS;
import Pacientes.Paciente;

public class HospitalMexico extends OMS { //Herencia

	public HospitalMexico(Paciente[] p) {
		super(p);
	}

	@Override
	public boolean isGamHospital() {
		return false;
	}

	@Override
	public Hospital getNombreHospital() {
		return null;
	}

}
