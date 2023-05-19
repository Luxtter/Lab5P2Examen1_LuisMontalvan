/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labp2examen1_luismontalvan;

/**
 *
 * @author luism
 */
public class Persona {
    protected String nombre,poder, tipo, debilidad;
    protected int agilidadM, agilidadF, fuerza;

    public Persona() {
    }

    public Persona(String nombre, String poder, String tipo, String debilidad, int agilidadM, int agilidadF, int fuerza) {
        this.nombre = nombre;
        this.poder = poder;
        this.tipo = tipo;
        this.debilidad = debilidad;
        this.agilidadM = agilidadM;
        this.agilidadF = agilidadF;
        this.fuerza = fuerza;
    }

    public String getDebilidad() {
        return debilidad;
    }

    public void setDebilidad(String debilidad) {
        this.debilidad = debilidad;
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public int getAgilidadM() {
        return agilidadM;
    }

    public void setAgilidadM(int agilidadM) {
        this.agilidadM = agilidadM;
    }

    public int getAgilidadF() {
        return agilidadF;
    }

    public void setAgilidadF(int agilidadF) {
        this.agilidadF = agilidadF;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", poder=" + poder + ", tipo=" + tipo + ", agilidadM=" + agilidadM + ", agilidadF=" + agilidadF + ", fuerza=" + fuerza + '}';
    }

    
    
}
