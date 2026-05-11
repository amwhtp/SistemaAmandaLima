/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import beans.AslVendasProdutos;
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
public class DaoAslVendasProdutos extends DaoAbstract{
    
    @Override
    public void insert(Object object) {
        AslVendasProdutos aslVendasProdutos = (AslVendasProdutos) object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url = "jdbc:mysql://localhost/db_amanda_lima";
            user = "amanda_lima";
            password = "amanda_lima";
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            String sql = "insert into asl_vendas_produtos values (?,?,?,?,?,?,?)";
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.setInt(1, aslVendasProdutos.getAslIdVendaProduto());
            pst.setDouble(2, aslVendasProdutos.getAslDesconto());
            pst.setInt(3, aslVendasProdutos.getAslIdVenda());
            pst.setInt(4, aslVendasProdutos.getAslIdProduto());
            pst.setInt(5, aslVendasProdutos.getAslQuantidade());
            pst.setDouble(6, aslVendasProdutos.getAslSubtotal());
            pst.setDouble(7, aslVendasProdutos.getAslValorUnitario()); 
            pst.executeUpdate();
        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoAslVendasProdutos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
    Logger.getLogger(DaoAslVendasProdutos.class.getName()).log(Level.SEVERE, null, ex);
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
