
package VISTA;

import CONTROLADOR.ControlPrincipal;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author james
 */
public class VLogin extends javax.swing.JFrame {

    public VLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txt_cedula = new javax.swing.JTextField();
        lbl_password = new javax.swing.JLabel();
        txt_password = new javax.swing.JPasswordField();
        LbNombreEmpresa = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        LbEntrar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 255));
        setLocationByPlatform(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_cedula.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N
        txt_cedula.setForeground(new java.awt.Color(204, 204, 204));
        txt_cedula.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_cedula.setText("Ingrese el usuario");
        txt_cedula.setBorder(null);
        txt_cedula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_cedulaMousePressed(evt);
            }
        });
        txt_cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cedulaActionPerformed(evt);
            }
        });
        txt_cedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_cedulaKeyPressed(evt);
            }
        });
        jPanel1.add(txt_cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 300, 40));

        lbl_password.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_password.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VISTA/ICONOS/IconoLClave.png"))); // NOI18N
        lbl_password.setPreferredSize(new java.awt.Dimension(40, 40));
        lbl_password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl_passwordMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lbl_passwordMouseReleased(evt);
            }
        });
        jPanel1.add(lbl_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, -1, -1));

        txt_password.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 14)); // NOI18N
        txt_password.setForeground(new java.awt.Color(204, 204, 204));
        txt_password.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_password.setText("********");
        txt_password.setBorder(null);
        txt_password.setMinimumSize(new java.awt.Dimension(15, 24));
        txt_password.setPreferredSize(new java.awt.Dimension(15, 24));
        txt_password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_passwordMousePressed(evt);
            }
        });
        txt_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_passwordActionPerformed(evt);
            }
        });
        jPanel1.add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 300, 40));

        LbNombreEmpresa.setFont(new java.awt.Font("Roboto Mono Medium", 1, 24)); // NOI18N
        LbNombreEmpresa.setForeground(new java.awt.Color(255, 255, 255));
        LbNombreEmpresa.setText("Nombre Empresa");
        jPanel1.add(LbNombreEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 420, 230, -1));

        jLabel1.setFont(new java.awt.Font("Roboto Mono Medium", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VISTA/ICONOS/FondoLogin.png"))); // NOI18N
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(491, 0, 340, 490));

        jLabel4.setFont(new java.awt.Font("Roboto Mono Medium", 1, 14)); // NOI18N
        jLabel4.setText("Contraseña");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto Mono Medium", 1, 14)); // NOI18N
        jLabel5.setText("Usuario");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 300, 10));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 300, 10));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(5, 5, 5));
        jLabel2.setText("INICIAR SESIÓN");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VISTA/ICONOS/edita.png"))); // NOI18N
        jLabel3.setText(" LOGO");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 210, 50));

        jPanel2.setBackground(new java.awt.Color(33, 87, 145));

        LbEntrar.setBackground(new java.awt.Color(33, 87, 145));
        LbEntrar.setFont(new java.awt.Font("Roboto Mono Medium", 1, 18)); // NOI18N
        LbEntrar.setForeground(new java.awt.Color(255, 255, 255));
        LbEntrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LbEntrar.setText("ENTRAR");
        LbEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LbEntrar.setOpaque(true);
        LbEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LbEntrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LbEntrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LbEntrarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(LbEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(LbEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 130, 40));

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_passwordActionPerformed

    private void txt_cedulaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_cedulaMousePressed
        // TODO add your handling code here:
        if(txt_cedula.getText().equalsIgnoreCase("Ingrese el usuario")){
                 txt_cedula.setText("");
                 txt_cedula.setForeground(Color.BLACK);   
        }
        
        if(String.valueOf(txt_password.getPassword()).isEmpty()){
                txt_password.setText("********");
                txt_password.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_txt_cedulaMousePressed

    private void txt_passwordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_passwordMousePressed
        // TODO add your handling code here:
        if(String.valueOf(txt_password.getPassword()).equals("********")){
                 txt_password.setText("");
                 txt_password.setForeground(Color.BLACK);   
        }
        
        if(txt_cedula.getText().isEmpty()){
                txt_cedula.setText("Ingrese el usuario");
                txt_cedula.setForeground(Color.GRAY);
        }        
    }//GEN-LAST:event_txt_passwordMousePressed

    private void LbEntrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LbEntrarMouseEntered
        // TODO add your handling code here:
        LbEntrar.setBackground(new Color(50,110,170));
    }//GEN-LAST:event_LbEntrarMouseEntered

    private void LbEntrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LbEntrarMouseExited
        // TODO add your handling code here:
        LbEntrar.setBackground(new Color(33,87,145));
    }//GEN-LAST:event_LbEntrarMouseExited

    private void lbl_passwordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_passwordMousePressed
        // TODO add your handling code here:
        txt_password.setFont(new java.awt.Font("Roboto Mono", 0, 14));
        getTxt_password().setEchoChar((char) 0);
       
    }//GEN-LAST:event_lbl_passwordMousePressed

    private void lbl_passwordMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_passwordMouseReleased
        // TODO add your handling code here:
        txt_password.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 14));
        getTxt_password().setEchoChar((char) '\u2022');
    }//GEN-LAST:event_lbl_passwordMouseReleased

    private void txt_cedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cedulaActionPerformed

    private void LbEntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LbEntrarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_LbEntrarMouseClicked

    private void txt_cedulaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cedulaKeyPressed
        // TODO add your handling code here:
        if(txt_cedula.getText().equalsIgnoreCase("Ingrese el usuario")){
                 txt_cedula.setText("");
                 txt_cedula.setForeground(Color.BLACK);   
        }
    }//GEN-LAST:event_txt_cedulaKeyPressed

    public JLabel getLbl_password() {
        return lbl_password;
    }

    public void setLbl_password(JLabel lbl_password) {
        this.lbl_password = lbl_password;
    }

    public JTextField getTxt_cedula() {
        return txt_cedula;
    }

    public void setTxt_cedula(JTextField txt_cedula) {
        this.txt_cedula = txt_cedula;
    }

    public JPasswordField getTxt_password() {
        return txt_password;
    }

    public void setTxt_password(JPasswordField txt_password) {
        this.txt_password = txt_password;
    }

    public JLabel getLbEntrar() {
        return LbEntrar;
    }

    public void setLbEntrar(JLabel LbEntrar) {
        this.LbEntrar = LbEntrar;
    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LbEntrar;
    private javax.swing.JLabel LbNombreEmpresa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbl_password;
    private javax.swing.JTextField txt_cedula;
    private javax.swing.JPasswordField txt_password;
    // End of variables declaration//GEN-END:variables
}
