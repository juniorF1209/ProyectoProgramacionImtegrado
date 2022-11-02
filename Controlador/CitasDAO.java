
package Controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import Modelo.*;
import Conexion.MySQLConexion;
public class CitasDAO {
    
    public List<CitasDAO> listaCitas(){
        List<CitasDAO> listaCitas = new ArrayList();
        Connection cn = MySQLConexion.getConexion();
        try{
            String sql = "***********";
            PreparedStatement st = cn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                CitasDAO c = new CitasDAO();
                
                listaCitas.add(c);
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return listaCitas;
    }
    
}
