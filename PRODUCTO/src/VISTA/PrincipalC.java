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
        this.LblTransp = lblTransp;
    }

    public void setDtPrincipal(JDesktopPane DtPrincipal) {
        this.DtPrincipal = DtPrincipal;
    }

    public JLabel getLblTransp() {
        return LblTransp;
    }

    public void setLblTransp(JLabel lblTransp) {
        this.LblTransp = lblTransp;
    }
    
    
    
    
    @SuppressWarnings("unchecked")
   

    

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        LbPrincipal = new javax.swing.JLabel();
        LbProdYSer = new javax.swing.JLabel();
        LbCliYProv = new javax.swing.JLabel();
        LbOtra = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        LblTransp = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        LbOtra1 = new javax.swing.JLabel();
        DtPrincipal = new javax.swing.JDesktopPane();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(235, 235, 244));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(33, 49, 91));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto Mono SemiBold", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VISTA/ICONOS/edita.png"))); // NOI18N
        jLabel1.setText(" Prueba");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 278, 72));

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
        });
        jPanel2.add(LbPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 254, 51));

        LbProdYSer.setBackground(new java.awt.Color(33, 49, 91));
        LbProdYSer.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LbProdYSer.setForeground(new java.awt.Color(184, 199, 206));
        LbProdYSer.setText("  Productos & Servicios");
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
        });
        jPanel2.add(LbProdYSer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 254, 45));

        LbCliYProv.setBackground(new java.awt.Color(33, 49, 91));
        LbCliYProv.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LbCliYProv.setForeground(new java.awt.Color(184, 199, 206));
        LbCliYProv.setText("  Clientes & Proveedores");
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
        jPanel2.add(LbCliYProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 260, 45));

        LbOtra.setBackground(new java.awt.Color(33, 49, 91));
        LbOtra.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LbOtra.setForeground(new java.awt.Color(184, 199, 206));
        LbOtra.setText("  OtraOpcion");
        LbOtra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LbOtra.setOpaque(true);
        LbOtra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LbOtraMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LbOtraMouseEntered(evt);
            }
        });
        jPanel2.add(LbOtra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 260, 45));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText(" ");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 259, -1, -1));

        LblTransp.setBackground(new java.awt.Color(33, 49, 91));
        LblTransp.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LblTransp.setForeground(new java.awt.Color(184, 199, 206));
        LblTransp.setText("  Transportista");
        LblTransp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LblTransp.setOpaque(true);
        LblTransp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LblTranspMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LblTranspMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LblTranspMouseExited(evt);
            }
        });
        jPanel2.add(LblTransp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 260, 45));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VISTA/ICONOS/Salir.png"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 650, 90, 70));

        LbOtra1.setBackground(new java.awt.Color(33, 49, 91));
        LbOtra1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LbOtra1.setForeground(new java.awt.Color(184, 199, 206));
        LbOtra1.setText("  OtraOpcion");
        LbOtra1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LbOtra1.setOpaque(true);
        LbOtra1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LbOtra1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LbOtra1MouseEntered(evt);
            }
        });
        jPanel2.add(LbOtra1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 260, 45));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 750));

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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 720, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LbOtraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LbOtraMouseEntered
        // TODO add your handling code here:
        LbProdYSer.setBackground(new java.awt.Color(33, 49, 91));
        LbPrincipal.setBackground(new java.awt.Color(33, 49, 91));
        LbCliYProv.setBackground(new java.awt.Color(33, 49, 91));
        LblTransp.setBackground(new java.awt.Color(33, 49, 91));
     LbOtra.setBackground(new java.awt.Color(14, 22, 40));
    }//GEN-LAST:event_LbOtraMouseEntered

    private void LbOtraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LbOtraMouseClicked
        // TODO add your handling code here:
        LbProdYSer.setBackground(new java.awt.Color(33, 49, 91));
        LbPrincipal.setBackground(new java.awt.Color(33, 49, 91));
        LbCliYProv.setBackground(new java.awt.Color(33, 49, 91));
        LblTransp.setBackground(new java.awt.Color(33, 49, 91));
     LbOtra.setBackground(new java.awt.Color(14, 22, 40));
    }//GEN-LAST:event_LbOtraMouseClicked

    private void LbCliYProvMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LbCliYProvMouseEntered
        // TODO add your handling code here:ç
        // TODO add your handling code here:
        LbProdYSer.setBackground(new java.awt.Color(33, 49, 91));
        LbPrincipal.setBackground(new java.awt.Color(33, 49, 91));
        LbCliYProv.setBackground(new java.awt.Color(14, 22, 40));
        LblTransp.setBackground(new java.awt.Color(33, 49, 91));
     LbOtra.setBackground(new java.awt.Color(33, 49, 91));
    }//GEN-LAST:event_LbCliYProvMouseEntered

    private void LbCliYProvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LbCliYProvMouseClicked
        // TODO add your handling code here:
        LbProdYSer.setBackground(new java.awt.Color(33, 49, 91));
        LbPrincipal.setBackground(new java.awt.Color(33, 49, 91));
        LbCliYProv.setBackground(new java.awt.Color(14, 22, 40));
        LblTransp.setBackground(new java.awt.Color(33, 49, 91));
     LbOtra.setBackground(new java.awt.Color(33, 49, 91));
    }//GEN-LAST:event_LbCliYProvMouseClicked

    private void LbProdYSerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LbProdYSerMouseEntered
        // TODO add your handling code here:
        LbProdYSer.setBackground(new java.awt.Color(14, 22, 40));
        LbPrincipal.setBackground(new java.awt.Color(33, 49, 91));
        LbCliYProv.setBackground(new java.awt.Color(33, 49, 91));
        LblTransp.setBackground(new java.awt.Color(33, 49, 91));
     LbOtra.setBackground(new java.awt.Color(33, 49, 91));
    }//GEN-LAST:event_LbProdYSerMouseEntered

    private void LbProdYSerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LbProdYSerMouseClicked
        // TODO add your handling code here:
        LbProdYSer.setBackground(new java.awt.Color(14, 22, 40));
        LbPrincipal.setBackground(new java.awt.Color(33, 49, 91));
        LbCliYProv.setBackground(new java.awt.Color(33, 49, 91));
        LblTransp.setBackground(new java.awt.Color(33, 49, 91));
     LbOtra.setBackground(new java.awt.Color(33, 49, 91));
    }//GEN-LAST:event_LbProdYSerMouseClicked

    private void LbPrincipalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LbPrincipalMouseEntered
        // TODO add your handling code here:
        LbProdYSer.setBackground(new java.awt.Color(33, 49, 91));
        LbPrincipal.setBackground(new java.awt.Color(14, 22, 40));
        LbCliYProv.setBackground(new java.awt.Color(33, 49, 91));
        LblTransp.setBackground(new java.awt.Color(33, 49, 91));
     LbOtra.setBackground(new java.awt.Color(33, 49, 91));
    }//GEN-LAST:event_LbPrincipalMouseEntered

    private void LbPrincipalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LbPrincipalMouseClicked
        // TODO add your handling code here:
        LbProdYSer.setBackground(new java.awt.Color(33, 49, 91));
        LbPrincipal.setBackground(new java.awt.Color(14, 22, 40));
        LbCliYProv.setBackground(new java.awt.Color(33, 49, 91));
        LblTransp.setBackground(new java.awt.Color(33, 49, 91));
     LbOtra.setBackground(new java.awt.Color(33, 49, 91));
    }//GEN-LAST:event_LbPrincipalMouseClicked

    private void LbProdYSerAncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_LbProdYSerAncestorMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_LbProdYSerAncestorMoved

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel2MouseClicked

    private void LblTranspMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblTranspMouseEntered
        // TLbProdYSer.setBackground(new java.awt.Color(33, 49, 91));
        LbPrincipal.setBackground(new java.awt.Color(33, 49, 91));
        LbCliYProv.setBackground(new java.awt.Color(33, 49, 91));
        LblTransp.setBackground(new java.awt.Color(14, 22, 40));
     LbOtra.setBackground(new java.awt.Color(33, 49, 91));
    }//GEN-LAST:event_LblTranspMouseEntered

    private void LblTranspMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblTranspMouseClicked
        LbProdYSer.setBackground(new java.awt.Color(33, 49, 91));
        LbPrincipal.setBackground(new java.awt.Color(33, 49, 91));
        LbCliYProv.setBackground(new java.awt.Color(33, 49, 91));
        LblTransp.setBackground(new java.awt.Color(14, 22, 40));
        LbOtra.setBackground(new java.awt.Color(33, 49, 91));
    }//GEN-LAST:event_LblTranspMouseClicked

    private void LblTranspMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblTranspMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_LblTranspMouseExited

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
                int sal = JOptionPane.showConfirmDialog(null, "¿Seguro que desea salir?","Salir",JOptionPane.YES_NO_OPTION);
                if(sal==0){
                    this.dispose();
                }        
        
    }//GEN-LAST:event_jLabel3MouseClicked

    private void LbOtra1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LbOtra1MouseClicked
        // TODO add your handling code here:
        if(LbOtra.getHeight()>0){
            LbOtra.setSize(120, 0);
        }else{
            LbOtra.setSize(120, 20);
        }
    }//GEN-LAST:event_LbOtra1MouseClicked

    private void LbOtra1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LbOtra1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_LbOtra1MouseEntered

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane DtPrincipal;
    private javax.swing.JLabel LbCliYProv;
    private javax.swing.JLabel LbOtra;
    private javax.swing.JLabel LbOtra1;
    private javax.swing.JLabel LbPrincipal;
    private javax.swing.JLabel LbProdYSer;
    private javax.swing.JLabel LblTransp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
