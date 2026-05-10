/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans;

import java.util.Date;

/**
 *
 * @author User
 */
public class AslProduto {

    public int getAslIdProduto() {
        return aslIdProduto;
    }

    public void setAslIdProduto(int aslIdProduto) {
        this.aslIdProduto = aslIdProduto;
    }

    public String getAslNome() {
        return aslNome;
    }

    public void setAslNome(String aslNome) {
        this.aslNome = aslNome;
    }

    public String getAslDescricao() {
        return aslDescricao;
    }

    public void setAslDescricao(String aslDescricao) {
        this.aslDescricao = aslDescricao;
    }

    public String getAslTipo() {
        return aslTipo;
    }

    public void setAslTipo(String aslTipo) {
        this.aslTipo = aslTipo;
    }

    public int getAslEstoque() {
        return aslEstoque;
    }

    public void setAslEstoque(int aslEstoque) {
        this.aslEstoque = aslEstoque;
    }

    public Double getAslPreco() {
        return aslPreco;
    }

    public void setAslPreco(Double aslPreco) {
        this.aslPreco = aslPreco;
    }

    public String getAslCor() {
        return aslCor;
    }

    public void setAslCor(String aslCor) {
        this.aslCor = aslCor;
    }

    public String getAslMaterial() {
        return aslMaterial;
    }

    public void setAslMaterial(String aslMaterial) {
        this.aslMaterial = aslMaterial;
    }
    private int aslIdProduto;
    private String aslNome;
    private String aslDescricao;
    private String aslTipo;
    private int aslEstoque;
    private Double aslPreco;
    private String aslCor;
    private String aslMaterial; 
}
