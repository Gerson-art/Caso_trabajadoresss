package Datos;

import Modelo.Trabajador;

import java.util.ArrayList;

public interface InterfaceDatos {

	public ArrayList<Trabajador> leer();

	public void editar(String isapre,String afp, String rut, String nombre, String apellido);

}