package Menu_Principal;

import java.util.Scanner;

/**
 * Created by al341853 on 28/02/17.
 */
public class Principal extends Acciones implements Menus {

    private int opcionPrincipal, opcion;
    private Scanner scan = new Scanner(System.in);

    public void ejecucion() {

        menuPrincipal();

        opcionPrincipal = scan.nextInt();

        if (opcionPrincipal != 0) {
            do {
                opcion = getMenuPrincipal(opcionPrincipal);
                if (opcion == 0) {
                    menuPrincipal();
                    opcionPrincipal = scan.nextInt();
                }else {
                    accionSubmenu(opcionPrincipal, opcion);
                }
            } while (opcionPrincipal != 0);
        }
        scan.close();
    }


    private int getMenuPrincipal(int opcion) {
        // Aquí accederemos a cada menú del principal
        switch (opcion) {
            case 1:
                clientOptions();
                break;
            case 2:
                callOptions();
                break;
            case 3:
                invoiceOptions();
                break;
            default:
                return 0;
        }

        System.out.print("Elija una opción de las anteriores: ");
        return scan.nextInt();
    }

    public void accionSubmenu(int opcionPrincipal, int opcion){
    // Una vez sepamos la opcion del submenú ejecutaremos la opcion
        switch (opcionPrincipal){
            case 1:
                accionesClientes(opcion);
            case 2:
                accionesLlamadas(opcion);
            case 3:
                accionesFacturas(opcion);
        }
    }


    @Override
    public void menuPrincipal() {
        System.out.println("******************* MENÚ PRINCIPAL *******************");
        System.out.println();
        System.out.println("1. Menú cliente.");
        System.out.println("2. Menú llamadas.");
        System.out.println("3. Menú facturas.");
        System.out.println("0. Salir.");
    }

    @Override
    public void clientOptions() {
        System.out.println("******************* MENÚ CLIENTES *******************");
        System.out.println();
        System.out.println("1. Dar de alta un nuevo cliente.");
        System.out.println("2. Borrar un cliente.");
        System.out.println("3. Cambiar la tarifa de un cliente.");
        System.out.println("4. Recuperar los datos de un cliente.");
        System.out.println("5. Recuperar el listado de todos los clientes.");
        System.out.println("0. Atrás.");
    }

    @Override
    public void callOptions() {
        System.out.println("******************* MENÚ LLAMADAS *******************");
        System.out.println();
        System.out.println("1. Dar de alta una llamada.");
        System.out.println("2. Listar las llamadas de un cliente.");
        System.out.println("0. Atrás.");
    }

    @Override
    public void invoiceOptions() {
        System.out.println("******************* MENÚ FACTURAS *******************");
        System.out.println();
        System.out.println("1. Emitir una factura para un cliente.");
        System.out.println("2. Recuperar los datos de una factura.");
        System.out.println("3. Recuperar las facturas de un cliente.");
        System.out.println("0. Atrás.");
    }
}
