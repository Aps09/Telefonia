package Clientes;

import Facturas.Facturas;
import Fecha.Fecha;
import Llamadas.Llamadas;
import Tarifa.Tarifa;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Scanner;


/**
 * Created by al341853 on 28/02/17.
 */
public class Clientes implements Fecha, Serializable{

    // **************************** ATRIBUTOS ****************************

    private Scanner scan = new Scanner(System.in);

    private int size;

    public String nif;
    private String nombre;
    private Direccion direccion;
    private String email;
    private LocalDateTime fechaAlta;
    private Tarifa tarifa;


    private Nodos clients[];
    public Facturas facturas;
    public Llamadas llamadas;


    // **************************** CONSTRUCTORES ****************************

    public Clientes(){
        this.size=0;
        this.facturas= new Facturas();
        this.llamadas= new Llamadas();
    }


    // **************************** PEDIR DATOS ****************************

    public Nodos askClient(){
            Nodos nuevo = new Nodos();
            System.out.print("¿Cuál es el NIF del cliente?: ");
            nuevo.cliente.nif = scan.next();


            System.out.print("¿Cuál es el nombre del cliente?: ");
            nuevo.cliente.nombre = scan.next();

            System.out.print("Indique su e-mail: ");
            nuevo.cliente.email = scan.next();

            nuevo.cliente.direccion.askDirection();

            // Falta recoger el dia actual y preguntar la tarifa
            this.fechaAlta=LocalDateTime.now();
            return nuevo;
    }


    // **************************** METODOS ****************************

    public void addClient(Nodos cliente) {

        if (size > 0) {
            for (Nodos aux = clients[0]; aux != null; aux = aux.next) {
                if (aux.next == null) {
                    aux.next = cliente;
                    cliente.prev = aux;
                }
            }
        } else
            clients[0] = cliente;

        size++;
    }

    public void metodoSerializable(){

    }


    public LocalDateTime getFecha(){
        return fechaAlta;
    }

    public void delClient(String nif){
        for(Nodos aux = clients[0]; aux!= null; aux = aux.next){
            if(aux.cliente.nif == nif){
                aux.prev.next = aux.next;
                aux.next.prev = aux.prev;
                size--;
            }
        }
    }

    public void cambiarTarifa(int nueva, String nif){
        for(Nodos aux = clients[0]; aux!= null; aux = aux.next){
            if(aux.cliente.nif == nif) {
                aux.cliente.tarifa.setCantidad(nueva);
            }
        }
    }

    public void datosCliente(String dni){
        for(Nodos aux = clients[0]; aux!= null; aux = aux.next){
            if(aux.cliente.nif == dni) {
                System.out.println("Nombre: "+aux.cliente.nombre);
                System.out.println("NIF: "+aux.cliente.nif);
                aux.cliente.direccion.getInfo();
                System.out.println("Correo: "+aux.cliente.email);
                System.out.println("Fecha de alta: "+aux.cliente.fechaAlta);
                System.out.println("Tarifa: "+aux.cliente.tarifa+"€/min");
            }
        }
    }

    public Nodos getClient(String dni){
        for(Nodos aux = clients[0]; aux!= null; aux = aux.next) {
            if (aux.cliente.nif == nif)
                return aux;
        }
        return null;
    }

    public void getClients(){
        for(Nodos aux = clients[0]; aux!= null; aux = aux.next)
            System.out.println(aux.cliente.nombre);
    }

    public void getFacturas(String dni){
        for(Nodos aux = clients[0]; aux!= null; aux = aux.next) {
            if (aux.cliente.nif == dni)
                aux.cliente.facturas.printFacturas();
        }
    }

    // **************************** COMPARADOR ****************************

    public boolean equals (Clientes cliente){
        for(Nodos aux = clients[0]; aux!= null; aux = aux.next) {
            if (aux.cliente.nif == cliente.nif) {
                return true;
            }
        }
        return false;
    }
}
