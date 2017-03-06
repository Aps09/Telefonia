package Facturas;

import Clientes.Clientes;
import Fecha.Fecha;
import Tarifa.Tarifa;

import java.time.LocalDateTime;

/**
 * Created by al341853 on 28/02/17.
 */
public class Facturas implements Fecha{

    //FALTAN VARIABLES, LA CLASE FECHA Y DESARROLLAR LOS METODOS

    private int codfac;
    private Tarifa tarifa;
    private int importe;
    private int size;
    private LocalDateTime fechaEmision;
    private Clientes cliente;
    private Facturas[] listaFacturas;


    public Facturas(){
        size=0;
    }

    public void addFactura(){

    }

    public int calcularFactura (){

    }

    public LocalDateTime getFecha(){
        return fechaEmision;
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
        System.out.println("Código de factura: "+this.codfac);
        System.out.println("Tarifa contratada: "+this.tarifa);
        System.out.println("Importe total: "+this.importe);
        System.out.println("Fecha de emisión de factura: "+this.fechaEmision);
    }

}
