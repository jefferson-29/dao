
package DAO;

import Modelo.ClsClases;
import Modelo.ClsConexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Amaikase
 */
public class ClasesDAO extends ClsConexion{
    
    ClsClases dao = new ClsClases();
    
    public boolean guardarUsuario(ClsClases usuDAO){
        String consulta = "insert into clases(nombre_clase, hora_inicio, hora_fin, id_instructor) "
                + "values"
                + "('" + usuDAO.getNombreClase()+ "','" + usuDAO.getHoraInicio()+ "','"
                + usuDAO.getHoraFin()+ "'," + "(select id_instructor from instructores where nombre_instructor = '"+ usuDAO.getInstructor()+ "')"+ ")";
        System.out.println(consulta);
        return super.ejecutar(consulta);        
    }
    
    public ClsClases buscarUsuario(int idClase, String nombreClase){
        String consulta = "select id_clase, nombre_clase, hora_inicio, hora_fin,(select nombre_instructor from instructores where nombre_instructor = '" + nombreClase +"')" + " from clases " + "where id_clase= " + "'" + idClase + "'" +"";
        //System.out.println(consulta);
        super.ejecutarRetorno(consulta);
        try{
            if(resultadoDB.next()){
                dao.setIdClase(resultadoDB.getInt("id_clase"));
                dao.setNombreClase(resultadoDB.getString("nombre_clase"));
                dao.setHoraInicio(resultadoDB.getTime("hora_inicio"));
                dao.setHoraFin(resultadoDB.getTime("hora_fin"));                
                dao.setInstructor(resultadoDB.getString("nombre_instructor"));                
            }
        }catch(SQLException ex){
            System.out.println("error al buscar");
        }
        return dao;
    }
    
    public boolean modificarUsuario(ClsClases usuDAO){
        String consulta = "update clases set nombre_clase='" + usuDAO.getNombreClase()
                + "'," + "hora_inicio='" + usuDAO.getHoraInicio()
                + "'," + "hora_fin='" + usuDAO.getHoraFin()
                + "'," + "id_instructor=(select id_instructor from instructores where nombre_instructor = '" + usuDAO.getInstructor()
                + "')" + "where id_clase=" + "'" + usuDAO.getIdClase()+ "'";
        //System.out.println(consulta);
        return super.ejecutar(consulta);
    }
    
    public boolean eliminarUsuario(int idClase){
        String consulta = "delete from clases where id_clase=" + "'" + idClase + "'";
        //System.out.println(consulta);
        return super.ejecutar(consulta);
    }
    
    public DefaultTableModel listarUsuario(){
        DefaultTableModel modelTabla;
        String nombreColumnas[] = {"id_clase","nombre_clase", "hora_inicio", "hora_fin", "nombre_instructor"};
        modelTabla = new DefaultTableModel(new Object[][]{}, nombreColumnas);
        
        String consulta = "select id_clase, nombre_clase, hora_inicio, hora_fin, nombre_instructor from clases join instructores on instructores.id_instructor = clases.id_instructor";
        //System.out.println(consulta);
        super.ejecutarRetorno(consulta);
        
        try{
            while(resultadoDB.next()){
                modelTabla.addRow(new Object[]{
                    resultadoDB.getInt("id_clase"),
                    resultadoDB.getString("nombre_clase"),
                    resultadoDB.getString("hora_inicio"),
                    resultadoDB.getString("hora_fin"),
                    resultadoDB.getString("nombre_instructor")});
            }
        }catch(SQLException ex){
            System.out.println("no esta listando");
        }
        return modelTabla;
    }
    
    public ResultSet listarClase(){
        String consulta = "SELECT * from instructores";
        super.ejecutarRetorno(consulta);
        return resultadoDB;
        
    }
    
    public DefaultTableModel agregarUsuario(String socio){
        DefaultTableModel modelTabla;
        String nombreColumnas[] = {"nombre_socio"};
        modelTabla = new DefaultTableModel(new Object[][]{}, nombreColumnas);
        
        String consulta = "select nombre_socio from socios where nombre_socio = '" +socio+ "'";
        //System.out.println(consulta);
        super.ejecutarRetorno(consulta);

        try{
            while(resultadoDB.next()){
                modelTabla.addRow(new Object[]{
                    resultadoDB.getString("nombre_socio")});
            }
        }catch(SQLException ex){
            System.out.println("no esta listando");
        }
        return modelTabla;
    }
    
    public ResultSet buscarId(String socio) {
        String consulta = "SELECT id_socio FROM socios WHERE nombre_socio = '" + socio ;
        super.ejecutarRetorno(consulta);
        return super.resultadoDB;
    }
    
    public int obtenerIdUltimaClase() {
	String consulta = "select id_clase from clases order by id_clase asc";
	super.ejecutarRetorno(consulta);
	int[] retorno = null;
	
	try {
		while(resultadoDB.next()) {
                    retorno = new int[] {
                        resultadoDB.getInt("id_clase")};
		}
		return retorno[0];
	}catch(SQLException e) {
		e.printStackTrace();
	}
	return 0;
}
}
