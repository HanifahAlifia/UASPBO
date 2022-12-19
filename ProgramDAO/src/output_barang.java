/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.stripbandunk.jwidget.annotation.TableColumn;
/**
 *
 * @author USER X
 */
public class output_barang {
    @TableColumn(number=1, name ="ID Barang")
    private int ID_Barang;
    @TableColumn(number=2, name ="Nama HandPhone")
    private String Nama_HandPhone;
    @TableColumn(number=3, name ="Jumlah")
    private int Jumlah;
    @TableColumn(number=4, name ="Total Harga")
    private long Total_Harga;
    @TableColumn(number=5, name ="Nama Costumer")
    private String Nama_Costumer;
    @TableColumn(number=6, name ="Tanggal Pembelian")
    private String Tanggal_Pembelian;

    public int getID_Barang() {
        return ID_Barang;
    }

    public void setID_Barang(int ID_Barang) {
        this.ID_Barang = ID_Barang;
    }

    public String getNama_HandPhone() {
        return Nama_HandPhone;
    }

    public void setNama_HandPhone(String Nama_HandPhone) {
        this.Nama_HandPhone = Nama_HandPhone;
    }

    public int getJumlah() {
        return Jumlah;
    }

    public void setJumlah(int Jumlah) {
        this.Jumlah = Jumlah;
    }

    public long getTotal_Harga() {
        return Total_Harga;
    }

    public void setTotal_Harga(long Total_Harga) {
        this.Total_Harga = Total_Harga;
    }

    public String getNama_Costumer() {
        return Nama_Costumer;
    }

    public void setNama_Costumer(String Nama_Costumer) {
        this.Nama_Costumer = Nama_Costumer;
    }

    public String getTanggal_Pembelian() {
        return Tanggal_Pembelian;
    }

    public void setTanggal_Pembelian(String Tanggal_Pembelian) {
        this.Tanggal_Pembelian = Tanggal_Pembelian;
    }

    
}
