/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fungsi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class koneksi {
    
    Connection koneksi;
    Statement stm;
    
    public void config(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            koneksi = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_restaurant", "admin", "admin");
            stm = koneksi.createStatement();
            System.out.println("Koneksi Berhasil");
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog (null, "Koneksi Gagal" +e.getMessage());
        }
    }
    
        public Connection getKonek() {
            return koneksi;
        }
        
        public Statement getStm(){
            return stm;
        }
}
