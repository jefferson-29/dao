
package Controlador;

import Modelo.ClsConexion;
import Modelo.ClsUsuario;
import DAO.UsuarioDAO;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Amaikase
 */
public class CtlUsuario {
    ClsConexion conexion = new ClsConexion();

    public CtlUsuario() {
    }
    
    public boolean SolicitudGuardar(int id, String nombre, String apellido, int telefono, String direccion){
        ClsUsuario usuario = new ClsUsuario(id,nombre, apellido, telefono, direccion);
        UsuarioDAO usuDAO = new UsuarioDAO();
        return usuDAO.guardarUsuario(usuario);
    }
    public ClsUsuario SolicitarBuscar(int id){
        UsuarioDAO usuDAO = new UsuarioDAO();
        return usuDAO.buscarUsuario(id);
    }
    public boolean SolicitudModificar(int id, String nombre, String apellido, int telefono, String direccion){
        ClsUsuario usuario = new ClsUsuario(id, nombre, apellido, telefono, direccion);
        UsuarioDAO usuDAO = new UsuarioDAO();
        return usuDAO.modificarUsuario(usuario);
    }
    public boolean solicitudEliminar(int id){
        UsuarioDAO usuDAO = new UsuarioDAO();
        return usuDAO.eliminarUsuario(id);
    }
    public DefaultTableModel solicitudListar(){
        UsuarioDAO usuDAO = new UsuarioDAO();
        return usuDAO.listarUsuario();
    }
    
    public int obtenerId(String s) {
        UsuarioDAO dao = new UsuarioDAO();
	return dao.obtenerId(s);
    }
}
