/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matematika;

/**
 *
 * @author USER
 */
public class MatematikaBeraksi {
     public static void main(String[] args) {
        // Membuat objek Matematika
        Matematika mtk = new Matematika();

        // Menjalankan operasi matematika dengan nilai yang berbeda
        mtk.tambahAngka(65, 15);
        mtk.kurangAngka(75, 45);
        mtk.kaliAngka(9, 7);
        mtk.bagiAngka(49, 7);

        // Menguji pembagian dengan angka 0
        mtk.bagiAngka(10, 0);
    }
}

