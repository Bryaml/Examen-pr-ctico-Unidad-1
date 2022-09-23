package server;

import utils.MySQLConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DaoCal {
    public boolean savePerson(String name, String firtsname, String secondname, String curp,int age){

        try
                (Connection con = MySQLConnection.getConnection();
                 PreparedStatement pstm =con.prepareStatement("insert into rfc (name,firtsname,secondname,curp,age)values(?,?,?,?,?);")
                )
        {
            pstm.setString(1, name);
            pstm.setString(2, firtsname);
            pstm.setString(3, secondname);
            pstm.setString(4, curp);
            pstm.setInt(5,age);

            return  pstm.executeUpdate()==1;
        }catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }
    public boolean rfc(String name, String firtsname, String secondname, String curp,int age){

        try
                (Connection con = MySQLConnection.getConnection();
                 PreparedStatement pstm =con.prepareStatement("insert into rfc (name,firtsname,secondname,curp,age)values(?,?,?,?,?);")
                )
        {
            pstm.setString(1, name);
            pstm.setString(2, firtsname);
            pstm.setString(3, secondname);
            pstm.setString(4, curp);
            pstm.setInt(5,age);

            return  pstm.executeUpdate()==1;
        }catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }


    public boolean deletePerson(int id) {
        boolean result=false;
        try
                (Connection con =MySQLConnection.getConnection();
                 PreparedStatement pstm =con.prepareStatement("delete from rfc where id=?")
                )
        {
            pstm.setInt(1,id);
            result =pstm.executeUpdate()==1;
        }catch(Exception e){
            e.printStackTrace();
        }
        return result;
    }

    public List<BeanRfc> findAll() {
        List<BeanRfc> courseList = new ArrayList<>();
        try (
                Connection con = MySQLConnection.getConnection();
                Statement stm = ((Connection) con).createStatement();
                ResultSet rs = stm.executeQuery("select *  from rfc")
        ) {
            while (rs.next()){
                BeanRfc unCurso = new BeanRfc();
                unCurso.setId(rs.getInt("id"));
                unCurso.setName(rs.getNString("name"));
                unCurso.setFirtsname(rs.getString("firtsname"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return courseList;
    }
}
