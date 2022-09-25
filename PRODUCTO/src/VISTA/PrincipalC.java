/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VISTA;

import java.awt.Color;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author james
 */
public class PrincipalC extends javax.swing.JFrame {

    /**
     * Creates new form PrincipalC
     */
    public PrincipalC() {
        initComponents();
    }

    //Getters y setters
    
    public JLabel getLbCliYProv() {
        return LbCliYProv;
    }

    public void setLbCliYProv(JLabel LbCliYProv) {
        this.LbCliYProv = LbCliYProv;
    }

    public JLabel getLbProdYSer() {
        return LbProdYSer;
    }

    public void setLbProdYSer(JLabel LbProdYSer) {
        this.LbProdYSer = LbProdYSer;
    }

    public JDesktopPane getDtPrincipal() {
        return DtPrincipal;
    }

    public PrincipalC(JLabel lblTransp) {
        this.LbCompElec = lblTransp;
    }

    public void setDtPrincipal(JDesktopPane DtPrincipal) {
        this.DtPrincipal = DtPrincipal;
    }

    public JLabel getLblTransp() {
        return LbCompElec;
    }

    public void setLblTransp(JLabel lblTransp) {
        this.LbCompElec = lblTransp;
    }

    public JLabel getLbCompElec() {
        return LbCompElec;
    }

    public void setLbCompElec(JLabel LbCompElec) {
        this.LbCompElec = LbCompElec;
    }
    
    
    
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JpOpcionPyS = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        JpBarraLateral = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        LbPrincipal = new javax.swing.JLabel();
        LbProdYSer = new javax.swing.JLabel();
        LbGenerarATS = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        LbCompElec = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        LbOComprobantes = new javax.swing.JLabel();
        LbCliYProv = new javax.swing.JLabel();
        LbReportes = new javax.swing.JLabel();
        LbCuentasPC = new javax.swing.JLabel();
        LbCuentasPP = new javax.swing.JLabel();
        LbCompras = new javax.swing.JLabel();
        DtPrincipal = new javax.swing.JDesktopPane();
        jPanel3 = new javax.swing.JPanel();

        JpOpcionPyS.setBackground(new java.awt.Color(14, 22, 40));
        JpOpcionPyS.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(175, 185, 197));
        jLabel4.setText("   >      Ver Todos");
        JpOpcionPyS.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 260, 48));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(175, 185, 197));
        jLabel5.setText("   >      Nuevo");
        JpOpcionPyS.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 48));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(235, 235, 244));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JpBarraLateral.setBackground(new java.awt.Color(33, 49, 91));
        JpBarraLateral.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JpBarraLateralMouseClicked(evt);
            }
        });
        JpBarraLateral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VISTA/ICONOS/edita.png"))); // NOI18N
        jLabel1.setText(" Prueba");
        JpBarraLateral.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 72));

        LbPrincipal.setBackground(new java.awt.Color(33, 49, 91));
        LbPrincipal.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LbPrincipal.setForeground(new java.awt.Color(184, 199, 206));
        LbPrincipal.setText("  Principal");
        LbPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LbPrincipal.setOpaque(true);
        LbPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LbPrincipalMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LbPrincipalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LbPrincipalMouseExited(evt);
            }
        });
        JpBarraLateral.add(LbPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 260, 51));

        LbProdYSer.setBackground(new java.awt.Color(33, 49, 91));
        LbProdYSer.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LbProdYSer.setForeground(new java.awt.Color(184, 199, 206));
        LbProdYSer.setText("  Productos / Servicios        ");
        LbProdYSer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LbProdYSer.setOpaque(true);
        LbProdYSer.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                LbProdYSerAncestorMoved(evt);
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        LbProdYSer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LbProdYSerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LbProdYSerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LbProdYSerMouseExited(evt);
            }
        });
        JpBarraLateral.add(LbProdYSer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 260, 50));

        LbGenerarATS.setBackground(new java.awt.Color(33, 49, 91));
        LbGenerarATS.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LbGenerarATS.setForeground(new java.awt.Color(184, 199, 206));
        LbGenerarATS.setText("  Generar ATS");
        LbGenerarATS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LbGenerarATS.setOpaque(true);
        LbGenerarATS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LbGenerarATSMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LbGenerarATSMouseEntered(evt);
            }
        });
        JpBarraLateral.add(LbGenerarATS, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 260, 45));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText(" ");
        JpBarraLateral.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 259, -1, -1));

        LbCompElec.setBackground(new java.awt.Color(33, 49, 91));
        LbCompElec.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LbCompElec.setForeground(new java.awt.Color(184, 199, 206));
        LbCompElec.setText("  Comprobantes Electronicos");
        LbCompElec.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LbCompElec.setOpaque(true);
        LbCompElec.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LbCompElecMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LbCompElecMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LbCompElecMouseExited(evt);
            }
        });
        JpBarraLateral.add(LbCompElec, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 260, 45));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VISTA/ICONOS/Salir.png"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        JpBarraLateral.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 650, 90, 70));

        LbOComprobantes.setBackground(new java.awt.Color(33, 49, 91));
        LbOComprobantes.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LbOComprobantes.setForeground(new java.awt.Color(184, 199, 206));
        LbOComprobantes.setText("  Otros Comprobantes");
        LbOComprobantes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LbOComprobantes.setOpaque(true);
        LbOComprobantes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LbOComprobantesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LbOComprobantesMouseEntered(evt);
            }
        });
        JpBarraLateral.add(LbOComprobantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 260, 45));

        LbCliYProv.setBackground(new java.awt.Color(33, 49, 91));
        LbCliYProv.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LbCliYProv.setForeground(new java.awt.Color(184, 199, 206));
        LbCliYProv.setText("  Clientes / Proveedores");
        LbCliYProv.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LbCliYProv.setOpaque(true);
        LbCliYProv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LbCliYProvMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LbCliYProvMouseEntered(evt);
            }
        });
        JpBarraLateral.add(LbCliYProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 260, 45));

        LbReportes.setBackground(new java.awt.Color(33, 49, 91));
        LbReportes.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LbReportes.setForeground(new java.awt.Color(184, 199, 206));
        LbReportes.setText("  Reportes");
        LbReportes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LbReportes.setOpaque(true);
        LbReportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LbReportesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LbReportesMouseEntered(evt);
            }
        });
        JpBarraLateral.add(LbReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 260, 45));

        LbCuentasPC.setBackground(new java.awt.Color(33, 49, 91));
        LbCuentasPC.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LbCuentasPC.setForeground(new java.awt.Color(184, 199, 206));
        LbCuentasPC.setText("  Cuentas por Cobrar");
        LbCuentasPC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LbCuentasPC.setOpaque(true);
        LbCuentasPC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LbCuentasPCMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LbCuentasPCMouseEntered(evt);
            }
        });
        JpBarraLateral.add(LbCuentasPC, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 260, 45));

        LbCuentasPP.setBackground(new java.awt.Color(33, 49, 91));
        LbCuentasPP.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LbCuentasPP.setForeground(new java.awt.Color(184, 199, 206));
        LbCuentasPP.setText("  Cuentas por Pagar");
        LbCuentasPP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LbCuentasPP.setOpaque(true);
        LbCuentasPP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LbCuentasPPMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LbCuentasPPMouseEntered(evt);
            }
        });
        JpBarraLateral.add(LbCuentasPP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, 260, 45));

        LbCompras.setBackground(new java.awt.Color(33, 49, 91));
        LbCompras.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LbCompras.setForeground(new java.awt.Color(184, 199, 206));
        LbCompras.setText("  Compras");
        LbCompras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LbCompras.setOpaque(true);
        LbCompras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LbComprasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LbComprasMouseEntered(evt);
            }
        });
        JpBarraLateral.add(LbCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 260, 45));

        jPanel1.add(JpBarraLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 750));

        DtPrincipal.setBackground(new java.awt.Color(240, 240, 255));

        javax.swing.GroupLayout DtPrincipalLayout = new javax.swing.GroupLayout(DtPrincipal);
        DtPrincipal.setLayout(DtPrincipalLayout);
        DtPrincipalLayout.setHorizontalGroup(
            DtPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1120, Short.MAX_VALUE)
        );
        DtPrincipalLayout.setVerticalGroup(
            DtPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 670, Short.MAX_VALUE)
        );

        jPanel1.add(DtPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 1120, 670));

        jPanel3.setBackground(new java.awt.Color(33, 49, 91));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1130, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 1130, 80));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 746, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LbGenerarATSMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LbGenerarATSMouseEntered
        // TODO add your handling code here:
        LbPrincipal.setBackground(new java.awt.Color(33, 49, 91));
        LbProdYSer.setBackground(new java.awt.Color(33, 49, 91));
        LbCliYProv.setBackground(new java.awt.Color(33, 49, 91));
        LbCompElec.setBackground(new java.awt.Color(33, 49, 91));
        LbOComprobantes.setBackground(new java.awt.Color(33, 49, 91));
        LbCompras.setBackground(new java.awt.Color(33, 49, 91));
        LbGenerarATS.setBackground(new java.awt.Color(14, 22, 40));
        LbReportes.setBackground(new java.awt.Color(33, 49, 91));
        LbCuentasPC.setBackground(new java.awt.Color(33, 49, 91));
        LbCuentasPP.setBackground(new java.awt.Color(33, 49, 91)); 
    }//GEN-LAST:event_LbGenerarATSMouseEntered

    private void LbGenerarATSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LbGenerarATSMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_LbGenerarATSMouseClicked

    private void LbCliYProvMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LbCliYProvMouseEntered
        // TODO add your handling code here:ç
        LbPrincipal.setBackground(new java.awt.Color(33, 49, 91));
        LbProdYSer.setBackground(new java.awt.Color(33, 49, 91));
        LbCliYProv.setBackground(new java.awt.Color(14, 22, 40));
        LbCompElec.setBackground(new java.awt.Color(33, 49, 91));
        LbOComprobantes.setBackground(new java.awt.Color(33, 49, 91));
        LbCompras.setBackground(new java.awt.Color(33, 49, 91));
        LbGenerarATS.setBackground(new java.awt.Color(33, 49, 91));
        LbReportes.setBackground(new java.awt.Color(33, 49, 91));
        LbCuentasPC.setBackground(new java.awt.Color(33, 49, 91));
        LbCuentasPP.setBackground(new java.awt.Color(33, 49, 91));  
    }//GEN-LAST:event_LbCliYProvMouseEntered

    private void LbCliYProvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LbCliYProvMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_LbCliYProvMouseClicked

    private void LbProdYSerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LbProdYSerMouseEntered
        // TODO add your handling code here:
        LbPrincipal.setBackground(new java.awt.Color(33, 49, 91));
        LbProdYSer.setBackground(new java.awt.Color(14, 22, 40));
        LbCliYProv.setBackground(new java.awt.Color(33, 49, 91));
        LbCompElec.setBackground(new java.awt.Color(33, 49, 91));
        LbOComprobantes.setBackground(new java.awt.Color(33, 49, 91));
        LbCompras.setBackground(new java.awt.Color(33, 49, 91));
        LbGenerarATS.setBackground(new java.awt.Color(33, 49, 91));
        LbReportes.setBackground(new java.awt.Color(33, 49, 91));
        LbCuentasPC.setBackground(new java.awt.Color(33, 49, 91));
        LbCuentasPP.setBackground(new java.awt.Color(33, 49, 91));
    }//GEN-LAST:event_LbProdYSerMouseEntered

    private void LbProdYSerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LbProdYSerMouseClicked
        // TODO add your handling code here:  
     
    }//GEN-LAST:event_LbProdYSerMouseClicked

    private void LbPrincipalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LbPrincipalMouseEntered
        // TODO add your handling code here:
        LbPrincipal.setBackground(new java.awt.Color(14, 22, 40));
        LbProdYSer.setBackground(new java.awt.Color(33, 49, 91));
        LbCliYProv.setBackground(new java.awt.Color(33, 49, 91));
        LbCompElec.setBackground(new java.awt.Color(33, 49, 91));
        LbOComprobantes.setBackground(new java.awt.Color(33, 49, 91));
        LbCompras.setBackground(new java.awt.Color(33, 49, 91));
        LbGenerarATS.setBackground(new java.awt.Color(33, 49, 91));
        LbReportes.setBackground(new java.awt.Color(33, 49, 91));
        LbCuentasPC.setBackground(new java.awt.Color(33, 49, 91));
        LbCuentasPP.setBackground(new java.awt.Color(33, 49, 91));
    }//GEN-LAST:event_LbPrincipalMouseEntered

    private void LbPrincipalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LbPrincipalMouseClicked
        // TODO add your handling code here:       
    }//GEN-LAST:event_LbPrincipalMouseClicked

    private void LbProdYSerAncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_LbProdYSerAncestorMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_LbProdYSerAncestorMoved

    private void JpBarraLateralMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JpBarraLateralMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_JpBarraLateralMouseClicked

    private void LbCompElecMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LbCompElecMouseEntered
        // TLbProdYSer.setBackground(new java.awt.Color(33, 49, 91));
        LbPrincipal.setBackground(new java.awt.Color(33, 49, 91));
        LbProdYSer.setBackground(new java.awt.Color(33, 49, 91));
        LbCliYProv.setBackground(new java.awt.Color(33, 49, 91));
        LbCompElec.setBackground(new java.awt.Color(14, 22, 40));
        LbOComprobantes.setBackground(new java.awt.Color(33, 49, 91));
        LbCompras.setBackground(new java.awt.Color(33, 49, 91));
        LbGenerarATS.setBackground(new java.awt.Color(33, 49, 91));
        LbReportes.setBackground(new java.awt.Color(33, 49, 91));
        LbCuentasPC.setBackground(new java.awt.Color(33, 49, 91));
        LbCuentasPP.setBackground(new java.awt.Color(33, 49, 91));
    }//GEN-LAST:event_LbCompElecMouseEntered

    private void LbCompElecMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LbCompElecMouseClicked

    }//GEN-LAST:event_LbCompElecMouseClicked

    private void LbCompElecMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LbCompElecMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_LbCompElecMouseExited

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
                int sal = JOptionPane.showConfirmDialog(null, "¿Seguro que desea salir?","Salir",JOptionPane.YES_NO_OPTION);
                if(sal==0){
                    this.dispose();
                }        
        
    }//GEN-LAST:event_jLabel3MouseClicked

    private void LbOComprobantesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LbOComprobantesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_LbOComprobantesMouseClicked

    private void LbOComprobantesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LbOComprobantesMouseEntered
        // TODO add your handling code here:
        LbPrincipal.setBackground(new java.awt.Color(33, 49, 91));
        LbProdYSer.setBackground(new java.awt.Color(33, 49, 91));
        LbCliYProv.setBackground(new java.awt.Color(33, 49, 91));
        LbCompElec.setBackground(new java.awt.Color(33, 49, 91));
        LbOComprobantes.setBackground(new java.awt.Color(14, 22, 40));
        LbCompras.setBackground(new java.awt.Color(33, 49, 91));
        LbGenerarATS.setBackground(new java.awt.Color(33, 49, 91));
        LbReportes.setBackground(new java.awt.Color(33, 49, 91));
        LbCuentasPC.setBackground(new java.awt.Color(33, 49, 91));
        LbCuentasPP.setBackground(new java.awt.Color(33, 49, 91));         
    }//GEN-LAST:event_LbOComprobantesMouseEntered

    private void LbReportesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LbReportesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_LbReportesMouseClicked

    private void LbReportesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LbReportesMouseEntered
        // TODO add your handling code here:
        LbPrincipal.setBackground(new java.awt.Color(33, 49, 91));
        LbProdYSer.setBackground(new java.awt.Color(33, 49, 91));
        LbCliYProv.setBackground(new java.awt.Color(33, 49, 91));
        LbCompElec.setBackground(new java.awt.Color(33, 49, 91));
        LbOComprobantes.setBackground(new java.awt.Color(33, 49, 91));
        LbCompras.setBackground(new java.awt.Color(33, 49, 91));
        LbGenerarATS.setBackground(new java.awt.Color(33, 49, 91));
        LbReportes.setBackground(new java.awt.Color(14, 22, 40));
        LbCuentasPC.setBackground(new java.awt.Color(33, 49, 91));
        LbCuentasPP.setBackground(new java.awt.Color(33, 49, 91));          
    }//GEN-LAST:event_LbReportesMouseEntered

    private void LbCuentasPCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LbCuentasPCMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_LbCuentasPCMouseClicked

    private void LbCuentasPCMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LbCuentasPCMouseEntered
        // TODO add your handling code here:
        LbPrincipal.setBackground(new java.awt.Color(33, 49, 91));
        LbProdYSer.setBackground(new java.awt.Color(33, 49, 91));
        LbCliYProv.setBackground(new java.awt.Color(33, 49, 91));
        LbCompElec.setBackground(new java.awt.Color(33, 49, 91));
        LbOComprobantes.setBackground(new java.awt.Color(33, 49, 91));
        LbCompras.setBackground(new java.awt.Color(33, 49, 91));
        LbGenerarATS.setBackground(new java.awt.Color(33, 49, 91));
        LbReportes.setBackground(new java.awt.Color(33, 49, 91));
        LbCuentasPC.setBackground(new java.awt.Color(14, 22, 40));
        LbCuentasPP.setBackground(new java.awt.Color(33, 49, 91));         
    }//GEN-LAST:event_LbCuentasPCMouseEntered

    private void LbCuentasPPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LbCuentasPPMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_LbCuentasPPMouseClicked

    private void LbCuentasPPMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LbCuentasPPMouseEntered
        // TODO add your handling code here:
        LbPrincipal.setBackground(new java.awt.Color(33, 49, 91));
        LbProdYSer.setBackground(new java.awt.Color(33, 49, 91));
        LbCliYProv.setBackground(new java.awt.Color(33, 49, 91));
        LbCompElec.setBackground(new java.awt.Color(33, 49, 91));
        LbOComprobantes.setBackground(new java.awt.Color(33, 49, 91));
        LbCompras.setBackground(new java.awt.Color(33, 49, 91));
        LbGenerarATS.setBackground(new java.awt.Color(33, 49, 91));
        LbReportes.setBackground(new java.awt.Color(33, 49, 91));
        LbCuentasPC.setBackground(new java.awt.Color(33, 49, 91));
        LbCuentasPP.setBackground(new java.awt.Color(14, 22, 40));    
    }//GEN-LAST:event_LbCuentasPPMouseEntered

    private void LbComprasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LbComprasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_LbComprasMouseClicked

    private void LbComprasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LbComprasMouseEntered
        // TODO add your handling code here:
        LbPrincipal.setBackground(new java.awt.Color(33, 49, 91));
        LbProdYSer.setBackground(new java.awt.Color(33, 49, 91));
        LbCliYProv.setBackground(new java.awt.Color(33, 49, 91));
        LbCompElec.setBackground(new java.awt.Color(33, 49, 91));
        LbOComprobantes.setBackground(new java.awt.Color(33, 49, 91));
        LbCompras.setBackground(new java.awt.Color(14, 22, 40));
        LbGenerarATS.setBackground(new java.awt.Color(33, 49, 91));
        LbReportes.setBackground(new java.awt.Color(33, 49, 91));
        LbCuentasPC.setBackground(new java.awt.Color(33, 49, 91));
        LbCuentasPP.setBackground(new java.awt.Color(33, 49, 91));        
        
    }//GEN-LAST:event_LbComprasMouseEntered

    private void LbPrincipalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LbPrincipalMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_LbPrincipalMouseExited

    private void LbProdYSerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LbProdYSerMouseExited
        // TODO add your handling code here:
        
    }//GEN-LAST:event_LbProdYSerMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane DtPrincipal;
    private javax.swing.JPanel JpBarraLateral;
    private javax.swing.JPanel JpOpcionPyS;
    private javax.swing.JLabel LbCliYProv;
    private javax.swing.JLabel LbCompElec;
    private javax.swing.JLabel LbCompras;
    private javax.swing.JLabel LbCuentasPC;
    private javax.swing.JLabel LbCuentasPP;
    private javax.swing.JLabel LbGenerarATS;
    private javax.swing.JLabel LbOComprobantes;
    private javax.swing.JLabel LbPrincipal;
    private javax.swing.JLabel LbProdYSer;
    private javax.swing.JLabel LbReportes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
