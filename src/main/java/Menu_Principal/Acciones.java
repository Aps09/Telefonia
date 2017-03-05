package Menu_Principal;

import Clientes.*;
import Clientes.Clientes.Node;
import Facturas.*;
import Llamadas.*;

import javax.xml.soap.Node;
import java.util.Scanner;

/**
 * Created by Andres on 04/03/2017.
 */
public class Acciones {

    private String nif, apellido;
    private int tipo;
    private Scanner scan = new Scanner (System.in);

    public void accionesClientes(int eleccion){
        switch(eleccion){
            case 1: //dar de alta cliente
                System.out.print("El cliente que quiere añadir se trata de una empresa (1) o un particular (2)? (responda con 1 o 2): ");
                tipo = scan.nextInt();

                if(tipo == 1){
                    Clientes cliente = new Empresas();


                    cliente.addClient(cliente);
                }else{
                    System.out.print("Indíquenos su apellido: ");
                    apellido = scan.next();
                    Clientes cliente = new Particulares(apellido);
                    cliente.askClient();
                    cliente.addClient(cliente);
                }

            case 2: //borrar cliente
                System.out.print("Indique el NIF del cliente que desee eliminar: ");
                nif = scan.next();




            case 3: //cambiar tarifa


            case 4: //recuperar datos cliente

            case 5: //lista de clientes
        }
    }

    public void accionesLlamadas(int eleccion){
        switch(eleccion){
            case 1:

            case 2:

        }
    }

    public void accionesFacturas(int eleccion){
        switch(eleccion){
            case 1:

            case 2:

            case 3:

        }
    }
}
