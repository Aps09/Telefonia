package Clientes;


/**
 * Created by al341853 on 28/02/17.
 */
public class Particulares extends Clientes {

    // **************************** ATRIBUTOS ****************************
    private String apellido;


    // **************************** CONSTRUCTORES ****************************

    public Particulares (String apellidos){
        super();
        this.apellido = apellidos;
    }


    // **************************** METODOS ****************************

   public String getApellido(){
        return this.apellido;
   }

   public void setApellido(String nuevo){
       this.apellido=nuevo;
   }

}
