package OMS;

import java.util.ArrayList;
import java.util.List;

import Hospitales.Hospital;
import Pacientes.Paciente;

public abstract class OMS { //patron de diseno template
	
	private List<Paciente> paciente = new ArrayList<Paciente>();
	
	
	public OMS(List<Paciente> p){
		this.paciente = p;
	}
	
	public abstract boolean isGamHospital();
	
	public abstract Hospital getNombreHospital();
}
