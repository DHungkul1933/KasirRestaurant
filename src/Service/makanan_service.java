
package Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import entity.makanan;

public class makanan_service {
       private Connection koneksi;
     public makanan_service(){
      koneksi = Koneksi.getkoneksi();
     }
     public List<makanan>Tampil(){
      PreparedStatement prepare = null;
      ResultSet result = null;
      List<makanan>list = new ArrayList<>();
      try{
          String sql = "select * from makanan";
          prepare = koneksi.prepareStatement(sql);
          result = prepare.executeQuery();
          while(result.next()){
              makanan pel = new makanan();
              pel.setId_makanan(result.getInt("Id_Makanan"));
              pel.setKode_makanan(result.getString("Kode_Makanan"));
              pel.setNama_makanan(result.getString("Nama_Makanan"));
              pel.setHarga(result.getInt("Harga"));
              list.add(pel);
          }
          return list;
      }catch (SQLException e){
          System.out.println("keterangan" + e);
           return list;
      }finally{
          if(prepare != null){
               try {
                   prepare.close();
               }catch(SQLException e){
                   System.out.println(e);
               }
      }
         if (result != null){
               try{
                   result.close();
               }catch (SQLException e){
                   System.out.println(e);
               }
           }       
      }
  }
       public void insertproduk(makanan pel){
       PreparedStatement prepare = null;
       try{
           String sql ="INSERT INTO makanan(Kode_Makanan,Nama_Makanan,Harga)"
                        + "VALUES (?,?,?)";
           prepare = koneksi.prepareStatement(sql);
           prepare.setString(1, pel.getKode_makanan());
           prepare.setString(2, pel.getNama_makanan());
           prepare.setInt(3, pel.getHarga());
           prepare.executeUpdate();
           System.out.println("Berhasil insert data");
       }catch (SQLException e){
           System.out.println("gagal update dengan kesalahan = " + e);
       }finally {
           if(prepare != null){
               try{
                   prepare.close();
               }catch(SQLException e){
           System.out.println("ada kesalahan = " + e);
               }
           }
       }
  }
           public void Update_makanan (makanan pel){
       PreparedStatement prepare = null;
       
       try{
           String sql = "UPDATE makanan SET Nama_Makanan=?,Kode_Makanan=?,Harga=? where Id_Makanan=?";
                   
           prepare = koneksi.prepareStatement(sql);
           
           prepare.setString(1, pel.getNama_makanan());
           prepare.setString(2,pel.getKode_makanan());
           prepare.setInt(3,pel.getHarga());
           prepare.setInt(4,pel.getId_makanan());
           prepare.executeUpdate();
           System.out.println("berhasil update");
       }catch (SQLException ex){
         System.out.println("gagal update dengan error" + ex);
         
       }finally{
           if (prepare!=null){
               try{
                   prepare.close();
               }catch (SQLException ex){
                   
               }               
           }  
       }
           }
              public void delete_paket(int Id_Makanan){
       PreparedStatement prepare = null;
       
       try{
           String sql ="DELETE FROM makanan WHERE Id_Makanan=?";
           prepare= koneksi.prepareStatement(sql);
           prepare.setInt(1, Id_Makanan);
           prepare.executeUpdate();
           System.out.println("berhasil delete");
           
       }catch(SQLException ex){
           System.out.println ("gagal update dengan error" + ex);
       }finally{
           if (prepare != null){
               try{
               prepare.close();
               }catch (SQLException ex){
                   
               }
           }
       }
   }
}
