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
public class VCrearProveedor extends javax.swing.JInternalFrame {

    protected Validaciones validaciones = new Validaciones();
    /**
     * Creates new form VOpcionesProd
     */
    public VCrearProveedor() {
        initComponents();
        quitarBarra();
        Validar();
    }

    
    public void quitarBarra(){
        ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setNorthPane(null);
    }        
    
    
    public void Validar(){
        validaciones.createFilteredField(TxtCelular, 10, Validaciones.MATCH_NUMEROS);
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
        jSeparator8 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TxtId = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        TxtDireccion = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        CbTipoId = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        CbCiudad = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        TxtAliasSuc = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        CbProvincia = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        TxtCodSucursal = new javax.swing.JTextField();
        BtnGuardarProv = new javax.swing.JButton();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        TxtNombre = new javax.swing.JTextField();
        Txttelefono = new javax.swing.JTextField();
        jSeparator12 = new javax.swing.JSeparator();
        TxtCelular = new javax.swing.JTextField();
        jSeparator13 = new javax.swing.JSeparator();
        TxtCorreo = new javax.swing.JTextField();
        jSeparator14 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        jSeparator15 = new javax.swing.JSeparator();

        setPreferredSize(new java.awt.Dimension(1120, 670));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(33, 49, 91));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 65)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Proveedor");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(788, Short.MAX_VALUE))
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

        jSeparator7.setForeground(new java.awt.Color(33, 49, 91));
        jPanel3.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 340, 10));

        jSeparator8.setForeground(new java.awt.Color(33, 49, 91));
        jPanel3.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 180, 10));

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel5.setText("Tipo de Identificación:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel6.setText("Identificacion:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, -1, -1));

        TxtId.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        TxtId.setBorder(null);
        jPanel3.add(TxtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 70, 220, 30));

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel7.setText("Nombres / Razon Social:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, 30));

        TxtDireccion.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        TxtDireccion.setBorder(null);
        jPanel3.add(TxtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 500, 30));

        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel12.setText("DATOS BASICOS");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        CbTipoId.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        CbTipoId.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cedula", "RUC", "Pasaporte", "Identificacion del Exterior", "Placa" }));
        jPanel3.add(CbTipoId, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 190, 30));

        jLabel13.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel13.setText("Direccion:");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        jLabel14.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel14.setText("Alias Sucursal:");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        jLabel16.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel16.setText("Telefono:");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        CbCiudad.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        CbCiudad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sin Especificar" }));
        jPanel3.add(CbCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 340, 200, 30));

        jLabel19.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel19.setText("Celular:");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, -1, -1));

        jLabel20.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel20.setText("Provincia:");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, -1));

        TxtAliasSuc.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        TxtAliasSuc.setBorder(null);
        jPanel3.add(TxtAliasSuc, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 180, 30));

        jLabel21.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel21.setText("Correo:");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 300, -1, -1));

        CbProvincia.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        CbProvincia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sin Especificar", "Azuay                                                                                                                                                ", "Bolivar                                                                                                                                       ", "Cañar", "Carchi", "Chimborazo", "Cotopaxi", "El Oro", "Esmeraldas", "Exterior", "Galapagos", "Guayas", "Imbabura", "Loja", "Los Rios", "Manabi", "Morona Santiago", "Napo", "Orellana", "Pastaza", "Pichincha", "Santa Elena", "Santo Domingo", "Sucumbios", "Tungurahua", "Zamora Chinchipe" }));
        CbProvincia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbProvinciaActionPerformed(evt);
            }
        });
        jPanel3.add(CbProvincia, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 190, 30));

        jLabel22.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel22.setText("Ciudad:");
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, -1, -1));

        TxtCodSucursal.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        TxtCodSucursal.setBorder(null);
        jPanel3.add(TxtCodSucursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 200, 100, 30));

        BtnGuardarProv.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        BtnGuardarProv.setText("Guardar");
        jPanel3.add(BtnGuardarProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 420, 110, 40));

        jSeparator9.setForeground(new java.awt.Color(33, 49, 91));
        jPanel3.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 100, 220, 10));

        jSeparator10.setForeground(new java.awt.Color(33, 49, 91));
        jPanel3.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 230, 100, 10));

        jLabel17.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel17.setText("Codigo Sucursal:");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, -1, -1));

        TxtNombre.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        TxtNombre.setBorder(null);
        jPanel3.add(TxtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 340, 30));

        Txttelefono.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        Txttelefono.setBorder(null);
        jPanel3.add(Txttelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 170, 30));

        jSeparator12.setForeground(new java.awt.Color(33, 49, 91));
        jPanel3.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 180, 10));

        TxtCelular.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        TxtCelular.setBorder(null);
        jPanel3.add(TxtCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, 160, 30));

        jSeparator13.setForeground(new java.awt.Color(33, 49, 91));
        jPanel3.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, 170, 10));

        TxtCorreo.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        TxtCorreo.setBorder(null);
        jPanel3.add(TxtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 290, 330, 30));

        jSeparator14.setForeground(new java.awt.Color(33, 49, 91));
        jPanel3.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 320, 330, 10));

        jLabel15.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel15.setText("MATRIZ");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jSeparator15.setForeground(new java.awt.Color(33, 49, 91));
        jPanel3.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 500, 10));

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

    private void CbProvinciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbProvinciaActionPerformed
        // TODO add your handling code here:
        int prov = CbProvincia.getSelectedIndex();
        switch(prov){
            case 0: 
                    CbCiudad.removeAllItems();
                    CbCiudad.addItem("Sin Especificar");
            break;
            case 1: 
                    CbCiudad.removeAllItems();
                    CbCiudad.addItem("Sin Especificar");
                    CbCiudad.addItem("Camilo Ponce Enriquez");
                    CbCiudad.addItem("Chordeleg");
                    CbCiudad.addItem("Cuenca");
                    CbCiudad.addItem("El Pan");
                    CbCiudad.addItem("Giron");
                    CbCiudad.addItem("Guachapala");
                    CbCiudad.addItem("Gualaceo");
                    CbCiudad.addItem("Nabon");
                    CbCiudad.addItem("Oña");
                    CbCiudad.addItem("Paute");
                    CbCiudad.addItem("Pucara");
                    CbCiudad.addItem("San Fernando");
                    CbCiudad.addItem("Santa Isabel");
                    CbCiudad.addItem("Sevilla de Oro");
                    CbCiudad.addItem("Sigsig");
            break;
            case 2: 
                    CbCiudad.removeAllItems();
                    CbCiudad.addItem("Sin Especificar");
                    CbCiudad.addItem("Caluma");
                    CbCiudad.addItem("Chillanes");
                    CbCiudad.addItem("Chimbo");
                    CbCiudad.addItem("Echeandia");
                    CbCiudad.addItem("Guaranda");
                    CbCiudad.addItem("Las Naves");
                    CbCiudad.addItem("San Miguel");
            break;
            case 3: 
                    CbCiudad.removeAllItems();
                    CbCiudad.addItem("Sin Especificar");
                    CbCiudad.addItem("Azogues");
                    CbCiudad.addItem("Biblian");
                    CbCiudad.addItem("Cañar");
                    CbCiudad.addItem("Deleg");
                    CbCiudad.addItem("El Tambo");
                    CbCiudad.addItem("La Troncal");
                    CbCiudad.addItem("Suscal");
            break;
            case 4: 
                    CbCiudad.removeAllItems();
                    CbCiudad.addItem("Sin Especificar");
                    CbCiudad.addItem("Bolivar");
                    CbCiudad.addItem("Espejo");
                    CbCiudad.addItem("Huace");
                    CbCiudad.addItem("Mira");
                    CbCiudad.addItem("Montufar");
                    CbCiudad.addItem("Tulcan");
            break;
            case 5: 
                    CbCiudad.removeAllItems();
                    CbCiudad.addItem("Sin Especificar");
                    CbCiudad.addItem("Alausi");
                    CbCiudad.addItem("Chambo");
                    CbCiudad.addItem("Chunchi");
                    CbCiudad.addItem("Cumanda");
                    CbCiudad.addItem("Guamote");
                    CbCiudad.addItem("Guano");
                    CbCiudad.addItem("Pallatanga");
                    CbCiudad.addItem("Penipe");
                    CbCiudad.addItem("Riobamba");                
            break;
            case 6: 
                    CbCiudad.removeAllItems();
                    CbCiudad.addItem("Sin Especificar");
                    CbCiudad.addItem("La Mana");
                    CbCiudad.addItem("Latacunga");
                    CbCiudad.addItem("Pangua");
                    CbCiudad.addItem("Pujili");
                    CbCiudad.addItem("Salcedo");
                    CbCiudad.addItem("Saquisili");
                    CbCiudad.addItem("Sigchos");               
            break;
            case 7:
                    CbCiudad.removeAllItems();
                    CbCiudad.addItem("Sin Especificar");
                    CbCiudad.addItem("Arenillas");
                    CbCiudad.addItem("Atagualpa");
                    CbCiudad.addItem("Balsas");
                    CbCiudad.addItem("Chilla");
                    CbCiudad.addItem("El Guabo");
                    CbCiudad.addItem("Huaquillas");
                    CbCiudad.addItem("Las Lajas");                      
                    CbCiudad.addItem("Machala");
                    CbCiudad.addItem("Marcabeli");
                    CbCiudad.addItem("Pasaje");
                    CbCiudad.addItem("Piñas");
                    CbCiudad.addItem("Portovelo");                 
                    CbCiudad.addItem("Santa Rosa");
                    CbCiudad.addItem("Zaruma");  
            break;
            case 8: 
                    CbCiudad.removeAllItems();
                    CbCiudad.addItem("Sin Especificar");
                    CbCiudad.addItem("Atacames");
                    CbCiudad.addItem("Eloy Alfaro");
                    CbCiudad.addItem("Esmeraldas");
                    CbCiudad.addItem("Muisne");
                    CbCiudad.addItem("Quininde");
                    CbCiudad.addItem("Rioverde");
                    CbCiudad.addItem("San Lorenzo");     
            break;
            case 9: 
                    CbCiudad.removeAllItems();
                    CbCiudad.addItem("Sin Especificar");                
            break;
            case 10: 
                    CbCiudad.removeAllItems();
                    CbCiudad.addItem("Sin Especificar");    
                    CbCiudad.addItem("Isabela");    
                    CbCiudad.addItem("San Cristobal");    
                    CbCiudad.addItem("Santa Cruz");    
            break;
            case 11:
                    CbCiudad.removeAllItems();
                    CbCiudad.addItem("Sin Especificar");    
                    CbCiudad.addItem("Balao");    
                    CbCiudad.addItem("Balzar");  
                    CbCiudad.addItem("Bucay");  
                    CbCiudad.addItem("Colimes");  
                    CbCiudad.addItem("Daule");  
                    CbCiudad.addItem("Duran");  
                    CbCiudad.addItem("El Empalme");  
                    CbCiudad.addItem("El Triunfo");  
                    CbCiudad.addItem("Guayaquil");  
                    CbCiudad.addItem("Isidro Ayora");  
                    CbCiudad.addItem("Jujan");  
                    CbCiudad.addItem("Lomas de Sargentillo");  
                    CbCiudad.addItem("Marcelino Maridueña");  
                    CbCiudad.addItem("Milagro");  
                    CbCiudad.addItem("Naranjal");  
                    CbCiudad.addItem("Naranjito");  
                    CbCiudad.addItem("Nobol");  
                    CbCiudad.addItem("Palestina");  
                    CbCiudad.addItem("Pedro Carbo");
                    CbCiudad.addItem("Playas");  
                    CbCiudad.addItem("Salitre");  
                    CbCiudad.addItem("Sanborondon"); 
                    CbCiudad.addItem("Santa Lucia");  
                    CbCiudad.addItem("Simon Bolivar");
                    CbCiudad.addItem("Yaguachi");  
            break;
            case 12: 
                    CbCiudad.removeAllItems();
                    CbCiudad.addItem("Sin Especificar");    
                    CbCiudad.addItem("Anotonio Ante");    
                    CbCiudad.addItem("Cotacachi");  
                    CbCiudad.addItem("Otavalo");  
                    CbCiudad.addItem("Pimampiro");  
                    CbCiudad.addItem("San Miguel de Urcuqui");  
            break;
            case 13: 
                    CbCiudad.removeAllItems();
                    CbCiudad.addItem("Sin Especificar");    
                    CbCiudad.addItem("Alamor");    
                    CbCiudad.addItem("Calvas");  
                    CbCiudad.addItem("Catamayo");  
                    CbCiudad.addItem("Celica");  
                    CbCiudad.addItem("Chaguarpamba");  
                    CbCiudad.addItem("Espindola");  
                    CbCiudad.addItem("Gonzanama");  
                    CbCiudad.addItem("Loja");  
                    CbCiudad.addItem("Macara");  
                    CbCiudad.addItem("Olmedo");  
                    CbCiudad.addItem("Paltas");  
                    CbCiudad.addItem("Pindal");  
                    CbCiudad.addItem("Puyango");  
                    CbCiudad.addItem("Quilanga");  
                    CbCiudad.addItem("Saraguro");  
                    CbCiudad.addItem("Sozoranga");  
                    CbCiudad.addItem("Zapotillo");  
            break;
            case 14: 
                    CbCiudad.removeAllItems();
                    CbCiudad.addItem("Sin Especificar");    
                    CbCiudad.addItem("Baba");    
                    CbCiudad.addItem("Babahoyo");  
                    CbCiudad.addItem("Buena Fe");  
                    CbCiudad.addItem("Mocache");  
                    CbCiudad.addItem("Montalvo");  
                    CbCiudad.addItem("Palenque");  
                    CbCiudad.addItem("Pueblo Viejo");  
                    CbCiudad.addItem("Quevedo");  
                    CbCiudad.addItem("Quinsaloma");  
                    CbCiudad.addItem("Urdaneta");  
                    CbCiudad.addItem("Valencia"); 
                    CbCiudad.addItem("Ventanas"); 
                    CbCiudad.addItem("Vinces"); 
            break;
            case 15:
                    CbCiudad.removeAllItems();
                    CbCiudad.addItem("Sin Especificar");    
                    CbCiudad.addItem("24 de Mayo");    
                    CbCiudad.addItem("Bolivar");  
                    CbCiudad.addItem("Calceta");  
                    CbCiudad.addItem("Chone");  
                    CbCiudad.addItem("El Carmen");  
                    CbCiudad.addItem("Flavio Alfaro");  
                    CbCiudad.addItem("Jama");  
                    CbCiudad.addItem("Jaramijo");  
                    CbCiudad.addItem("Jipijapa");  
                    CbCiudad.addItem("Junin");  
                    CbCiudad.addItem("Manta");  
                    CbCiudad.addItem("Montecristi");  
                    CbCiudad.addItem("Olmedo");  
                    CbCiudad.addItem("Pajan");  
                    CbCiudad.addItem("Pedernales");  
                    CbCiudad.addItem("Pichincha");  
                    CbCiudad.addItem("Portoviejo");  
                    CbCiudad.addItem("Puerto Lopez");  
                    CbCiudad.addItem("Rocafuerte");  
                    CbCiudad.addItem("San Vicente"); 
                    CbCiudad.addItem("Santa Ana"); 
                    CbCiudad.addItem("Sucre"); 
                    CbCiudad.addItem("Tosagua"); 
            break;
            case 16:
                    CbCiudad.removeAllItems();
                    CbCiudad.addItem("Sin Especificar");    
                    CbCiudad.addItem("Gualaquiza");    
                    CbCiudad.addItem("Huamboya");  
                    CbCiudad.addItem("Limon Indanza");  
                    CbCiudad.addItem("Logroño");  
                    CbCiudad.addItem("Morona");  
                    CbCiudad.addItem("Pablo Sexto");  
                    CbCiudad.addItem("Palora");  
                    CbCiudad.addItem("San Juan Bosco");  
                    CbCiudad.addItem("Santiago de Mendez");  
                    CbCiudad.addItem("Sucua");  
                    CbCiudad.addItem("Taisha");  
                    CbCiudad.addItem("Tiwintza");  

            break;
            case 17:
                    CbCiudad.removeAllItems();
                    CbCiudad.addItem("Sin Especificar");    
                    CbCiudad.addItem("Archidona");    
                    CbCiudad.addItem("Carlos Julio Arosemena Tola");  
                    CbCiudad.addItem("El Chaco");  
                    CbCiudad.addItem("Quijos");  
                    CbCiudad.addItem("Tena");  
            break;
            case 18: 
                    CbCiudad.removeAllItems();
                    CbCiudad.addItem("Sin Especificar");    
                    CbCiudad.addItem("Aguarico");    
                    CbCiudad.addItem("Francisco de Orellana");  
                    CbCiudad.addItem("La Joya de los Sachas");  
                    CbCiudad.addItem("Loreto");               
            break;
            case 19:
                    CbCiudad.removeAllItems();
                    CbCiudad.addItem("Sin Especificar");    
                    CbCiudad.addItem("Arajuno");    
                    CbCiudad.addItem("Mera");  
                    CbCiudad.addItem("Pastaza");  
                    CbCiudad.addItem("Santa Clara");    
            break;
            case 20: 
                    CbCiudad.removeAllItems();
                    CbCiudad.addItem("Sin Especificar");    
                    CbCiudad.addItem("Cayambe");    
                    CbCiudad.addItem("Mejia");  
                    CbCiudad.addItem("Pedro Moncayo");                      
                    CbCiudad.addItem("Pedro Vicente Maldonado");    
                    CbCiudad.addItem("Puerto Quito");    
                    CbCiudad.addItem("Quito");  
                    CbCiudad.addItem("Rumiñahui");  
                    CbCiudad.addItem("San Miguel de los Bancos"); 
            break;
            case 21: 
                    CbCiudad.removeAllItems();
                    CbCiudad.addItem("Sin Especificar");    
                    CbCiudad.addItem("La Libertad");    
                    CbCiudad.addItem("Salinas");  
                    CbCiudad.addItem("Santa Elena");  
            break;
            case 22:
                    CbCiudad.removeAllItems();
                    CbCiudad.addItem("Sin Especificar");
                    CbCiudad.addItem("La Concordia");
                    CbCiudad.addItem("Santo Domingo");                
            break;
            case 23:
                    CbCiudad.removeAllItems();
                    CbCiudad.addItem("Sin Especificar");
                    CbCiudad.addItem("Cascales");
                    CbCiudad.addItem("Cuyabeno");
                    CbCiudad.addItem("Gonzalo Pizarro");
                    CbCiudad.addItem("Lago Agrio");
                    CbCiudad.addItem("Putumayo");
                    CbCiudad.addItem("Shushufindi");
                    CbCiudad.addItem("Sucumbios");             
            break;            
            case 24:
                    CbCiudad.removeAllItems();
                    CbCiudad.addItem("Sin Especificar");
                    CbCiudad.addItem("Ambato");
                    CbCiudad.addItem("Baños");
                    CbCiudad.addItem("Cevallos");
                    CbCiudad.addItem("Mocha");
                    CbCiudad.addItem("Patate");
                    CbCiudad.addItem("Pelileo");
                    CbCiudad.addItem("Santiago de Pillaro");
                    CbCiudad.addItem("Tisaleo");                
            break;
            case 25: 
                    CbCiudad.removeAllItems();
                    CbCiudad.addItem("Sin Especificar");
                    CbCiudad.addItem("Centinela del Condor");
                    CbCiudad.addItem("Chinchipe");
                    CbCiudad.addItem("El Pangui");
                    CbCiudad.addItem("Nangaritza");
                    CbCiudad.addItem("Palanda");
                    CbCiudad.addItem("Paquisha");
                    CbCiudad.addItem("Yacuambi");
                    CbCiudad.addItem("Yantzaza");
                    CbCiudad.addItem("Zamora");
            break;
        }
    }//GEN-LAST:event_CbProvinciaActionPerformed

    public JButton getBtnGuardarProv() {
        return BtnGuardarProv;
    }

    public void setBtnGuardarProv(JButton BtnGuardarProv) {
        this.BtnGuardarProv = BtnGuardarProv;
    }
  
    public JComboBox<String> getCbCiudad() {
        return CbCiudad;
    }

    public void setCbCiudad(JComboBox<String> CbCiudad) {
        this.CbCiudad = CbCiudad;
    }

    public JComboBox<String> getCbProvincia() {
        return CbProvincia;
    }

    public void setCbProvincia(JComboBox<String> CbProvincia) {
        this.CbProvincia = CbProvincia;
    }

    public JComboBox<String> getCbTipoId() {
        return CbTipoId;
    }

    public void setCbTipoId(JComboBox<String> CbTipoId) {
        this.CbTipoId = CbTipoId;
    }

    public JTextField getTxtAliasSuc() {
        return TxtAliasSuc;
    }

    public void setTxtAliasSuc(JTextField TxtAliasSuc) {
        this.TxtAliasSuc = TxtAliasSuc;
    }

    public JTextField getTxtCelular() {
        return TxtCelular;
    }

    public void setTxtCelular(JTextField TxtCelular) {
        this.TxtCelular = TxtCelular;
    }

    public JTextField getTxtCodSucursal() {
        return TxtCodSucursal;
    }

    public void setTxtCodSucursal(JTextField TxtCodSucursal) {
        this.TxtCodSucursal = TxtCodSucursal;
    }

    public JTextField getTxtCorreo() {
        return TxtCorreo;
    }

    public void setTxtCorreo(JTextField TxtCorreo) {
        this.TxtCorreo = TxtCorreo;
    }

    public JTextField getTxtId() {
        return TxtId;
    }

    public void setTxtId(JTextField TxtId) {
        this.TxtId = TxtId;
    }

    public JTextField getTxtNombre() {
        return TxtNombre;
    }

    public void setTxtNombre(JTextField TxtNombre) {
        this.TxtNombre = TxtNombre;
    }

    public JTextField getTxtDireccion() {
        return TxtDireccion;
    }

    public void setTxtDireccion(JTextField TxtDireccion) {
        this.TxtDireccion = TxtDireccion;
    }

    public JTextField getTxttelefono() {
        return Txttelefono;
    }

    public void setTxttelefono(JTextField Txttelefono) {
        this.Txttelefono = Txttelefono;
    }

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnGuardarProv;
    private javax.swing.JComboBox<String> CbCiudad;
    private javax.swing.JComboBox<String> CbProvincia;
    private javax.swing.JComboBox<String> CbTipoId;
    private javax.swing.JTextField TxtAliasSuc;
    private javax.swing.JTextField TxtCelular;
    private javax.swing.JTextField TxtCodSucursal;
    private javax.swing.JTextField TxtCorreo;
    private javax.swing.JTextField TxtDireccion;
    private javax.swing.JTextField TxtId;
    private javax.swing.JTextField TxtNombre;
    private javax.swing.JTextField Txttelefono;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    // End of variables declaration//GEN-END:variables
}
