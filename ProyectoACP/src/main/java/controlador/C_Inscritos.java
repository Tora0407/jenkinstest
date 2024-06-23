package controlador;

import java.sql.*;
import java.util.*;
import modelo.*;
import util.MySQLConexion;

public class C_Inscritos {
    
     public List <Inscripciones> lisesp(){
        Connection cn = MySQLConexion.getConexion();
        List <Inscripciones> lis = new ArrayList();
        
        try {
            String sql="select i.codigo_inscripcion,num_auto,concat(p.nombre,' ',p.apellido),concat(p2.nombre,' ',p2.apellido),p.codigo,p2.codigo "
                    + "from inscripcion i join participante p on i.piloto=p.codigo join participante p2 on i.copiloto = p2.codigo";
            PreparedStatement st = cn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            
            while (rs.next()){
                Inscripciones i = new Inscripciones();
                i.setCodigo(rs.getInt(1));
                i.setNum_auto(rs.getInt(2));
                i.setPiloto(rs.getString(3));
                i.setCopiloto(rs.getString(4));
                i.setCodp(rs.getString(5));
                i.setCodcop(rs.getString(6));
                lis.add(i);
            }
    
        } catch (Exception ex) {
            ex.printStackTrace();
        }finally{
            try {
                cn.close();
            } catch (Exception e) {
            }
        }
        return lis;
        
    }
     
      public List <Participantes> participantes(){
        Connection cn = MySQLConexion.getConexion();
        List <Participantes> lis = new ArrayList();
        
        try {
            String sql="select codigo,concat(apellido,' ',nombre),licencia from participante order by 2";
            PreparedStatement st = cn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            
            while (rs.next()){
                Participantes p = new Participantes();
                p.setCod(rs.getString(1));
                p.setNombre(rs.getString(2));
                p.setLicencia(rs.getString(3));
                lis.add(p);
            }
    
        } catch (Exception ex) {
            ex.printStackTrace();
        }finally{
            try {
                cn.close();
            } catch (Exception e) {
            }
        }
        return lis;
        
    }
      
      public int verificador(int ver){
        Connection cn = MySQLConexion.getConexion();
        int i=-1;
        
        try {
            String sql="select num_auto from auto where num_auto="+ver;
            PreparedStatement st = cn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            
            if (rs.next()){
                i=0;
            }
            else{
                String sql2="select count(*) from auto";
                PreparedStatement st2 = cn.prepareStatement(sql2);
                ResultSet rs2 = st2.executeQuery();
                if(rs2.next()){
                    int g = rs2.getInt(1);
                    if(g==0) i=0;
                    
                }
            }
    
        } catch (Exception ex) {
            ex.printStackTrace();
        }finally{
            try {
                cn.close();
            } catch (Exception e) {
            }
        }
        return i;
        
    }
       public Auto verauto(int cod){
        Connection cn = MySQLConexion.getConexion();
        Auto a = null;
        
        try {
            String sql="select modelo,nombre from auto a join categoria c on a.categoria = c.codigo where num_auto="+cod;
            PreparedStatement st = cn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            
            if (rs.next()){
                a = new Auto();
                a.setModelo(rs.getString(1));
                a.setCategoria(rs.getString(2));
            }
    
        } catch (Exception ex) {
            ex.printStackTrace();
        }finally{
            try {
                cn.close();
            } catch (Exception e) {
            }
        }
        return a;
        
    }
      
      
      public void agregar(Inscripciones i){
        Connection cn = MySQLConexion.getConexion();
        
        try {
            String sql = "insert into inscripcion (num_auto,piloto,copiloto) values (?,?,?)";
            PreparedStatement st = cn.prepareStatement(sql);
            st.setInt(1,i.getNum_auto());
            st.setString(2, i.getPiloto());
            st.setString(3,i.getCopiloto());
            st.executeUpdate();
                    
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        
    }
     
    
    
}
