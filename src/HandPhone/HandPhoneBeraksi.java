/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HandPhone;

/**
 *
 * @author USER
 */
public class HandPhoneBeraksi {
    
      public static void main(String[] args) {
        // Membuat objek HandPhone
        HandPhone handphone = new HandPhone();

        // Menyalakan perangkat
        handphone.hidupkan();

        // Melakukan panggilan suara
        handphone.lakukanPanggilanSuara();

        // Mengirim pesan teks
        handphone.kirimPesanTeks();

        // Mematikan perangkat
        handphone.matikanPerangkat();
    }
}

