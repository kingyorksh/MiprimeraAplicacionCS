/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Empleado;

import com.mycompany.miprimeraaplicacioncs.accesobd;
import java.sql.ResultSet;
import java.sql.SQLDataException;
import java.sql.SQLException;

/**
 *
 * @author gm_ai
 */
public class EmpleadoBeans {
    private int id_empleado;
    private String Nombres;
    private String Apellidos;
    private String Direccion;
    private String Telefono;
    private String Cargo;
    private accesobd bd; //creamos un objeto para concetar a la base de datos 
    
    //Constructor de la clase empleadis 

    public EmpleadoBeans() throws Exception { //clausula para corregir un erro 
        bd = new accesobd("localhost", "root", "1234", "facturacion");
        bd.conectaBD();
    }
    
    // <editor-fold defaultstate="collapsed" desc="Metodos GET y SET"> 
 
    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }// </editor-fold> 

    //en este apartado se agregaran los metodos par que funcione empleados 
    //Incrementador de ID 
    public int incremento() throws SQLException {
        int incre = 1;
        ResultSet rs;
        rs = bd.consultaBD("select max(id_empleado) as num from empleado;");

        if (rs.next()) {
            incre = rs.getInt(1) + 1;
        } else {
            incre = 1;
        }

        return incre;
    }
    
    public void insertar_empleado() throws SQLException {

        String cadena = "insert into empleado values ('" + incremento() + "','" + getNombres() + "','" + getApellidos() + "','" + getDireccion() + "','" + getTelefono() + "','" + getCargo() + "')";
        bd.actualizaBD(cadena);

    }
    public void actualizar_empleado() throws SQLException{   //linea de codigo para actializar desde el controlador
        
        String cadena = "update empleado set nombres = '"+getNombres()+"' , apellidos = '"+getApellidos()+"' , direccion = '"+getDireccion()+"' , telefono = '"+getTelefono()+"',cargo = '"+getCargo()+"' where id_empleado = "+getId_empleado()+" ;"; 
        bd.actualizaBD(cadena);
    }
    public void eliminar_empleado() throws SQLDataException {
        String cadena ="  Delete from empleado where id_empleado ="+getId_empleado()+";" ;
        bd.actualizaBD(cadena);
   }
    public ResultSet consultaTabla(String sql) throws SQLException {
        return bd.consultaBD(sql);
    }
    
    public void consultar_empleado() throws SQLException {

        ResultSet rs;
        rs = bd.consultaBD("select * from empleado");
        while (rs.next()) {
            System.out.print(rs.getInt(1) + " ");
            System.out.print(rs.getString(2) + " ");
            System.out.print(rs.getString(3) + " ");
            System.out.print(rs.getString(4) + " ");
            System.out.print(rs.getString(5) + " ");
            System.out.print(rs.getString(6) + " ");
            System.out.println("");
        }
    }
    
}
