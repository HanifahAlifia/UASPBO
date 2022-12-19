/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.stripbandunk.jwidget.annotation.TableColumn;
/**
 *
 * @author User
 */
public class Barang {
    @TableColumn(number=1, name ="ID Barang")
    private int ID_Barang;
    @TableColumn(number=2, name ="Kode Barang")
    private String kode_barang;
    @TableColumn(number=3, name ="Nama HandPhone")
    private String Nama_HandPhone;
    @TableColumn(number=4, name ="Merk")
    private String Merk;
    @TableColumn(number=5, name ="Stok")
    private int Stok;
    @TableColumn(number=6, name ="Harga")
    private long Harga;

    public int getID_Barang() {
        return ID_Barang;
    }

    public void setID_Barang(int ID_Barang) {
        this.ID_Barang = ID_Barang;
    }

    public String getKode_barang() {
        return kode_barang;
    }

    public void setKode_barang(String kode_barang) {
        this.kode_barang = kode_barang;
    }

    public String getNama_HandPhone() {
        return Nama_HandPhone;
    }

    public void setNama_HandPhone(String Nama_HandPhone) {
        this.Nama_HandPhone = Nama_HandPhone;
    }

    public String getMerk() {
        return Merk;
    }

    public void setMerk(String Merk) {
        this.Merk = Merk;
    }

    public int getStok() {
        return Stok;
    }

    public void setStok(int Stok) {
        this.Stok = Stok;
    }

    public long getHarga() {
        return Harga;
    }

    public void setHarga(long Harga) {
        this.Harga = Harga;
    }

    
}
