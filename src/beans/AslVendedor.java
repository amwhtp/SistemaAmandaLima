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
public class AslVendedor {
    private int aslIdVendedor;
    private String aslNomeCompleto;
    private String aslEmail;
    private String aslTelefone;
    private String aslCPf;
    private Date aslDataAdmissao;
    private Double aslComissao;

    /**
     * @return the aslIdVendedor
     */
    public int getAslIdVendedor() {
        return aslIdVendedor;
    }

    /**
     * @param aslIdVendedor the aslIdVendedor to set
     */
    public void setAslIdVendedor(int aslIdVendedor) {
        this.aslIdVendedor = aslIdVendedor;
    }

    /**
     * @return the aslNomeCompleto
     */
    public String getAslNomeCompleto() {
        return aslNomeCompleto;
    }

    /**
     * @param aslNomeCompleto the aslNomeCompleto to set
     */
    public void setAslNomeCompleto(String aslNomeCompleto) {
        this.aslNomeCompleto = aslNomeCompleto;
    }

    /**
     * @return the aslEmail
     */
    public String getAslEmail() {
        return aslEmail;
    }

    /**
     * @param aslEmail the aslEmail to set
     */
    public void setAslEmail(String aslEmail) {
        this.aslEmail = aslEmail;
    }

    /**
     * @return the aslTelefone
     */
    public String getAslTelefone() {
        return aslTelefone;
    }

    /**
     * @param aslTelefone the aslTelefone to set
     */
    public void setAslTelefone(String aslTelefone) {
        this.aslTelefone = aslTelefone;
    }

    /**
     * @return the aslCPf
     */
    public String getAslCPf() {
        return aslCPf;
    }

    /**
     * @param aslCPf the aslCPf to set
     */
    public void setAslCPf(String aslCPf) {
        this.aslCPf = aslCPf;
    }

    /**
     * @return the aslDataAdmissao
     */
    public Date getAslDataAdmissao() {
        return aslDataAdmissao;
    }

    /**
     * @param aslDataAdmissao the aslDataAdmissao to set
     */
    public void setAslDataAdmissao(Date aslDataAdmissao) {
        this.aslDataAdmissao = aslDataAdmissao;
    }

    /**
     * @return the aslComissao
     */
    public Double getAslComissao() {
        return aslComissao;
    }

    /**
     * @param aslComissao the aslComissao to set
     */
    public void setAslComissao(Double aslComissao) {
        this.aslComissao = aslComissao;
    }
}
