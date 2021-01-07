
package DAO;

import Modelo.ClsCategoria;
import Modelo.ClsConexion;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Amaikase
 */
public class CategoriaDAO extends ClsConexion{
    
    ClsCategoria dao = new ClsCategoria();
    
    public boolean guardarUsuario(ClsCategoria usuDAO){
        String consulta = "insert into categorias(nombre_categoria,valor_mensualidad) "
                + "values"
                + "('" + usuDAO.getNombreCategoria()+ "'," + usuDAO.getValorMensualidad()+ ")";
        //System.out.println(consulta);
        return super.ejecutar(consulta);        
    }
    
    public ClsCategoria buscarUsuario(int id){
        String consulta = "select id_categoria,nombre_categoria, valor_mensualidad from categorias " + "where id_categoria= " + "'" + id + "'" +"";
        //System.out.println(consulta);
        super.ejecutarRetorno(consulta);
        try{
            if(resultadoDB.next()){
                dao.setId_categoria(resultadoDB.getInt("id_categoria"));
                dao.setNombreCategoria(resultadoDB.getString("nombre_categoria"));
                dao.setValorMensualidad(resultadoDB.getInt("valor_mensualidad"));         
            }
        }catch(SQLException ex){
            System.out.println("error al buscar");
        }
        return dao;
    }
    
    public boolean modificarUsuario(ClsCategoria usuDAO){
        String consulta = "update categorias set nombre_categoria='" + usuDAO.getNombreCategoria()
                + "'," + " valor_mensualidad=" + usuDAO.getValorMensualidad()
                + " where id_categoria=" + "'" + usuDAO.getId_categoria()+ "'";
        System.out.println(consulta);
        return super.ejecutar(consulta);
    }
    
    public boolean eliminarUsuario(int id){
        String consulta = "delete from categorias where id_categoria=" + "'" + id + "'";
        System.out.println(consulta);
        return super.ejecutar(consulta);
    }
    
    public DefaultTableModel listarUsuario(){
        DefaultTableModel modelTabla;
        String nombreColumnas[] = {"id_categoria","nombre_categoria", "valor_mensualidad"};
        modelTabla = new DefaultTableModel(new Object[][]{}, nombreColumnas);
        
        String consulta = "select id_categoria, nombre_categoria, valor_mensualidad from categorias";
        //System.out.println(consulta);
        super.ejecutarRetorno(consulta);
        
        try{
            while(resultadoDB.next()){
                modelTabla.addRow(new Object[]{
                    resultadoDB.getInt("id_categoria"),
                    resultadoDB.getString("nombre_categoria"),
                    resultadoDB.getString("valor_mensualidad")});
            }
        }catch(SQLException ex){
            System.out.println("no esta listando");
        }
        return modelTabla;
    }
}
