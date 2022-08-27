/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import org.postgresql.util.Base64;

/**
 *
 * @author prisc
 */
public class Producto{
    
    //Atributos
    private String CodigoP, idP;
    private double precio1, precio2, precio3, SubsiP;
    private String NombreP, DescripcionP, FechaVP, TipoP, TipoIVAP, IceP, MStockP, CategoriaP, UnidP, CodAuxP;
    private int Stock;
    private Image foto;
    //constructores
    
    public Producto() {
    }

    public Producto(String CodigoP, double precio1, double precio2, double precio3, String NombreP, String DescripcionP, String FechaVP, String TipoP, String TipoIVAP, String IceP, String MStockP, String CategoriaP, double SubsiP, String UnidP, String CodAuxP, String idP, int Stock, Image foto) {
        this.idP = idP;
        this.CodigoP = CodigoP;
        this.precio1 = precio1;
        this.precio2 = precio2;
        this.precio3 = precio3;
        this.NombreP = NombreP;
        this.DescripcionP = DescripcionP;
        this.FechaVP = FechaVP;
        this.TipoP = TipoP;
        this.TipoIVAP = TipoIVAP;
        this.IceP = IceP;
        this.MStockP = MStockP;
        this.CategoriaP = CategoriaP;
        this.SubsiP = SubsiP;
        this.UnidP = UnidP;
        this.Stock = Stock;
        this.CodAuxP = CodAuxP;
        this.foto = foto;
    }

    //getters y setters

    public String getIdP() {
        return idP;
    }

    public void setIdP(String idP) {
        this.idP = idP;
    }
    
    public String getCodigoP() {
        return CodigoP;
    }

    public void setCodigoP(String CodigoP) {
        this.CodigoP = CodigoP;
    }

    public double getPrecio1() {
        return precio1;
    }

    public void setPrecio1(double precio1) {
        this.precio1 = precio1;
    }

    public double getPrecio2() {
        return precio2;
    }

    public void setPrecio2(double precio2) {
        this.precio2 = precio2;
    }

    public double getPrecio3() {
        return precio3;
    }

    public void setPrecio3(double precio3) {
        this.precio3 = precio3;
    }

    public String getNombreP() {
        return NombreP;
    }

    public void setNombreP(String NombreP) {
        this.NombreP = NombreP;
    }

    public String getDescripcionP() {
        return DescripcionP;
    }

    public void setDescripcionP(String DescripcionP) {
        this.DescripcionP = DescripcionP;
    }

    public String getFechaVP() {
        return FechaVP;
    }

    public void setFechaVP(String FechaVP) {
        this.FechaVP = FechaVP;
    }

    public String getTipoP() {
        return TipoP;
    }

    public void setTipoP(String TipoP) {
        this.TipoP = TipoP;
    }

    public String getTipoIVAP() {
        return TipoIVAP;
    }

    public void setTipoIVAP(String TipoIVAP) {
        this.TipoIVAP = TipoIVAP;
    }

    public String getIceP() {
        return IceP;
    }

    public void setIceP(String IceP) {
        this.IceP = IceP;
    }

    public String getMStockP() {
        return MStockP;
    }

    public void setMStockP(String MStockP) {
        this.MStockP = MStockP;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }
    
    public String getCategoriaP() {
        return CategoriaP;
    }

    public void setCategoriaP(String CategoriaP) {
        this.CategoriaP = CategoriaP;
    }

    public double getSubsiP() {
        return SubsiP;
    }

    public void setSubsiP(double SubsiP) {
        this.SubsiP = SubsiP;
    }

    public String getUnidP() {
        return UnidP;
    }

    public void setUnidP(String UnidP) {
        this.UnidP = UnidP;
    }

    public String getCodAuxP() {
        return CodAuxP;
    }

    public void setCodAuxP(String CodAuxP) {
        this.CodAuxP = CodAuxP;
    }

    public Image getFoto() {
        return foto;
    }

    public void setFoto(Image foto) {
        this.foto = foto;
    }

//metodos DB

//Inserta Producto
    public boolean InsertarProducto(String cod, String nomb, String desc, String stck, String pre, String pre2, String pre3, String tipp, String tipi, String ic, String mst, String cate, String fec, String subs, String und, String codaux, Image fot) {
        ConexionDB conec=new ConexionDB();  
        //Proceso Foto
        String binFoto = null;
        
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try{
            BufferedImage img = deImangen(fot);
            ImageIO.write(img, "jpg", baos);
            byte[] imgBytea = baos.toByteArray();
            binFoto = Base64.encodeBytes(imgBytea);
        }catch(IOException e){
            e.printStackTrace();
        }             
        //Fin Proceso Foto
        
        try {
            String sql;
                sql = "Insert into producto ";
                sql += "( codigo_prod, nombre, descripcion, stock, precio, precio2, precio3, tipo_producto, tipo_iva, ice, maneja_stock, categoria_prod, fecha_venci, subsidio_unit, unidad, codigo_auxiliar, eliminado, foto)";
                sql += "VALUES ('"+cod+"', '"+nomb+"', '"+desc+"', "+stck+", "+pre+","+pre2+","+pre3+", '"+tipp+"', '"+tipi+"', '"+ic+"', '"+mst+"', '"+cate+"', '"+fec+"', "+subs+", '"+und+"', '"+codaux+"', '1', '"+binFoto+"')";
                if (conec.noQuery(sql) == null) {
                    return true;
                } else {
                    return false;
                }
        } catch (Exception e) {
            return false;
        }finally{
            try {
                conec.CerrarConexion();
            } catch (SQLException e) {
                System.err.println(e);
            }            
        }   
    }       
    
//Editar Persona
    public boolean ActualizarProducto(String cod, String nomb, String desc, String stck, String pre, String pre2, String pre3, String tipp, String tipi, String ic, String mst, String cate, String fec, String subs, String und, String codaux, Image fot ){
        ConexionDB conec=new ConexionDB();  
        
        String binFoto = null;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try{
            BufferedImage img = deImangen(fot);
            ImageIO.write(img, "jpg", baos);
            byte[] imgBytea = baos.toByteArray();
            binFoto = Base64.encodeBytes(imgBytea);
        }catch(IOException e){
            e.printStackTrace();
        }            
        String sql;
        sql = "UPDATE producto ";
        sql += "SET nombre = '"+nomb+"', descripcion = '"+desc+"', stock = '"+stck+"', precio = '"+pre+"', precio2 = '"+pre2+"', precio3 = '"+pre3+"', tipo_producto = '"+tipp+"', tipo_iva = '"+tipi+"', ice = '"+ic+"', maneja_stock = '"+mst+"', categoria_prod = '"+cate+"', fecha_venci = '"+fec+"', subsidio_unit = '"+subs+"', unidad = '"+und+"', codigo_auxiliar = '"+codaux+"', foto = '"+binFoto+"'";
        sql += "WHERE codigo_prod = '"+cod+"'";        
        if (conec.noQuery(sql) == null) {
            return true;
        } else {
            return false;
        }
    }   
    
//Eliminar Productos
    public boolean EliminarProducto(String cod){
        ConexionDB conec=new ConexionDB();  
        String sql;
        sql = "UPDATE producto ";
        sql += "SET eliminado = '0'";
        sql += "WHERE codigo_prod = '"+cod+"'";        
        if (conec.noQuery(sql) == null) {
            return true;
        } else {
            return false;
        }
    }    
    
//mostrar los productos de la base 
    public List<Producto> mostrarProductos(String nomb, String campo){
        ConexionDB conec=new ConexionDB(); 
        ImageIcon fotico;
        InputStream is;
        try {
        String sql = "SELECT * FROM producto where UPPER("+campo+") like UPPER('"+nomb+"%') and eliminado = 1";
        ResultSet rs = conec.query(sql);
        List<Producto> listaP = new ArrayList<Producto>();
            byte[] bytea;
            while (rs.next()) {
                Producto p = new Producto();
                p.setIdP(rs.getString("id_producto"));
                p.setCodigoP(rs.getString("codigo_prod"));
                p.setPrecio1(rs.getDouble("precio"));
                p.setPrecio2(rs.getDouble("precio2"));
                p.setPrecio3(rs.getDouble("precio3"));
                p.setNombreP(rs.getString("nombre"));
                p.setDescripcionP(rs.getString("descripcion"));
                p.setTipoP(rs.getString("tipo_producto"));
                p.setTipoIVAP(rs.getString("tipo_iva"));
                p.setIceP(rs.getString("ice"));
                p.setMStockP(rs.getString("maneja_stock"));
                p.setCategoriaP(rs.getString("categoria_prod"));
                p.setFechaVP(rs.getString("fecha_venci"));
                p.setSubsiP(rs.getDouble("subsidio_unit"));
                p.setUnidP(rs.getString("unidad"));
                p.setCodAuxP(rs.getString("codigo_auxiliar"));
                p.setStock(rs.getInt("stock")); 
                bytea = rs.getBytes("foto");
                if (bytea != null) {
                        try {
                            bytea = Base64.decode(bytea, 0, rs.getBytes("foto").length);
                            p.setFoto(getImage(bytea));
                        } catch (IOException ex) {
                        ex.printStackTrace();
                }}
                listaP.add(p);
            }
            rs.close();
            return listaP;
        } catch (SQLException ex) {
            Logger.getLogger(Producto.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }   finally{
            try {
                conec.CerrarConexion();
            } catch (SQLException e) {
                System.err.println(e);
            }            
        }        
    }  
    
    //Foto
        public BufferedImage deImangen(Image img){
        BufferedImage cambio = new BufferedImage(img.getWidth(null), img.getHeight(null), BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = cambio.createGraphics();
        g2d.drawImage(img, 0, 0, null);
        g2d.dispose();
        
        return cambio;
    }
        
    public Image getImage(byte[] bytes) throws IOException{
        ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
        try {
                    Iterator reader = ImageIO.getImageReadersByFormatName("jpg");
                    ImageReader ir = (ImageReader) reader.next();
                    Object source = bis;
                    ImageInputStream lis = ImageIO.createImageInputStream(source);
                    ir.setInput(lis,true);

                    return ir.read(0);                    
        } catch (Exception e) {
        try {
                    Iterator reader = ImageIO.getImageReadersByFormatName("png");
                    ImageReader ir = (ImageReader) reader.next();
                    Object source = bis;
                    ImageInputStream lis = ImageIO.createImageInputStream(source);
                    ir.setInput(lis,true);

                    return ir.read(0);                    
        } catch (Exception xe) {
            JOptionPane.showMessageDialog(null, "Solo se aceptan jpg o png");
            return null;
        }
        }
    }          
    //
}
