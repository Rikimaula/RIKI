/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab17soal2.java;

/**
 *
 * @author RIKI
 */
public class Bab17soal2Java {

    public static void main(String[] args) {
        // TODO code application logic here
        String[][] negaraDanIbukota = {
            {"Indonesia", "Jakarta"},
            {"Jepang", "Tokyo"},
            {"Iran", "Teheran"},
            {"Malaysia", "Kuala Lumpur"},
            {"Thailand", "Bangkok"}
        };

        // Mengakses dan menampilkan data dari array
        for (String[] negaraDanIbukota1 : negaraDanIbukota) {
            String negara = negaraDanIbukota1[0];
            String ibukota = negaraDanIbukota1[1];
            System.out.println("Ibukota " + negara + " adalah " + ibukota);
        }
    }
}