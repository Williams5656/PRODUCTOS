/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VISTA.CRUD;


import com.toedter.calendar.JDateChooser;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author james
 */
public class VcrudProducto extends javax.swing.JInternalFrame {

    /**
     * Creates new form VcrudProducto
     */
    public VcrudProducto() {
        
        initComponents();
       
    }

    public JButton getBtnAgregarArt() {
        return BtnAgregarArt;
    }

    public void setBtnAgregarArt(JButton BtnAgregarArt) {
        this.BtnAgregarArt = BtnAgregarArt;
    }

    public JDialog getJdProducto() {
        return JdProducto;
    }

    public void setJdProducto(JDialog JdProducto) {
        this.JdProducto = JdProducto;
    }

    public JTable getJtb_productos() {
        return jtb_productos;
    }

    public void setJtb_productos(JTable jtb_productos) {
        this.jtb_productos = jtb_productos;
    }   
    
    public JButton getBtnEditarArt() {
        return BtnEditarArt;
    }

    public void setBtnEditarArt(JButton BtnEditarArt) {
        this.BtnEditarArt = BtnEditarArt;
    }

    public JButton getBtnEliminarArt() {
        return BtnEliminarArt;
    }

    public void setBtnEliminarArt(JButton BtnEliminarArt) {
        this.BtnEliminarArt = BtnEliminarArt;
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

    public JLabel getLbNombreArtF() {
        return LbNombreArtF;
    }

    public void setLbNombreArtF(JLabel LbNombreArtF) {
        this.LbNombreArtF = LbNombreArtF;
    }

    public JTextField getTxtBuscarArt() {
        return TxtBuscarArt;
    }

    public void setTxtBuscarArt(JTextField TxtBuscarArt) {
        this.TxtBuscarArt = TxtBuscarArt;
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

    public JComboBox<String> getCbBuscarProd() {
        return CbBuscarProd;
    }

    public void setCbBuscarProd(JComboBox<String> CbBuscarProd) {
        this.CbBuscarProd = CbBuscarProd;
    }

    public JLabel getLbFotoM() {
        return LbFotoM;
    }

    public void setLbFotoM(JLabel LbFotoM) {
        this.LbFotoM = LbFotoM;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JdProducto = new javax.swing.JDialog();
        BG = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
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
        jLabel18 = new javax.swing.JLabel();
        BtnAgregarArt = new javax.swing.JButton();
        BtnEditarArt = new javax.swing.JButton();
        BtnEliminarArt = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtb_productos = new javax.swing.JTable();
        LbFotoM = new javax.swing.JLabel();
        LbNombreArtF = new javax.swing.JLabel();
        TxtBuscarArt = new javax.swing.JTextField();
        CbBuscarProd = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        BG.setBackground(new java.awt.Color(235, 240, 245));
        BG.setForeground(new java.awt.Color(204, 204, 204));
        BG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(33, 49, 91));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PRODUCTOS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(410, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(0, 18, Short.MAX_VALUE))
        );

        BG.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 80));

        jPanel2.setBackground(new java.awt.Color(225, 235, 245));

        LbFotoAGProd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LbFotoAGProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VISTA/ICONOS/ProductoGenerico.png"))); // NOI18N
        LbFotoAGProd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setText("Codigo:");

        jLabel6.setText("Precio 1:");

        jLabel7.setText("Precio 2:");

        jLabel9.setText("Precio 3:");

        jLabel10.setText("Nombre:");

        jLabel11.setText("Descripcion:");

        jLabel12.setText("Tipo de Producto:");

        CbTipoProd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bien", "Servicio" }));

        jLabel13.setText("Tipo IVA:");

        CbTipoIvaProd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "12 %", "0 %", "No objeto de Impuesto", "Exento de IVA", "IVA Diferenciado" }));

        jLabel14.setText("ICE:");

        CbIceProd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione ICE", "Cigarrillos rubio", "Cigarrillos negros", "Productos del tabaco y suced n...", "Bebidas alcoh¢licas, distintas...", "Cerveza Industrial", "Cerveza artesanal", "Bebidas Gaseosas con alto cont...", "Bebidas Gaseosas con bajo cont...", "Camionetas, furgonetas, camion...", "Veh¡culos motorizados cuyo pre...", "Veh¡culos motorizados, excepto...", "Veh¡culos motorizados, cuyo pr...", "Veh¡culos motorizados, cuyo pr...", "Veh¡culos motorizados cuyo pre...", "Veh¡culos motorizados cuyo pre...", " Veh¡culos motorizados cuyo pre...", "Aviones, avionetas y helic¢pte...", "Servicios de televisi¢n pagada", "Servicios de Telefon¡a ", "Bebidas energizantes", "Bebidas no alcoh¢licas ", "Veh¡culos h¡bridos o el‚ctrico...", "Veh¡culos h¡bridos o el‚ctrico...", "Veh¡culos h¡bridos o el‚ctrico...", "Veh¡culos h¡bridos o el‚ctrico...", "Veh¡culos h¡bridos o el‚ctrico...", "Veh¡culos h¡bridos o el‚ctrico...", "Bebidas  alcoh¢licas SENAE", "Cerveza Industrial SENAE", "Cigarrillos rubio SENAE", "Cigarrillos negros SENAE", "Cerveza artesanal SENAE", "Bebidas Gaseosas con alto cont...", "Bebidas Gaseosas con bajo cont...", "Bebidas energizantes SENAE", "Bebidas no alcoh¢licas SENAE", "Perfumes y aguas de tocador", "Videojuegos ", "Armas de fuego, armas deportiv...", "Focos incandescentes excepto a...", "Servicios de casinos, salas de...", "Las cuotas, membres¡as, afilia...", "Cocinas, calefones y otros de...", "Ice Fundas Plásticas", "Cocinas, calefones y otros de..." }));

        jLabel15.setText("Desea Manejar Stock");

        CbMStockProd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));

        jLabel16.setText("Categoria:");

        CbCateProd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Principal", "Prueba", "Juan" }));

        jLabel19.setText("Fecha de Vencimiento:");

        jLabel20.setText("Subsidio Unitario:");

        jLabel21.setText("Unidad:");

        CbUnidadProd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno", "Unidad", "test", "Saco 75Kg", "Saco 5Kg", "Saco 50Kg", "Saco 4Kg", "Saco 45Kg", "Saco 40Kg", "Saco 3Kg", "Saco 35Kg", "Saco 30Kg", "Saco 2Kg", "Saco 25Kg", "Saco 20Kg", "Saco 1Kg", "Saco 15Kg", "Saco 10Kg", "Saco 100Kg", "Paquete de 9", "Paquete de 6", "Paquete de 4", "Paquete de 36", "Paquete de 3", "Paquete de 24", "Paquete de 20", "Paquete de 18", "Paquete de 13", "Paquete de 12", "Paquete de 10", "Metros", "Kilogramo" }));

        jLabel22.setText("Codigo Auxiliar:");

        BtnGuardarProd.setText("Guardar");

        BtnImportarFoto.setText("Importar Foto");
        BtnImportarFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnImportarFotoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtNombreProd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtDescProd, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(30, 30, 30)
                                .addComponent(CbIceProd, 0, 1, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CbMStockProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(TxtCodProd, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(TxtPrecio1Prod)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TxtPrecio2Prod, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TxtPrecio3Prod, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CbCateProd, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel19)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JcFVenciProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CbTipoProd, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CbTipoIvaProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 31, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtSubsiProd, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addGap(18, 18, 18)
                                .addComponent(TxtCodAuxProd)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CbUnidadProd, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(LbFotoAGProd, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(BtnImportarFoto)
                        .addGap(61, 61, 61))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnGuardarProd)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(TxtCodProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtPrecio1Prod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(TxtPrecio2Prod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(TxtPrecio3Prod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(CbTipoProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(CbTipoIvaProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(CbIceProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)
                            .addComponent(CbMStockProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JcFVenciProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel16)
                                .addComponent(CbCateProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel19)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(TxtSubsiProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21)
                            .addComponent(CbUnidadProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(TxtCodAuxProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(LbFotoAGProd, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnImportarFoto))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtDescProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtNombreProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(BtnGuardarProd)
                .addContainerGap())
        );

        BG.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 720, 330));

        javax.swing.GroupLayout JdProductoLayout = new javax.swing.GroupLayout(JdProducto.getContentPane());
        JdProducto.getContentPane().setLayout(JdProductoLayout);
        JdProductoLayout.setHorizontalGroup(
            JdProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        JdProductoLayout.setVerticalGroup(
            JdProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setTitle("Productos");
        setPreferredSize(new java.awt.Dimension(1000, 550));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 64, -1, -1));

        BtnAgregarArt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VISTA/ICONOS/agrega.png"))); // NOI18N
        BtnAgregarArt.setText("Agregar");
        BtnAgregarArt.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnAgregarArt.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(BtnAgregarArt, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 6, 195, -1));

        BtnEditarArt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VISTA/ICONOS/edita.png"))); // NOI18N
        BtnEditarArt.setText("Editar");
        BtnEditarArt.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnEditarArt.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(BtnEditarArt, new org.netbeans.lib.awtextra.AbsoluteConstraints(488, 6, 195, -1));

        BtnEliminarArt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VISTA/ICONOS/delete_remove_close_icon_181533.png"))); // NOI18N
        BtnEliminarArt.setText("Eliminar");
        BtnEliminarArt.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnEliminarArt.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(BtnEliminarArt, new org.netbeans.lib.awtextra.AbsoluteConstraints(689, 6, 222, -1));

        jtb_productos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Codigo", "Nombre", "Precio", "Precio 2", "Precio 3", "IVA", "ICE", "Stock", "Stock"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jtb_productos);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 740, -1));

        LbFotoM.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LbFotoM.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(LbFotoM, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 80, 210, 220));
        getContentPane().add(LbNombreArtF, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 310, 210, 30));
        getContentPane().add(TxtBuscarArt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 150, -1));

        CbBuscarProd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre", "Descripcion" }));
        getContentPane().add(CbBuscarProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, -1, -1));

        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 270, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnImportarFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnImportarFotoActionPerformed

    }//GEN-LAST:event_BtnImportarFotoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG;
    private javax.swing.JButton BtnAgregarArt;
    private javax.swing.JButton BtnEditarArt;
    private javax.swing.JButton BtnEliminarArt;
    private javax.swing.JButton BtnGuardarProd;
    private javax.swing.JButton BtnImportarFoto;
    private javax.swing.JComboBox<String> CbBuscarProd;
    private javax.swing.JComboBox<String> CbCateProd;
    private javax.swing.JComboBox<String> CbIceProd;
    private javax.swing.JComboBox<String> CbMStockProd;
    private javax.swing.JComboBox<String> CbTipoIvaProd;
    private javax.swing.JComboBox<String> CbTipoProd;
    private javax.swing.JComboBox<String> CbUnidadProd;
    private com.toedter.calendar.JDateChooser JcFVenciProd;
    private javax.swing.JDialog JdProducto;
    private javax.swing.JLabel LbFotoAGProd;
    private javax.swing.JLabel LbFotoM;
    private javax.swing.JLabel LbNombreArtF;
    private javax.swing.JTextField TxtBuscarArt;
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
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jtb_productos;
    // End of variables declaration//GEN-END:variables
}
