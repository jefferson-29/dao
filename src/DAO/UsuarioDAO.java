
package DAO;

import Modelo.ClsUsuario;
import Modelo.ClsConexion;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Amaikase
 */
public class UsuarioDAO extends ClsConexion{
    ClsUsuario dao = new ClsUsuario();
    
    public boolean guardarUsuario(ClsUsuario usuDAO){
        String consulta = "insert into instructores(nombre_instructor,apellido_instructor,telefono_instructor,direccion_instructor) "
                + "values"
                + "('" + usuDAO.getNombre() + "','" + usuDAO.getApellido() + "',"
                + usuDAO.getTelefono()+ ",'" + usuDAO.getDireccion()+ "')";
        //System.out.println(consulta);
        return super.ejecutar(consulta);        
    }
    
    public ClsUsuario buscarUsuario(int id){
        String consulta = "select id_instructor,nombre_instructor,apellido_instructor,telefono_instructor,direccion_instructor from instructores " + "where id_instructor= " + "'" + id + "'" +"";
        //System.out.println(consulta);
        super.ejecutarRetorno(consulta);
        try{
            if(resultadoDB.next()){
                dao.setId(resultadoDB.getInt("id_instructor"));
                dao.setNombre(resultadoDB.getString("nombre_instructor"));
                dao.setApellido(resultadoDB.getString("apellido_instructor"));
                dao.setTelefono(resultadoDB.getInt("telefono_instructor"));                
                dao.setDireccion(resultadoDB.getString("direccion_instructor"));                
            }
        }catch(SQLException ex){
            System.out.println("error al buscar");
        }
        return dao;
    }
    
    public boolean modificarUsuario(ClsUsuario usuDAO){
        String consulta = "update instructores set nombre_instructor='" + usuDAO.getNombre()
                + "'," + "apellido_instructor='" + usuDAO.getApellido()
                + "'," + "telefono_instructor=" + usuDAO.getTelefono()
                + "," + "direccion_instructor='" + usuDAO.getDireccion()
                + "'" + " where id_instructor=" + "'" + usuDAO.getId()+ "'";
        //System.out.println(consulta);
        return super.ejecutar(consulta);
    }
    
    public boolean eliminarUsuario(int id){
        String consulta = "delete from instructores where id_instructor=" + "'" + id + "'";
        System.out.println(consulta);
        return super.ejecutar(consulta);
    }
    
    public DefaultTableModel listarUsuario(){
        DefaultTableModel modelTabla;
        String nombreColumnas[] = {"id_instructor","nombre_instructor", "apellido_instructor", "telefono_instructor", "direccion_instructor"};
        modelTabla = new DefaultTableModel(new Object[][]{}, nombreColumnas);
        
        String consulta = "select id_instructor,nombre_instructor, apellido_instructor, telefono_instructor, direccion_instructor from instructores";
        //System.out.println(consulta);
        super.ejecutarRetorno(consulta);
        
        try{
            while(resultadoDB.next()){
                modelTabla.addRow(new Object[]{
                    resultadoDB.getInt("id_instructor"),
                    resultadoDB.getString("nombre_instructor"),
                    resultadoDB.getString("apellido_instructor"),
                    resultadoDB.getInt("telefono_instructor"),
                    resultadoDB.getString("direccion_instructor")});
            }
        }catch(SQLException ex){
            System.out.println("no esta listando");
        }
        return modelTabla;
    }
    
    public int obtenerId(String s) {
	String consulta = "select id_instructor from instructores where nombre_instructor = '"+s+"'";
	super.ejecutarRetorno(consulta);
	int[] retorno = null;
	
	try {
		while(resultadoDB.next()) {			
			retorno = new int[] {
                            resultadoDB.getInt("id_instructor")};
		}		
	return retorno[0];
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return 0;
    }
}
