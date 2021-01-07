
package Modelo;

public class ClsDetalle {

    int id_socio;
    int id_clase;

    public ClsDetalle(int id_socio, int id_clase) {
        super();
        this.id_socio = id_socio;
        this.id_clase = id_clase;
    }

    public ClsDetalle() {
        super();
    }

    public int getId_socio() {
        return id_socio;
    }
    public void setId_socio(int id_socio) {
        this.id_socio = id_socio;
    }
    public int getId_clase() {
        return id_clase;
    }
    public void setId_clase(int id_clase) {
        this.id_clase = id_clase;
    }   
}
