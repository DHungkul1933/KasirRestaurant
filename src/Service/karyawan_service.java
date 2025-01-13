package Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import entity.karyawan;

public class karyawan_service {
     private Connection koneksi;
     public karyawan_service(){
      koneksi = Koneksi.getkoneksi();
     }
     public List<karyawan>Tampil(){
      PreparedStatement prepare = null;
      ResultSet result = null;
      List<karyawan>list = new ArrayList<>();
      try{
          String sql = "select * from karyawan";
          prepare = koneksi.prepareStatement(sql);
          result = prepare.executeQuery();
          while(result.next()){
              karyawan pel = new karyawan();
              pel.setId_karyawan(result.getInt("Id_karyawan"));
              pel.setKode_karyawan(result.getString("Kode_karyawan"));
              pel.setnama_karyawan(result.getString("Nama_karyawan"));
              pel.setAlamat(result.getString("Alamat"));
              pel.setNo_telp(result.getString("No_telp"));
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
     public void insertproduk(karyawan pel){
       PreparedStatement prepare = null;
       try{
           String sql ="INSERT INTO karyawan(Kode_karyawan,Nama_karyawan,Alamat,No_telp)"
                        + "VALUES (?,?,?,?)";
           prepare = koneksi.prepareStatement(sql);
           prepare.setString(1, pel.getKode_karyawan());
           prepare.setString(2, pel.getnama_karyawan());
           prepare.setString(3, pel.getAlamat());
           prepare.setString(4, pel.getNo_telp());
           prepare.executeUpdate();
           System.out.println("Berhasil insert data");
       }catch (SQLException e){
           System.out.println("gagal insert dengan kesalahan = " + e);
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
       public void Update_karyawan (karyawan pel){
       PreparedStatement prepare = null;
       
       try{
           String sql = "UPDATE karyawan SET Nama_karyawan=?,Kode_karyawan=?,Alamat=?,No_telp=? where Id_karyawan=?";
                   
           prepare = koneksi.prepareStatement(sql);
           
           prepare.setString(1, pel.getnama_karyawan());
           prepare.setString(2,pel.getKode_karyawan());
           prepare.setString(3,pel.getAlamat());
           prepare.setString(4,pel.getNo_telp());
           prepare.setInt(5,pel.getId_karyawan());
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
        public void delete_paket(int Id_karyawan){
       PreparedStatement prepare = null;
       
       try{
           String sql ="DELETE FROM karyawan WHERE Id_karyawan=?";
           prepare= koneksi.prepareStatement(sql);
           prepare.setInt(1, Id_karyawan);
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
