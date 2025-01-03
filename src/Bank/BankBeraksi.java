/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bank;

/**
 *
 * @author USER
 */
public class BankBeraksi {
    public static void main(String[] args) {
        // Membuat objek Bank dengan saldo awal
        Bank bk = new Bank(10000000);

        // Menampilkan saldo awal
        bk.getSaldo();

        // Menambahkan saldo
        bk.simpanUang(6300000);

        // Mencoba menarik saldo lebih dari yang tersedia
        bk.ambilUang(3300000);
    }
}

