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
public class AslVendas {
    private int aslIdVenda;
    private String aslFormaPagamento;
    private String aslStatusVenda;
    private int aslIdCliente;
    private int aslIdVendedor;
    private Date aslDataVenda;
    private Double aslValorTotal;

    /**
     * @return the aslIdVenda
     */
    public int getAslIdVenda() {
        return aslIdVenda;
    }

    /**
     * @param aslIdVenda the aslIdVenda to set
     */
    public void setAslIdVenda(int aslIdVenda) {
        this.aslIdVenda = aslIdVenda;
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
     * @return the aslStatusVenda
     */
    public String getAslStatusVenda() {
        return aslStatusVenda;
    }

    /**
     * @param aslStatusVenda the aslStatusVenda to set
     */
    public void setAslStatusVenda(String aslStatusVenda) {
        this.aslStatusVenda = aslStatusVenda;
    }

    /**
     * @return the aslIdCliente
     */
    public int getAslIdCliente() {
        return aslIdCliente;
    }

    /**
     * @param aslIdCliente the aslIdCliente to set
     */
    public void setAslIdCliente(int aslIdCliente) {
        this.aslIdCliente = aslIdCliente;
    }

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
     * @return the aslDataVenda
     */
    public Date getAslDataVenda() {
        return aslDataVenda;
    }

    /**
     * @param aslDataVenda the aslDataVenda to set
     */
    public void setAslDataVenda(Date aslDataVenda) {
        this.aslDataVenda = aslDataVenda;
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
}
