package heroesyvillanos;

import java.util.ArrayList;
import java.util.Scanner;


public class Interfaz {

    static Scanner lector = new Scanner(System.in);
    static int opc_menu;
    static Listapersonajes perso= new Listapersonajes();
    static ListaGrupoCombatientes grupocom= new ListaGrupoCombatientes();

    public static void main(String[] args) {
        
        interfazmenuprin();
        imprimirlinea();
    }

    static void interfazmenuprin() {
        System.out.println("Heroes y Villanos");
        System.out.println("");
        System.out.println("Escoja algunas de las siguientes opciones");
        System.out.println("1. Crear Personaje");
        System.out.println("2. Consultar Personajes");
        System.out.println("3. Crear grupo combatientes");
        System.out.println("4. Listar grupos combatientes");
        System.out.print("Digite su opción: ");
        opc_menu = lector.nextInt();
        lector.nextLine();
        switch(opc_menu){
            case 1:
                imprimirlinea();
                InterfazCrearpersonaje();
                break;
            case 2:
                imprimirlinea();
                InterfazBuscarPersonajes();
                break;
            case 3:
                imprimirlinea();
                Interfazcreargrupocom();
                break;
            case 4:
                imprimirlinea();
                interfazgrupoconvalora();
                break;
        }

    }

    static void imprimirlinea() {
        System.out.println("");
        System.out.println("");
        System.out.println("__________________________________________________________________________");
    }

    static void InterfazCrearpersonaje() {
        System.out.println("Creación de personaje");
        System.out.println("");
        System.out.print("Ingrese el nombre del personaje: ");
        String nom_per = lector.nextLine();
        System.out.print("Ingrese a la liga a la que pertece, h si es héroe o v si es villano: ");
        String liga = lector.nextLine();
        System.out.print("Cuantos poderes tiene?: ");
        int num_pod = lector.nextInt();
        lector.nextLine();
        ArrayList<Poder> poderes= new ArrayList<>();
        
        //Aquí se hace el ingreso de los poderes
        
        for (int    i = 1; i <= num_pod; i++) {
            Poder pod_aux= new PoderAtaque();
            System.out.print("Ingrese el nombre del poder " + i + ": ");
            String nom_pod= lector.nextLine();
            System.out.print("El poder " + i + " es de tipo(escriba a si es de ataque, escriba d si es defensa ó u si es de utilidad):");
            String tipo_pod= lector.nextLine();
            switch(tipo_pod){
                case "a":
                    pod_aux= new PoderAtaque();
                    break;
                case "A":
                    pod_aux= new PoderAtaque();
                    break;
                case "d":
                    pod_aux= new PoderDefensivo();
                    break;
                case "D":
                    pod_aux= new PoderDefensivo();
                    break;
                case "u":
                    pod_aux= new PoderUtilidad();
                    break;
                case "U":
                    pod_aux= new PoderUtilidad();
                    break;
                    
            }
            pod_aux.setNombre(nom_pod);
            poderes.add(pod_aux);
                 
        }
        //Aquí se ingresan los implementos
        System.out.print("Cuantos implementos tiene?: ");
        int num_imp= lector.nextInt();
        lector.nextLine();
        String[] implemen= new String[num_imp];
        for(int i=0; i<num_imp;i++){
            System.out.print("Ingrese el implemento "+(i+1)+": ");
            implemen[i]=lector.nextLine();
        }
        //Aquí se ingresan las frases
        System.out.print("Cuantas frases tiene?: ");
        int num_fra= lector.nextInt();
        lector.nextLine();
        String[] frases= new String[num_fra];
        for(int i=0; i<num_fra;i++){
            System.out.print("Ingrese la frase "+(i+1)+": ");
            frases[i]=lector.nextLine();
        }
        perso.crearpersonaje(nom_per, liga, implemen, frases, poderes);
        System.out.println("El personaje ha sido creado con éxito!");
        imprimirlinea();
        InterfazBuscarPersonajes();
    }
    static void InterfazBuscarPersonajes(){
        System.out.println("Seleccione alguna de las siguientes opciones:");
        System.out.println("");
        System.out.println("1. Consultar por tipo");
        System.out.println("2. Consultar por coincidencia con información");
        System.out.println("");
        System.out.println("Ingrese su opción: ");
        int num_opc_bus= lector.nextInt();
        lector.nextLine();
        ArrayList<Personaje> per_a_imp;
        if (num_opc_bus==1) {
            per_a_imp=InterfazBuscarPersonajesportipo();
        }
        else{
            per_a_imp=InterfazBuscarPersonajesporinfo();
        }
        System.out.println("Lista de personajes");
        System.out.println("");
        for (int i = 0; i < per_a_imp.size(); i++) {
            System.out.println((i+1)+". "+per_a_imp.get(i).getNombre());
        }
    }

    static ArrayList InterfazBuscarPersonajesportipo() {
        System.out.println("Seleccione el tipo de personaje que desea buscar: ");
        System.out.println("");
        System.out.println("1. Heroe");
        System.out.println("2. Villano");
        System.out.println("");
        System.out.println("Ingrese su opción: ");
        int num_bus_tip= lector.nextInt();
        lector.nextLine();
        ArrayList<Personaje> per_tipo=new ArrayList<>();
        if(num_bus_tip==1){
            per_tipo= perso.listarpersonajesportipo("Héroe");
        }
        else if(num_bus_tip==2){
            per_tipo= perso.listarpersonajesportipo("Villano");
        }
        return per_tipo;
    }

    static ArrayList InterfazBuscarPersonajesporinfo() {
        System.out.println("Ingrese la palabra que desea buscar: ");
        String pal_bus=lector.next();
        return perso.listarpersonajesporinfo(pal_bus);
        
    }
    static void Interfazcreargrupocom(){
        System.out.println("Cuál es el nombre del grupo: ");
        String auxnom_com= lector.next();
        System.out.println("Cuantos integrantes tiene el grupo: ");
        int auxnum_int=lector.nextInt();
        lector.nextLine();
        ArrayList<Personaje> aux_per=perso.getPersonajes();
        ArrayList<Personaje> per_grup= new ArrayList<>();
        int[] num_int= new int[auxnum_int] ;
        for (int i = 0; i < auxnum_int; i++) {
            for (int j = 0; j <aux_per.size(); j++) {
                System.out.println((j+1)+ aux_per.get(j).getNombre());
            }
            System.out.println("Digite el número del integrante "+(i+1)+": ");
            int opc_int= lector.nextInt();
            lector.nextLine();
            per_grup.add(aux_per.get(opc_int-1));
            aux_per.remove(opc_int-1);
            imprimirlinea();
            
        }
        Estrategia estra_gru= new EstrategiaAtaque();
        imprimirlinea();
        System.out.println("Sobre cuál estrategia desea evaluar(A: Ataque,D: Defensa, AE: Aerea): ");
        String let_estra= lector.next();
        String nom_estr="";
        if(let_estra.equals("A") || let_estra.equals("a")){
            estra_gru=  new EstrategiaAtaque();
            nom_estr="Ataque";
        }
        else if(let_estra.equals("D") || let_estra.equals("d")){
            estra_gru=  new EstrategiaDefensa();
            nom_estr="Defensa";
        }
        else if(let_estra.equals("AE") || let_estra.equals("ae")){
            estra_gru=  new EstrategiaAerea();
            nom_estr="Aerea";
        }
        grupocom.creargrupocomba(per_grup, estra_gru, nom_estr);
        System.out.println("Grupo creado con exito!");
        
    }
    static void interfazgrupoconvalora(){
        System.out.println("Estos son los grupos existentes: ");
        
        for (int i = 0; i < grupocom.getGruposcombatientes().size(); i++) {
            System.out.println((i+1)+ " " + grupocom.getGruposcombatientes().get(i).getNombre()+" Estrategia: "+grupocom.getGruposcombatientes().get(i).getNom_estra()+ " Valoración: "+ grupocom.getGruposcombatientes().get(i).getValoración() );
        }
    }
}

