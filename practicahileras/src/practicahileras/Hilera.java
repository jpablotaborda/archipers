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
    public nodoDoble getPrimero(){
        return primero;
    }
    public nodoDoble getUltimo(){
        return ultimo;
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
    
    public void invertir(){
        nodoDoble p= ultimo;
        ultimo=primero;
        primero=p;
        while(p!=null){
            nodoDoble aux= p.getLigaizq();
            p.setLigaizq(p.getLigader());
            p.setLigader(aux);
            p=aux;
        }
    }
    void modificarhilera(int desde, int hasta, String inser){
        Hilera hil_ins= new Hilera();
        hil_ins.construirPalabra(inser);
        nodoDoble p= primero;
        if(p==null){
            return ;
        }
        int con_nod=1;
        while(con_nod< desde-1 ){
            p=p.getLigader();
            con_nod++;
        }
        nodoDoble q=p;
        while(con_nod< hasta){
            q=q.getLigader();
            con_nod++;
        }
        
        p.setLigader(null);
        nodoDoble r=q.getLigader();
        q.setLigader(null);
        this.conectar(hil_ins.primero, p);
        
        if(r!=null)
        {
            
            this.conectar(r, hil_ins.getUltimo());
        }
        else{
            ultimo= hil_ins.getUltimo();
        }
        
        
        
    }

    public Boolean substringdepan(String hil_pan)// verifica si hilera original es substring de string en pant
    {
        Hilera hil_ent= new Hilera();
        hil_ent.construirPalabra(hil_pan);
        Boolean esSub=false;
        nodoDoble p= getPrimero();
        nodoDoble r= hil_ent.primero;
        while(p!=null){
            while(r.getLetra()==p.getLetra()){
                nodoDoble q=p.getLigader();
                r=r.getLigader();
                while (q.getLetra()==r.getLetra()) {
                    q=q.getLigader();
                    r=r.getLigader();
                    if(r==null){
                        return true;
                    }
                }
            }
            p=p.getLigader();
        
        }
        
        return false;
        
    }
    public String devolverpalabra(){
        nodoDoble p= getPrimero();
        StringBuilder crea_pal= new StringBuilder();
        
        while(p!=null){
            crea_pal.append(p.getLetra());
            p=p.getLigader();
        }
        return crea_pal.toString();
    }
     public Boolean verianagrama(Hilera hile1, Hilera hile2) {
        nodoDoble p=hile1.primero;
        nodoDoble q=hile2.primero;
        Boolean ana=false;
        
        while(p.getLetra()==q.getLetra()){
            p=p.getLigader();
            q=q.getLigader();
            if(p==null && q==null){
                return true;
            }
        }
        return ana;
    }
     public Hilera devolinvertido(){
        Hilera inver= new Hilera();
        nodoDoble p=ultimo;
        while(p!=null){
            nodoDoble x= new nodoDoble(p.getLetra());
            inver.conectar(x, inver.ultimo);
            p=p.getLigaizq();
        }
        return inver;
    }
    
    public Boolean verpalindromo(){
        nodoDoble p=primero;
        Hilera invertida= this.devolinvertido();
        nodoDoble q=invertida.primero;
        Boolean palindromo= false;
        while(p.getLetra()==q.getLetra()){
            p=p.getLigader();
        
            q=q.getLigader();
            if (p==null && q==null) {
                return true;
            }
        }
        
        return palindromo;
        
    }
    public void ordenar() {
        nodoDoble p=primero;
        while(p!=null){
            nodoDoble q=p.getLigader();
            while(q!=null){
                if(p.getLetra()>q.getLetra()){
                    char aux=q.getLetra();
                    q.setLetra(p.getLetra());
                    p.setLetra(aux);
                    
                }
               q=q.getLigader();
            }
             p=p.getLigader();
        }
        
    }
    public Hilera copiaordenada(){
        Hilera copia=this.crearcopia();
        copia.ordenar();
        return copia;
    }
    public Hilera crearcopia(){
        Hilera copia= new Hilera();
        nodoDoble p=primero;
        while(p!=null){
            nodoDoble x= new nodoDoble(p.getLetra());
            copia.conectar(x, copia.ultimo);
            p=p.getLigader();
        } 
        return copia;
    }
    public void borrarparte(int posicion){
        nodoDoble x = primero; 
        int i=1;
        while (x != null) {
            if (i == posicion) {
                if (x == primero) {
                    primero = ultimo = null;
                } else {
                    ultimo = x.getLigaizq();
                    (x.getLigaizq()).setLigader(null);
                }
                return;
            }
            x = x.getLigader();
            i++;
        }
    }
                
    
}
