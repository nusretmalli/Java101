package com.company;

import java.util.Scanner;

public class HesapMakinesi {

    public static void main(String[] args) {

        int n1,n2,select;

        Scanner input = new Scanner(System.in);
        System.out.println("İlk Sayıyı Giriniz:");
        n1 = input.nextInt();
        System.out.println("İkinci Sayıyı Giriniz:");
        n2 = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        select = input.nextInt();

        switch(select) {
            case 1:
                System.out.println("Toplam: " + n1+n2);
                break;
            case 2:
                System.out.println("Fark: " + (n1-n2));
                break;
            case 3:
                System.out.println("Çarpımları: " + (n1*n2));
                break;
            case 4:
                if(n2!=0){
                    System.out.println("Bölümleri: " + (n1/n2));
                    break;}
                else{
                System.out.println("Bir Sayı 0'a bölünemez");
                    break;}
            default:
                System.out.println("Hatalı İşlem Girdiniz.");
        }

    }
}
