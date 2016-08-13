package heroesyvillanos;

import java.util.ArrayList;


public class Personaje {
    private String nombre;
    private String liga;
    ArrayList<Poder> poder;
    String[] implemento;
    String[] frases;

  
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
    
}
