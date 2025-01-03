/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mahasiswa;

/**
 *
 * @author USER
 */
public class MahasiswaBeraksi {
    public static void main(String[] args) {
        // Membuat objek Mahasiswa
        Mahasiswa ms = new Mahasiswa();

        // Memberikan nilai pada variabel di objek Mahasiswa
        ms.membaca = "Sedang membaca tugas yang diberikan oleh Dosen";
        ms.nyontek = "Sedang melakukan pencontekan kepada teman sebelah";
        ms.modifikasi = "Sedang memodifikasi jawaban dari tugas yang diberikan";

        // Memanggil metode untuk menampilkan informasi
        ms.membaca();
        ms.nyontek();
        ms.modifikasi();
    }
}

