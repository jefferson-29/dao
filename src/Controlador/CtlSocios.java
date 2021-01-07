
package Controlador;

import Modelo.ClsConexion;
import Modelo.ClsSocios;
import DAO.SociosDAO;
import DAO.UsuarioDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Amaikase
 */
public class CtlSocios {
    ClsSocios conexion = new ClsSocios();

    public CtlSocios() {
    }
    
    public boolean SolicitudGuardar(int id, String nombreSocio, String apellidoSocio, Date fechaNacimiento, String categoria, int telefono){
        ClsSocios usuario = new ClsSocios(id, nombreSocio, apellidoSocio, fechaNacimiento, categoria, telefono);
        SociosDAO usuDAO = new SociosDAO();
        return usuDAO.guardarUsuario(usuario);
    }
    public ClsSocios SolicitarBuscar(int id, String nombreCategoria){
        SociosDAO usuDAO = new SociosDAO();
        return usuDAO.buscarUsuario(id,nombreCategoria);
    }
    public boolean SolicitudModificar(int id, String nombreSocio, String apellidoSocio, Date fechaNacimiento, String categoria, int telefono){
        ClsSocios usuario = new ClsSocios(id, nombreSocio, apellidoSocio, fechaNacimiento, categoria, telefono);
        SociosDAO usuDAO = new SociosDAO();
        return usuDAO.modificarUsuario(usuario);
    }
    public boolean solicitudEliminar(int id){
        SociosDAO usuDAO = new SociosDAO();
        return usuDAO.eliminarUsuario(id);
    }
    public DefaultTableModel solicitudListar(){
        SociosDAO usuDAO = new SociosDAO();
        return usuDAO.listarUsuario();
    }
    
    public DefaultComboBoxModel comboSocios() {
        SociosDAO usuDAO = new SociosDAO();
        DefaultComboBoxModel categorias;
        categorias = new DefaultComboBoxModel();
        categorias.removeAllElements();
        categorias.addElement("--SELECIONE--");

        try {
            ResultSet resultado = usuDAO.listarSocio();
            while (resultado.next()) {
                categorias.addElement(resultado.getString(2));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return categorias;
    }
    
    public DefaultComboBoxModel comboClaseSocios() {
        String consulta = "SELECT * from socios";
        SociosDAO usuDAO = new SociosDAO();
        DefaultComboBoxModel categorias;
        categorias = new DefaultComboBoxModel();
        categorias.removeAllElements();
        categorias.addElement("--SELECIONE--");

        try {
            ResultSet resultado = usuDAO.listarClaseSocio(consulta);
            while (resultado.next()) {
                categorias.addElement(resultado.getString(2));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return categorias;
    }
}
