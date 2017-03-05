package Clientes;

/**
 * Created by Andres on 04/03/2017.
 */
public class Tarifa {

    // **************************** ATRIBUTOS ****************************

    private int cantidad;


    // **************************** CONSTRUCTORES ****************************

    public Tarifa(){
        this.cantidad=0;
    }

    public Tarifa(int cifra){
        this.cantidad=cifra;
    }


    // **************************** METODOS ****************************

    public int getCantidad(){
        return this.cantidad;
    }

    public void setCantidad(int nuevo){
        this.cantidad = nuevo;
    }

}
