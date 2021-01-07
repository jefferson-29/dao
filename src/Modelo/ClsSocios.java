
package Modelo;

import java.util.Date;

/**
 *
 * @author Amaikase
 */
public class ClsSocios {
    private String nombreSocio = "";
    private String apellidoSocio = "";
    private Date fechaNacimiento;
    private String categoria;
    private int telefono;
    private int id;

    public ClsSocios(int id, String nombreSocio, String apellidoSocio, Date fechaNacimiento,String categoria,int telefono) {
        this.nombreSocio = nombreSocio;
        this.apellidoSocio = apellidoSocio;
        this.fechaNacimiento = fechaNacimiento;
        this.categoria = categoria;
        this.telefono = telefono;
        this.id = id;
    }

    public ClsSocios() {
    }

    public String getNombreSocio() {
        return nombreSocio;
    }

    public void setNombreSocio(String nombreSocio) {
        this.nombreSocio = nombreSocio;
    }

    public String getApellidoSocio() {
        return apellidoSocio;
    }

    public void setApellidoSocio(String apellidSocio) {
        this.apellidoSocio = apellidSocio;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
