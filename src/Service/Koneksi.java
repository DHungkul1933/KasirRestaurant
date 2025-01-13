
package Service;

import com.mysql.cj.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Koneksi {
      private static Connection koneksi;
    public static Connection getkoneksi(){
    if (koneksi == null){
    try {
        Driver driver = new Driver();
        DriverManager.registerDriver(driver);
        String url = "jdbc:mysql://localhost:3306/kasir_saung_abah";
        String user = "root";
        String pass = "";
        
        koneksi = DriverManager.getConnection(url, user,pass);
        System.out.println("Koneksi Sukses");
        
    }catch (SQLException e){
         e.printStackTrace();
        System.out.println("Koneksi gagal" + e);
    }
}
    return koneksi;
    }
}
