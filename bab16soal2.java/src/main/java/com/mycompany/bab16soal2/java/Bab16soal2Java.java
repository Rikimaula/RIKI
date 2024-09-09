package com.mycompany.bab16soal2.java;

public class Bab16soal2Java {
    public static void main(String[] args) {
        double a = 9.5;
        double b = 2.5;

        // Membuat array dari tipe OperasiAritmatika
        OperasiAritmatika[] operasi = new OperasiAritmatika[]{
            new Penjumlahan(a, b),
            new Pengurangan(a, b),
            new Perkalian(a, b),
            new Pembagian(a, b)
        };

        // Menggunakan polimorfisme untuk memanggil metode hitung()
        for (OperasiAritmatika op : operasi) {
            try {
                System.out.println("Hasil: " + op.hitung());
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

