/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author USER
 */
public class MatematikaCanggihBanget {
   public static void main(String[] args) {
        // Membuat objek dari kelas MatematikaCanggih
        MatematikaCanggih kalkulator = new MatematikaCanggih();

        // Menguji beberapa kasus modulus
        kalkulator.hitungModulus(10, 3);  
        kalkulator.hitungModulus(25, 5); 
        kalkulator.hitungModulus(15, 4);  
        kalkulator.hitungModulus(7, 0);   
    }
}