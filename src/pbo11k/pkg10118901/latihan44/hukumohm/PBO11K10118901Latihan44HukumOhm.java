/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118901.latihan44.hukumohm;
/**
 *
 * @author
 * NAMA         : Dedi Cahya
 * NIM          : 10118901
 * Kelas        : PBO11K
 * Deskripsi Program : Menghitung tegangan dengan konsep orientasi objek
 */
public class PBO11K10118901Latihan44HukumOhm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("====== Hukum Ohm ======");
        Baterai btr = new Baterai();
        Baterai b = new Baterai(btr.getKuatArus(),btr.getHambatan());
        System.out.println("Hasil Tegangan\t: " + btr.hitungTegangan() + " volt");
    }
    
}
