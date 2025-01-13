
package Service;

//import entity.login;
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//
public class login_service {
    
}
//     private Connection koneksi;
//     private PreparedStatement prepare;
//     private ResultSet result;
//     
//     class user{
//         int Id, Id_level;
//         String username,password;
//         
//         public user(){
//             this.Id = 0;
//             this.Id_level = 0;
//             this.username
//         }
//     }
//    public login ceklogin (String Username, String Password){
//     koneksi = Koneksi.getkoneksi();
//        PreparedStatement prepare = null;
//        ResultSet result = null;
//        login Login = null;
//        try{
//            String sql = "Select * from login where Username = ? and Password = md5(?) ";
//            prepare = koneksi.prepareStatement(sql);
//            prepare.setString(1, Username);
//            prepare.setString(2, Password);
//            result = prepare.executeQuery();
//            if(result.next()){
//                Login = new login();
//                Login.setId(result.getInt("Id"));
//                Login.setUsername(result.getString("Username"));
//                Login.setPassword(result.getString("Password"));
//               
//            }
//            return Login;
//        }catch(SQLException ex){
//            System.out.print("Ada yang salah dengan query" + ex);
//            return Login;
//        }finally{
//            if (prepare != null){
//                try {
//                    prepare.close();
//                }catch(SQLException ex){                  
//                }
//            }
//            if (result !=null){
//                try {
//                    result.close();
//                }catch(SQLException ex){
//                    
//                }
//            }
//        }
//        
//    }

