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
    public void eliminarHilerapar(int indice, int posicion){
        lishilera.get(indice).borrarparte(posicion);
    }
    public void invetirHilera(int indice){
        lishilera.get(indice).invertir();
    }

    public void modificarHilera(int indice, int desde, int hasta, String pala_ins) {
        lishilera.get(indice).modificarhilera(desde, hasta,pala_ins);
    }
    public Boolean versubstringdepan(int indice, String ent_pan){
        return lishilera.get(indice).substringdepan(ent_pan);
    }
    public String devolverstring(int indice){
        return lishilera.get(indice).devolverpalabra();
    }
   

    public Boolean veripalindro(int indice) {
        return lishilera.get(indice).verpalindromo();
        
    }
    public void ordenar(int indice) {

      lishilera.get(indice).ordenar();
    }
    public Boolean verianagrama(int indice1, int indice2) {
        Hilera hile1=lishilera.get(indice1);
        Hilera hile2=lishilera.get(indice2);
        return hile2.verianagrama(hile1.copiaordenada(),hile2.copiaordenada());
    }

}
