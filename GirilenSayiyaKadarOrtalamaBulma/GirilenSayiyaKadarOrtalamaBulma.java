package com.company;

import java.util.Scanner;

public class GirilenSayiyaKadarOrtalamaBulma {

    public static void main(String[] args) {

        int sayi, ekle = 0, bol=0;
        double sonuc;

        Scanner input = new Scanner(System.in);
        System.out.print("Sayiyi Giriniz: ");
        sayi = input.nextInt();

        for (int i = 1; i <= sayi; i++)
        {
            if (i %3 == 0 && i % 4 == 0)
            {
                ekle = ekle + i ;
                bol++;
            }
        }
        sonuc = ekle / bol;
        System.out.println("Ortalama " + sonuc);
    }
}