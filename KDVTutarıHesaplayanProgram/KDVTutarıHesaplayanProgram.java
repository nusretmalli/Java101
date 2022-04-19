package com.company;
import  java.util.Scanner;

public class KDVTutarıHesaplayanProgram {

    public static void main(String[] args) {
        double girdi, kdvOranı = 0.18, kdvOranı1 = 0.08, sonuc, sonuc1, kdvhesap1, kdvhesap;

        System.out.println("Tutarınızı Giriniz: ");
        Scanner input = new Scanner(System.in);

        girdi = input.nextDouble();

        kdvhesap1 = girdi*kdvOranı1;
        sonuc1 = girdi + kdvhesap1;

        kdvhesap = girdi*kdvOranı;
        sonuc = girdi + kdvhesap;


        String c = (girdi > 1000) ? ("KDV'li fiyatı: " + sonuc1 + "\n"+ "KDV fiyatı: "+ kdvhesap1) : ("KDV'li fiyatı: " + sonuc + "\n"+ "KDV fiyatı: "+ kdvhesap);
        System.out.println(c);
    }
}



