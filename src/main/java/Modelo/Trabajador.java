package Modelo;

public class Trabajador extends Persona {

	Empresa empresa;
	private String Isapre;
	private String AFP;

	public Trabajador(String rut, String nombre, String apellido,String Isapre, String AFP) {
		super(rut, nombre, apellido);
		this.Isapre = Isapre;
		this.AFP = AFP;
	}
	@Override
	public String toString() {
		return Num_rut+","+ Nombre+ "," + Apellido + "," + Isapre + "," + AFP;
	}
	public String getIsapre() {
		return Isapre;
	}
	public String getRut() {
		return Num_rut;
	}
	public String getNombre() {
		return Nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public String getAFP() {
		return AFP;
	}

}