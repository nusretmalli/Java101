package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int mat, fizik, kimya, turkce, tarih, muzik;
        Scanner girdi = new Scanner(System.in);

        System.out.println("Matematik Notunuzu Giriniz:");
        mat = girdi.nextInt();
        System.out.println("Fizik Notunuzu Giriniz:");
        fizik= girdi.nextInt();
        System.out.println("Kimya Notunuzu Giriniz:");
        kimya= girdi.nextInt();
        System.out.println("Türkçe Notunuzu Giriniz:");
        turkce= girdi.nextInt();
        System.out.println("Tarih Notunuzu Giriniz:");
        tarih = girdi.nextInt();
        System.out.println("Müzik Notunuzu Giriniz:");
        muzik = girdi.nextInt();

        int toplam = (mat+fizik+kimya+turkce+tarih+muzik);
        double hesap= toplam / 6;

        String c = (hesap > 60) ? ("Sınıfı Geçtiniz Ortalamanız: "+ hesap) : ("Sınıfı Geçemediniz Ortalamanız: "+ hesap);
        System.out.println(c);


    }
}
