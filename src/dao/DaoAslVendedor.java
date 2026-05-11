/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import beans.AslVendedor;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author User
 */
public class DaoAslVendedor extends DaoAbstract{
    
    @Override
    public void insert(Object object) {
        AslVendedor aslVendedor = (AslVendedor) object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url = "jdbc:mysql://localhost/db_amanda_lima";
            user = "amanda_lima";
            password = "amanda_lima";
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            String sql = "insert into asl_vendedor values (?,?,?,?,?,?,?)";
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.setInt(1, aslVendedor.getAslIdVendedor());
            pst.setString(2, aslVendedor.getAslCpf());
            pst.setDouble(3, aslVendedor.getAslComissao());
            pst.setString(4, aslVendedor.getAslEmail());
            pst.setString(5, aslVendedor.getAslNomeCompleto());
            pst.setString(6, aslVendedor.getAslTelefone());
            pst.setString(7, null); //dataadmissao 
            pst.executeUpdate();
        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoAslVendedor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
    Logger.getLogger(DaoAslVendedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object list(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object listAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
