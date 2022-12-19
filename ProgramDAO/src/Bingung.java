import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */

public class Bingung {
    private Connection koneksi;
    public Bingung() {
        koneksi = KoneksiDatabase.getKoneksi();
}
public void insert(Barang barang){
    PreparedStatement prepare = null;
    try {
    String sql ="INSERT INTO output_barang(ID_Barang,Kode_Barang,Nama_HandPhone,Merk,Stok,Harga)VALUES(?,?,?,?,?,?)";
    prepare = (PreparedStatement) koneksi.prepareStatement(sql);
    prepare.setInt(1, barang.getID_Barang());
    prepare.setString(2, barang.getNama_HandPhone());
    prepare.setLong(3, barang.getJumlah());
    prepare.setInt(4, barang.getTotal_Harga());
    prepare.setString(5, barang.getNama_Costumer());
    prepare.setString(6, barang.getTanggal_Pembelian());
    prepare.executeUpdate();
    System.out.println("Prepare statement berhasil dibuat");
}catch(SQLException ex){
    System.out.println("Prepare statement gagal dibuat");
    System.out.println("Pesan : " + ex.getMessage());
}finally{
    if (prepare != null){
        try{
            prepare.close();
            System.out.println("Prepare statemen berhasil ditutup");
        }catch(SQLException ex){
            System.out.println("Prepare statemen gagal ditutup");
            System.out.println("Pesan : " + ex.getMessage());
}
}
}
}
public void update(Barang barang){
PreparedStatement prepare = null;
    try {
    String sql ="UPDATE output_barang SET ID_Barang=?,Jumlah=?,Total_Harga=?,Nama_Costumer=?,Tanggal_Pembelian=? WHERE Nama_HandPhone=?";
    prepare.setInt(1, barang.getID_Barang());
    prepare.setString(2, barang.getNama_HandPhone());
    prepare.setLong(3, barang.getJumlah());
    prepare.setInt(4, barang.getTotal_Harga());
    prepare.setString(5, barang.getNama_Costumer());
    prepare.setString(6, barang.getTanggal_Pembelian());
    prepare.executeUpdate();
    System.out.println("Prepare statement berhasil dibuat");
}catch(SQLException ex){
    System.out.println("Prepare statement gagal dibuat");
    System.out.println("Pesan : " + ex.getMessage());
}finally{
    if (prepare != null){
        try{
            prepare.close();
            System.out.println("Prepare statemen berhasil ditutup");
        }catch(SQLException ex){
            System.out.println("Prepare statemen gagal ditutup");
            System.out.println("Pesan : " + ex.getMessage());
}
}
}
}
public void delete(String Nama_HandPhone){
PreparedStatement prepare = null;
try {
String sql ="DELETE FROM output_barang WHERE Nama_HandPhone=?";
prepare = (PreparedStatement) koneksi.prepareStatement(sql);
prepare.setString(1, Nama_HandPhone);
prepare.executeUpdate();
System.out.println("Prepare statement berhasil dibuat");
}catch(SQLException ex){
System.out.println("Prepare statement gagal dibuat");
System.out.println("Pesan : " + ex.getMessage());
}finally{
if (prepare != null){
try{
prepare.close();
System.out.println("Prepare statemen berhasil ditutup");
}catch(SQLException ex){
System.out.println("Prepare statemen gagal ditutup");
System.out.println("Pesan : " + ex.getMessage());
}
}
}
}
public List<Barang> selectAll(){
PreparedStatement prepare = null;
ResultSet result = null;
List<Barang> list = new ArrayList<>();
try {
String sql ="SELECT * FROM output_barang";
prepare = (PreparedStatement) koneksi.prepareStatement(sql);
result = prepare.executeQuery();
while (result.next()){
Barang barang = new Barang();
barang.setID_Barang(result.getInt("ID_Barang"));
barang.setNama_HandPhone(result.getString("Nama_HandPhone"));
barang.setJumlah(result.getInt("Jumlah"));
barang.setTotal_Harga(result.getInt("Total_Harga"));
barang.setNama_Customer(result.getString("Nama_Customer"));
barang.setTanggal_Pembelian(result.getString("Tanggal_Pembelian"));
list.add(barang);
}
System.out.println("Prepare statement berhasil dibuat");
return list;
}catch(SQLException ex){
System.out.println("Prepare statement gagal dibuat");
System.out.println("Pesan : " + ex.getMessage());
return list;
}finally{
if (prepare != null){
try{
prepare.close();
System.out.println("Prepare statemen berhasil ditutup");
}catch(SQLException ex){
System.out.println("Prepare statemen gagal ditutup");
System.out.println("Pesan : " + ex.getMessage());
}
}
if (result != null){
    try{
result.close();
System.out.println("Resultset berhasil ditutup");
}catch(SQLException ex){
System.out.println("Resultset gagal ditutup");
System.out.println("Pesan : " + ex.getMessage());
}
}
}
}

    boolean getID_Barang() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
