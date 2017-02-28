package Menu_Principal;

import java.util.Scanner;

/**
 * Created by al341853 on 28/02/17.
 */
public class Principal {

    private int option;
    private String continue_option = "s";
    private Scanner scan = new Scanner(System.in);

    public void main (){
        option = options();

        //************ Un case para cada opcion ************

    }

    private int options() {

        System.out.println("Escoja la opción que desee ejecutar: ");

        clientOptions();;
        callOptions();
        invoiceOptions();

        System.out.print("Elija la opción que desea ejecutar: ");
        option = scan.nextInt();

        if(option > 10 || option < 1){
            System.out.print("Ha ocurrido un error, el valor introducido no corresponde con ninguna opción.");
            throw new IllegalArgumentException();
        }else return option;

    }

    private void clientOptions(){
        System.out.println("1. Dar de alta un nuevo cliente.");
        System.out.println("2. Borrar un cliente.");
        System.out.println("3. Cambiar la tarifa de un cliente.");
        System.out.println("4. Recuperar los datos de un cliente.");
        System.out.println("5. Recuperar el listado de todos los clientes.");
    }

    private void callOptions(){
        System.out.println("6. Dar de alta una llamada.");
        System.out.println("7. Listar las llamadas de un cliente.");
    }

    private void invoiceOptions(){
        System.out.print("8. Emitir una factura para un cliente.");
        System.out.print("9. Recuperar los datos de una factura.");
        System.out.print("10. Recuperar las facturas de un cliente.");
    }

}
