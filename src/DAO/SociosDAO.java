
package DAO;

import Modelo.ClsSocios;
import Modelo.ClsConexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Amaikase
 */
public class SociosDAO extends ClsConexion{
    
    ClsSocios dao = new ClsSocios();
    
    public boolean guardarUsuario(ClsSocios usuDAO){
        String consulta = "insert into socios(nombre_socio, apellido_socio, fecha_nacimiento, id_categoria, telefono_socios) "
                + "values"
                + "('" + usuDAO.getNombreSocio()+ "','" + usuDAO.getApellidoSocio()+ "'," + "'" + usuDAO.getFechaNacimiento()+ "'," + "(select id_categoria from categorias where nombre_categoria = '"+ usuDAO.getCategoria()+ "')" + "," + usuDAO.getTelefono() +")";
        //System.out.println(consulta);
        return super.ejecutar(consulta);        
    }
    
    public ClsSocios buscarUsuario(int id,String nombreCategoria){
        String consulta = "select id_socio,nombre_socio,apellido_socio,fecha_nacimiento,(select nombre_categoria from categorias where nombre_categoria = '" + nombreCategoria +"')" + ",telefono_socios from socios where id_socio= " + id ;
        //System.out.println(consulta);
        super.ejecutarRetorno(consulta);
        try{
            if(resultadoDB.next()){
                dao.setId(resultadoDB.getInt("id_socio"));
                dao.setNombreSocio(resultadoDB.getString("nombre_socio"));
                dao.setApellidoSocio(resultadoDB.getString("apellido_socio"));
                dao.setFechaNacimiento(resultadoDB.getDate("fecha_nacimiento"));
                dao.setCategoria(resultadoDB.getString("nombre_categoria"));
                dao.setTelefono(resultadoDB.getInt("telefono_socios"));
            }
        }catch(SQLException ex){
            System.out.println("error al buscar");
        }
        return dao;
    }
    
    public boolean modificarUsuario(ClsSocios usuDAO){
        String consulta = "update socios set nombre_socio='" + usuDAO.getNombreSocio()
                + "'," + "apellido_socio='" + usuDAO.getApellidoSocio()
                + "'," + "fecha_nacimiento='" + usuDAO.getFechaNacimiento()
                + "'," + "id_categoria=(select id_categoria from categorias where nombre_categoria = '" + usuDAO.getCategoria()
                + "')," + "telefono_socios=" + usuDAO.getTelefono()
                + " " + "where id_socio=" + "'" + usuDAO.getId()+ "'";
        //System.out.println(consulta);
        return super.ejecutar(consulta);
    }
    
    public boolean eliminarUsuario(int id){
        String consulta = "delete from socios where id_socio=" + "'" + id + "'";
        //System.out.println(consulta);
        return super.ejecutar(consulta);
    }
    
    public DefaultTableModel listarUsuario(){
        DefaultTableModel modelTabla;
        String nombreColumnas[] = {"id_socio","nombre_socio", "apellido_socio","fecha_nacimiento", "nombre_categoria", "telefono_socios"};
        modelTabla = new DefaultTableModel(new Object[][]{}, nombreColumnas);
        
        String consulta = "select id_socio,nombre_socio, apellido_socio, fecha_nacimiento,nombre_categoria, telefono_socios from socios join categorias on categorias.id_categoria = socios.id_categoria";
        //System.out.println(consulta);
        super.ejecutarRetorno(consulta);
        
        try{
            while(resultadoDB.next()){
                modelTabla.addRow(new Object[]{
                    resultadoDB.getInt("id_socio"),
                    resultadoDB.getString("nombre_socio"),
                    resultadoDB.getString("apellido_socio"),
                    resultadoDB.getString("fecha_nacimiento"),
                    resultadoDB.getString("nombre_categoria"),
                    resultadoDB.getInt("telefono_socios")});
            }
        }catch(SQLException ex){
            System.out.println("no esta listando");
        }
        return modelTabla;
    }
    
    public ResultSet listarSocio(){
        String consulta = "SELECT * from categorias";
        super.ejecutarRetorno(consulta);
        return resultadoDB;
        
    }
    
    public ResultSet listarClaseSocio(String consulta){
        super.ejecutarRetorno(consulta);
        return resultadoDB;
    }
}
