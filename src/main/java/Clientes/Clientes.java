package Clientes;

import Facturas.Facturas;
import Llamadas.Fecha;
import Llamadas.Llamadas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;


/**
 * Created by al341853 on 28/02/17.
 */
public class Clientes {

    // **************************** ATRIBUTOS ****************************

    private Scanner scan = new Scanner(System.in);

    private int size;

    private Node clients[];
    private Facturas facturas;
    private Llamadas llamadas;


    // **************************** CLASE NODO ****************************

    public class Node{

        private Node next;
        private Node prev;
        private String nif;
        private String nombre;
        private Direccion direccion;
        private String email;
        private Fecha fechaAlta;
        private Tarifa tarifa;

        public Node(){
            nif = null;
            nombre = null;
            direccion = new Direccion();
            next = null;
            prev = null;
        }

        public Node(Node sig, Node ant) {
            next = sig;
            prev = ant;
        }

    }


    // **************************** CONSTRUCTORES ****************************

    public Clientes(){
        this.size=0;
        this.facturas= new Facturas();
        this.llamadas= new Llamadas();
    }


    // **************************** PEDIR DATOS ****************************

    public Node askClient(){
            Node nuevo = new Node();
            System.out.print("¿Cuál es el NIF del cliente?: ");
            nuevo.nif= scan.next();


            System.out.print("¿Cuál es el nombre del cliente?: ");
            nuevo.nombre = scan.next();

            System.out.print("Indique su e-mail: ");
            nuevo.email = scan.next();

            nuevo.direccion.askDirection();

            // Falta recoger el dia actual y preguntar la tarifa
            return nuevo;
    }


    // **************************** METODOS ****************************

    public void addClient(Clientes cliente){
        Node nodo = new Node();
        nodo.cliente = cliente;

        if (size > 0){
            for(Node aux = clients[0]; aux != null ; aux=aux.next ){
                if(aux.next==null){
                    aux.next = nodo;
                    nodo.prev = aux;
                }
            }
        } else
            clients[0]=nodo;
        size++;
    }

    public Fecha getFecha(){

    }

    public void delClient(String nif){
        for(Node aux = clients[0]; aux!= null; aux = aux.next){
            if(aux.cliente.nif == nif){
                aux.prev.next = aux.next;
                aux.next.prev = aux.prev;
                size--;
            }
        }
    }

    public void cambiarTarifa(int nueva, String nif){
        for(Node aux = clients[0]; aux!= null; aux = aux.next){
            if(aux.cliente.nif == nif) {
                aux.cliente.tarifa.setCantidad(nueva);
            }
        }
    }

    public void datosCliente(String dni){
        for(Node aux = clients[0]; aux!= null; aux = aux.next){
            if(aux.cliente.nif == nif) {
                System.out.println("Nombre: "+aux.cliente.nombre);
                System.out.println("NIF: "+aux.cliente.nif);
                aux.cliente.direccion.getInfo();
                System.out.println("Correo: "+aux.cliente.email);
                System.out.println("Fecha de alta: "+aux.cliente.fechaAlta);
                System.out.println("Tarifa: "+aux.cliente.tarifa+"€/min");
            }
        }
    }

    public Clientes getClients(){
        for(Node aux = clients[0]; aux!= null; aux = aux.next)
            System.out.println(aux.cliente.nombre);
    }


    // **************************** COMPARADOR ****************************

    public boolean equals (Clientes cliente){
        for(Node aux = clients[0]; aux!= null; aux = aux.next) {
            if (aux.cliente.nif == nif) {
                return true;
            }
        }
        return false;
    }

}
