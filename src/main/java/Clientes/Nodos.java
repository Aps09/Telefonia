package Clientes;

/**
 * Created by Andres on 05/03/2017.
 */
public class Nodos {
    public Clientes cliente;
    public Nodos next;
    public Nodos prev;


    public Nodos(){
        cliente = null;
    }

    public Nodos(Clientes client){
        cliente = client;
    }
}
