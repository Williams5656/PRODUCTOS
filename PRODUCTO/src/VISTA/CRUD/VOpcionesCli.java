/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VISTA.CRUD;

import javax.swing.JLabel;

/**
 *
 * @author james
 */
public class VOpcionesCli extends javax.swing.JInternalFrame {

    /**
     * Creates new form VOpcionesProd
     */
    public VOpcionesCli() {
        initComponents();
        quitarBarra();
    }

    public void quitarBarra(){
        ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setNorthPane(null);
    }           

    public JLabel getLbFondo() {
        return LbFondo;
    }

    public void setLbFondo(JLabel LbFondo) {
        this.LbFondo = LbFondo;
    }

    public JLabel getLbImportarCli() {
        return LbImportarCli;
    }

    public void setLbImportarCli(JLabel LbImportarCli) {
        this.LbImportarCli = LbImportarCli;
    }

    public JLabel getLbImportarProv() {
        return LbImportarProv;
    }

    public void setLbImportarProv(JLabel LbImportarProv) {
        this.LbImportarProv = LbImportarProv;
    }

    public JLabel getLbMostrarCli() {
        return LbMostrarCli;
    }

    public void setLbMostrarCli(JLabel LbMostrarCli) {
        this.LbMostrarCli = LbMostrarCli;
    }

    public JLabel getLbMostrarProv() {
        return LbMostrarProv;
    }

    public void setLbMostrarProv(JLabel LbMostrarProv) {
        this.LbMostrarProv = LbMostrarProv;
    }

    public JLabel getLbMostrarTrans() {
        return LbMostrarTrans;
    }

    public void setLbMostrarTrans(JLabel LbMostrarTrans) {
        this.LbMostrarTrans = LbMostrarTrans;
    }

    public JLabel getLbNCli() {
        return LbNCli;
    }

    public void setLbNCli(JLabel LbNCli) {
        this.LbNCli = LbNCli;
    }

    public JLabel getLbNProv() {
        return LbNProv;
    }

    public void setLbNProv(JLabel LbNProv) {
        this.LbNProv = LbNProv;
    }

    public JLabel getLbNTrans() {
        return LbNTrans;
    }

    public void setLbNTrans(JLabel LbNTrans) {
        this.LbNTrans = LbNTrans;
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
        LbNProv = new javax.swing.JLabel();
        LbImportarCli = new javax.swing.JLabel();
        LbMostrarTrans = new javax.swing.JLabel();
        LbNCli = new javax.swing.JLabel();
        LbMostrarCli = new javax.swing.JLabel();
        LbMostrarProv = new javax.swing.JLabel();
        LbImportarProv = new javax.swing.JLabel();
        LbNTrans = new javax.swing.JLabel();
        LbFondo = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1120, 670));

        jPanel1.setBackground(new java.awt.Color(225, 235, 245));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LbNProv.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        LbNProv.setForeground(new java.awt.Color(255, 255, 255));
        LbNProv.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LbNProv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VISTA/ICONOS/AddTrans.png"))); // NOI18N
        LbNProv.setText(" Nuevo Proveedor");
        LbNProv.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LbNProv.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        LbNProv.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(LbNProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 210, 190));

        LbImportarCli.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        LbImportarCli.setForeground(new java.awt.Color(255, 255, 255));
        LbImportarCli.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LbImportarCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VISTA/ICONOS/Importar.png"))); // NOI18N
        LbImportarCli.setText("Importar Clientes");
        LbImportarCli.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LbImportarCli.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        LbImportarCli.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(LbImportarCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 290, 230, 190));

        LbMostrarTrans.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        LbMostrarTrans.setForeground(new java.awt.Color(255, 255, 255));
        LbMostrarTrans.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LbMostrarTrans.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VISTA/ICONOS/Read.png"))); // NOI18N
        LbMostrarTrans.setText("Ver Todos");
        LbMostrarTrans.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LbMostrarTrans.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        LbMostrarTrans.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(LbMostrarTrans, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 70, 180, 190));

        LbNCli.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        LbNCli.setForeground(new java.awt.Color(255, 255, 255));
        LbNCli.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LbNCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VISTA/ICONOS/AddCli.png"))); // NOI18N
        LbNCli.setText(" Nuevo Cliente");
        LbNCli.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LbNCli.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        LbNCli.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(LbNCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 200, 190));

        LbMostrarCli.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        LbMostrarCli.setForeground(new java.awt.Color(255, 255, 255));
        LbMostrarCli.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LbMostrarCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VISTA/ICONOS/Read.png"))); // NOI18N
        LbMostrarCli.setText("Ver Todos");
        LbMostrarCli.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LbMostrarCli.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        LbMostrarCli.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(LbMostrarCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 180, 190));

        LbMostrarProv.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        LbMostrarProv.setForeground(new java.awt.Color(255, 255, 255));
        LbMostrarProv.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LbMostrarProv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VISTA/ICONOS/Read.png"))); // NOI18N
        LbMostrarProv.setText("Ver Todos");
        LbMostrarProv.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LbMostrarProv.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        LbMostrarProv.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(LbMostrarProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, 180, 190));

        LbImportarProv.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        LbImportarProv.setForeground(new java.awt.Color(255, 255, 255));
        LbImportarProv.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LbImportarProv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VISTA/ICONOS/Importar.png"))); // NOI18N
        LbImportarProv.setText("Importar Proveedores");
        LbImportarProv.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LbImportarProv.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        LbImportarProv.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(LbImportarProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 290, 250, 190));

        LbNTrans.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        LbNTrans.setForeground(new java.awt.Color(255, 255, 255));
        LbNTrans.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LbNTrans.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VISTA/ICONOS/AddTrans.png"))); // NOI18N
        LbNTrans.setText(" Nuevo Transportista");
        LbNTrans.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LbNTrans.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        LbNTrans.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(LbNTrans, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 70, 250, 190));

        LbFondo.setBackground(new java.awt.Color(255, 255, 255));
        LbFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VISTA/ICONOS/FondoOpciones.jpg"))); // NOI18N
        LbFondo.setText("jLabel1");
        LbFondo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.add(LbFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 660));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LbFondo;
    private javax.swing.JLabel LbImportarCli;
    private javax.swing.JLabel LbImportarProv;
    private javax.swing.JLabel LbMostrarCli;
    private javax.swing.JLabel LbMostrarProv;
    private javax.swing.JLabel LbMostrarTrans;
    private javax.swing.JLabel LbNCli;
    private javax.swing.JLabel LbNProv;
    private javax.swing.JLabel LbNTrans;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
