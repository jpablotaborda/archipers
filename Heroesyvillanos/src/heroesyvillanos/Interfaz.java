package heroesyvillanos;
 
import java.util.Scanner;



public class Interfaz {
    static Scanner lector= new Scanner(System.in);
    static int opc_menu;
    public static void main(String[] args) {
        mostrarmenuprin();
        imprimirlinea();
    }
    static void mostrarmenuprin(){
        System.out.println("Heroes y Villanos");
        System.out.println("");
        System.out.println("Escoja algunas de las siguientes opciones");
        System.out.println("1. Crear Personaje");
        System.out.println("2. Consultar Personajes");
        System.out.println("3.Ingresar interfaz de grupos combatientes");
        System.out.println("");
        System.out.print("Digite su opción: ");
        opc_menu=lector.nextInt();
        
    }
    static void imprimirlinea(){
        System.out.println("__________________________________________________________________________");
    }
    
}
