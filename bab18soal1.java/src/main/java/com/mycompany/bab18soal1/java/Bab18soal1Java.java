/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab18soal1.java;

/**
 *
 * @author RIKI
 */
public class Bab18soal1Java {

    public static void main(String[] args) {
        // TODO code application logic here
       try {
            // Kode yang mungkin melempar pengecualian
            int result = 10 / 0; // Ini akan menyebabkan ArithmeticException
            System.out.println("Hasil: " + result);
        } catch (ArithmeticException e) {
            // Menangkap dan menangani pengecualian
            System.out.println("Terjadi pengecualian: " + e.getMessage());
        } finally {
            // Blok ini selalu dieksekusi
            System.out.println("Blok finally dieksekusi.");
        }
        try {
            // Memanggil metode yang dapat melempar pengecualian
            checkAge(15); // Umur di bawah 18, sehingga akan melempar pengecualian
        } catch (IllegalArgumentException e) {
            // Menangkap dan menangani pengecualian
            System.out.println("Terjadi pengecualian: " + e.getMessage());
        }
    }

    // Metode yang melempar pengecualian
    public static void checkAge(int age) {
        if (age < 18) {
            // Melempar pengecualian jika umur kurang dari 18
            throw new IllegalArgumentException("Umur harus 18 tahun atau lebih.");
        }
        System.out.println("Umur Anda: " + age);
    }
}
    
