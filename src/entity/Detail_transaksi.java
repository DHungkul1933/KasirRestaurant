/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.Date;

/**
 *
 * @author ASUS
 */
public class Detail_transaksi {
   int Id_detail;
   int Id_Karyawan;
   int Id_Makanan;

    public int getId_transaksi() {
        return Id_transaksi;
    }

    public void setId_transaksi(int Id_transaksi) {
        this.Id_transaksi = Id_transaksi;
    }
   int Id_transaksi;
   int jumlah;
   int Harga_satuan;
   int subtotal;
   String Pembayaran;
   Date Tanggal;
   int Uang;
   int Kembalian;
   String kasir;
int total;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    public int getId_detail() {
        return Id_detail;
    }

    public void setId_detail(int Id_detail) {
        this.Id_detail = Id_detail;
    }

    public int getId_Karyawan() {
        return Id_Karyawan;
    }

    public void setId_Karyawan(int Id_Karyawan) {
        this.Id_Karyawan = Id_Karyawan;
    }

    public int getId_Makanan() {
        return Id_Makanan;
    }

    public void setId_Makanan(int Id_Makanan) {
        this.Id_Makanan = Id_Makanan;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public int getHarga_satuan() {
        return Harga_satuan;
    }

    public void setHarga_satuan(int Harga_satuan) {
        this.Harga_satuan = Harga_satuan;
    }

    public int getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(int subtotal) {
        this.subtotal = subtotal;
    }

    public String getPembayaran() {
        return Pembayaran;
    }

    public void setPembayaran(String Pembayaran) {
        this.Pembayaran = Pembayaran;
    }

    public Date getTanggal() {
        return Tanggal;
    }

    public void setTanggal(Date Tanggal) {
        this.Tanggal = Tanggal;
    }

    public int getUang() {
        return Uang;
    }

    public void setUang(int Uang) {
        this.Uang = Uang;
    }

    public int getKembalian() {
        return Kembalian;
    }

    public void setKembalian(int Kembalian) {
        this.Kembalian = Kembalian;
    }

    public String getKasir() {
        return kasir;
    }

    public void setKasir(String kasir) {
        this.kasir = kasir;
    }
}
