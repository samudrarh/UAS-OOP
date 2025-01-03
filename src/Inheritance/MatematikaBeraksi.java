/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author USER
 */
public class MatematikaBeraksi {
    
    public static void main(String[] args) {
        // Membuat objek dari kelas Matematika
        Matematika matematika = new Matematika();

        // Menjalankan berbagai operasi matematika
        matematika.pertambahan(125, 25);   // 125 + 25 = 150
        matematika.pengurangan(100, 50);    // 100 - 50 = 50
        matematika.perkalian(10, 25);      // 10 * 25 = 250
        matematika.pembagian(60, 5);      // 60 / 5 = 12

        // Uji pembagian dengan nol
        matematika.pembagian(100, 0);      // Error: Tidak bisa membagi dengan nol.
        
    }
}