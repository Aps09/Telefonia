package Clientes;

import java.util.Scanner;

/**
 * Created by Andres on 04/03/2017.
 */
public class Direccion {

    // **************************** ATRIBUTOS ****************************

    private int codPostal;
    private Scanner scan = new Scanner(System.in);
    private String provincia, poblacion;


    // **************************** CONSTRUCTORS ****************************

    public Direccion(){
        this.provincia = null;
        this.poblacion = null;
    }

    public Direccion(int codigoPostal, String prov, String pob){
        this.codPostal = codigoPostal;
        this.provincia = prov;
        this.poblacion = pob;
    }


    // **************************** PEDIR DATOS ****************************

    public void askDirection(){
        System.out.print("¿Qué código postal tiene el usuario que desea añadir?: ");
        this.codPostal = scan.nextInt();

        System.out.print("¿De qué provincia es el usuario que desea añadir?: ");
        this.provincia = scan.next();

        System.out.print("¿De qué población es el usuario que desea añadir?: ");
        this.poblacion = scan.next();
    }


    // **************************** GETTERS ****************************

    public int getCodPostal(){
        return codPostal;
    }

    public String getProvincia(){
        return provincia;
    }

    public String getPoblacion(){
        return poblacion;
    }


    // **************************** ENSEÑAR INFORMATION ****************************

    public void getInfo(){
        System.out.println("Código postal: "+codPostal);
        System.out.println("Provincia: "+provincia);
        System.out.println("Población: "+poblacion);
    }


    // **************************** SETTERS ****************************

    public void setCodPostal(int nuevo){
        this.codPostal = nuevo;
    }

    public void setProvincia(String nuevo){
        this.provincia = nuevo;
    }

    public void setPoblacion(String nuevo){
        this.poblacion = nuevo;
    }

}
