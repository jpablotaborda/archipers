package heroesyvillanos;

import java.util.ArrayList;

public class ListaGrupoCombatientes {
    private ArrayList<GrupoCombatiente> gruposcombatientes;
    public ListaGrupoCombatientes(){
        gruposcombatientes= new ArrayList<>();
    }
    public void creargrupocomba(ArrayList<Personaje> int_grupo,Estrategia estra_a_val, String nom_estra, String nom_grupo ){
        GrupoCombatiente aux_gru= new GrupoCombatiente();
        aux_gru.setIntegrantes(int_grupo);
        aux_gru.setEstra(estra_a_val);
        aux_gru.setNom_estra(nom_estra);
        aux_gru.valorarestrategia();
        aux_gru.setNombre(nom_grupo);
        gruposcombatientes.add(aux_gru);
        
    }

    public ArrayList<GrupoCombatiente> getGruposcombatientes() {
        return gruposcombatientes;
    }

    public void setGruposcombatientes(ArrayList<GrupoCombatiente> gruposcombatientes) {
        this.gruposcombatientes = gruposcombatientes;
    }
    
}
