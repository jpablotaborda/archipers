package practicahileras;

import java.util.ArrayList;

public class AdmiHilera {
    ArrayList<Hilera> lishilera;

    public AdmiHilera() {
        lishilera=new ArrayList<>();
    }
    public void construirHilera(String palabra){
        Hilera hil_aux=new Hilera();
        hil_aux.construirPalabra(palabra);
        lishilera.add(hil_aux);
    }
    public ArrayList<Hilera> obtLista(){
        return lishilera;
    }
    public void eliminarHileracom(int indice){
        lishilera.remove(indice);
    }
    public void eliminarHilerapar(int indice, String aborrar){
        lishilera.get(indice).borrarparte(aborrar);
    }
    
}
