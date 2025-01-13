
package entity;

import com.stripbandunk.jwidget.annotation.TableColumn;

public class makanan {

    public int getId_makanan() {
        return Id_makanan;
    }

    public void setId_makanan(int Id_makanan) {
        this.Id_makanan = Id_makanan;
    }

    public String getKode_makanan() {
        return Kode_makanan;
    }

    public void setKode_makanan(String Kode_makanan) {
        this.Kode_makanan = Kode_makanan;
    }

    public String getNama_makanan() {
        return Nama_makanan;
    }

    public void setNama_makanan(String Nama_makanan) {
        this.Nama_makanan = Nama_makanan;
    }

    public int getHarga() {
        return Harga;
    }

    public void setHarga(int Harga) {
        this.Harga = Harga;
    }
 @TableColumn(number=1,name="Id")
 int Id_makanan;
 @TableColumn(number=2,name="Kode Makanan")
 String Kode_makanan;
 @TableColumn(number=3,name="Nama Makanan")
 String Nama_makanan;
 @TableColumn(number=4,name="Harga")
 int Harga;
}
