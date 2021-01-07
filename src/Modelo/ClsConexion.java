
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author Amaikase
 */
public class ClsConexion {
    protected String driver = "org.postgresql.Driver";
    protected String connectString = "jdbc:postgresql://localhost:5432/nueva bd";
    protected String user = "postgres";
    protected String password = "123";
    protected Connection conexionDB;
    protected Statement sentenciaSQL;
    protected ResultSet resultadoDB;


public void conectar(){
    
        try{
            Class.forName(driver);
            conexionDB = DriverManager.getConnection(connectString,user,password);
            sentenciaSQL = conexionDB.createStatement();
        }catch(ClassNotFoundException | SQLException e){
            System.out.println(e.getMessage());
        }
}
    public void desconectar(){
        try{
            sentenciaSQL.close();
            conexionDB.close();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
    public boolean ejecutar(String sentecia){
        try{
            conectar();
            sentenciaSQL.executeUpdate(sentecia);
            desconectar();
        }catch(Exception e){
            return false;
        }
        return true;
    }
    public void ejecutarRetorno(String sentencia){
        
        try{
            conectar();
            resultadoDB = sentenciaSQL.executeQuery(sentencia);
            //desconectar();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
    
