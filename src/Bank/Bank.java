/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bank;

/**
 *
 * @author SAMUDRA
 */
public class Bank {
    private int saldo;

    // Konstruktor untuk inisialisasi saldo
    public Bank(int saldoAwal) {
        saldo = saldoAwal;
    }

    // Method untuk menampilkan saldo
    public void getSaldo() {
        System.out.printf("Saldo Anda saat ini: Rp %,d%n", saldo);
    }

    // Method untuk menyimpan uang
    public void simpanUang(int jumlah) {
        if (jumlah > 0) {
            saldo += jumlah;
            System.out.printf("Berhasil menambahkan Rp %,d. Saldo terbaru: Rp %,d%n", jumlah, saldo);
        } else {
            System.out.println("Jumlah yang disimpan harus lebih besar dari nol.");
        }
    }

    // Method untuk menarik uang
    public void ambilUang(int jumlah) {
        if (jumlah > 0 && jumlah <= saldo) {
            saldo -= jumlah;
            System.out.printf("Berhasil menarik Rp %,d. Saldo Anda sekarang: Rp %,d%n", jumlah, saldo);
        } else if (jumlah > saldo) {
            System.out.printf("Saldo Anda tidak cukup untuk menarik Rp %,d%n", jumlah);
        } else {
            System.out.println("Jumlah yang ditarik harus lebih besar dari nol.");
        }
    }
}

