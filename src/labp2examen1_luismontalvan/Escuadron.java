/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labp2examen1_luismontalvan;

import java.util.ArrayList;

/**
 *
 * @author luism
 */
public class Escuadron {
    private String nombre, TipoE, lider, localidad;
    ArrayList<Persona> integrantes= new ArrayList();

    public Escuadron() {
    }

    public Escuadron(String nombre, String TipoE, String lider, String localidad) {
        this.nombre = nombre;
        this.TipoE = TipoE;
        this.lider = lider;
        this.localidad = localidad;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoE() {
        return TipoE;
    }

    public void setTipoE(String TipoE) {
        this.TipoE = TipoE;
    }

    public String getLider() {
        return lider;
    }

    public void setLider(String lider) {
        this.lider = lider;
    }

    public ArrayList<Persona> getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(ArrayList<Persona> integrantes) {
        this.integrantes = integrantes;
    }

    @Override
    public String toString() {
        return "Escuadron{" + "nombre=" + nombre + ", TipoE=" + TipoE + ", lider=" + lider + ", integrantes=" + integrantes + '}';
    }
    
    
}
