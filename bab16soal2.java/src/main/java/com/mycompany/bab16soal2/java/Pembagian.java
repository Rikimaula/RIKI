/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.bab16soal2.java;

public class Pembagian extends OperasiAritmatika {
    public Pembagian(double a, double b) {
        super(a, b);
    }

    @Override
    protected double hitung() {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Pembagi tidak boleh nol");
        }
    }
}
