package Llamadas;

import Clientes.Clientes;
import Fecha.Fecha;

import java.time.LocalDateTime;
import java.util.Scanner;

/**
 * Created by al341853 on 28/02/17.
 */
public class Llamadas implements Fecha{

    private LocalDateTime fechaLlamada;
    private int tiempoLlamada;
    private int numeroTelefono;
    private Scanner scan = new Scanner(System.in);

    private Llamadas[] llamadas;

    // **************************** PEDIR DATOS ****************************

    public void preguntarLlamada(){
        System.out.print("¿Cuál es el número al que ha llamado?: ");
        this.numeroTelefono = scan.nextInt();

        System.out.print("¿Cuánto tiempo ha durado la llamada?: ");
        this.tiempoLlamada = scan.nextInt();

        System.out.print("¿Qué día se efectuó la llamada?: ");
        int dia = scan.nextInt();

        System.out.print("¿Qué mes se efectuó la llamada?: ");
        int mes = scan.nextInt();

        System.out.print("¿Qué año se efectuó la llamada?: ");
        int year = scan.nextInt();

        System.out.print("¿A qué hora se efectuó dicha llamada?: ");
        int hora = scan.nextInt();

        System.out.print("¿En qué minuto se efectuó la llamada?: ");
        int min = scan.nextInt();

        this.fechaLlamada = LocalDateTime.of(year,mes,dia,hora,min);

    }

    public void addCall (){
        this.preguntarLlamada();
        for(int )


    }

    public LocalDateTime getFecha(){
        return fechaLlamada;
    }

    public Llamadas getCalls (Clientes cliente){

    }

}
