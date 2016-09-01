package practicahileras;


public class nodoDoble {
    private nodoDoble ligaizq;
    private char letra;
    private nodoDoble ligader;

    public nodoDoble(char letraen) {
        ligaizq= null;
        letra=letraen;
        ligader=null;
    }

    
    public nodoDoble getLigaizq() {
        return ligaizq;
    }


    public void setLigaizq(nodoDoble ligaizq) {
        this.ligaizq = ligaizq;
    }


    public char getLetra() {
        return letra;
    }


    public void setLetra(char letra) {
        this.letra = letra;
    }


    public nodoDoble getLigader() {
        return ligader;
    }


    public void setLigader(nodoDoble ligader) {
        this.ligader = ligader;
    }
    
    
}
