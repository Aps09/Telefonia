package Tarifa;

/**
 * Created by al341853 on 6/03/17.
 */
public class Tarifa {

    private int cantidad;

    public Tarifa(){
        cantidad = 0;
    }

    public Tarifa(int nuevo){
        this.cantidad=nuevo;
    }

    public int getCantidad(){
        return this.cantidad;
    }

    public void setCantidad(int nuevo){
        this.cantidad=nuevo;
    }

}
