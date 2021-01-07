
package DAO;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

import Modelo.ClsConexion;
import Modelo.ClsDetalle;

public class DetalleDAO extends ClsConexion{

    ClsDetalle dao = new ClsDetalle();

    public boolean guardarDetalle(int socio, int clase){
            String consulta = "insert into detalle_socios_clases(id_socio, id_clase) values"+
            " ("+socio+","+clase+")";		
            System.out.println(consulta);
            return super.ejecutar(consulta);
    }

    public boolean modificarDetalle(int clase){
            String consulta = "delete detalle_socios_clases from detalle_socios_clases where id_clase = "+clase;
            System.out.println(consulta);
            return super.ejecutar(consulta);
    }

    public int obtenerIdSocio(String s) {
            String consulta = "select id_socio from socios where nombre_socio = '"+s+"'";
            super.ejecutarRetorno(consulta);
            int[] retorno = null;

            try {
                while(resultadoDB.next()) {				
                        retorno = new int[] {
                            resultadoDB.getInt("id_socio")};
                }

                return retorno[0];

            } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
            }
            return 0;
    }
	
    public DefaultTableModel listarDetalle(int id_clase) {
        DefaultTableModel modelTabla;
        String nombreColumnas[] = {"NOMBRE SOCIOS"};
        modelTabla = new DefaultTableModel(new Object[][] {}, nombreColumnas);
        String consulta = "select socios.nombre_socio from socios join detalle_socios_clases on socios.id_socio = detalle_socios_clases.id_socio where detalle_socios_clases.id_clase = "+id_clase;
        super.ejecutarRetorno(consulta);

        try {
                while(resultadoDB.next()) {
                        modelTabla.addRow(new Object[] {
                                        resultadoDB.getString("socios.nombre_socio")});
                }

        }catch(SQLException ex) {
                System.err.println(ex.getMessage());
                System.out.println("Esto se tosto");
        }
        return modelTabla;
    }

    public ArrayList<String> obtenerListaArray(int id_clase){
	
	ArrayList<String> retorno = new ArrayList<String>();
	String consulta = "select socios.nombre_socio from socios join detalle_socios_clases on socios.id_socio = detalle_socios_clases.id_socio where detalle_socios_clases.id_clase = "+id_clase;
	super.ejecutarRetorno(consulta);
	
	try {
            while(resultadoDB.next()) {
                    retorno.add(resultadoDB.getString("socios.nombre_socio"));				
            }
            }catch(SQLException ex) {
            System.err.println(ex.getMessage());
            System.out.println("Esto se tosto");
	}
	return retorno;
    }
}