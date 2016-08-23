package heroesyvillanos;

import java.util.ArrayList;


public class Personaje {
    private String nombre;
    private String liga;
    private ArrayList<Poder> poder;
    private String[] implementos;
    private String[] lis_frases;

  
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

 
    public String getLiga() {
        return liga;
    }

    public void setLiga(String liga) {
        this.liga = liga;
    }

    public ArrayList<Poder> getPoder() {
        return poder;
    }

    public void setPoder(ArrayList<Poder> poder) {
        this.poder = poder;
    }

    public String[] getImplementos() {
        return implementos;
    }

    public void setImplementos(String[] implementos) {
        this.implementos = implementos;
    }

    public String[] getLis_frases() {
        return lis_frases;
    }
    
    public void setLis_frases(String[] lis_frases) {
        this.lis_frases = lis_frases;
    }
    
}
