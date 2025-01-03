/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polymorphism;

/**
 *
 * @author USER
 */
public class MatematikaCanggih extends Matematika {

    // Modulus
    void modulus(int a, int b) {
        if (b != 0) {
            int hasil = a % b;
            System.out.println("Hasil dari " + a + " % " + b + " = " + hasil);
        } else {
            System.out.println("Error: Modulus dengan 0 tidak diperbolehkan.");
        }
    }

    void modulus(double a, double b) {
        if (b != 0) {
            double hasil = a % b;
            System.out.println("Hasil dari " + a + " % " + b + " = " + hasil);
        } else {
            System.out.println("Error: Modulus dengan 0 tidak diperbolehkan.");
        }
    }

    void modulus(int a, int b, int c) {
        if (b != 0 && c != 0) {
            int hasil = a % b % c;
            System.out.println("Hasil dari " + a + " % " + b + " % " + c + " = " + hasil);
        } else {
            System.out.println("Error: Modulus dengan 0 tidak diperbolehkan.");
        }
    }

    void modulus(double a, double b, double c) {
        if (b != 0 && c != 0) {
            double hasil = a % b % c;
            System.out.println("Hasil dari " + a + " % " + b + " % " + c + " = " + hasil);
        } else {
            System.out.println("Error: Modulus dengan 0 tidak diperbolehkan.");
        }
    }
}
   

