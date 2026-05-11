/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import beans.AslComprasProduto;
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
public class DaoAslComprasProduto extends DaoAbstract{
    
    @Override
    public void insert(Object object) {
        AslComprasProduto aslComprasProduto = (AslComprasProduto) object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url = "jdbc:mysql://localhost/db_amanda_lima";
            user = "amanda_lima";
            password = "amanda_lima";
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            String sql = "insert into asl_compras_produto values (?,?,?,?,?,?,?)";
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.setInt(1, aslComprasProduto.getAslIdCompraProduto());
            pst.setDouble(2, aslComprasProduto.getAslCustoUnitario()); 
            pst.setInt(3, aslComprasProduto.getAslIdCompra());
            pst.setString(4, aslComprasProduto.getAslLote());
            pst.setInt(5, aslComprasProduto.getAslIdProduto());
            pst.setInt(6, aslComprasProduto.getAslQuantidade());
            pst.setDouble(7, aslComprasProduto.getAslSubtotal()); 
            pst.executeUpdate();
        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoAslComprasProduto.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
    Logger.getLogger(DaoAslComprasProduto.class.getName()).log(Level.SEVERE, null, ex);
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
