package Menu_Principal;

import Clientes.*;
import Facturas.*;
import Llamadas.*;

import java.util.Scanner;

/**
 * Created by Andres on 04/03/2017.
 */
public class Acciones {

    private String dni, apellido;
    private int tipo, nuevaTarifa,codfac;
    private Scanner scan = new Scanner (System.in);
    public Clientes aux = new Clientes();

    public void accionesClientes(int eleccion){
        Nodos nuevo = new Nodos();

        switch(eleccion){
            case 1: //dar de alta cliente
                System.out.print("El cliente que quiere añadir se trata de una empresa (1) o un particular (2)? (responda con 1 o 2): ");
                tipo = scan.nextInt();

                if(tipo == 1){
                    Clientes cliente = new Empresas();
                    nuevo = cliente.askClient();
                    cliente.addClient(nuevo);
                }else{
                    System.out.print("Indíquenos su apellido: ");
                    apellido = scan.next();
                    Clientes cliente = new Particulares(apellido);
                    nuevo = cliente.askClient();
                    cliente.addClient(nuevo);
                }

            case 2: //borrar cliente
                System.out.print("Indique el NIF del cliente que desee eliminar: ");
                dni = scan.next();

                aux.delClient(dni);

            case 3: //cambiar tarifa
                System.out.print("Indique el NIF del cliente que desee cambiar la tarifa: ");
                dni = scan.next();

                System.out.print("Indique la cantidad de la nueva tarifa: ");
                nuevaTarifa = scan.nextInt();
                aux.cambiarTarifa(nuevaTarifa,dni);

            case 4: //recuperar datos cliente
                System.out.print("Indique el NIF del cliente que desee recuperar los datos: ");
                dni = scan.next();

                aux.datosCliente(dni);

            case 5: //lista de clientes
                System.out.println("Estos son los clientes actuales: ");
                aux.getClients();
        }
    }

    public void accionesLlamadas(int eleccion){
        switch(eleccion){
            case 1: //Dar de alta llamada

            case 2: //Listar llamadas de un cliente

        }
    }

    public void accionesFacturas(int eleccion){
        switch(eleccion){
            case 1: //emitir factura para cliente

            case 2: //recuperar datos de una factura
                System.out.print("Indique el código de factura que desea eliminar: ");
                codfac = scan.nextInt();
                aux.facturas.getFactura(codfac);
            case 3: //recuperar las facturas de un cliente
                System.out.print("Indique el NIF del cliente que desee recuperar sus facturas: ");
                dni = scan.next();
                aux.getFacturas(dni);
        }
    }
}
