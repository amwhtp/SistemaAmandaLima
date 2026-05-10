/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import beans.AslCliente;
import beans.AslUsuarios;
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
public class DaoAslCliente extends DaoAbstract {

    @Override
    public void insert(Object object) {
        AslCliente aslCliente = (AslCliente) object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url = "jdbc:mysql://localhost/db_amanda_lima";
            user = "amanda_lima";
            password = "amanda_lima";
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            String sql = "insert into asl_usuarios values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.setInt(1, aslCliente.getAslIdCliente());
            pst.setString(2, aslCliente.getAslBairro());
            pst.setString(3, aslCliente.getAslCep());
            pst.setString(4, aslCliente.getAslCidade());
            pst.setString(5, aslCliente.getAslComplemento());
            pst.setString(6, aslCliente.getAslCpf());
            pst.setString(7, aslCliente.getAslEmail());
            pst.setString(8, null); //datacadastro
            pst.setString(9, null); //datanascimento
            pst.setString(10, aslCliente.getAslEstado()); 
            pst.setString(11, aslCliente.getAslGenero()); 
            pst.setString(12, aslCliente.getAslNomeCompleto()); 
            pst.setString(13, aslCliente.getAslNumero()); 
            pst.setString(14, aslCliente.getAslRua()); 
            pst.setString(15, aslCliente.getAslTelefone()); 
            pst.executeUpdate();
            
            } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoAslUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
    Logger.getLogger(DaoAslUsuarios.class.getName()).log(Level.SEVERE, null, ex);
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
