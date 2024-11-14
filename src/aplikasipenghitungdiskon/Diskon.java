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
    private double diskonpersen;
    private String kodekupon;
    private double harga;

    Diskon(double harga, int diskonpersen, String kodeKupon) {
        this.diskonpersen = diskonpersen;
        this.kodekupon = kodekupon;
        this.harga = harga;
    }
    
    private double getDiskonPresentase() {
        if (diskonpersen == 5) {
            return 5; 
        } else if ( diskonpersen == 10) {
            return 10; 
        }else if ( diskonpersen == 15) {
            return 15; 
        }else if ( diskonpersen == 20) {
            return 20; 
        }else if ( diskonpersen == 25) {
            return 25; 
        }else if ( diskonpersen== 30) {
            return 30; 
        }else if ( diskonpersen == 35) {
            return 35; 
        }else if ( diskonpersen == 40) {
            return 40; 
        }else if ( diskonpersen == 45) {
            return 45; 
        }else if ( diskonpersen == 50) {
            return 50; 
        }else if ( diskonpersen == 55) {
            return 55; 
        }else if ( diskonpersen == 60) {
            return 60; 
        }else if ( diskonpersen == 65) {
            return 65; 
        }else if ( diskonpersen == 70) {
            return 70; 
        }else if ( diskonpersen == 75) {
            return 75; 
        }else if ( diskonpersen == 80) {
            return 80; 
        }else if ( diskonpersen == 85) {
            return 85; 
        }else if ( diskonpersen == 90) {
            return 90; 
        }else if ( diskonpersen == 95) {
            return 95; 
        }else if ( diskonpersen == 100) {
            return 100; 
        }
        return 0;
    }

    // Mendapatkan diskon berdasarkan metode pembayaran
    private double getDiskonKupon() {
       switch (kodekupon.toLowerCase()) {
            case "001":
                return 10;
            case "002":
                return 5;
            default:
                return 0;
        } 
        
    }

    // Menghitung total diskon (diskon input + diskon metode)
    public double hitungTotalDiskon() {
        double totalDiskon = getDiskonPresentase() + getDiskonKupon();
        return harga * totalDiskon / 100;
    }

    // Menghitung harga setelah diskon
    public double hitungHargaSetelahDiskon() {
        return harga - hitungTotalDiskon();
    }
}

