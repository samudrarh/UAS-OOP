/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author USER
 */
public class MatematikaCanggihBangetBeraksi {
    // Metode untuk melakukan pertambahan dua angka
    public void Pertambahan(int a, int b) {
        int hasil = a + b;
        System.out.println("Hasil dari " + a + " + " + b + " = " + hasil);
    }

    // Metode untuk melakukan perkalian dua angka
    public void Perkalian(int a, int b) {
        int hasil = a * b;
        System.out.println("Hasil dari " + a + " * " + b + " = " + hasil);
    }

    // Metode untuk melakukan modulus dua angka
    public void Modulus(int a, int b) {
        // Pengecekan jika pembagi adalah nol
        if (b == 0) {
            System.out.println("Kesalahan: Pembagian dengan nol tidak diperbolehkan.");
            return;
        }
        int hasil = a % b;
        System.out.println("Hasil dari " + a + " % " + b + " = " + hasil);
    }

    // Metode untuk melakukan pertambahan tiga angka
    public void PertambahanTiga(int a, int b, int c) {
        int hasil = a + b + c;
        System.out.println("Hasil dari " + a + " + " + b + " + " + c + " = " + hasil);
    }
}

