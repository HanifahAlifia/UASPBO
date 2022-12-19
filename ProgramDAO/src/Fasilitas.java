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

public class Fasilitas {
    private Connection koneksi;
    public Fasilitas() {
        koneksi = KoneksiDatabase.getKoneksi();
}
public void insert(Barang barang){
    PreparedStatement prepare = null;
    try {
    String sql ="INSERT INTO input_barang(ID_Barang,Kode_Barang,Nama_HandPhone,Merk,Stok,Harga)VALUES(?,?,?,?,?,?)";
    prepare = (PreparedStatement) koneksi.prepareStatement(sql);
    prepare.setInt(1, barang.getID_Barang());
    prepare.setString(2, barang.getKode_Barang());
    prepare.setString(3, barang.getNama_HandPhone());
    prepare.setString(4, barang.getMerk());
    prepare.setInt(5, barang.getStok());
    prepare.setLong(6, barang.getHarga());
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
    String sql ="UPDATE input_barang SET ID_Barang=?,Nama_HandPhone=?,Merk=?,Stok=?,Harga=? WHEREkode_barang=?";
    prepare.setInt(1, barang.getID_Barang());
    prepare.setString(2, barang.getKode_Barang());
    prepare.setString(3, barang.getNama_HandPhone());
    prepare.setString(4, barang.getMerk());
    prepare.setInt(5, barang.getStok());
    prepare.setLong(6, barang.getHarga());
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
public void delete(String kode_barang){
PreparedStatement prepare = null;
try {
String sql ="DELETE FROM input_barang WHERE kode_barang=?";
prepare = (PreparedStatement) koneksi.prepareStatement(sql);
prepare.setString(1, kode_barang);
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
String sql ="SELECT * FROM input_barang";
prepare = (PreparedStatement) koneksi.prepareStatement(sql);
result = prepare.executeQuery();
while (result.next()){
Barang barang = new Barang();
barang.setID_Barang(result.getInt("ID_Barang"));
barang.setKode_Barang(result.getString("Kode_Barang"));
barang.setNama_HandPhone(result.getString("Nama_HandPhone"));
barang.setMerk(result.getString("Merk"));
barang.setStok(result.getInt("Stok"));
barang.setHarga(result.getLong("Harga"));
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
}
