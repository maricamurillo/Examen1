package Pacientes;

public class Paciente {
	private final String nombre;//inmutabilidad
	private final int edad;
	private final int temperatura;
	private final Boolean vomito;
	
	public Paciente (String nombre, int edad, int temperatura, Boolean vomito){ //Sobrecarga
		this.nombre = nombre;
		this.edad = edad;
		this.temperatura = temperatura;
		this.vomito = vomito;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public int getTemperatura() {
		return temperatura;
	}
	
	public Boolean getVomito() {
		return vomito;
	}

}

