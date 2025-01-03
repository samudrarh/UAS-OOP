/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

/**
 *
 * @author USER
 */
public class ACBeraksi {
    public static void main(String[] args) {
        AC acRuangan = new AC();
        
        // Simulasi status awal AC
        System.out.println("Status AC saat ini: Mati");

        // Menghidupkan dan mematikan AC
        acRuangan.hidupkanAC();
        acRuangan.matikanAC();
        acRuangan.matikanAC();
        acRuangan.hidupkanAC();
        acRuangan.hidupkanAC();

        // Mengatur suhu AC (dinginkan dan panaskan)
        acRuangan.dinginkanAC();
        acRuangan.panaskanAC();
        acRuangan.panaskanAC();
        acRuangan.dinginkanAC();
        acRuangan.dinginkanAC();
    }
}
