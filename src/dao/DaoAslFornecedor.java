/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import beans.AslFornecedor;
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
public class DaoAslFornecedor extends DaoAbstract{
    
    @Override
    public void insert(Object object) {
        AslFornecedor aslFornecedor = (AslFornecedor) object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url = "jdbc:mysql://localhost/db_amanda_lima";
            user = "amanda_lima";
            password = "amanda_lima";
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            String sql = "insert into asl_fornecedor values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.setInt(1, aslFornecedor.getAslIdFornecedor());
            pst.setString(2, aslFornecedor.getAslBairro()); 
            pst.setString(3, aslFornecedor.getAslCep());
            pst.setString(4, aslFornecedor.getAslCidade());
            pst.setString(5, aslFornecedor.getAslCnpj());
            pst.setString(6, aslFornecedor.getAslComplemento());
            pst.setString(7, null); //datacadastro 
            pst.setString(8, aslFornecedor.getAslEmail()); 
            pst.setString(9, aslFornecedor.getAslEstado()); 
            pst.setString(10, aslFornecedor.getAslNumero()); 
            pst.setString(11, aslFornecedor.getAslRazaoSocial()); 
            pst.setString(12, aslFornecedor.getAslRua()); 
            pst.setString(13, aslFornecedor.getAslSite()); 
            pst.setString(14, aslFornecedor.getAslTelefone()); 
            pst.setString(15, aslFornecedor.getAslTipoFornecedor()); 
            pst.executeUpdate();
        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoAslFornecedor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
    Logger.getLogger(DaoAslFornecedor.class.getName()).log(Level.SEVERE, null, ex);
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
