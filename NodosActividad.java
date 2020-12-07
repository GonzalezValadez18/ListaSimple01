/*
 * GONZALEZ VALADEZ JOSE LEONARDO
 * 3S11
 * 
 */
package nodosactividad;

import java.util.Scanner;

public class NodosActividad {

    public static void main(String[] args) {
   Scanner sc = new Scanner (System.in);
           Lista lista = new Lista();
        int opcion;
        String ele = null;
       do{
               System.out.println("------1. Agregar------\n"
                                + "------2. Mostrar------\n"
                                + "------3. Eliminar-----\n");
               System.out.println("Selecciona una accion a realizar en la lista:");
               switch (opcion=sc.nextInt()){
                   case 1:
                           System.out.println("Ingresa un dato");
                           lista.agregarInicio(ele);
                       break;
                       case 2:
                           System.out.println("La lista contiene estos datos");
                           lista.mostrarLista();
                       break;
                       case 3:
                           System.out.println("Se elimino el dato del final");
                           lista.eliminarUltimo();
                       break;
               }
           
       }while(opcion!=4);
    }}