
package Modelo;

import java.sql.Time;

/**
 *
 * @author Amaikase
 */
public class ClsClases {
    private int idClase;
    private String nombreClase="";
    private Time horaInicio;
    private Time horaFin;
    private String instructor;

    public ClsClases(int idClase, String nombreClase, Time horaInicio, Time horaFin, String instructor) {
        this.idClase = idClase;
        this.nombreClase = nombreClase;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.instructor = instructor;
    }

    public ClsClases() {
    }

    public String getNombreClase() {
        return nombreClase;
    }

    public void setNombreClase(String nombreClase) {
        this.nombreClase = nombreClase;
    }

    public Time getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Time horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Time getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(Time horaFin) {
        this.horaFin = horaFin;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public int getIdClase() {
        return idClase;
    }

    public void setIdClase(int idClase) {
        this.idClase = idClase;
    }
    
}
