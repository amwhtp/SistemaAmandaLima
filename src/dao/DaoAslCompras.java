/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import beans.AslCompras;
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
public class DaoAslCompras extends DaoAbstract{
    
    @Override
    public void insert(Object object) {
        AslCompras aslCompras = (AslCompras) object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url = "jdbc:mysql://localhost/db_amanda_lima";
            user = "amanda_lima";
            password = "amanda_lima";
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            String sql = "insert into asl_compras values (?,?,?,?,?,?,?)";
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.setInt(1, aslCompras.getAslIdCompras());
            pst.setString(2, null); //datacompra 
            pst.setString(3, aslCompras.getAslFormaPagamento());
            pst.setInt(4, aslCompras.getAslIdFornecedor());
            pst.setString(5, aslCompras.getAslObservacao());
            pst.setString(6, aslCompras.getAslStatusCompra());
            pst.setDouble(7, aslCompras.getAslValorTotal()); 
            pst.executeUpdate();
        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoAslCompras.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
    Logger.getLogger(DaoAslCompras.class.getName()).log(Level.SEVERE, null, ex);
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
