/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matematika;

/**
 *
 * @author USER
 */
public class Matematika {
    int hasil;

    // Metode untuk menjumlahkan dua angka
    void tambahAngka(int a, int b) {
        hasil = a + b;
        System.out.println("Penjumlahan: " + a + " + " + b + " = " + hasil);
    }

    // Metode untuk mengurangi dua angka
    void kurangAngka(int a, int b) {
        hasil = a - b;
        System.out.println("Pengurangan: " + a + " - " + b + " = " + hasil);
    }

    // Metode untuk mengalikan dua angka
    void kaliAngka(int a, int b) {
        hasil = a * b;
        System.out.println("Perkalian: " + a + " x " + b + " = " + hasil);
    }

    // Metode untuk membagi dua angka
    void bagiAngka(int a, int b) {
        if (b != 0) {
            hasil = a / b;
            System.out.println("Pembagian: " + a + " / " + b + " = " + hasil);
        } else {
            System.out.println("Error: Pembagian dengan 0 tidak diperbolehkan.");
        }
    }
}

