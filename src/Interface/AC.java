/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

/**
 *
 * @author USER
 */
public class AC {
    // Status untuk AC: 0 = Mati, 1 = Hidup, 2 = Dingin, 3 = Panas
    private int statusAC;
    
    // Konstanta untuk status AC
    public static final int KEADAAN_MATI = 0;
    public static final int KEADAAN_HIDUP = 1;
    public static final int KEADAAN_DINGIN = 2;
    public static final int KEADAAN_PANAS = 3;

    // Konstruktor untuk inisialisasi status AC (dimulai dalam keadaan mati)
    public AC() {
        this.statusAC = KEADAAN_MATI;
    }

    // Implementasi metode hidupkan AC
    public void hidupkanAC() {
        if (statusAC == KEADAAN_MATI) {
            statusAC = KEADAAN_HIDUP;
            System.out.println("Hidupkan AC! --> AC dihidupkan");
        } else {
            System.out.println("Hidupkan AC! --> AC sudah dalam keadaan hidup");
        }
    }

    // Implementasi metode matikan AC
    public void matikanAC() {
        if (statusAC == KEADAAN_HIDUP || statusAC == KEADAAN_DINGIN || statusAC == KEADAAN_PANAS) {
            statusAC = KEADAAN_MATI;
            System.out.println("Matikan AC! --> AC dimatikan");
        } else {
            System.out.println("Matikan AC! --> AC sudah dalam keadaan mati");
        }
    }

    // Implementasi metode dinginkan AC
    public void dinginkanAC() {
        if (statusAC == KEADAAN_HIDUP || statusAC == KEADAAN_PANAS) {
            statusAC = KEADAAN_DINGIN;
            System.out.println("Dinginkan AC! --> AC didinginkan");
        } else {
            System.out.println("Dinginkan AC! --> AC sudah dalam keadaan dingin");
        }
    }

    // Implementasi metode panaskan AC
    public void panaskanAC() {
        if (statusAC == KEADAAN_HIDUP || statusAC == KEADAAN_DINGIN) {
            statusAC = KEADAAN_PANAS;
            System.out.println("Panaskan AC! --> AC dipanaskan");
        } else {
            System.out.println("Panaskan AC! --> AC sudah dalam keadaan panas");
        }
    }
}

