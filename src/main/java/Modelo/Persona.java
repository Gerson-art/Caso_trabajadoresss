package Modelo;

public abstract class Persona {

	protected String Nombre;
	protected String Apellido;
	protected String Num_rut;

	public Persona(String rut, String nombre, String apellido) {
		this.Num_rut = rut;
		this.Nombre = nombre;
		this.Apellido = apellido;
	}

}