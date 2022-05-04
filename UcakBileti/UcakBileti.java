package com.company;

import java.util.Scanner;

public class UcakBileti {

    public static void main(String[] args) {

        double km, ucret, total=0;
        int tip, yas;
        Scanner input = new Scanner(System.in);

        System.out.println("Kaç km gideceksiniz: ");
        km = input.nextDouble();
        if (km<=0){
            System.out.println("Hatalı Veri Girdiniz");
        }
        ucret = km * (0.10);

        System.out.println("Yaşınızı Giriniz:");
        yas = input.nextInt();
        if(yas<=0){
            System.out.println("Hatalı Veri Girdiniz");
        }

        System.out.println("*******Yolculuk Tipini Seçiniz*******\n1: Tek Yön\n2: Gidiş-Dönüş");
        tip = input.nextInt();
        if (tip != 1 && tip != 2){
            System.out.println("Hatalı Veri Girdiniz");
        }


        if(yas>0 && yas <=12){
            total=ucret - (ucret/2);
            if (tip == 2){
                total=total - (total/5);
                total = total * 2;
            }
        }
        else if(yas>12 && yas <=24){
            total=ucret - (ucret/10);
            if (tip == 2){
                total=total - (total/5);
                total = total * 2;
            }
        }
        else if(yas>=65){
            total=ucret - ((ucret*3)/10);
            if (tip == 2){
                total=total - (total/5);
                total = total * 2;
            }
        }
        else{
            total=ucret;
            if (tip == 2){
                total=total - (total/5);
                total = total * 2;
            }
        }
        System.out.println("Toplam Tutar: "+ total);

    }

}
