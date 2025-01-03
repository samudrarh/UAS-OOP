/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mobil;

/**
 *
 * @author USER
 */
public class Mobil {
    // Variabel untuk menyimpan warna dan tahun produksi mobil
    String warnaMobil;
    int tahunPembuatan;

    // Konstruktor untuk menginisialisasi objek Mobil
    public Mobil(String warna, int tahun) {
        this.warnaMobil = warna;
        this.tahunPembuatan = tahun;
    }

    // Metode untuk menampilkan informasi tentang mobil
    void mobil() {
        System.out.println("Warna mobil saya adalah: " + warnaMobil);
        System.out.println("Mobil saya diproduksi pada tahun: " + tahunPembuatan);
    }
}
