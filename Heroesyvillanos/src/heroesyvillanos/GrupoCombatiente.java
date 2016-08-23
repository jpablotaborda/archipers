package heroesyvillanos;

import java.util.ArrayList;

public class GrupoCombatiente {
    private ArrayList<Personaje> integrantes;
    private int valoración;
    private Estrategia estra;
    private String nom_estra;
    private String nombre;
    
    public void valorarestrategia(){
        valoración= estra.valorarestra(integrantes);
    }

    public ArrayList<Personaje> getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(ArrayList<Personaje> integrantes) {
        this.integrantes = integrantes;
    }

    public int getValoración() {
        return valoración;
    }


    public void setValoración(int valoración) {
        this.valoración = valoración;
    }

    public Estrategia getEstra() {
        return estra;
    }

    public void setEstra(Estrategia estra) {
        this.estra = estra;
    }

 
    public String getNombre() {
        return nombre;
    }

 
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getNom_estra() {
        return nom_estra;
    }


    public void setNom_estra(String nom_estra) {
        this.nom_estra = nom_estra;
    }
}
