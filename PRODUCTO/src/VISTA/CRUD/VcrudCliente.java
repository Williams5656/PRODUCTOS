/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VISTA.CRUD;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author User
 */
public class VcrudCliente extends javax.swing.JInternalFrame {

    /**
     * Creates new form VcrudCliente
     */
    public VcrudCliente() {
        initComponents();
    }
    
    //Getters y Setter

    public JButton getBtnAgregarCli() {
        return BtnAgregarCli;
    }

    public void setBtnAgregarCli(JButton BtnAgregarCli) {
        this.BtnAgregarCli = BtnAgregarCli;
    }

    public JButton getBtnCancelarCli() {
        return BtnCancelarCli;
    }

    public void setBtnCancelarCli(JButton BtnCancelarCli) {
        this.BtnCancelarCli = BtnCancelarCli;
    }

    public JButton getBtnEditarCli() {
        return BtnEditarCli;
    }

    public void setBtnEditarCli(JButton BtnEditarCli) {
        this.BtnEditarCli = BtnEditarCli;
    }

    public JButton getBtnEliminarCli() {
        return BtnEliminarCli;
    }

    public void setBtnEliminarCli(JButton BtnEliminarCli) {
        this.BtnEliminarCli = BtnEliminarCli;
    }

    public JButton getBtnGuardarCli() {
        return BtnGuardarCli;
    }

    public void setBtnGuardarCli(JButton BtnGuardarCli) {
        this.BtnGuardarCli = BtnGuardarCli;
    }

    public JDialog getJdCliente() {
        return JdCliente;
    }

    public void setJdCliente(JDialog JdCliente) {
        this.JdCliente = JdCliente;
    }

    public JTextField getTxtApellido() {
        return TxtApellido;
    }

    public void setTxtApellido(JTextField TxtApellido) {
        this.TxtApellido = TxtApellido;
    }

    public JTextField getTxtBuscarCli() {
        return TxtBuscarCli;
    }

    public void setTxtBuscarCli(JTextField TxtBuscarCli) {
        this.TxtBuscarCli = TxtBuscarCli;
    }

    public JTextField getTxtCedulaCli() {
        return TxtCedulaCli;
    }

    public void setTxtCedulaCli(JTextField TxtCedulaCli) {
        this.TxtCedulaCli = TxtCedulaCli;
    }

    public JTextField getTxtCelular() {
        return TxtCelular;
    }

    public void setTxtCelular(JTextField TxtCelular) {
        this.TxtCelular = TxtCelular;
    }

    public JTextField getTxtCiudad() {
        return TxtCiudad;
    }

    public void setTxtCiudad(JTextField TxtCiudad) {
        this.TxtCiudad = TxtCiudad;
    }

    public JTextField getTxtDireccion() {
        return TxtDireccion;
    }

    public void setTxtDireccion(JTextField TxtDireccion) {
        this.TxtDireccion = TxtDireccion;
    }

    public JTextField getTxtNombre() {
        return TxtNombre;
    }

    public void setTxtNombre(JTextField TxtNombre) {
        this.TxtNombre = TxtNombre;
    }

    public JTextField getTxtTelefono() {
        return TxtTelefono;
    }

    public void setTxtTelefono(JTextField TxtTelefono) {
        this.TxtTelefono = TxtTelefono;
    }

    public JComboBox<String> getjComboBuscar() {
        return jComboBuscar;
    }

    public void setjComboBuscar(JComboBox<String> jComboBuscar) {
        this.jComboBuscar = jComboBuscar;
    }

    public JLabel getjLabelIcono() {
        return jLabelIcono;
    }

    public void setjLabelIcono(JLabel jLabelIcono) {
        this.jLabelIcono = jLabelIcono;
    }

    public JLabel getjLabelTitulo() {
        return jLabelTitulo;
    }

    public void setjLabelTitulo(JLabel jLabelTitulo) {
        this.jLabelTitulo = jLabelTitulo;
    }

    public JTable getJtb_cliente() {
        return jtb_cliente;
    }

    public void setJtb_cliente(JTable jtb_cliente) {
        this.jtb_cliente = jtb_cliente;
    }

    public JTextField getTxtDireccionDom() {
        return TxtDireccionDom;
    }

    public void setTxtDireccionDom(JTextField TxtDireccionDom) {
        this.TxtDireccionDom = TxtDireccionDom;
    }

    public JTextField getTxtRazonSocial() {
        return TxtRazonSocial;
    }

    public void setTxtRazonSocial(JTextField TxtRazonSocial) {
        this.TxtRazonSocial = TxtRazonSocial;
    }
    
    

    //Getters y Setter del JD

        
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JdCliente = new javax.swing.JDialog();
        jLabelTitulo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        TxtCedulaCli = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TxtNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TxtApellido = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TxtDireccion = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        TxtDireccionDom = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        TxtCiudad = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        TxtRazonSocial = new javax.swing.JTextField();
        jLabelIcono = new javax.swing.JLabel();
        BtnGuardarCli = new javax.swing.JButton();
        BtnCancelarCli = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        TxtTelefono = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        TxtCelular = new javax.swing.JTextField();
        BtnAgregarCli = new javax.swing.JButton();
        BtnEditarCli = new javax.swing.JButton();
        BtnEliminarCli = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtb_cliente = new javax.swing.JTable();
        TxtBuscarCli = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jComboBuscar = new javax.swing.JComboBox<>();

        jLabelTitulo.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("Registrar Cliente");

        jLabel3.setText("RUC/CI:");

        jLabel4.setText("Nombre:");

        jLabel5.setText("Apellido:");

        jLabel6.setText("Direccion:");

        jLabel7.setText("Domicilio:");

        jLabel8.setText("Ciudad:");

        jLabel9.setText("Razon social:");

        jLabelIcono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VISTA/ICONOS/ClienteG.png"))); // NOI18N

        BtnGuardarCli.setText("Guardar");

        BtnCancelarCli.setText("Cancelar");
        BtnCancelarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarCliActionPerformed(evt);
            }
        });

        jLabel2.setText("Telefono:");

        jLabel10.setText("Celular:");

        javax.swing.GroupLayout JdClienteLayout = new javax.swing.GroupLayout(JdCliente.getContentPane());
        JdCliente.getContentPane().setLayout(JdClienteLayout);
        JdClienteLayout.setHorizontalGroup(
            JdClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(JdClienteLayout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110))
            .addGroup(JdClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JdClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel2)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JdClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JdClienteLayout.createSequentialGroup()
                        .addGroup(JdClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtRazonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(JdClienteLayout.createSequentialGroup()
                                .addGroup(JdClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TxtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtCedulaCli, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                                    .addComponent(TxtDireccionDom))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(JdClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelIcono, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JdClienteLayout.createSequentialGroup()
                                        .addGroup(JdClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(BtnCancelarCli, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                                            .addComponent(BtnGuardarCli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(34, 34, 34)))))
                        .addGap(45, 45, 45))
                    .addGroup(JdClienteLayout.createSequentialGroup()
                        .addGroup(JdClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(TxtCelular, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtTelefono, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        JdClienteLayout.setVerticalGroup(
            JdClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JdClienteLayout.createSequentialGroup()
                .addGroup(JdClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JdClienteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JdClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TxtCedulaCli, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(JdClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(TxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(JdClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(TxtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(JdClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(TxtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(JdClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(TxtDireccionDom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(JdClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(TxtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(JdClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(TxtRazonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(JdClienteLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabelIcono, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnGuardarCli)
                        .addGap(4, 4, 4)
                        .addComponent(BtnCancelarCli)))
                .addGap(10, 10, 10)
                .addGroup(JdClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JdClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 204), 5, true));
        setTitle("CRUD de Clientes");

        BtnAgregarCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VISTA/ICONOS/business_application_addmale_useradd_insert_add_user_client_2312.png"))); // NOI18N
        BtnAgregarCli.setText("Agregar");
        BtnAgregarCli.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnAgregarCli.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnAgregarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarCliActionPerformed(evt);
            }
        });

        BtnEditarCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VISTA/ICONOS/modifica.png"))); // NOI18N
        BtnEditarCli.setText("Editar");
        BtnEditarCli.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnEditarCli.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        BtnEliminarCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VISTA/ICONOS/user_eliminate_12817.png"))); // NOI18N
        BtnEliminarCli.setText("Eliminar");
        BtnEliminarCli.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnEliminarCli.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jtb_cliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cedula/Ruc", "Apellido", "Nombre", "Contacto", "Ciudad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtb_cliente);

        jLabel1.setText("Clientes");

        jComboBuscar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cedula", "Apellido", "Nombre" }));
        jComboBuscar.setPreferredSize(new java.awt.Dimension(75, 32));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TxtBuscarCli, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnAgregarCli, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnEditarCli, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnEliminarCli, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 975, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(BtnAgregarCli)
                    .addComponent(BtnEditarCli)
                    .addComponent(BtnEliminarCli)
                    .addComponent(TxtBuscarCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCancelarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnCancelarCliActionPerformed

    private void BtnAgregarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnAgregarCliActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAgregarCli;
    private javax.swing.JButton BtnCancelarCli;
    private javax.swing.JButton BtnEditarCli;
    private javax.swing.JButton BtnEliminarCli;
    private javax.swing.JButton BtnGuardarCli;
    private javax.swing.JDialog JdCliente;
    private javax.swing.JTextField TxtApellido;
    private javax.swing.JTextField TxtBuscarCli;
    private javax.swing.JTextField TxtCedulaCli;
    private javax.swing.JTextField TxtCelular;
    private javax.swing.JTextField TxtCiudad;
    private javax.swing.JTextField TxtDireccion;
    private javax.swing.JTextField TxtDireccionDom;
    private javax.swing.JTextField TxtNombre;
    private javax.swing.JTextField TxtRazonSocial;
    private javax.swing.JTextField TxtTelefono;
    private javax.swing.JComboBox<String> jComboBuscar;
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
    private javax.swing.JLabel jLabelIcono;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jtb_cliente;
    // End of variables declaration//GEN-END:variables
}
