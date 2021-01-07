
package Controlador;

import Modelo.ClsConexion;
import Modelo.ClsCategoria;
import DAO.CategoriaDAO;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Amaikase
 */
public class CtlCategoria {
    
    ClsCategoria conexion = new ClsCategoria();

    public CtlCategoria() {
    }
    
    public boolean SolicitudGuardar(int id_categoria, String nombreCategoria, int valorMensualidad){
        ClsCategoria usuario = new ClsCategoria(id_categoria,nombreCategoria, valorMensualidad);
        CategoriaDAO usuDAO = new CategoriaDAO();
        return usuDAO.guardarUsuario(usuario);
    }
    public ClsCategoria SolicitarBuscar(int id){
        CategoriaDAO usuDAO = new CategoriaDAO();
        return usuDAO.buscarUsuario(id);
    }
    public boolean SolicitudModificar(int id_categoria, String nombreCategoria, int valorMensualidad){
        ClsCategoria usuario = new ClsCategoria(id_categoria,nombreCategoria, valorMensualidad);
        CategoriaDAO usuDAO = new CategoriaDAO();
        return usuDAO.modificarUsuario(usuario);
    }
    public boolean solicitudEliminar(int id){
        CategoriaDAO usuDAO = new CategoriaDAO();
        return usuDAO.eliminarUsuario(id);
    }
    public DefaultTableModel solicitudListar(){
        CategoriaDAO usuDAO = new CategoriaDAO();
        return usuDAO.listarUsuario();
    }
}
