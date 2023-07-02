/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Factura;

import com.mycompany.miprimeraaplicacioncs.accesobd;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author gm_ai
 */
public class FacturaBeans {
    private int id_factura;
    private int id_cliente;
    private int id_empleado;
    private String fecha;
    private double subtota;
    private double IVA;
    private double total;
    private String numero;
    private private final accesobd bd;

    public FacturaBeans() {
        
    }
// <editor-fold defaultstate="collapsed" desc="GETER Y SETER">
    public int getId_factura() {
        return id_factura;
    }

    public void setId_factura(int id_factura) {
        this.id_factura = id_factura;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getSubtota() {
        return subtota;
    }

    public void setSubtota(double subtota) {
        this.subtota = subtota;
    }

    public double getIVA() {
        return IVA;
    }

    public void setIVA(double IVA) {
        this.IVA = IVA;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    } // </editor-fold> 
    
    public int incremento() throws SQLException {
        int incre = 1;
        ResultSet rs;
        rs = bd.consultaBD("select max(id_producto) as num from producto;");

        if (rs.next()) {
            incre = rs.getInt(1) + 1;
        } else {
            incre = 10;
        }

        return incre;
    }
    
    
}
