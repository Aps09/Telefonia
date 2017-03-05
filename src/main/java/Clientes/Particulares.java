package Clientes;

import Llamadas.FechaLl;

/**
 * Created by al341853 on 28/02/17.
 */
public class Particulares extends Clientes {
    private String apellido;

    // Aquí van los constructores

    public Particulares (String apellidos){
        super();
        this.apellido = apellidos;
    }

    // Aquí van los métodos

    @Override
    public void addClient(){

    }

    @Override
    public FechaLl getFecha(){

    }

    @Override
    public void delClient(){

    }

    @Override
    public void cambiarTarifa(){

    }

    @Override
    public void datosCliente(String dni){

    }

    @Override
    public Clientes getClient(){

    }

}
