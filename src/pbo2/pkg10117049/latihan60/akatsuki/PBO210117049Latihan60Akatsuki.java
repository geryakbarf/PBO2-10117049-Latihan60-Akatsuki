/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117049.latihan60.akatsuki;

/**
 *
 * @author Gery Akbar Fauzi
 * Nama : Gery Akbar Fauzi 
 * Kelas : PBO2 
 * Nim : 10117049
 * Deskripsi Program : Program ini berisi program untuk menampilkan anggota
 * Akatsuki
 */
public class PBO210117049Latihan60Akatsuki {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Itachi itachi = new Itachi();
        itachi.setNama("Uchiha Itachi");
        itachi.setAsalDesa("Konohagakure");
        itachi.setElemen("Api");
        itachi.setPartner("Kisame Hosigaki");
        itachi.setKekuatanMata("Mangekyo Sharingan");
        System.out.println("Nama : "+itachi.getNama());
        System.out.println("Asal Desa : "+itachi.getAsalDesa());
        System.out.println("Elemen Utama : "+itachi.getElemen());
        System.out.println("Nama Partner : "+itachi.getPartner());
        System.out.println("Kekuatan Khusus : "+itachi.getKekuatanMata());
        itachi.jurus();
        
        Kisame kisame = new Kisame();
        kisame.setNama("Hosigaki Kisame");
        kisame.setAsalDesa("Kirigakure");
        kisame.setElemen("Air");
        kisame.setPartner("Uchiha Itachi");
        kisame.setKekuatanSamehada("Bijuu Tanpa Ekor");
        kisame.setSenjataKhusus("Samehada");
        System.out.println("Nama : "+kisame.getNama());
        System.out.println("Asal Desa : "+kisame.getAsalDesa());
        System.out.println("Elemen Utama : "+kisame.getElemen());
        System.out.println("Nama Partner : "+kisame.getPartner());
        System.out.println("Kekuatan Khusus : "+kisame.getKekuatanSamehada());
        System.out.println("Senjata Khsusus : "+kisame.getSenjataKhusus());
        kisame.jurus();
        
        Hidan hidan = new Hidan();
        hidan.setNama("Hidan");
        hidan.setAsalDesa("Amegakure");
        hidan.setElemen("Tidak Punya Elemen");
        hidan.setPartner("Kakuzu");
        hidan.setKekuatanRitual("Lingkaran Ritual Kematian");
        hidan.setSenjataKhusus("Pedang Ritual Kematian");
        System.out.println("Nama : "+hidan.getNama());
        System.out.println("Asal Desa : "+hidan.getAsalDesa());
        System.out.println("Elemen Utama : "+hidan.getElemen());
        System.out.println("Nama Partner : "+hidan.getPartner());
        System.out.println("Kekuatan Khusus : "+hidan.getKekuatanRitual());
        System.out.println("Senjata Khusus : "+hidan.getSenjataKhusus());
        hidan.jurus();
        
    }
    
}
