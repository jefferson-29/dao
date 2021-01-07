
package Controlador;

import Modelo.ClsConexion;
import Modelo.ClsClases;
import DAO.ClasesDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Amaikase
 */
public class CtlClase {
    
    ClsClases conexion = new ClsClases();

    public CtlClase() {
    }
    
    public boolean SolicitudGuardar(int idClase, String nombreClase, Time horaInicio, Time horaFin, String instructor){
        ClsClases usuario = new ClsClases(idClase, nombreClase, horaInicio, horaFin, instructor);
        ClasesDAO usuDAO = new ClasesDAO();
        return usuDAO.guardarUsuario(usuario);
    }
    
    public ClsClases SolicitarBuscar(int idClase, String nombreClase)    {
        ClasesDAO usuDAO = new ClasesDAO();
        return usuDAO.buscarUsuario(idClase,nombreClase);
    }
    
    public boolean SolicitudModificar(int idClase, String nombreClase, Time horaInicio, Time horaFin, String instructor){
        ClsClases usuario = new ClsClases(idClase, nombreClase, horaInicio, horaFin, instructor);
        ClasesDAO usuDAO = new ClasesDAO();
        return usuDAO.modificarUsuario(usuario);
    }
    
    public boolean solicitudEliminar(int idClase){
        ClasesDAO usuDAO = new ClasesDAO();
        return usuDAO.eliminarUsuario(idClase);
    }
    
    public DefaultTableModel solicitudListar(){
        ClasesDAO usuDAO = new ClasesDAO();
        return usuDAO.listarUsuario();
    }
    
    public DefaultTableModel solicitudAgregar(String socio){
        ClasesDAO usuDAO = new ClasesDAO();
        return usuDAO.agregarUsuario(socio);
    }
    
    public DefaultComboBoxModel comboClase() {
        ClasesDAO usuDAO = new ClasesDAO();
        DefaultComboBoxModel categorias;
        categorias = new DefaultComboBoxModel();
        categorias.removeAllElements();
        categorias.addElement("--SELECIONE--");

        try {
            ResultSet resultado = usuDAO.listarClase();
            while (resultado.next()) {
                categorias.addElement(resultado.getString(2));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return categorias;
    }
    
    public int obtenerIdUltimaClase() {
        ClasesDAO dao = new ClasesDAO();
        return dao.obtenerIdUltimaClase();
    }
}
