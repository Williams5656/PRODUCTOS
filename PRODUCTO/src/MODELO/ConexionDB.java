/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author james
 */
public class ConexionDB {
    private static Connection conexion;
    private static Statement stm;
    
    private final String user = "znfnqjrnxvbgqe";
    private final String clave = "f48f4656ce162f56bdc4ed25c0384bcff30056bece5403fd038aa4b60f84c75e";
    private final String url = "jdbc:postgresql://ec2-44-199-52-133.compute-1.amazonaws.com/dc3k5f62r653lp";

    
    public ConexionDB() {
        //cargar Driver Base
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, e);
            System.out.println("Error de driver");
        }

        try {
            // conexion
            conexion = DriverManager.getConnection(url, user, clave);
        } catch (SQLException e) {
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, e);
            System.out.println("Error de conexion");
        }
    }
    
    public ResultSet query(String sql) {
        try {
            stm = conexion.createStatement();
            ResultSet resultado = stm.executeQuery(sql);
            return resultado;
        } catch (SQLException ex) {
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    //PRODUCTOS
     public boolean accion(String sqla){
        try {
            stm = conexion.createStatement();
            boolean rb=stm.execute(sqla);
            stm.close();
            return true; //rb;
        } catch (SQLException ex) {
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
     
    
    public SQLException noQuery(String nqry) {

        try {
            stm = conexion.createStatement();
            stm.execute(nqry);
            stm.close();
            return null;
        } catch (SQLException ex) {
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
            return ex;
        }
    }

    public static Connection getConexion() {
        return conexion;
    }

    public static void setConexion(Connection conexion) {
        ConexionDB.conexion = conexion;
    }

    public void CerrarConexion() throws SQLException {
        conexion.close();
    }    
}
