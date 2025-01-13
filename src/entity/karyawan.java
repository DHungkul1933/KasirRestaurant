/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import com.stripbandunk.jwidget.annotation.TableColumn;

/**
 *
 * @author ASUS
 */
public class karyawan {
    @TableColumn(number=1,name="Id")
    int Id_karyawan;

    public int getId_karyawan() {
        return Id_karyawan;
    }

    public void setId_karyawan(int Id_karyawan) {
        this.Id_karyawan = Id_karyawan;
    }

    public String getKode_karyawan() {
        return Kode_karyawan;
    }

    public void setKode_karyawan(String Kode_karyawan) {
        this.Kode_karyawan = Kode_karyawan;
    }

    public String getAlamat() {
        return Alamat;
    }

    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }

    public String getNo_telp() {
        return No_telp;
    }

    public void setNo_telp(String No_telp) {
        this.No_telp = No_telp;
    }
    

    public String getnama_karyawan() {
        return nama_karyawan;
    }

    public void setnama_karyawan(String nama_karyawan) {
        this.nama_karyawan = nama_karyawan;
    }
    @TableColumn(number=2,name="Kode Karyawan")
    String Kode_karyawan;
    @TableColumn(number=3,name="Nama Karyawan")
    String nama_karyawan;
    @TableColumn(number=4,name="Alamat")
    String Alamat;
    @TableColumn(number=5,name="No.Telpon")
    String No_telp;
}
