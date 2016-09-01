package practicahileras;


public class Hilera {
    nodoDoble primero;
    nodoDoble ultimo;

    public Hilera() {
        primero=null;
        ultimo=null;
    }
    public nodoDoble primeraletra(){
        return primero;
    }
    public nodoDoble ultimaletra(){
        return primero;
    }
    public Boolean finaldehilera(nodoDoble x){
        return x==null;
    }
    public Boolean esVacia(){
        return primero==null;
    }
    public String recorridoizqder(){
        
        StringBuilder cons_hil= new StringBuilder();
        nodoDoble x= primeraletra();
        while(!finaldehilera(x)){
            cons_hil.append(x.getLetra());
            x=x.getLigader();
        }
        String palabra= cons_hil.toString();
        return palabra;
        
    }
    public String recorridoderizq(){
        String palabra="";
        nodoDoble x= ultimaletra();
        while(!finaldehilera(x)){
            palabra.concat( ""+ x.getLetra());
            x=x.getLigaizq();
        }
        return palabra;
        
    }
    public void construirPalabra(String palabra){
        for (int i = 0; i < palabra.length(); i++) {
             
            insertar(palabra.charAt(i), ultimo);
      
            
        }
    }
    public void conectar(nodoDoble x, nodoDoble y)//conecta x después de y
    {
        if(y==null)// el nodo se conecta al principio
        {
            x.setLigader(primero);
            if(primero!=null){
                primero.setLigaizq(x);
            }
            else{
                ultimo=x;
            }
            primero=x;
        }
        else if(y.getLigader()==null)//el nodo se coneta al final
        {
            y.setLigader(x);
            x.setLigaizq(y);
            ultimo=x;
        }
        else //el nodo se conecta en un sitio intermedio
        {
            x.setLigader(y.getLigader());
            x.setLigaizq(y);
            x.getLigader().setLigaizq(x);
            y.setLigader(x);
            
        }
    }
    public void insertar(char letra,nodoDoble y){
        nodoDoble x,p;
        x= new nodoDoble(letra);
        conectar(x, y);
    }
    public void desconectar(nodoDoble x){
        if(x.getLigader()==null){
            primero= x.getLigader();
            if(primero==null){
                ultimo=null;
            }
            else{
                primero.setLigaizq(null);
            }
        }
        else if(x.getLigader()==null){
            ultimo=x.getLigaizq();
            ultimo.setLigader(null);
        }
        else{
            x.getLigader().setLigaizq(x.getLigaizq());
            x.getLigaizq().setLigader(x.getLigader());
        }
        
    }
    public void borrarparte(String aborrar){
        int pos_letra=0;
        char letra_actu= aborrar.charAt(pos_letra);
        nodoDoble p=primero;
        
        while(!finaldehilera(p)){
            while(p.getLetra()!=letra_actu){
                p=p.getLigader();
            }
            nodoDoble q=p.getLigader();
            pos_letra++;
            letra_actu=aborrar.charAt(pos_letra);
//            for(int i = 1; i < aborrar.length(); i++) {
//                    while(q.getLetra()==letra_actu){
//                        
//                    }
//             }
            
            
            
        }
    }
}
