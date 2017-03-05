package Facturas;

import Clientes.Clientes;
import Fecha.Fecha;

/**
 * Created by al341853 on 28/02/17.
 */
public class Facturas {

    //FALTAN VARIABLES, LA CLASE FECHA Y DESARROLLAR LOS METODOS

    private int codfac;
    private int tarifa;
    private int importe;
    private int size;
    private Fecha fechaEmision;
    private Clientes cliente;
    private Facturas[] listaFacturas;


    public Facturas(){
        size=0;
    }

    public void addFactura(){
        // recorrer vector y añadir ultimo
    }

    public int calcularFactura (){

    }

    public Fecha getFecha(){

    }

    public void getFactura (int codfac){
        for(int index = 0; index < size; index++){
            if (listaFacturas[index].codfac == codfac)
                listaFacturas[index].getInfo();
        }
    }

    public void printFacturas(){
        for(int index = 0; index < size; index++){
            listaFacturas[index].getInfo();
        }
    }


    // **************************** ENSEÑAR INFORMATION ****************************

    public void getInfo(){
        for(int index = 0; index < )
        System.out.println("Código de factura: "+this.codfac);
        System.out.println("Tarifa contratada: "+this.tarifa);
        System.out.println("Importe total: "+this.importe);
        //Enseñar fecha

    }

}
