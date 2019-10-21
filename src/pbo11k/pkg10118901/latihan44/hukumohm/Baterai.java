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
public class Baterai {
    private float hambatan,kuatArus;
    
    public Baterai(){
        this.hambatan =12;
        this.kuatArus =3;
        System.out.println("Kuat arus yang mengalir pada suatu kawat Penghantar\nakan berbanding lurus dengan beda potensial\npada ujung-ujung kawat penghantar tersebut\nasalkan suhu kawat dijaga konstan.\n");
    }
    public Baterai(float kuatArus, float hambatan){
        System.out.println("Kuat Arus\t: " + kuatArus + " ampere");
        System.out.println("Hambatan\t: " + hambatan + " ohm");
    }

    public float getHambatan() {
        return hambatan;
    }

    public float getKuatArus() {
        return kuatArus;
    }
    
    public float hitungTegangan(){
        return kuatArus * hambatan;
    }
    
}
