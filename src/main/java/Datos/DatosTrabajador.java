package Datos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import Modelo.Trabajador;
import java.io.BufferedWriter;
import java.io.FileWriter;


public class DatosTrabajador implements InterfaceDatos {

    private String nombreArchivo= "trabajadores.txt";

    public ArrayList<Trabajador> leer() {
        ArrayList<Trabajador> trabajadores = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("trabajadores.txt"));
            String linea = reader.readLine();
            while (linea != null) {
                String[] datos = linea.split(",");
                Trabajador trabajador = new Trabajador(datos[0], datos[1], datos[2], datos[3], datos[4]);
                trabajadores.add(trabajador);
                linea = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return trabajadores;

    }
    public String leerRut(){
        ArrayList<Trabajador> trabajadores = leer();
        return trabajadores.get(0).getRut();

    }
    public String leerNombre() {
        ArrayList<Trabajador> trabajadores = leer();
        return trabajadores.get(0).getNombre();
    }
    public String leerApellido() {
        ArrayList<Trabajador> trabajadores = leer();
        return trabajadores.get(0).getApellido();
    }
    public String leerIsapre(){
        ArrayList<Trabajador> trabajadores = leer();
        return trabajadores.get(0).getIsapre();}
    public String leerAFP(){
        ArrayList<Trabajador> trabajadores = leer();
        return trabajadores.get(0).getAFP();}

    public void editar(String nuevoRut, String nuevoNombre, String nuevoApellido, String nuevaIsapre, String nuevaAFP) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo));
            String linea;
            StringBuilder contenido = new StringBuilder();

            while ((linea = reader.readLine()) != null) {
                String[] partes = linea.split(",");
                // Reemplazar el DNI anterior con el nuevo DNI
                partes[0] = nuevoRut;
                partes[1] = nuevoNombre;
                partes[2] = nuevoApellido;
                partes[3]= nuevaIsapre;
                partes[4]= nuevaAFP;
                contenido.append(partes[0]).append(",").append(partes[1]).append(",").append(partes[2]).append(",").append(partes[3]).append(",").append(partes[4]).append("\n");
            }
            reader.close();

            BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo));
            writer.write(contenido.toString());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}


