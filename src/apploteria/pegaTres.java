/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apploteria;

/**
 *
 * @author Developer
 */
import java.util.Random;

public class pegaTres extends Evento{
    private int ganador[] = new int[3];
    private int premios[]={100,1000,100000};
    private int numeroSorteo;

    pegaTres(String fecha, int numeroSorteo){
        super(fecha);
        this.numeroSorteo = numeroSorteo;
    }

    public void realizarSorteo(){
      Random rand = new Random();
      int numeroMax = 100;
        //generate random values from 0-99
      for(int cont=0; cont<3; cont++){
            ganador[cont] = rand.nextInt(numeroMax); 
            System.out.println("Numero Ganador: " + ganador[cont]);
        }
    }

    public void buscarGanadores(){

    }
}
