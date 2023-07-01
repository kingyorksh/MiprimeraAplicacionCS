/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.miprimeraaplicacioncs;

/**
 *
 * @author gm_ai
 */
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;

public class FrmCliente extends javax.swing.JFrame {

    /**
     * Creates new form FrmCliente
     */
    public FrmCliente() {
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

        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtCliente = new javax.swing.JTable();
        lblid_cliente = new javax.swing.JLabel();
        txtid_cliente = new javax.swing.JTextField();
        btnNuevo = new javax.swing.JButton();
        lbl_cedula = new javax.swing.JLabel();
        txtcedula = new javax.swing.JTextField();
        btnEviar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        lblnombres = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        lblapellidos = new javax.swing.JLabel();
        txtapellidos = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();
        lbldireccion = new javax.swing.JLabel();
        txtdireccion = new javax.swing.JTextField();
        lbltelefono = new javax.swing.JLabel();
        txttelefono = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        btnCargar = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jtCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Cedula", "Nombres", "Apellidos", "Direccion", "Telefono"
            }
        ));
        jtCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtCliente);

        lblid_cliente.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblid_cliente.setText("ID_CLIENTE");

        txtid_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtid_clienteActionPerformed(evt);
            }
        });

        btnNuevo.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        lbl_cedula.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lbl_cedula.setText("CEDULA/RUC");

        btnEviar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnEviar.setText("Guardar");
        btnEviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEviarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        lblnombres.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblnombres.setText("NOMBRES");

        lblapellidos.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblapellidos.setText("APELLIDOS");

        btnActualizar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        lbldireccion.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lbldireccion.setText("DIRECCION");

        lbltelefono.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lbltelefono.setText("TELEFONO");

        btnCargar.setBackground(new java.awt.Color(255, 102, 255));
        btnCargar.setForeground(new java.awt.Color(255, 255, 0));
        btnCargar.setText("CARGAR");
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField12)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 631, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCargar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblnombres, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblapellidos)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lbltelefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbldireccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(lblid_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtapellidos, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                            .addComponent(txtdireccion)
                            .addComponent(txtnombre)
                            .addComponent(txtcedula)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtid_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnEviar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(144, 144, 144))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblid_cliente)
                    .addComponent(txtid_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevo))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_cedula)
                    .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEviar))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblnombres)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblapellidos)
                    .addComponent(txtapellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizar))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbldireccion)
                    .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbltelefono)
                    .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(btnCargar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtid_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtid_clienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtid_clienteActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        this.nuevo();  //funcion para el evente 
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        this.Eliminar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEviarActionPerformed
        // TODO add your handling code here:
        this.enviar();

    }//GEN-LAST:event_btnEviarActionPerformed

    private void jtClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtClienteMouseClicked
        // TODO add your handling code here:
        this.MouseClick();
    }//GEN-LAST:event_jtClienteMouseClicked

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        this.Actualizar();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
        // TODO add your handling code here:
        this.mostrar(jtCliente, "select * from cliente");
    }//GEN-LAST:event_btnCargarActionPerformed

    /**
     * @param args the command line arguments
     */
    private void nuevo() {
        try {
            ClienteBeans cb = new ClienteBeans();
            txtid_cliente.setText("" + cb.incremento());
            txtcedula.setText("");
            txtnombre.setText("");
            txtapellidos.setText("");
            txtdireccion.setText("");
            txttelefono.setText("");
            this.mostrar(jtCliente, "select * from cliente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error :" + e.toString());
        }
    }

    private void Actualizar() {
        try {
            ClienteBeans cb = new ClienteBeans();
            cb.setId_cliente(Integer.parseInt(txtid_cliente.getText()));
            cb.setCedula(txtcedula.getText());
            cb.setNombres(txtnombre.getText());
            cb.setApellido(txtapellidos.getText());
            cb.setDireccion(txtdireccion.getText());
            cb.setTelefono(txttelefono.getText());
            cb.actualizar_cliente();
            this.mostrar(jtCliente, "Select * from cliente");
            JOptionPane.showMessageDialog(null, "La Infomacion se ACTUALIZO correcatamente ");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de transaccion :" + e.toString());
        }
    }

    private void Eliminar() {
        try {
            ClienteBeans cb = new ClienteBeans();
            cb.setId_cliente(Integer.parseInt(txtid_cliente.getText()));
            cb.setCedula(txtcedula.getText());
            cb.setNombres(txtnombre.getText());
            cb.setApellido(txtapellidos.getText());
            cb.setDireccion(txtdireccion.getText());
            cb.setTelefono(txttelefono.getText());
            cb.eliminar_cliente();
            this.mostrar(jtCliente, "Select * from cliente");
            JOptionPane.showMessageDialog(null, "La Infomacion se ELIMINO correcatamente ");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de transaccion :" + e.toString());
        }
    }

    private void enviar() {
        try {
            ClienteBeans cb = new ClienteBeans();
            cb.setId_cliente(Integer.parseInt(txtid_cliente.getText()));
            cb.setCedula(txtcedula.getText());
            cb.setNombres(txtnombre.getText());
            cb.setApellido(txtapellidos.getText());
            cb.setDireccion(txtdireccion.getText());
            cb.setTelefono(txttelefono.getText());
            cb.insertar_cliente();
            this.mostrar(jtCliente, "Select * from cliente");
            JOptionPane.showMessageDialog(null, "La Infomacion se GUARDO correcatamente ");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de transaccion :" + e.toString());
        }
    }
    // Enviamos un objeto Swing

    private void mostrar(javax.swing.JTable JT, String sql) { //
        try {
            ClienteBeans cb = new ClienteBeans();
            ResultSet rs;
            DefaultTableModel modelo = new DefaultTableModel();  //modelo
            JT.setModel(modelo);

            rs = cb.consultaTabla(sql);
            ResultSetMetaData rsMd;  //resul set meta data 
            rsMd = rs.getMetaData();

            int cantcolumnas = rsMd.getColumnCount();

            // llenar la la tabla 
            for (int i = 1; i < cantcolumnas + 1; i++) {
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

    private void MouseClick() {
        int fila = jtCliente.getSelectedRow();

        txtid_cliente.setText(jtCliente.getModel().getValueAt(fila, 0).toString());
        txtcedula.setText(jtCliente.getModel().getValueAt(fila, 1).toString());
        txtnombre.setText(jtCliente.getModel().getValueAt(fila, 2).toString());
        txtapellidos.setText(jtCliente.getModel().getValueAt(fila, 3).toString());
        txtdireccion.setText(jtCliente.getModel().getValueAt(fila, 4).toString());
        txttelefono.setText(jtCliente.getModel().getValueAt(fila, 5).toString());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnCargar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEviar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTable jtCliente;
    private javax.swing.JLabel lbl_cedula;
    private javax.swing.JLabel lblapellidos;
    private javax.swing.JLabel lbldireccion;
    private javax.swing.JLabel lblid_cliente;
    private javax.swing.JLabel lblnombres;
    private javax.swing.JLabel lbltelefono;
    private javax.swing.JTextField txtapellidos;
    private javax.swing.JTextField txtcedula;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtid_cliente;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
}
