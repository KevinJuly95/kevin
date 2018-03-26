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
public class keretaaksi {
    public static void main(String[] args) {
        KeretaApi Listrik = new KeretaApi();
        KeretaApi Lokomotif = new KeretaApi();
        KeretaApi Levitasi = new KeretaApi();
        
        Listrik.Jenis = "KRL Hitachi";
        Listrik.JmlKursi = 80;
        Listrik.JmlGerbang = 8;
        Listrik.kecepatan = 120;
        Listrik.JmlAwak = 28;
        
        Lokomotif.Jenis = "Lokomotif CC300";
        Lokomotif.JmlKursi = 60;
        Lokomotif.JmlGerbang = 8;
        Lokomotif.kecepatan = 120;
        Lokomotif.JmlAwak = 28;
        
        Levitasi.Jenis = "Maglev";
        Levitasi.JmlKursi = 90;
        Levitasi.JmlGerbang = 10;
        Levitasi.kecepatan = 6000;
        Levitasi.JmlAwak = 30;
        
        Listrik.datakereta();
        Lokomotif.datakereta();
        Levitasi.datakereta();
    }
}
