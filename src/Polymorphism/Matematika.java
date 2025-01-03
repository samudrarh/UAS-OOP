/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polymorphism;

/**
 *
 * @author USER
 */
public class Matematika {
     // Tambah
    void pertambahan(int a, int b) {
        int hasil = a + b;
        System.out.println("Hasil dari " + a + " + " + b + " = " + hasil);
    }

    void pertambahan(double a, double b) {
        double hasil = a + b;
        System.out.println("Hasil dari " + a + " + " + b + " = " + hasil);
    }

    void pertambahan(int a, int b, int c) {
        int hasil = a + b + c;
        System.out.println("Hasil dari " + a + " + " + b + " + " + c + " = " + hasil);
    }

    void pertambahan(double a, double b, double c) {
        double hasil = a + b + c;
        System.out.println("Hasil dari " + a + " + " + b + " + " + c + " = " + hasil);
    }

    // Kurang
    void pengurangan(int a, int b) {
        int hasil = a - b;
        System.out.println("Hasil dari " + a + " - " + b + " = " + hasil);
    }

    void pengurangan(double a, double b) {
        double hasil = a - b;
        System.out.println("Hasil dari " + a + " - " + b + " = " + hasil);
    }

    void pengurangan(int a, int b, int c) {
        int hasil = a - b - c;
        System.out.println("Hasil dari " + a + " - " + b + " - " + c + " = " + hasil);
    }

    void pengurangan(double a, double b, double c) {
        double hasil = a - b - c;
        System.out.println("Hasil dari " + a + " - " + b + " - " + c + " = " + hasil);
    }

    // Kali
    void perkalian(int a, int b) {
        int hasil = a * b;
        System.out.println("Hasil dari " + a + " * " + b + " = " + hasil);
    }

    void perkalian(double a, double b) {
        double hasil = a * b;
        System.out.println("Hasil dari " + a + " * " + b + " = " + hasil);
    }

    void perkalian(int a, int b, int c) {
        int hasil = a * b * c;
        System.out.println("Hasil dari " + a + " * " + b + " * " + c + " = " + hasil);
    }

    void perkalian(double a, double b, double c) {
        double hasil = a * b * c;
        System.out.println("Hasil dari " + a + " * " + b + " * " + c + " = " + hasil);
    }

    // Bagi
    void pembagian(int a, int b) {
        if (b != 0) {
            int hasil = a / b;
            System.out.println("Hasil dari " + a + " / " + b + " = " + hasil);
        } else {
            System.out.println("Error: Pembagian dengan 0 tidak diperbolehkan.");
        }
    }

    void pembagian(double a, double b) {
        if (b != 0) {
            double hasil = a / b;
            System.out.println("Hasil dari " + a + " / " + b + " = " + hasil);
        } else {
            System.out.println("Error: Pembagian dengan 0 tidak diperbolehkan.");
        }
    }

    void pembagian(int a, int b, int c) {
        if (b != 0 && c != 0) {
            int hasil = a / b / c;
            System.out.println("Hasil dari " + a + " / " + b + " / " + c + " = " + hasil);
        } else {
            System.out.println("Error: Pembagian dengan 0 tidak diperbolehkan.");
        }
    }

    void pembagian(double a, double b, double c) {
        if (b != 0 && c != 0) {
            double hasil = a / b / c;
            System.out.println("Hasil dari " + a + " / " + b + " / " + c + " = " + hasil);
        } else {
            System.out.println("Error: Pembagian dengan 0 tidak diperbolehkan.");
        }
    }
}
