
package Controlador;

import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

import DAO.DetalleDAO;
import Modelo.ClsConexion;

public class CtlDetalle {

ClsConexion conexion = new ClsConexion();
	
	public CtlDetalle(){
		
	}
	
    public void SolicitudGuardar(ArrayList<String> socios, int id_clase) {
        for(String s:socios) {
            DetalleDAO dao = new DetalleDAO();
            dao.guardarDetalle(dao.obtenerIdSocio(s), id_clase);
        }
    }

    public void SolicitudModificar(ArrayList<String> socios, int id_clase){
        DetalleDAO dao = new DetalleDAO();
        dao.modificarDetalle(id_clase);
        SolicitudGuardar(socios, id_clase);
    }

    public DefaultTableModel SolicitudListar(int id_clase){
        DetalleDAO dao = new DetalleDAO();
        return dao.listarDetalle(id_clase);
    }

    public ArrayList<String> SolicitudListarArrayList(int id_clase){
        DetalleDAO dao = new DetalleDAO();
        return dao.obtenerListaArray(id_clase);
    }
}
