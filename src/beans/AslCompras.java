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
public class AslCompras {
    private int aslIdCompras;
    private String aslStatusCompra;
    private String aslFormaPagamento;
    private Double aslValorTotal;
    private String aslObservacao;
    private Date aslDataCompra;
    private int aslIdFornecedor;

    /**
     * @return the aslIdCompras
     */
    public int getAslIdCompras() {
        return aslIdCompras;
    }

    /**
     * @param aslIdCompras the aslIdCompras to set
     */
    public void setAslIdCompras(int aslIdCompras) {
        this.aslIdCompras = aslIdCompras;
    }

    /**
     * @return the aslStatusCompra
     */
    public String getAslStatusCompra() {
        return aslStatusCompra;
    }

    /**
     * @param aslStatusCompra the aslStatusCompra to set
     */
    public void setAslStatusCompra(String aslStatusCompra) {
        this.aslStatusCompra = aslStatusCompra;
    }

    /**
     * @return the aslFormaPagamento
     */
    public String getAslFormaPagamento() {
        return aslFormaPagamento;
    }

    /**
     * @param aslFormaPagamento the aslFormaPagamento to set
     */
    public void setAslFormaPagamento(String aslFormaPagamento) {
        this.aslFormaPagamento = aslFormaPagamento;
    }

    /**
     * @return the aslValorTotal
     */
    public Double getAslValorTotal() {
        return aslValorTotal;
    }

    /**
     * @param aslValorTotal the aslValorTotal to set
     */
    public void setAslValorTotal(Double aslValorTotal) {
        this.aslValorTotal = aslValorTotal;
    }

    /**
     * @return the aslObservacao
     */
    public String getAslObservacao() {
        return aslObservacao;
    }

    /**
     * @param aslObservacao the aslObservacao to set
     */
    public void setAslObservacao(String aslObservacao) {
        this.aslObservacao = aslObservacao;
    }

    /**
     * @return the aslDataCompra
     */
    public Date getAslDataCompra() {
        return aslDataCompra;
    }

    /**
     * @param aslDataCompra the aslDataCompra to set
     */
    public void setAslDataCompra(Date aslDataCompra) {
        this.aslDataCompra = aslDataCompra;
    }

    /**
     * @return the aslIdFornecedor
     */
    public int getAslIdFornecedor() {
        return aslIdFornecedor;
    }

    /**
     * @param aslIdFornecedor the aslIdFornecedor to set
     */
    public void setAslIdFornecedor(int aslIdFornecedor) {
        this.aslIdFornecedor = aslIdFornecedor;
    }
}
