package heroesyvillanos;

import java.util.ArrayList;

public class GrupoCombatiente {
    ArrayList<Personaje> integrantes;
    int valoración;
    Estrategia estra;
    
    public void valorarestrategia(){
        valoración=estra.valorarestra();
    }
}
