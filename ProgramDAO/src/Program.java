import java.util.List;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Program {
static void insert (){
    Fasilitas perintah = new Fasilitas();
    Barang atk = new Barang();
    atk.setID_Barang();
    atk.setKode_Barang();
    atk.setNama_HandPhone();
    atk.setMerk();
    atk.setStok();
    atk.setHarga();
    perintah.insert(atk);
    }
    

static void update(){
    Fasilitas perintah = new Fasilitas();
    Barang atk = new Barang();
    atk.setID_Barang();
    atk.setKode_Barang();
    atk.setNama_HandPhone();
    atk.setMerk();
    atk.setStok();
    atk.setHarga();
    perintah.update(atk);
}
static void delete(){
    Fasilitas perintah = new Fasilitas();
perintah.delete("B002");
}
static void selectAll(){
    Fasilitas perintah = new Fasilitas();
List<Barang> list = perintah.selectAll();
for(Barang barang : list){
System.out.println(barang.getID_Barang());
System.out.println(barang.getKode_Barang());
System.out.println(barang.getNama_HandPhone());
System.out.println(barang.getMerk());
System.out.println(barang.getStok());
System.out.println(barang.getHarga());
System.out.println("-------------------------");
}
}


public static void main(String[] args) {
    insert();
        
}
}