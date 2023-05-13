/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Cesar Alegre Flores
 */
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Asistencia {
    
    private int hora;
    private int fecha;
    private Nombre nombre;
    private Estado estado;

    public Asistencia(Nombre nombre, Estado estado) {
        this.nombre = nombre;
        this.estado = estado;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public void setNombre(Nombre nombre) {
        this.nombre = nombre;
    }

   
    
    
}
