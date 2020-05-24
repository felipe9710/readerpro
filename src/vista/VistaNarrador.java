/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import control.ControlNarrador;
import control.ControlPais_Narrador;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import modelo.Pais_Narrador;
import modelo.Narrador;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author usuario
 */
public class VistaNarrador extends javax.swing.JFrame {
   
    LinkedList<Pais_Narrador> listapu;
    LinkedList<Narrador> listaN;
    
    /**
     * Creates new form VistaNarrador
     */
    public VistaNarrador() {
        initComponents();
        listapu = new LinkedList<>();
        listaN = new LinkedList<>();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        apellidoNarrador2 = new javax.swing.JTextField();
        btnAgregarNarrador = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        btnEliminarNarrador = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        btnModificarNarrador = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnLimpiarNarrador = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        nombreNarrador1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nombreNarrador2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        apellidoNarrador1 = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        idn = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        scrollPane1 = new java.awt.ScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnmp = new javax.swing.JButton();

        jLabel5.setText("jLabel5");

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btnAgregarNarrador.setText("Insertar");
        btnAgregarNarrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarNarradorActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Primer Nombre");

        btnEliminarNarrador.setText("Mostrar");
        btnEliminarNarrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarNarradorActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Segundo Nombre");

        btnModificarNarrador.setText("Modificar");
        btnModificarNarrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarNarradorActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("INSERTAR NARRADOR");

        btnLimpiarNarrador.setText("Eliminar");
        btnLimpiarNarrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarNarradorActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Primer Apellido");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Segundo Apellido");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Fecha de Nacimiento");

        jDateChooser1.setDateFormatString("dd/mm/yyyy");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Pais Narrador");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elegir" }));

        idn.setEditable(false);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Id:");

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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        scrollPane1.add(jScrollPane1);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Ir al menu");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("principal");

        btnmp.setText("jButton1");
        btnmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel7))
                .addGap(43, 43, 43))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(idn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(scrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel10))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                                    .addComponent(apellidoNarrador2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(apellidoNarrador1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nombreNarrador2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nombreNarrador1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnmp)
                                .addGap(10, 10, 10))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(btnAgregarNarrador)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminarNarrador)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificarNarrador)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpiarNarrador))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jLabel1)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(idn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(nombreNarrador1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(nombreNarrador2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel7)
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(apellidoNarrador1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(apellidoNarrador2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnmp)
                        .addGap(28, 28, 28)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarNarrador)
                    .addComponent(btnEliminarNarrador)
                    .addComponent(btnModificarNarrador)
                    .addComponent(btnLimpiarNarrador))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(scrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents



    
       
    private void btnAgregarNarradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarNarradorActionPerformed
        ControlNarrador objcE=new ControlNarrador();
        
    String nombre_Narrador1=nombreNarrador1.getText();
    String nombre_Narrado2=nombreNarrador2.getText();
    String apellido_Narrado1=apellidoNarrador1.getText();
    String apellido_Narrado2=apellidoNarrador2.getText();
    String nombrePais = jComboBox1.getSelectedItem().toString();
            int idn = 0;

        for (int j = 0; j < listapu.size(); j++) {
            Pais_Narrador pais = listapu.get(j);
            if (nombrePais.equals(pais.getNombrePaisN())) {
                idn = pais.getId_PaisN();

            }
        }
        
    Date fecha_nacimiento_narrador2 = jDateChooser1.getDate();
    
    long d=fecha_nacimiento_narrador2.getTime();
    
    java.sql.Date fecha_nacimiento_narrador= new java.sql.Date(d);//Se hace esto por que date entrega sabado domigo lunes etc, aqui se acomoda el formato con d al ponerle get time    

    Narrador objNarrador = new Narrador(nombre_Narrador1, nombre_Narrado2, apellido_Narrado1, apellido_Narrado2, fecha_nacimiento_narrador, idn);
        ControlNarrador objcu = new ControlNarrador();
        boolean t = objcu.insertar_Narrador(objNarrador);
    
        if (t == true) {
            JOptionPane.showMessageDialog(this, "Se inserto el narrador");
        } else {
            JOptionPane.showMessageDialog(this, "No se inserto el narrador");
        }
    }//GEN-LAST:event_btnAgregarNarradorActionPerformed

    private void btnLimpiarNarradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarNarradorActionPerformed
                        ControlNarrador objeu = new ControlNarrador();
        String selected = idn.getText();
        boolean t1 = objeu.eliminarNarrador(selected);

        if (t1 == true) {
            JOptionPane.showMessageDialog(this, "Se elimino el narrador");
        } else {
            JOptionPane.showMessageDialog(this, "No se elimino el narrador");
        }
    }//GEN-LAST:event_btnLimpiarNarradorActionPerformed

    private void btnModificarNarradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarNarradorActionPerformed
         String nombre_narrador1 = nombreNarrador1.getText();
         String nombre_narrado2  = nombreNarrador2.getText();
         String apellido_narrado1  = apellidoNarrador1.getText();
         String apellido_narrado2  = apellidoNarrador2.getText();                
         Date fecha_nacimiento_narrador2 = jDateChooser1.getDate();
         //String id_PaisNF = jComboBox1.getSelectedItem().toString();
         
         long f=fecha_nacimiento_narrador2.getTime();
    
         java.sql.Date fecha_nacimiento_narrador= new java.sql.Date(f);
         
        ControlNarrador objmpn = new ControlNarrador();
        String selected = idn.getText();
        
        boolean t1 = objmpn.modificarNarrador( selected,nombre_narrador1,nombre_narrado2,apellido_narrado1,apellido_narrado2,fecha_nacimiento_narrador);

        if (t1 == true) {
            JOptionPane.showMessageDialog(this, "Se modifico el narrador");
        } else {
            JOptionPane.showMessageDialog(this, "No se modifico el narrador");
        }
    }//GEN-LAST:event_btnModificarNarradorActionPerformed

    private void btnEliminarNarradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarNarradorActionPerformed
        ControlNarrador obju = new ControlNarrador();
        int ncolu;
        Object[] fila2;

        listaN = obju.consultarNarrador();
        DefaultTableModel modelo = new DefaultTableModel();
        this.jTable1.setModel(modelo);
        
        modelo.addColumn("id_narrador");
        modelo.addColumn("nombre_narrador1");
        modelo.addColumn("nombre_narrado2");
        modelo.addColumn("apellido_narrado1");
        modelo.addColumn("apellido_narrado2");
        modelo.addColumn("fecha nacimiento narrador");
        modelo.addColumn("id pais narrador");
        ncolu = modelo.getColumnCount();

        for (int i = 0; i < listaN.size(); i++) {

            fila2 = new Object[ncolu];
            fila2[0] = listaN.get(i).getId_narrador();
            fila2[1] = listaN.get(i).getNombre_narrador1();
            fila2[2] = listaN.get(i).getNombre_narrado2();
            fila2[3] = listaN.get(i).getApellido_narrado1();
            fila2[4] = listaN.get(i).getApellido_narrado2();
            fila2[5] = listaN.get(i).getFecha_nacimiento_narrador();
            fila2[6] = listaN.get(i).getId_PaisNF();
            
            modelo.addRow(fila2);
        }
    }//GEN-LAST:event_btnEliminarNarradorActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        ControlPais_Narrador objpu = new ControlPais_Narrador();
        listapu = objpu.consultarpaisnarrador();
        for (int i = 0; i < listapu.size(); i++) {

            Pais_Narrador objetoPaisN = listapu.get(i);
            jComboBox1.addItem(objetoPaisN.getNombrePaisN());
        }
    }//GEN-LAST:event_formWindowOpened

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int selected = jTable1.rowAtPoint(evt.getPoint());
         
        idn.setText(String.valueOf(jTable1.getValueAt(selected, 0)));
        nombreNarrador1.setText(String.valueOf(jTable1.getValueAt(selected, 1)));
        nombreNarrador2.setText(String.valueOf(jTable1.getValueAt(selected, 2)));
        apellidoNarrador1.setText(String.valueOf(jTable1.getValueAt(selected, 3)));
        apellidoNarrador2.setText(String.valueOf(jTable1.getValueAt(selected, 4)));
        //jDateChooser1.setDateFormatString(String.valueOf(jTable1.getValueAt(selected, 5)));
        jComboBox1.setSelectedItem(jTable1.getValueAt(selected, 6));
        
        //obtenemos la fecha de dicha fila
        String fecha = jTable1.getValueAt(selected, 5).toString();
        //creamos el formato en el que deseamos mostrar la fecha
        SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-mm-dd");
        //creamos una variable tipo Date y la ponemos NULL
        Date fechaN = null;
        try {
            //parseamos de String a Date usando el formato
            fechaN = formatoDelTexto.parse(fecha);
            //seteamos o mostramos la fecha en el JDateChooser
            jDateChooser1.setDate(fechaN);
            
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        

    }//GEN-LAST:event_jTable1MouseClicked

    private void btnmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmpActionPerformed
        
        VistaMenu vmp = new VistaMenu();
        this.dispose();
        vmp.setVisible(true);
        
    }//GEN-LAST:event_btnmpActionPerformed

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
            java.util.logging.Logger.getLogger(VistaNarrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaNarrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaNarrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaNarrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaNarrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidoNarrador1;
    private javax.swing.JTextField apellidoNarrador2;
    private javax.swing.JButton btnAgregarNarrador;
    private javax.swing.JButton btnEliminarNarrador;
    private javax.swing.JButton btnLimpiarNarrador;
    private javax.swing.JButton btnModificarNarrador;
    private javax.swing.JButton btnmp;
    private javax.swing.JTextField idn;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nombreNarrador1;
    private javax.swing.JTextField nombreNarrador2;
    private java.awt.ScrollPane scrollPane1;
    // End of variables declaration//GEN-END:variables
}