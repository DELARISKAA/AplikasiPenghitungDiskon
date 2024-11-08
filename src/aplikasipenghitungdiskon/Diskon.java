/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasipenghitungdiskon;

/**
 *
 * @author user
 */
public class Diskon {
    private double harga;  // Diskon yang diinput secara manual
    private String metodePembayaran;

    public Diskon(double harga, String metodePembayaran) {
        this.harga = harga;
        this.metodePembayaran = metodePembayaran;
    }
    
    private double getDiskonBerdasarkanHarga() {
        if (harga > 1000000) {
            return 15; // Diskon 15% jika harga lebih dari 1 juta
        } else if (harga > 500000) {
            return 10; // Diskon 10% jika harga lebih dari 500 ribu
        }
        return 0; // Tidak ada diskon jika harga kurang dari atau sama dengan 500 ribu
    }

    // Mendapatkan diskon berdasarkan metode pembayaran
    private double getDiskonMetode() {
        switch (metodePembayaran.toLowerCase()) {
            case "cash":
                return 10;
            case "debit":
                return 5;
            default:
                return 0;
        }
    }

    // Menghitung total diskon (diskon input + diskon metode)
    public double hitungTotalDiskon() {
        double totalDiskonPersen = getDiskonBerdasarkanHarga() + getDiskonMetode();
        return harga * totalDiskonPersen / 100;
    }

    // Menghitung harga setelah diskon
    public double hitungHargaSetelahDiskon() {
        return harga - hitungTotalDiskon();
    }
}

