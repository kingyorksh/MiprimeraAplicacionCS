package com.mycompany.miprimeraaplicacioncs;

import java.sql.*;

/**
 *
 * @author gm_ai
 */
public class ClienteBeans {

    private int id_cliente;
    private String cedula;
    private String nombres;
    private String apellido;
    private String direccion;
    private String telefono;
    private accesobd bd;  //declarar siempre 

    public ClienteBeans() throws Exception {
        bd = new accesobd("localhost", "root", "1234", "facturacion");
        bd.conectaBD();

    }

    //SETTER
    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    //GETTER
    public int getId_cliente() {
        return id_cliente;
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    //METODOS
    public int incremento() throws SQLException {
        int incre = 1;
        ResultSet rs;
        rs = bd.consultaBD("select max(id_cliente) as num from cliente;");

        if (rs.next()) {
            incre = rs.getInt(1) + 1;
        } else {
            incre = 1;
        }

        return incre;
    }

    public void insertar_cliente() throws SQLException {

        String cadena = "insert into cliente values ('" + incremento() + "','" + getCedula() + "','" + getNombres() + "','" + getApellido() + "','" + getDireccion() + "','" + getTelefono() + "')";
        bd.actualizaBD(cadena);

    }

    public void actualizar_cliente() throws SQLException{   //linea de codigo para actializar desde el controlador
        
        String cadena = "update cliente set cedula = '"+ getCedula()+"', nombres = '"+getNombres()+"' , apellidos = '"+getApellido()+"' , direccion = '"+getDireccion()+"' , telefono = '"+getTelefono()+"' where id_cliente = "+getId_cliente()+" ;"; 
        bd.actualizaBD(cadena);
    }

    public void eliminar_cliente() throws SQLDataException {
        String cadena ="  Delete from cliente where id_cliente ="+getId_cliente()+";" ;
        bd.actualizaBD(cadena);
   }

    public ResultSet consultaTabla(String sql) throws SQLException {
        return bd.consultaBD(sql);
    }

    public void consultar_cliente() throws SQLException {

        ResultSet rs;
        rs = bd.consultaBD("select * from cliente");
        while (rs.next()) {
            System.out.print(rs.getInt(1) + " ");
            System.out.print(rs.getString(2) + " ");
            System.out.print(rs.getString(3) + " ");
            System.out.print(rs.getString(4) + " ");
            System.out.print(rs.getString(5) + " ");
            System.out.print(rs.getString(6) + " ");
            //System.out.print(rs.getString(7) + " ");
            System.out.println("");
        }
    }
}
