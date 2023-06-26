package com.mycompany.miprimeraaplicacioncs;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author gm_ai
 */
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;


public class accesobd {

    private final String host;
    private final String user;
    private final String passwd;
    private final String bd;
    //******* para abrir o cerrar la coneccion a la BD
    private static Connection conexion = null;

    public accesobd(String host, String user, String passwd, String bd) {
        this.host = host;
        this.user = user;
        this.passwd = passwd;
        this.bd = bd;
    }

    public String getBd() {
        return bd;
    }

    public String getHost() {
        return host;
    }

    public String getPasswd() {
        return passwd;
    }

    public String getUser() {
        return user;
    }

    public void conectaBD() throws Exception {
        try {

            Class.forName("com.mysql.jdbc.Driver"); //ruta de mi dependencia 

            String cadena = "jdbc:mysql://" + getHost() + ":3306" + "/" + getBd();   //dicerccion nde la vbase de datos 
            conexion = DriverManager.getConnection(cadena, getUser(), getPasswd()); // asigancion a la variable tipo conetion
            System.out.println("Conexion exitosa a la BD");

        } catch (SQLException e) {
            System.out.println("Error de Conexion a la BD");
        }

    }

    public void actualizaBD(String sql) throws SQLDataException {
        try {
            Statement stm = conexion.createStatement();
            stm.executeUpdate(sql);
            System.out.println( "TRANSACCION EXITOSA");

        } catch (SQLException e) {
            System.out.println("ERROR DE TRANSACCION ~ " + e.toString()); //para ver el error
        }

    }

    public ResultSet consultaBD(String sql) throws SQLException {
        ResultSet cursor;
        Statement stm = conexion.createStatement();
        cursor= stm.executeQuery(sql);
        
        return cursor;
    }

    public void cerrarBD() throws SQLException {
        conexion.close();
        System.out.println("Cerrado");
    }

}
