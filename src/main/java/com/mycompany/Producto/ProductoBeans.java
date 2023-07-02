package com.mycompany.Producto;

import com.mycompany.miprimeraaplicacioncs.accesobd;
import java.sql.ResultSet;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.util.Date;





/**
 *
 * @author gm_ai
 */
public class ProductoBeans {

    private int id_producto;
    private String cod_producto;
    private String nombre;
    private String descripcion;
    private double preciocosto;
    private double pvp;
    private int stock_max;
    private int stock_min;
    private Date fecha_elaboracion;
    private Date fecha_vencimiento;
    private final accesobd bd;


    // constructore
    public ProductoBeans() throws Exception {
        bd = new accesobd("localhost", "root", "1234", "facturacion");
        bd.conectaBD();
    }
    // <editor-fold defaultstate="collapsed" desc="Metodos GET y SET"> 
    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getCod_producto() {
        return cod_producto;
    }

    public void setCod_producto(String cod_producto) {
        this.cod_producto = cod_producto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPreciocosto() {
        return preciocosto;
    }

    public void setPreciocosto(double preciocosto) {
        this.preciocosto = preciocosto;
    }

    public double getPvp() {
        return pvp;
    }

    public void setPvp(double pvp) {
        this.pvp = pvp;
    }

    public int getStock_max() {
        return stock_max;
    }

    public void setStock_max(int stock_max) {
        this.stock_max = stock_max;
    }

    public int getStock_min() {
        return stock_min;
    }

    public void setStock_min(int stock_min) {
        this.stock_min = stock_min;
    }

    public Date getFecha_elaboracion() {
        return fecha_elaboracion;
    }

    public void setFecha_elaboracion(Date fecha_elaboracion) {
        this.fecha_elaboracion = fecha_elaboracion;
    }

    public Date getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public void setFecha_vencimiento(Date fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }// </editor-fold> 
    
    public int incremento() throws SQLException {
        int incre = 10;
        ResultSet rs;
        rs = bd.consultaBD("select max(id_producto) as num from producto;");

        if (rs.next()) {
            incre = rs.getInt(1) + 3;
        } else {
            incre = 10;
        }

        return incre;
    }
    
    public void insertar_producto() throws SQLException {

        String cadena = "insert into producto values ('" + incremento() + "','" + getCod_producto() + "','" + getNombre() + "','" + getDescripcion()+ "','" 
                + getPreciocosto()+ "','" + getPvp() + "','" + getStock_max() + "','" + getStock_min() + "','" + getFecha_elaboracion() + "','" + fecha_vencimiento + "')";
        bd.actualizaBD(cadena);

    }
    
     public void actualizar_producto() throws SQLException{   //linea de codigo para actializar desde el controlador
        
        String cadena = "update producto set cod_producto = '"+getCod_producto()+"' , nombre = '"+getNombre()+"' , descripcion = '"+getDescripcion()+"' , preciocosto = '"+getPreciocosto()+"', pvp = '"
                +getPvp()+"', stock_maximo = '"+getStock_max()+"', stock_minimo= '"+getStock_min()+"', fecha_elaboracion = '"+getFecha_elaboracion()+"', fecha_vencimineto = '"+getFecha_vencimiento()+"' where id_producto = "+getId_producto()+" ;"; 
        bd.actualizaBD(cadena);
    }
    public void eliminar_producto() throws SQLDataException {
        String cadena ="  Delete from empleado where id_producto ="+getId_producto()+";" ;
        bd.actualizaBD(cadena);
   }
    public ResultSet consultaTabla(String sql) throws SQLException {
        return bd.consultaBD(sql);
    }
    
    public void consultar_producto() throws SQLException {

        ResultSet rs;
        rs = bd.consultaBD("select * from producto");
        while (rs.next()) {
            System.out.print(rs.getInt(1) + " ");
            System.out.print(rs.getString(2) + " ");
            System.out.print(rs.getString(3) + " ");
            System.out.print(rs.getString(4) + " ");
            System.out.print(rs.getDouble(5) + " ");
            System.out.print(rs.getDouble(6) + " ");
            System.out.print(rs.getInt(7) + " ");
            System.out.print(rs.getInt(8) + " ");
            System.out.print(rs.getDate(9) + " ");
            System.out.print(rs.getDate(10) + " ");
            System.out.println("");
        }
    }
    
}
