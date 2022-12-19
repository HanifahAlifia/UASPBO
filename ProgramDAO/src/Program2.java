import java.util.List;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Program2 {
static void insert (){
    Bingung perintah = new Bingung();
    Barang atk = new Barang();
    atk.setID_Barang();
    atk.setNama_HandPhone();
    atk.setJumlah();
    atk.setTotal_Harga();
    atk.setNama_Customer();
    atk.setTanggal_Pembelian();
    perintah.insert(atk);
    }
    

static void update(){
    Bingung perintah = new Bingung();
    Barang atk = new Barang();
    atk.setID_Barang();
    atk.setNama_HandPhone();
    atk.setJumlah();
    atk.setTotal_Harga();
    atk.setNama_Customer();
    atk.setTanggal_Pembelian();
    perintah.update(atk);
}
static void delete(){
    Bingung perintah = new Bingung();
perintah.delete("B002");
}
static void selectAll(){
    Bingung perintah = new Bingung();
List<Barang> list = perintah.selectAll();
for(Barang barang : list){
System.out.println(barang.getID_Barang());
System.out.println(barang.getNama_HandPhone());
System.out.println(barang.getJumlah());
System.out.println(barang.getTotal_Harga());
System.out.println(barang.getNama_Customer());
System.out.println(barang.getTanggal_Pembelian());
System.out.println("-------------------------");
}
}


public static void main(String[] args) {
    insert();
        
}
}