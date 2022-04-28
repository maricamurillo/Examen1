package Hospitales;

import java.util.List;

import OMS.OMS;
import Pacientes.Paciente;

public class HospitalNicoya extends OMS{ //Herencia
	
	private static List<Paciente> p;

	public HospitalNicoya() {
		super(p);
	}

	@Override
	public boolean isGamHospital() { //Sobreescritura de metodo
		return false;
	}

	@Override
	public Hospital getNombreHospital() {
		return null;
	}

}
