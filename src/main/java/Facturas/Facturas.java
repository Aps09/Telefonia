package Facturas;

import Clientes.Clientes;

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


    public int calculeInvoice (){

    }

    public Facturas.FechaFac getFecha(){

    }

    public Facturas getFactura (int codfac){
        for(int index = 0; index < size; index++){
            if (listaFacturas[index].codfac == codfac)
                listaFacturas[index].getInfo();
        }
    }

    public Facturas getFacturas (Clientes cliente){

    }


    // **************************** ENSEÑAR INFORMATION ****************************

    public void getInfo(){
        System.out.println("Código de factura: "+this.codfac);
        System.out.println("Tarifa contratada: "+this.tarifa);
        System.out.println("Importe total: "+this.importe);
        //Enseñar fecha

    }

}
