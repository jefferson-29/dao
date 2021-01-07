
package Modelo;

/**
 *
 * @author Amaikase
 */
public class ClsCategoria {
    private String nombreCategoria = "";
    private int valorMensualidad;
    private int id_categoria;

    public ClsCategoria(int id_categoria, String nombreCategoria, int valorMensualidad) {
        this.id_categoria = id_categoria;
        this.nombreCategoria = nombreCategoria;
        this.valorMensualidad = valorMensualidad;
    }

    public ClsCategoria() {
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public int getValorMensualidad() {
        return valorMensualidad;
    }

    public void setValorMensualidad(int valorMensualidad) {
        this.valorMensualidad = valorMensualidad;
    }

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }
}
