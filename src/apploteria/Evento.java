/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apploteria;

/**
 *
 * @author Developer
 */

//CLASE PADRE ABSTRACTA
public abstract class  Evento {
    private String fecha;
    private boolean esRealizado;

    Evento(String fecha){
        this.fecha=fecha;
        this.esRealizado=false;
    }

    protected void cambiarEvento(String fecha){
        this.fecha=fecha;
    }

    protected void cambiarEstado(){
//toggle
       esRealizado= !esRealizado;
       String msj= esRealizado ? "Realizado" : "No Realizado"; //IF Ternario
       System.out.println("Estado actualizado: " + msj);
    }

    protected void getFecha(){
        System.out.println("Fecha: " + this.fecha);    
    }

    protected boolean getEstado(){
        return this.esRealizado;
    }   

    protected abstract void realizarSorteo();

    protected abstract void buscarGanadores();
}
