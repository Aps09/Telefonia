package Menu_Principal;

/**
 * Created by Andres on 03/03/2017.
 */
public class Menus {



    public void menuPrincipal(){
        System.out.println("******************* MENÚ PRINCIPAL *******************");
        System.out.println();
        System.out.println("1. Menú cliente.");
        System.out.println("2. Menú llamadas.");
        System.out.println("3. Menú facturas.");
        System.out.println("0. Salir.");

    }

    public void clientOptions(){
        System.out.println("1. Dar de alta un nuevo cliente.");
        System.out.println("2. Borrar un cliente.");
        System.out.println("3. Cambiar la tarifa de un cliente.");
        System.out.println("4. Recuperar los datos de un cliente.");
        System.out.println("5. Recuperar el listado de todos los clientes.");
        System.out.println("0. Atrás.");

    }

    public void callOptions(){
        System.out.println("1. Dar de alta una llamada.");
        System.out.println("2. Listar las llamadas de un cliente.");
        System.out.println("0. Atrás.");

    }

    public void invoiceOptions(){
        System.out.println("1. Emitir una factura para un cliente.");
        System.out.println("2. Recuperar los datos de una factura.");
        System.out.println("3. Recuperar las facturas de un cliente.");
        System.out.println("0. Atrás.");

    }
}
