/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import control.BaseDatos;
import control.ControlAudio;
import control.ControlAudiolibro;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Audio;
import modelo.Audiolibro;


/**
 *
 * @author felipe
 */
public class VistaUmenu extends javax.swing.JFrame {
    
    LinkedList<Audiolibro> listAuL;
    LinkedList<Audio> listaAud;

    /**
     * Creates new form VistaUmenu
     */
    public VistaUmenu() {
        initComponents();
        listAuL = new LinkedList<>();
        listaAud = new LinkedList<>();
        txtsettitulo.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        btnbuscart = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        btnguardar = new javax.swing.JButton();
        txtsettitulo = new javax.swing.JTextField();
        btnbuscarC = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtcorreo = new javax.swing.JTextField();
        txtcontraseña = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btncs = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnbuscart.setForeground(new java.awt.Color(0, 0, 255));
        btnbuscart.setText("Buscar título");
        btnbuscart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscartActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        btnguardar.setText("GUARDAR");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        btnbuscarC.setText("Buscar por categoria");
        btnbuscarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarCActionPerformed(evt);
            }
        });

        jButton3.setText("Buscar por Autor");

        jButton4.setText("Buscar por editorial");

        jButton5.setText("Buscar por narrador");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(150, 150, 150)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(128, 128, 128)
                                .addComponent(btnbuscart)
                                .addGap(48, 48, 48)
                                .addComponent(btnbuscarC)
                                .addGap(63, 63, 63)
                                .addComponent(jButton3)))
                        .addGap(72, 72, 72)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnguardar)
                            .addComponent(txtsettitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jButton4)
                        .addGap(162, 162, 162)
                        .addComponent(jButton5)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnbuscart)
                    .addComponent(txtsettitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnbuscarC)
                    .addComponent(jButton3))
                .addGap(27, 27, 27)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnguardar)
                        .addGap(133, 133, 133))))
        );

        jTabbedPane1.addTab("BUSCAR", jPanel1);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Audiolibros ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(131, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel3)
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(145, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("BIBLIOTECA", jPanel2);

        jLabel4.setText("Correo :");

        jLabel5.setText("Contraseña :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel7.setText("ACTUALIZAR DATOS");

        jButton1.setText("ACTUALIZAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(226, 226, 226)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtcontraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(86, 86, 86)
                                .addComponent(jButton1))
                            .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(142, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(93, 93, 93)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtcontraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jButton1)))
                .addContainerGap(170, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("CUENTA", jPanel3);

        btncs.setText("Cerrar Sesión");
        btncs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncsActionPerformed(evt);
            }
        });

        jLabel2.setText("Creado por: Felipe Giraldo, Cjay Zambrano");

        jLabel6.setText("Miguel Rojas y Frank Castillo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btncs)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(30, 30, 30)
                .addComponent(btncs)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncsActionPerformed
        
        VistaLogin vcs = new VistaLogin();
        this.dispose();
        vcs.setVisible(true);
        
    }//GEN-LAST:event_btncsActionPerformed

    private void btnbuscartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscartActionPerformed

        ControlAudiolibro obju = new ControlAudiolibro();
        int ncolu;
        Object[] fila2;
        String titulo=txtNombre.getText();
        if(titulo.equals("")){
            JOptionPane.showMessageDialog(this, "Por favor escribe algo para buscar");
        }

        listAuL = obju.consultarAudioLibroBusqueda(titulo);
        
        DefaultTableModel modelo = new DefaultTableModel();
        this.jTable2.setModel(modelo);
        modelo.addColumn("id_audiolibro");
        modelo.addColumn("titulo");
        modelo.addColumn("fecha_creacion");
        modelo.addColumn("num_paginas");
        modelo.addColumn("duracion_total");
        modelo.addColumn("portada");
        modelo.addColumn("contraportada");
        modelo.addColumn("calificacion");
        modelo.addColumn("sipnosis");
        modelo.addColumn("numCapitulos");
        modelo.addColumn("idioma");
        modelo.addColumn("reproducciones");
        modelo.addColumn("id_narradorAF");
        modelo.addColumn("id_editorialAF");
        modelo.addColumn("id_categoriaAF");
        ncolu = modelo.getColumnCount();

        for (int i = 0; i < listAuL.size(); i++) {

            fila2 = new Object[ncolu];
            fila2[0] = listAuL.get(i).getId_audiolibro();
            fila2[1] = listAuL.get(i).getTitulo();
            fila2[2] = listAuL.get(i).getFecha_creacion();
            fila2[3] = listAuL.get(i).getNum_paginas();
            fila2[4] = listAuL.get(i).getDuracion_total();
            fila2[5] = listAuL.get(i).getPortada();
            fila2[6] = listAuL.get(i).getContraportada();
            fila2[7] = listAuL.get(i).getCalificacion();
            fila2[8] = listAuL.get(i).getSipnosis();
            fila2[9] = listAuL.get(i).getNumCapitulos();
            fila2[10] = listAuL.get(i).getIdioma();
            fila2[11] = listAuL.get(i).getReproducciones();
            fila2[12] = listAuL.get(i).getId_narradorAF();
            fila2[13] = listAuL.get(i).getId_editorialAF();
            fila2[14] = listAuL.get(i).getId_categoriaAF();

            modelo.addRow(fila2);
        }
        
    }//GEN-LAST:event_btnbuscartActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed

        String select = txtsettitulo.getText();
        ControlAudio objcaud = new ControlAudio();
        int ncolu;
        Object[] fila2;
        
        listaAud = objcaud.consultarAudioBusqueda(select);
        DefaultTableModel modelo = new DefaultTableModel();
        this.jTable1.setModel(modelo);
        
        modelo.addColumn("archivo de audio");
        modelo.addColumn("id del audiolibro");
        ncolu = modelo.getColumnCount();
        
        for (int j = 0; j<listaAud.size();j++){
            fila2 = new Object[ncolu];
            fila2[0] = listaAud.get(j).getArchivo_Audio();
            fila2[1] = listaAud.get(j).getId_audiolibroF();
            modelo.addRow(fila2);
            
        }
    }//GEN-LAST:event_btnguardarActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        
        int selected = jTable2.rowAtPoint(evt.getPoint());
        txtsettitulo.setText(String.valueOf(jTable2.getValueAt(selected, 0)));
        
    }//GEN-LAST:event_jTable2MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnbuscarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarCActionPerformed
        
        ControlAudiolibro obju = new ControlAudiolibro();
        int ncolu;
        Object[] fila2;
        String categoria=txtNombre.getText();
        if(categoria.equals("")){
            JOptionPane.showMessageDialog(this, "Por favor escribe algo para buscar");
        }

        listAuL = obju.consultarAudioLibroBusquedaPorcategoria(categoria);
        
        DefaultTableModel modelo = new DefaultTableModel();
        this.jTable2.setModel(modelo);
        modelo.addColumn("id_audiolibro");
        modelo.addColumn("titulo");
        modelo.addColumn("fecha_creacion");
        modelo.addColumn("num_paginas");
        modelo.addColumn("duracion_total");
        modelo.addColumn("portada");
        modelo.addColumn("contraportada");
        modelo.addColumn("calificacion");
        modelo.addColumn("sipnosis");
        modelo.addColumn("numCapitulos");
        modelo.addColumn("idioma");
        modelo.addColumn("reproducciones");
        modelo.addColumn("id_narradorAF");
        modelo.addColumn("id_editorialAF");
        modelo.addColumn("id_categoriaAF");
        ncolu = modelo.getColumnCount();

        for (int i = 0; i < listAuL.size(); i++) {

            fila2 = new Object[ncolu];
            fila2[0] = listAuL.get(i).getId_audiolibro();
            fila2[1] = listAuL.get(i).getTitulo();
            fila2[2] = listAuL.get(i).getFecha_creacion();
            fila2[3] = listAuL.get(i).getNum_paginas();
            fila2[4] = listAuL.get(i).getDuracion_total();
            fila2[5] = listAuL.get(i).getPortada();
            fila2[6] = listAuL.get(i).getContraportada();
            fila2[7] = listAuL.get(i).getCalificacion();
            fila2[8] = listAuL.get(i).getSipnosis();
            fila2[9] = listAuL.get(i).getNumCapitulos();
            fila2[10] = listAuL.get(i).getIdioma();
            fila2[11] = listAuL.get(i).getReproducciones();
            fila2[12] = listAuL.get(i).getId_narradorAF();
            fila2[13] = listAuL.get(i).getId_editorialAF();
            fila2[14] = listAuL.get(i).getId_categoriaAF();

            modelo.addRow(fila2);
        }
        
    }//GEN-LAST:event_btnbuscarCActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaUmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaUmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaUmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaUmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaUmenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuscarC;
    private javax.swing.JButton btnbuscart;
    private javax.swing.JButton btncs;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtcontraseña;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtsettitulo;
    // End of variables declaration//GEN-END:variables
}
