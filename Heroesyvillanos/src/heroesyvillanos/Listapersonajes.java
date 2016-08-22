package heroesyvillanos;

import java.util.ArrayList;

public class Listapersonajes {
    ArrayList<Personaje> Personajes=new ArrayList<>();
    int can_per;
    public Listapersonajes(){
        can_per=0;
    }
    
    public void crearpersonaje(String nombre, String liga, String[] implementos, String[] lisfrases,ArrayList<Poder> poderes){
        Personaje per_aux=new Personaje();
        if(liga.equals("H") || liga.equals("h")){
            per_aux=new Heroe();
        }
        else if(liga.equals("V") || liga.equals("v")){
            per_aux= new Villano();
        }
        per_aux.setNombre(nombre);
        per_aux.setImplementos(implementos);
        per_aux.setLis_frases(lisfrases);
        per_aux.setPoder(poderes);
        Personajes.add(per_aux);
        can_per++;
               
    }   
    
}
