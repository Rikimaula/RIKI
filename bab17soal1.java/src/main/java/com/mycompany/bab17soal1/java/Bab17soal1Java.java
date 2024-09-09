package com.mycompany.bab17soal1.java;

import java.util.Scanner; // Menambahkan impor untuk Scanner

public class Bab17soal1Java {

    public static void main(String[] args) {
        String[] kota;
        // Minta pengguna memasukkan jumlah kota
        try ( // Membuat instance Scanner untuk input dari keyboard
                Scanner scanner = new Scanner(System.in)) {
            // Minta pengguna memasukkan jumlah kota
            System.out.print("Masukan Jumlah Kota : ");
            int jumlahKota = scanner.nextInt();  // Membaca jumlah kota yang dimasukkan
            scanner.nextLine();  // Membersihkan newline setelah membaca integer
            // Membuat array untuk menyimpan nama kota
            kota = new String[jumlahKota];
            // Membaca nama kota dari pengguna
            for (int i = 0; i < jumlahKota; i++) {
                System.out.print("Kota ke " + (i + 1) + " : ");
                kota[i] = scanner.nextLine();
            }
            // Menutup scanner
        }

        // Menampilkan nama kota yang telah dimasukkan
        System.out.println("Kota-kota yang dimasukan:");
        for (String k : kota) {
            System.out.println(k);
        }
    }
}
