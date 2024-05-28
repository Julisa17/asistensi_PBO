/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package K3518024;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author dhani
 */
public class mysql {
        private static com.mysql.jdbc.Connection mysqlconfig;
    public static com.mysql.jdbc.Connection Koneksi()throws SQLException{
        try {
            // Database saya bernama uts
            String url="jdbc:mysql://localhost:3306/julisa"; 
            String user="root"; 
            String pass=""; 
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            mysqlconfig=(com.mysql.jdbc.Connection) DriverManager.getConnection(url, user, pass);            
        } catch (Exception e) {
            System.err.println("Koneksi ke Database Gagal, coba cek phpmyadmin "+e.getMessage());
        }
        return mysqlconfig;
    }
}
