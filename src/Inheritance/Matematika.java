/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author USER
 */
public class Matematika {
    // Metode penjumlahan
    public void pertambahan(int a, int b) {
        System.out.println(a + " + " + b + " = " + (a + b));
    }

    // Metode pengurangan
    public void pengurangan(int a, int b) {
        System.out.println(a + " - " + b + " = " + (a - b));
    }

    // Metode perkalian
    public void perkalian(int a, int b) {
        System.out.println(a + " * " + b + " = " + (a * b));
    }

    // Metode pembagian
    public void pembagian(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Tidak bisa membagi dengan nol.");
        } else {
            System.out.println(a + " / " + b + " = " + (a / b));
        }
    }
}
