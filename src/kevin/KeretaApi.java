/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kevin;

/**
 *
 * @author ACER
 */
public class KeretaApi {
    String Jenis;
    int JmlKursi;
    int JmlGerbang;
    int kecepatan;
    int JmlAwak;
    
    void datakereta(){
        System.out.println("+++++++++++++++++++++++++++++++++++++");
        System.out.println("Jenis Kereta    : "+Jenis);
        System.out.println("Jumlah Kursi    : "+JmlKursi);
        System.out.println("Jumlah Gerbang  : "+JmlGerbang);
        System.out.println("Kecepatan Maks  : "+kecepatan+"Km/Jam");
        System.out.println("Jumlah Awak     : "+JmlAwak);
        System.out.println("+++++++++++++++++++++++++++++++++++++");
    }
}
