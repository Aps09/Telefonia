package ClientesTest;

import es.uji.www.GeneradorDatosINE;
import Clientes.Direccion;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kamy on 5/03/17.
 */
public class DireccionTest {

    public static String provincia;
    public static String poblacion;
    public static int codPostal;
    public static Direccion domicilio;

    @BeforeClass
    public static void antes{
        GeneradorDatosINE datos = new GeneradorDatosINE;
        provincia = datos.getProvincia();
        poblacion = datos.getPoblacion();
        codPostal = 12004;
        domicilio = new Direccion(provincia, poblacion,codPostal);
    }

    @Test
    public void pruebaGetCodPostal(){
        assertEquals(domicilio.getCodPostal(), codPostal);
    }

    @Test
    public void pruebaGetProvincia(){
        assertEquals(domicilio.getProvincia(), provincia);
    }

    @Test
    public void pruebaGetPoblacion(){
        assertEquals(domicilio.getPoblacion(), poblacion);
    }

}
