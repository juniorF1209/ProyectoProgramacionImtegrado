
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

public class PacientesDAO {
    
    SimpleDateFormat fecha = new SimpleDateFormat("dd/mm/yyyy");
    
    public String buscarTipo(int cod){
        Tipo_Identificacion tipo= new Tipo_Identificacion();
        String nom="0";
        Connection cn = MySQLConexion.getConexion();
        try{
            String sql = "select * from tipo_identificacion where id_identificacion="+cod+" limit 1";
            PreparedStatement st = cn.prepareStatement(sql);
            ResultSet rt = st.executeQuery();
            if(rt.next()){
                nom= rt.getString(2);
            }
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return nom;
    }
    
    public Paciente newPaciente(){
    
        Paciente p = new Paciente();
        Connection cn = MySQLConexion.getConexion();
        
        try{
        
            String sql = "{CALL SP_*****()}";
            CallableStatement st = cn.prepareCall(sql);
            
            
            ResultSet rs = st.executeQuery();
            
            if(rs.next()){
            
                //p.setCod_fac(rs.getString(1));
            
            }
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
        return p;
        
    }
    
    public List<Paciente> listaPacientes(){
        List<Paciente> lpaciente = new ArrayList();
        Connection cn = MySQLConexion.getConexion();
        try{
            String sql = "select idpaciente, nompaciente, id_identificacion, num_identificacion, fecha_nacimiento, id_genero, domicilio, telefono from paciente";
            PreparedStatement st = cn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                Paciente p = new Paciente();
                p.setIdpaciente(rs.getString(1));
                p.setNompaciente(rs.getString(2));
                p.setId_identificacion(rs.getInt(3));
                p.setNum_documento(rs.getString(4));
                p.setNacimiento(rs.getDate(5));
                p.setId_genero(rs.getInt(6));
                p.setDomicilio(rs.getString(7));
                p.setTelefono(rs.getString(8));
                lpaciente.add(p);
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return lpaciente;
    }
}
