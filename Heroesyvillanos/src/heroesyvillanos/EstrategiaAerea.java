package heroesyvillanos;

import java.util.ArrayList;

public class EstrategiaAerea implements Estrategia{

  
    @Override
    public int valorarestra(ArrayList<Personaje> integra){
          int punt = 0;
        for (int i = 0; i < integra.size(); i++) {
            ArrayList<Poder> aux_pod = integra.get(i).getPoder();
            for (int j = 0; j < aux_pod.size(); j++) {
                if (aux_pod.get(j).getTipo().equals("Utilidad") && (aux_pod.get(j).getNombre().equals("Volar") || aux_pod.get(j).getNombre().equals("volar"))) {
                    punt=punt+10;
                }
            }

        }
        return punt;
    }
}
