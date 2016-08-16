package heroesyvillanos;

import java.util.ArrayList;
import java.util.Scanner;
import javax.sound.midi.Soundbank;

public class Interfaz {

    static Scanner lector = new Scanner(System.in);
    static int opc_menu;

    public static void main(String[] args) {
        mostrarmenuprin();
        imprimirlinea();
    }

    static void mostrarmenuprin() {
        System.out.println("Heroes y Villanos");
        System.out.println("");
        System.out.println("Escoja algunas de las siguientes opciones");
        System.out.println("1. Crear Personaje");
        System.out.println("2. Consultar Personajes");
        System.out.println("3.Ingresar interfaz de grupos combatientes");
        System.out.println("");
        System.out.print("Digite su opción: ");
        opc_menu = lector.nextInt();

    }

    static void imprimirlinea() {
        System.out.println("__________________________________________________________________________");
    }

    static void crearpersonaje() {
        System.out.println("Creación de personaje");
        System.out.println("");
        System.out.println("Ingrese el nombre del personaje: ");
        String nom_per = lector.next();
        System.out.println("Ingrese a la liga a la que pertece, h si es héroe o v si es villano: ");
        String liga = lector.next();
        System.out.println("Cuantos poderes tiene?");
        int num_pod = lector.nextInt();
        ArrayList<Poder> poderes= new ArrayList<>();

        for (int i = 1; i <= num_pod; i++) {
            System.out.println("Ingrese el nombre del poder " + i + ": ");
            String nom_pod= lector.next();
            System.out.println("El poder " + i + " es de tipo(escriba a si es de ataque, escriba d si es defensa ó u si es de utilidad):");
            String tipo_pod= lector.next();
            switch(tipo_pod){
                case "a":
                    
                    break;
                    
            }
            
        }
        System.out.println("Cuantos implementos tiene?: ");
        int num_imp= lector.nextInt();
        String[] implemen= new String[num_imp];
        for(int i=0; i<num_imp;i++){
            System.out.println("Ingrese el implemento "+i+": ");
            implemen[i]=lector.next();
        }
        System.out.println("Cuantas frases tiene?: ");
        int num_fra= lector.nextInt();
        String[] frases= new String[num_fra];
        for(int i=0; i<num_fra;i++){
            System.out.println("Ingrese la frase "+i+": ");
            frases[i]=lector.next();
        }
        System.out.println("El personaje ha sido creado con éxito!");
    }
}

