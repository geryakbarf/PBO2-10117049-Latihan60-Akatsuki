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
public class Itachi extends Akatsuki{
    private String kekuatanMata;
    
    @Override
    public void jurus(){
        System.out.println("Itachi memilki Jurus utama yaitu : ");
        System.out.println("1. Mangeko Sharingan");
        System.out.println("2. Amateratsu");
        System.out.println("3. Susanoo");
        System.out.println("4. Katon, Gokyaku No Jutsu");
        System.out.println("5. Genjutsu Tsukiyomi");
        System.out.println("");
    }

    public String getKekuatanMata() {
        return kekuatanMata;
    }

    public void setKekuatanMata(String kekuatanMata) {
        this.kekuatanMata = kekuatanMata;
    }
    
    
    
}
