/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VISTA.CRUD;

/**
 *
 * @author CLIENTE
 */
public class VcrudTransportista extends javax.swing.JInternalFrame {

    /**
     * Creates new form VcrudProveedor
     */
    public VcrudTransportista() {
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

        lblplaca = new javax.swing.JPanel();
        lblsubtitulo = new javax.swing.JLabel();
        lbltipoIdenficacion = new javax.swing.JLabel();
        lblnombres = new javax.swing.JLabel();
        TextNombres = new javax.swing.JTextField();
        lblidenficacion = new javax.swing.JLabel();
        txtidentificacion = new javax.swing.JTextField();
        ComBoxCedula = new javax.swing.JComboBox<>();
        lbltelefono = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        lblciudad = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        lblcelular = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        lblprovincia = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        lbldireccion = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        lblcorreo = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        lblTitulo = new javax.swing.JLabel();
        buttonGuardar = new javax.swing.JButton();

        lblsubtitulo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblsubtitulo.setText("Datos Básicos ");

        lbltipoIdenficacion.setText("Tipo de Identificación");

        lblnombres.setText("Nombres/Razón Social");

        TextNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextNombresActionPerformed(evt);
            }
        });

        lblidenficacion.setText("Identificación ");

        ComBoxCedula.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cédula", "Ruc", "Pasaporte", "Idenficicación Exterior", "Placa" }));
        ComBoxCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComBoxCedulaActionPerformed(evt);
            }
        });

        lbltelefono.setText("Telefono");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        lblciudad.setText("Ciudad");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Azuay", "Bolivar", "Cañar", "Carchi", "Chimborazo", "Cotopaxi", "El Oro", "Esmeraldas", "Exterior", "Galapagos", "Guayas", "Imbabura", "Loja", "Los Ríos", "Manabí ", "Morona Santiago", "Napo", "Orrellana", "Pastaza", "Pichincha", "Santa Elena", "Santo Domingo", "Sin Especificar", "Sucumbios", "Tungurahua", "Zamora Chimchipe" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        lblcelular.setText("Celular");

        lblprovincia.setText("Provincia");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lbldireccion.setText("Direccion");

        lblcorreo.setText("Correo");

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jLabel8.setText("Placa");

        javax.swing.GroupLayout lblplacaLayout = new javax.swing.GroupLayout(lblplaca);
        lblplaca.setLayout(lblplacaLayout);
        lblplacaLayout.setHorizontalGroup(
            lblplacaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblplacaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblsubtitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(lblplacaLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(lblplacaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(lblplacaLayout.createSequentialGroup()
                        .addComponent(lbltipoIdenficacion, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(lblplacaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TextNombres)
                            .addComponent(ComBoxCedula, 0, 295, Short.MAX_VALUE)))
                    .addGroup(lblplacaLayout.createSequentialGroup()
                        .addGroup(lblplacaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(lblplacaLayout.createSequentialGroup()
                                .addComponent(lblnombres)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lblplacaLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(lblplacaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lblplacaLayout.createSequentialGroup()
                                        .addComponent(lbltelefono)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lblplacaLayout.createSequentialGroup()
                                        .addComponent(lblciudad)
                                        .addGap(18, 18, 18)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(18, 18, 18)
                        .addGroup(lblplacaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblprovincia)
                            .addGroup(lblplacaLayout.createSequentialGroup()
                                .addComponent(lblcelular)
                                .addGap(18, 18, 18)
                                .addGroup(lblplacaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addGroup(lblplacaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblidenficacion)
                    .addComponent(lbldireccion)
                    .addComponent(lblcorreo)
                    .addComponent(jLabel8))
                .addGap(40, 40, 40)
                .addGroup(lblplacaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtidentificacion, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                    .addComponent(jTextField3)
                    .addComponent(jTextField4)
                    .addComponent(jTextField5))
                .addGap(44, 44, 44))
        );
        lblplacaLayout.setVerticalGroup(
            lblplacaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblplacaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblsubtitulo)
                .addGroup(lblplacaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lblplacaLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(lblplacaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbltipoIdenficacion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblidenficacion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComBoxCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(lblplacaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblnombres, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbldireccion)
                            .addComponent(txtidentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                    .addGroup(lblplacaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(lblplacaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblcorreo)
                            .addComponent(lblcelular)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbltelefono))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(lblplacaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblciudad)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblprovincia)
                    .addComponent(jLabel8)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(119, 119, 119))
        );

        lblTitulo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblTitulo.setText("Nuevo Transportista");

        buttonGuardar.setText("Guardar Transportista");
        buttonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblplaca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(lblTitulo)
                        .addGap(0, 851, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(buttonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addComponent(lblplaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(134, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonGuardarActionPerformed

    private void TextNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextNombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextNombresActionPerformed

    private void ComBoxCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComBoxCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComBoxCedulaActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComBoxCedula;
    private javax.swing.JTextField TextNombres;
    private javax.swing.JButton buttonGuardar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblcelular;
    private javax.swing.JLabel lblciudad;
    private javax.swing.JLabel lblcorreo;
    private javax.swing.JLabel lbldireccion;
    private javax.swing.JLabel lblidenficacion;
    private javax.swing.JLabel lblnombres;
    private javax.swing.JPanel lblplaca;
    private javax.swing.JLabel lblprovincia;
    private javax.swing.JLabel lblsubtitulo;
    private javax.swing.JLabel lbltelefono;
    private javax.swing.JLabel lbltipoIdenficacion;
    private javax.swing.JTextField txtidentificacion;
    // End of variables declaration//GEN-END:variables
}
