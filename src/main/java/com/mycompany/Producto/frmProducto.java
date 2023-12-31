/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.Producto;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import com.toedter.calendar.JCalendar;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author gm_ai
 */
public class FrmProducto extends javax.swing.JFrame {

    /**
     * Creates new form FrmProducto
     */
    public FrmProducto() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btmActualizar = new javax.swing.JButton();
        btnCargar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtidProductos = new javax.swing.JTextField();
        txtCodPorductos = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtPvp = new javax.swing.JTextField();
        txtPrecio_Costo = new javax.swing.JTextField();
        txtS_maximo = new javax.swing.JTextField();
        txtS_minimo = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        JT_PRO = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtJD_F_elaboracion = new com.toedter.calendar.JDateChooser();
        txtJD_F_vencimiento = new com.toedter.calendar.JDateChooser();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("ID_PRODUCTO");

        jLabel2.setText("COD_PRODUCTO");

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btmActualizar.setText("Actualizar");
        btmActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmActualizarActionPerformed(evt);
            }
        });

        btnCargar.setText("CARGAR");
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCargar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btmActualizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20)
                .addComponent(btnGuardar)
                .addGap(18, 18, 18)
                .addComponent(btnEliminar)
                .addGap(18, 18, 18)
                .addComponent(btmActualizar)
                .addGap(81, 81, 81)
                .addComponent(btnCargar)
                .addGap(18, 18, 18))
        );

        jLabel3.setText("NOMBRE");

        jLabel4.setText("DESCRIPCION");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        jScrollPane1.setViewportView(txtDescripcion);

        jLabel5.setText("Precio / Costo");

        jLabel6.setText("PVP");

        jLabel7.setText("Strock Maximo");

        jLabel8.setText("Strock Minimo");

        JT_PRO.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Codigo", "Producto", "Descripcion", "Precio/Costo", "PVP", "Stock Maximo", "Stock Minimo", "Elaborado", "Vencimiento"
            }
        ));
        JT_PRO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JT_PROMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(JT_PRO);

        jLabel9.setText("Fecha Elaboracion");

        jLabel10.setText("Fecha Vencimineto");

        txtJD_F_elaboracion.setDateFormatString("yyyy-MM-dd");
        txtJD_F_elaboracion.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                txtJD_F_elaboracionAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        txtJD_F_vencimiento.setDateFormatString("yyyy-MM-dd");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtidProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodPorductos, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtNombre)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPrecio_Costo)
                            .addComponent(txtS_maximo, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                            .addComponent(txtJD_F_elaboracion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPvp)
                            .addComponent(txtS_minimo)
                            .addComponent(txtJD_F_vencimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane2)
                .addGap(17, 17, 17))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(54, 54, 54))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(txtidProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCodPorductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(txtPvp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrecio_Costo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(txtS_maximo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtS_minimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel9)
                                .addComponent(jLabel10))
                            .addComponent(txtJD_F_elaboracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtJD_F_vencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        this.nuevo();
    }//GEN-LAST:event_btnNuevoActionPerformed
    private void nuevo() {
        try {
            ProductoBeans pb = new ProductoBeans();
            txtidProductos.setText("" + pb.incremento());//resicinimos todo lo que esta en el contenedor de la interfaz
            txtCodPorductos.setText("");
            txtNombre.setText("");
            txtDescripcion.setText("");
            txtPrecio_Costo.setText("");
            txtPvp.setText("");
            txtS_maximo.setText("");
            txtS_minimo.setText("");

            /*
            String fecha;
            SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
            fecha = f.format(txtJD_F_elaboracion.getDate());
            txtJD_F_elaboracion.setDateFormatString(fecha);
            System.out.println("Si carga ");
            String fecha2;
            SimpleDateFormat f2 = new SimpleDateFormat("yyyy-MM-dd");
            fecha2 = f2.format(txtJD_F_vencimiento.getDate());
            txtJD_F_vencimiento.setDateFormatString(fecha2);*/
            this.mostrar(JT_PRO, "select * from producto");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error :" + e.toString());
        }
    }
    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
        this.mostrar(JT_PRO, "select * from producto");
    }//GEN-LAST:event_btnCargarActionPerformed

    private void btmActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmActualizarActionPerformed
        this.actualizar();
    }//GEN-LAST:event_btmActualizarActionPerformed
    JCalendar calendar = new JCalendar();
    double pvp = 0;
    double precio = 0;

    private void actualizar() {
        double pvp = 0;
        double precio = 0;
        try {
            ProductoBeans cb = new ProductoBeans();

            cb.setId_producto(Integer.parseInt(txtidProductos.getText()));
            cb.setCod_producto(txtCodPorductos.getText());
            cb.setNombre(txtNombre.getText());
            cb.setDescripcion(txtDescripcion.getText());

            try {
                precio = Double.parseDouble(txtPrecio_Costo.getText());
                //String numeroFormateado = String.format("%.2f", valor);
                //resultado = Double.parseDouble(numeroFormateado);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Se predujo el error: " + e.getMessage());
            }
            cb.setPreciocosto(precio);
            ; /// codigo para cating de los valore s
            try {
                pvp = Double.parseDouble(txtPvp.getText());
                //String numeroFormateado = String.format("%.2f", valor);
                //resultado = Double.parseDouble(numeroFormateado);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Se predujo el error: " + e.getMessage());
            }
            cb.setPvp(pvp);

            cb.setStock_max(Integer.parseInt(txtS_maximo.getText()));
            cb.setStock_min(Integer.parseInt(txtS_minimo.getText()));

            System.out.println("SI CARGA");

            String fecha2;
            SimpleDateFormat f2 = new SimpleDateFormat("yyyy-MM-dd");
            fecha2 = f2.format(txtJD_F_elaboracion.getDate());
            cb.setFecha_elaboracion(fecha2);
            System.out.println(fecha2);

            System.out.println("SI CARGA 22");
            String fecha;
            fecha = f2.format(txtJD_F_vencimiento.getDate());
            cb.setFecha_vencimiento(fecha);

            cb.actualizar_producto();
            this.mostrar(JT_PRO, "Select * from producto");
            JOptionPane.showMessageDialog(null, "La Infomacion se ACTUALIZO correcatamente ");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de transaccion :" + e.toString());
        }
    }
    private void JT_PROMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JT_PROMouseClicked

        int fila = JT_PRO.getSelectedRow();

        txtidProductos.setText(JT_PRO.getModel().getValueAt(fila, 0).toString());
        txtCodPorductos.setText(JT_PRO.getModel().getValueAt(fila, 1).toString());
        txtNombre.setText(JT_PRO.getModel().getValueAt(fila, 2).toString());
        txtDescripcion.setText(JT_PRO.getModel().getValueAt(fila, 3).toString());
        txtPrecio_Costo.setText(JT_PRO.getModel().getValueAt(fila, 4).toString());
        txtPvp.setText(JT_PRO.getModel().getValueAt(fila, 5).toString());
        txtS_maximo.setText(JT_PRO.getModel().getValueAt(fila, 6).toString());
        txtS_minimo.setText(JT_PRO.getModel().getValueAt(fila, 7).toString());
        //txtJD_F_elaboracion.setDateFormatString(JT_PRO.getModel().getValueAt(fila, 8).toString());
        //txtJD_F_vencimiento.setDateFormatString(JT_PRO.getModel().getValueAt(fila, 9).toString());


    }//GEN-LAST:event_JT_PROMouseClicked

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        this.enviar();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        this.Eliminar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtJD_F_elaboracionAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_txtJD_F_elaboracionAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJD_F_elaboracionAncestorAdded
    private void Eliminar() {
        try {
            ProductoBeans cb = new ProductoBeans();

            cb.setId_producto(Integer.parseInt(txtidProductos.getText()));

            cb.eliminar_producto();
            this.mostrar(JT_PRO, "Select * from producto");
            JOptionPane.showMessageDialog(null, "La Infomacion se ELIMINO correcatamente ");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de transaccion :" + e.toString());
        }
    }

    private void enviar() {
        try {
            ProductoBeans cb = new ProductoBeans();

            cb.setId_producto(Integer.parseInt(txtidProductos.getText()));
            cb.setCod_producto(txtCodPorductos.getText());
            cb.setNombre(txtNombre.getText());
            cb.setDescripcion(txtDescripcion.getText());
            cb.setPreciocosto(Double.parseDouble(txtPrecio_Costo.getText()));
            cb.setPvp(Double.parseDouble(txtPvp.getText()));
            cb.setStock_max(Integer.parseInt(txtS_maximo.getText()));
            cb.setStock_min(Integer.parseInt(txtS_minimo.getText()));
            System.out.println("SI CARGA");

            String fecha2;
            SimpleDateFormat f2 = new SimpleDateFormat("yyyy-MM-dd");
            fecha2 = f2.format(txtJD_F_elaboracion.getDate());
            cb.setFecha_elaboracion(fecha2);
            System.out.println(fecha2);

            System.out.println("SI CARGA 22");
            String fecha;
            fecha = f2.format(txtJD_F_vencimiento.getDate());
            cb.setFecha_vencimiento(fecha);

            //cb.setFecha_vencimiento(txtJD_F_vencimiento.getDateFormatString());
            cb.insertar_producto();
            this.mostrar(JT_PRO, "Select * from producto");
            JOptionPane.showMessageDialog(null, "La Infomacion se GUARDO correcatamente ");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de transaccion :" + e.toString());
        }
    }

    /**
     * @param args the command line arguments
     */
    ///Mostrar los datos de la tabla con esta funcion
    private void mostrar(javax.swing.JTable JT, String sql) { //
        try {
            ProductoBeans pb = new ProductoBeans();
            ResultSet rs;
            DefaultTableModel modelo = new DefaultTableModel();  //modelo
            JT.setModel(modelo);

            rs = pb.consultaTabla(sql);
            ResultSetMetaData rsMd;  //resul set meta data 
            rsMd = rs.getMetaData();

            int cantcolumnas = rsMd.getColumnCount();

            // llenar la tabla 
            for (int i = 1; i < cantcolumnas + 1; i++) { //>>> mas uno por que la tabla no se llena completamente despues 
                modelo.addColumn(rsMd.getColumnLabel(i));

            }
            while (rs.next()) {   //par apoder visualizar valore de la tabla                 
                Object[] columna = new Object[cantcolumnas];   /// Array para cada lifa de la lista 
                for (int i = 0; i < cantcolumnas; i++) {
                    columna[i] = rs.getObject(i + 1);

                }
                modelo.addRow(columna);

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error " + e.toString());
        }

    }
    // Mouse click

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JT_PRO;
    private javax.swing.JButton btmActualizar;
    private javax.swing.JButton btnCargar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtCodPorductos;
    private javax.swing.JTextArea txtDescripcion;
    private com.toedter.calendar.JDateChooser txtJD_F_elaboracion;
    private com.toedter.calendar.JDateChooser txtJD_F_vencimiento;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio_Costo;
    private javax.swing.JTextField txtPvp;
    private javax.swing.JTextField txtS_maximo;
    private javax.swing.JTextField txtS_minimo;
    private javax.swing.JTextField txtidProductos;
    // End of variables declaration//GEN-END:variables
}
