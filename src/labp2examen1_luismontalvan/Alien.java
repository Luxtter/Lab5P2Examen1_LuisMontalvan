/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labp2examen1_luismontalvan;

/**
 *
 * @author luism
 */
public class Alien extends Extraterrestre{
    private String planeta;

    public Alien() {
    }

    public Alien(String planeta, String nombre, String poder, int agilidadM, int agilidadF, int fuerza) {
        super(nombre, poder, agilidadM, agilidadF, fuerza);
        this.planeta = planeta;
    }

    public String getPlaneta() {
        return planeta;
    }

    public void setPlaneta(String planeta) {
        this.planeta = planeta;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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

    @Override
    public String toString() {
        return super.toString()+"Alien{" + "planeta=" + planeta + '}';
    }
    
}
