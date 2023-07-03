/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Factura;

import com.mycompany.miprimeraaplicacioncs.accesobd;
import java.sql.ResultSet;
import java.sql.SQLDataException;
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
    private final accesobd bd;

    public FacturaBeans() throws Exception {
        bd = new accesobd("localhost", "root", "1234", "facturacion");
        bd.conectaBD();
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
        rs = bd.consultaBD("select max(id_factura) as num from factura;");

        if (rs.next()) {
            incre = rs.getInt(1) + 1;
        } else {
            incre = 10;
        }

        return incre;
    }
    
    public void insertar_factura() throws SQLException {

        String cadena = "insert into factura values ('" + incremento() + "','" + getId_cliente() + "','" + getId_empleado()+ "','" 
                + getFecha()+ "','" + getSubtota() + "','" + getIVA() + "','" + getTotal() + "','" + getNumero()+"')";
        bd.actualizaBD(cadena);

    }
    
    public void actualizar_factura() throws SQLException{   //linea de codigo para actializar desde el controlador
        
        String cadena = "update factura set id_factura = '"+getId_factura()+"' , id_cliente = '"+getId_cliente()+"' , id_empleado = '"+getId_empleado()+"' , fecha = '"+getFecha()+"', subtotal = '"
                +getSubtota()+"', iva = '"+getIVA()+"', total= '"+getTotal()+"', numero = '"+getNumero()+"' where id_factura = "+getId_factura()+";"; 
        bd.actualizaBD(cadena);
    }
    
    public void eliminar_factura() throws SQLDataException {
        String cadena ="  Delete from factura where id_factura ="+getId_factura()+";" ;
        bd.actualizaBD(cadena);
   }
    public ResultSet consultaTabla(String sql) throws SQLException {
        return bd.consultaBD(sql);
    }
    
}
