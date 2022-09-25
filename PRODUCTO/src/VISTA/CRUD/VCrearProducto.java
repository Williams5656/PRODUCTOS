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
public class VCrearProducto extends javax.swing.JInternalFrame {
    
    
    protected Validaciones validaciones = new Validaciones();
    /**
     * Creates new form VOpcionesProd
     */
    public VCrearProducto() {
        initComponents();
        quitarBarra();
        Validar();
    }

    
    public void Validar(){
        validaciones.createFilteredField(TxtPrecio1Prod, 10, Validaciones.MATCH_NUMEROS_DOUBLES);
        validaciones.createFilteredField(TxtPrecio2Prod, 10, Validaciones.MATCH_NUMEROS_DOUBLES);
        validaciones.createFilteredField(TxtPrecio3Prod, 10, Validaciones.MATCH_NUMEROS_DOUBLES);
        validaciones.createFilteredField(TxtSubsiProd, 10, Validaciones.MATCH_NUMEROS_DOUBLES);
    }
    
    public void quitarBarra(){
        ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setNorthPane(null);
    }        

    public JButton getBtnGuardarProd() {
        return BtnGuardarProd;
    }

    public void setBtnGuardarProd(JButton BtnGuardarProd) {
        this.BtnGuardarProd = BtnGuardarProd;
    }

    public JButton getBtnImportarFoto() {
        return BtnImportarFoto;
    }

    public void setBtnImportarFoto(JButton BtnImportarFoto) {
        this.BtnImportarFoto = BtnImportarFoto;
    }

    public JComboBox<String> getCbCateProd() {
        return CbCateProd;
    }

    public void setCbCateProd(JComboBox<String> CbCateProd) {
        this.CbCateProd = CbCateProd;
    }

    public JComboBox<String> getCbIceProd() {
        return CbIceProd;
    }

    public void setCbIceProd(JComboBox<String> CbIceProd) {
        this.CbIceProd = CbIceProd;
    }

    public JComboBox<String> getCbMStockProd() {
        return CbMStockProd;
    }

    public void setCbMStockProd(JComboBox<String> CbMStockProd) {
        this.CbMStockProd = CbMStockProd;
    }

    public JComboBox<String> getCbTipoIvaProd() {
        return CbTipoIvaProd;
    }

    public void setCbTipoIvaProd(JComboBox<String> CbTipoIvaProd) {
        this.CbTipoIvaProd = CbTipoIvaProd;
    }

    public JComboBox<String> getCbTipoProd() {
        return CbTipoProd;
    }

    public void setCbTipoProd(JComboBox<String> CbTipoProd) {
        this.CbTipoProd = CbTipoProd;
    }

    public JComboBox<String> getCbUnidadProd() {
        return CbUnidadProd;
    }

    public void setCbUnidadProd(JComboBox<String> CbUnidadProd) {
        this.CbUnidadProd = CbUnidadProd;
    }

    public JDateChooser getJcFVenciProd() {
        return JcFVenciProd;
    }

    public void setJcFVenciProd(JDateChooser JcFVenciProd) {
        this.JcFVenciProd = JcFVenciProd;
    }

    public JLabel getLbFotoAGProd() {
        return LbFotoAGProd;
    }

    public void setLbFotoAGProd(JLabel LbFotoAGProd) {
        this.LbFotoAGProd = LbFotoAGProd;
    }

    public JTextField getTxtCodAuxProd() {
        return TxtCodAuxProd;
    }

    public void setTxtCodAuxProd(JTextField TxtCodAuxProd) {
        this.TxtCodAuxProd = TxtCodAuxProd;
    }

    public JTextField getTxtCodProd() {
        return TxtCodProd;
    }

    public void setTxtCodProd(JTextField TxtCodProd) {
        this.TxtCodProd = TxtCodProd;
    }

    public JTextField getTxtDescProd() {
        return TxtDescProd;
    }

    public void setTxtDescProd(JTextField TxtDescProd) {
        this.TxtDescProd = TxtDescProd;
    }

    public JTextField getTxtNombreProd() {
        return TxtNombreProd;
    }

    public void setTxtNombreProd(JTextField TxtNombreProd) {
        this.TxtNombreProd = TxtNombreProd;
    }

    public JTextField getTxtPrecio1Prod() {
        return TxtPrecio1Prod;
    }

    public void setTxtPrecio1Prod(JTextField TxtPrecio1Prod) {
        this.TxtPrecio1Prod = TxtPrecio1Prod;
    }

    public JTextField getTxtPrecio2Prod() {
        return TxtPrecio2Prod;
    }

    public void setTxtPrecio2Prod(JTextField TxtPrecio2Prod) {
        this.TxtPrecio2Prod = TxtPrecio2Prod;
    }

    public JTextField getTxtPrecio3Prod() {
        return TxtPrecio3Prod;
    }

    public void setTxtPrecio3Prod(JTextField TxtPrecio3Prod) {
        this.TxtPrecio3Prod = TxtPrecio3Prod;
    }

    public JTextField getTxtSubsiProd() {
        return TxtSubsiProd;
    }

    public void setTxtSubsiProd(JTextField TxtSubsiProd) {
        this.TxtSubsiProd = TxtSubsiProd;
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
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        LbFotoAGProd = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TxtCodProd = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TxtPrecio1Prod = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        TxtPrecio2Prod = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        TxtPrecio3Prod = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        TxtNombreProd = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        TxtDescProd = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        CbTipoProd = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        CbTipoIvaProd = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        CbIceProd = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        CbMStockProd = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        CbCateProd = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        JcFVenciProd = new com.toedter.calendar.JDateChooser();
        jLabel20 = new javax.swing.JLabel();
        TxtSubsiProd = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        CbUnidadProd = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        TxtCodAuxProd = new javax.swing.JTextField();
        BtnGuardarProd = new javax.swing.JButton();
        BtnImportarFoto = new javax.swing.JButton();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();

        setPreferredSize(new java.awt.Dimension(1120, 670));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(33, 49, 91));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 65)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PRODUCTOS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(692, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 120));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator2.setForeground(new java.awt.Color(33, 49, 91));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 110, 10));

        jSeparator3.setForeground(new java.awt.Color(33, 49, 91));
        jPanel3.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 90, 140, 10));

        jSeparator5.setForeground(new java.awt.Color(33, 49, 91));
        jPanel3.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 240, 10));

        jSeparator7.setForeground(new java.awt.Color(33, 49, 91));
        jPanel3.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 140, 10));

        jSeparator8.setForeground(new java.awt.Color(33, 49, 91));
        jPanel3.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 140, 10));

        LbFotoAGProd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LbFotoAGProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VISTA/ICONOS/ProductoGenerico.png"))); // NOI18N
        LbFotoAGProd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(LbFotoAGProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(798, 23, 260, 240));

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel5.setText("Codigo:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, -1, -1));

        TxtCodProd.setBorder(null);
        jPanel3.add(TxtCodProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 110, 28));

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel6.setText("Precio 1:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 63, -1, -1));

        TxtPrecio1Prod.setBorder(null);
        jPanel3.add(TxtPrecio1Prod, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 140, 30));

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel7.setText("Precio 2:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, -1, 30));

        TxtPrecio2Prod.setBorder(null);
        jPanel3.add(TxtPrecio2Prod, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 140, 30));

        jLabel9.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel9.setText("Precio 3:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 60, -1, 30));

        TxtPrecio3Prod.setBorder(null);
        jPanel3.add(TxtPrecio3Prod, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 60, 140, 30));

        jLabel10.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel10.setText("Nombre:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        TxtNombreProd.setBorder(null);
        jPanel3.add(TxtNombreProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 112, 240, 30));

        jLabel11.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel11.setText("Descripcion:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 114, -1, 30));

        TxtDescProd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel3.add(TxtDescProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 320, 80));

        jLabel12.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel12.setText("Tipo de Producto:");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        CbTipoProd.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        CbTipoProd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bien", "Servicio" }));
        jPanel3.add(CbTipoProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 130, 30));

        jLabel13.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel13.setText("Tipo IVA:");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, -1, -1));

        CbTipoIvaProd.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        CbTipoIvaProd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "12 %", "0 %", "No objeto de Impuesto", "Exento de IVA", "IVA Diferenciado" }));
        jPanel3.add(CbTipoIvaProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, -1, -1));

        jLabel14.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel14.setText("ICE:");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        CbIceProd.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        CbIceProd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione ICE", "Cigarrillos rubio", "Cigarrillos negros", "Productos del tabaco y suced n...", "Bebidas alcoh¢licas, distintas...", "Cerveza Industrial", "Cerveza artesanal", "Bebidas Gaseosas con alto cont...", "Bebidas Gaseosas con bajo cont...", "Camionetas, furgonetas, camion...", "Veh¡culos motorizados cuyo pre...", "Veh¡culos motorizados, excepto...", "Veh¡culos motorizados, cuyo pr...", "Veh¡culos motorizados, cuyo pr...", "Veh¡culos motorizados cuyo pre...", "Veh¡culos motorizados cuyo pre...", " Veh¡culos motorizados cuyo pre...", "Aviones, avionetas y helic¢pte...", "Servicios de televisi¢n pagada", "Servicios de Telefon¡a ", "Bebidas energizantes", "Bebidas no alcoh¢licas ", "Veh¡culos h¡bridos o el‚ctrico...", "Veh¡culos h¡bridos o el‚ctrico...", "Veh¡culos h¡bridos o el‚ctrico...", "Veh¡culos h¡bridos o el‚ctrico...", "Veh¡culos h¡bridos o el‚ctrico...", "Veh¡culos h¡bridos o el‚ctrico...", "Bebidas  alcoh¢licas SENAE", "Cerveza Industrial SENAE", "Cigarrillos rubio SENAE", "Cigarrillos negros SENAE", "Cerveza artesanal SENAE", "Bebidas Gaseosas con alto cont...", "Bebidas Gaseosas con bajo cont...", "Bebidas energizantes SENAE", "Bebidas no alcoh¢licas SENAE", "Perfumes y aguas de tocador", "Videojuegos ", "Armas de fuego, armas deportiv...", "Focos incandescentes excepto a...", "Servicios de casinos, salas de...", "Las cuotas, membres¡as, afilia...", "Cocinas, calefones y otros de...", "Ice Fundas Plásticas", "Cocinas, calefones y otros de..." }));
        jPanel3.add(CbIceProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 240, 30));

        jLabel15.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel15.setText("Desea Manejar Stock");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, -1, -1));

        CbMStockProd.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        CbMStockProd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));
        jPanel3.add(CbMStockProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 260, 70, 30));

        jLabel16.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel16.setText("Categoria:");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        CbCateProd.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        CbCateProd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Principal", "Prueba", "Juan" }));
        jPanel3.add(CbCateProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 130, 30));

        jLabel19.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel19.setText("Fecha de Vencimiento:");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, -1, -1));

        JcFVenciProd.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jPanel3.add(JcFVenciProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 310, 180, 30));

        jLabel20.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel20.setText("Subsidio Unitario:");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));

        TxtSubsiProd.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        TxtSubsiProd.setBorder(null);
        jPanel3.add(TxtSubsiProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 140, 30));

        jLabel21.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel21.setText("Unidad:");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, -1, -1));

        CbUnidadProd.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        CbUnidadProd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno", "Unidad", "test", "Saco 75Kg", "Saco 5Kg", "Saco 50Kg", "Saco 4Kg", "Saco 45Kg", "Saco 40Kg", "Saco 3Kg", "Saco 35Kg", "Saco 30Kg", "Saco 2Kg", "Saco 25Kg", "Saco 20Kg", "Saco 1Kg", "Saco 15Kg", "Saco 10Kg", "Saco 100Kg", "Paquete de 9", "Paquete de 6", "Paquete de 4", "Paquete de 36", "Paquete de 3", "Paquete de 24", "Paquete de 20", "Paquete de 18", "Paquete de 13", "Paquete de 12", "Paquete de 10", "Metros", "Kilogramo" }));
        jPanel3.add(CbUnidadProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 360, 140, 30));

        jLabel22.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel22.setText("Codigo Auxiliar:");
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, -1, -1));

        TxtCodAuxProd.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        TxtCodAuxProd.setBorder(null);
        jPanel3.add(TxtCodAuxProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, 100, 30));

        BtnGuardarProd.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        BtnGuardarProd.setText("Guardar");
        jPanel3.add(BtnGuardarProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(955, 409, 90, 40));

        BtnImportarFoto.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        BtnImportarFoto.setText("Importar Foto");
        BtnImportarFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnImportarFotoActionPerformed(evt);
            }
        });
        jPanel3.add(BtnImportarFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 280, -1, 30));

        jSeparator9.setForeground(new java.awt.Color(33, 49, 91));
        jPanel3.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 140, 10));

        jSeparator10.setForeground(new java.awt.Color(33, 49, 91));
        jPanel3.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 440, 100, 10));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 1070, 500));

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

    private void BtnImportarFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnImportarFotoActionPerformed

    }//GEN-LAST:event_BtnImportarFotoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnGuardarProd;
    private javax.swing.JButton BtnImportarFoto;
    private javax.swing.JComboBox<String> CbCateProd;
    private javax.swing.JComboBox<String> CbIceProd;
    private javax.swing.JComboBox<String> CbMStockProd;
    private javax.swing.JComboBox<String> CbTipoIvaProd;
    private javax.swing.JComboBox<String> CbTipoProd;
    private javax.swing.JComboBox<String> CbUnidadProd;
    private com.toedter.calendar.JDateChooser JcFVenciProd;
    private javax.swing.JLabel LbFotoAGProd;
    private javax.swing.JTextField TxtCodAuxProd;
    private javax.swing.JTextField TxtCodProd;
    private javax.swing.JTextField TxtDescProd;
    private javax.swing.JTextField TxtNombreProd;
    private javax.swing.JTextField TxtPrecio1Prod;
    private javax.swing.JTextField TxtPrecio2Prod;
    private javax.swing.JTextField TxtPrecio3Prod;
    private javax.swing.JTextField TxtSubsiProd;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    // End of variables declaration//GEN-END:variables
}