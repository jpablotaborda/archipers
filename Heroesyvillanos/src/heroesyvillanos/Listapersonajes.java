package heroesyvillanos;

import java.util.ArrayList;

public class Listapersonajes {

    private ArrayList<Personaje> Personajes = new ArrayList<>();

    public void crearpersonaje(String nombre, String liga, String[] implementos, String[] lisfrases, ArrayList<Poder> poderes) {
        Personaje per_aux = new Personaje();
        if (liga.equals("H") || liga.equals("h")) {
            per_aux = new Heroe();
        } else if (liga.equals("V") || liga.equals("v")) {
            per_aux = new Villano();
        }
        per_aux.setNombre(nombre);
        per_aux.setImplementos(implementos);
        per_aux.setLis_frases(lisfrases);
        per_aux.setPoder(poderes);
        getPersonajes().add(per_aux);

    }

    public ArrayList listarpersonajesportipo(String tipo) {
        ArrayList<Personaje> aux_per_tipo = new ArrayList<>();
        for (int i = 0; i < getPersonajes().size(); i++) {
            if (getPersonajes().get(i).getLiga().equals(tipo)) {
                aux_per_tipo.add(getPersonajes().get(i));
            }
        }
        return aux_per_tipo;

    }

    public ArrayList listarpersonajesporinfo(String info) {
        ArrayList<Personaje> aux_per_info = new ArrayList<>();
        for (int i = 0; i < getPersonajes().size(); i++) {
            
            if (getPersonajes().get(i).getNombre().equals(info) || getPersonajes().get(i).getLiga().equals(info)) {
                aux_per_info.add(getPersonajes().get(i));
            }
            //buscando  en implementos
            String[] aux_imp = getPersonajes().get(i).getImplementos();
            for (int j = 0; j < aux_imp.length; j++) {

                if (aux_imp[j].contains(info)) {
                    aux_per_info.add(getPersonajes().get(i));
                }
            }
            //Buscando en poderes
            ArrayList<Poder> aux_pod = getPersonajes().get(i).getPoder();
            for (int j = 0; j < aux_pod.size(); j++) {
                if (aux_pod.get(j).getNombre().contains(info)) {
                    aux_per_info.add(getPersonajes().get(i));
                }

            }
            //Buscando en frases 
            String[] aux_fra= getPersonajes().get(i).getLis_frases();
            for (int j = 0; j < aux_fra.length; j++) {
                if(aux_fra[j].contains(info)){
                    aux_per_info.add(getPersonajes().get(i));
                }
            }

        }
        return aux_per_info;
    }

    public ArrayList<Personaje> getPersonajes() {
        return Personajes;
    }
    
    public void setPersonajes(ArrayList<Personaje> Personajes) {
        this.Personajes = Personajes;
    }
}



