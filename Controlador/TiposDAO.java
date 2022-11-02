
package Controlador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import Modelo.*;
import Conexion.MySQLConexion;
import java.sql.CallableStatement;
import java.sql.Date;
import java.text.SimpleDateFormat;
public class TiposDAO {
    
    public String buscarTipoIdentificacion(int cod){
        String Identificacion="0";
        Connection cn = MySQLConexion.getConexion();
        try{
            String sql = "select * from tipo_identificacion where id_identificacion="+cod+" limit 1";
            PreparedStatement st = cn.prepareStatement(sql);
            ResultSet rt = st.executeQuery();
            if(rt.next()){
                Identificacion= rt.getString(2);
            }
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return Identificacion;
    }
    
    public String buscarTipoGenero(int cod){
        String genero="0";
        Connection cn = MySQLConexion.getConexion();
        try{
            String sql = "select * from genero where id_genero="+cod+" limit 1";
            PreparedStatement st = cn.prepareStatement(sql);
            ResultSet rt = st.executeQuery();
            if(rt.next()){
                genero= rt.getString(2);
            }
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return genero;
    }
    
    public String buscarEstado(int cod){
        String estado="0";
        Connection cn = MySQLConexion.getConexion();
        try{
            String sql = "select * from estado_cita where id_estado_cita="+cod+" limit 1";
            PreparedStatement st = cn.prepareStatement(sql);
            ResultSet rt = st.executeQuery();
            if(rt.next()){
                estado= rt.getString(2);
            }
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return estado;
    }
    
}
