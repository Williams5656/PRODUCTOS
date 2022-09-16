/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VISTA.CRUD;

import MODELO.Validaciones;
import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author james
 */
public class VCrearUsuario extends javax.swing.JInternalFrame {

    protected Validaciones validaciones = new Validaciones();
    /**
     * Creates new form VOpcionesProd
     */
    public VCrearUsuario() {
        initComponents();
        quitarBarra();
        Validar();
    }

    
    public void quitarBarra(){
        ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setNorthPane(null);
    }        
    
    
    public void Validar(){
        validaciones.createFilteredField(Txttelefono, 10, Validaciones.MATCH_NUMEROS);
        validaciones.createFilteredField(TxtCorreo, 50, Validaciones.MATCH_EMAILS);
    }    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        TxtUsuario = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        BtnGuardarUsuario = new javax.swing.JButton();
        jSeparator9 = new javax.swing.JSeparator();
        TxtClave = new javax.swing.JTextField();
        Txttelefono = new javax.swing.JTextField();
        TxtCorreo = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();

        setPreferredSize(new java.awt.Dimension(1120, 670));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(33, 49, 91));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 50)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Registrarse");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(102, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel3)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 120));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator7.setForeground(new java.awt.Color(33, 49, 91));
        jPanel3.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 220, 10));

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel5.setText("Usuario:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        TxtUsuario.setBorder(null);
        jPanel3.add(TxtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 220, 30));

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel7.setText("Contraseña:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, 30));

        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel12.setText("Ingrese sus datos:");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        BtnGuardarUsuario.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        BtnGuardarUsuario.setText("Guardar");
        jPanel3.add(BtnGuardarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 410, 90, 40));

        jSeparator9.setForeground(new java.awt.Color(33, 49, 91));
        jPanel3.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 220, 10));

        TxtClave.setBorder(null);
        jPanel3.add(TxtClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 220, 30));

        Txttelefono.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        Txttelefono.setBorder(null);
        jPanel3.add(Txttelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 170, 30));

        TxtCorreo.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        TxtCorreo.setBorder(null);
        jPanel3.add(TxtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 290, 330, 30));

        jLabel15.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel15.setText("Permisos");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jCheckBox1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jCheckBox1.setText("Editar");
        jPanel3.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, -1, -1));

        jCheckBox2.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jCheckBox2.setText("Eliminar");
        jPanel3.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, -1, -1));

        jCheckBox3.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jCheckBox3.setText("Crear");
        jPanel3.add(jCheckBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 1070, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnGuardarUsuario;
    private javax.swing.JTextField TxtClave;
    private javax.swing.JTextField TxtCorreo;
    private javax.swing.JTextField TxtUsuario;
    private javax.swing.JTextField Txttelefono;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator9;
    // End of variables declaration//GEN-END:variables
}
