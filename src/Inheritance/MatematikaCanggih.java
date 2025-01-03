/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author USER
 */
public class MatematikaCanggih {
    public void hitungModulus(int a, int b) {
        // Memeriksa jika pembagi adalah nol
        if (b == 0) {
            System.out.println("Kesalahan: Pembagian dengan nol tidak diperbolehkan.");
            return;
        }

        // Menghitung hasil modulus
        int hasil = a % b;

        // Menampilkan hasil
        System.out.println("Hasil dari " + a + " % " + b + " = " + hasil);
    }
}