package com.company;

import java.util.Scanner;

public class BurcBulan {

    public static void main(String[] args) {

        int ay, gun;

        Scanner input = new Scanner(System.in);

        System.out.println("Doğduğunuz Ayı Giriniz:");
        ay = input.nextInt();
        System.out.println("Doğduğunuz Günü Giriniz:");
        gun = input.nextInt();

        if((ay>12 || ay <=0) || (gun > 31 || gun <= 0) )
        {
            System.out.println("Hatali Sayi Girdiniz:");
        }

        else if (((ay==3) && gun >= 21) || ((ay == 4)&&(gun<=20)))
        {
            System.out.println("Koç Burcusunuz.");
        }
        else if(((ay==4) && gun >= 21) || ((ay == 5)&&(gun<=21)))
        {
            System.out.println("Boğa Burcusunuz.");
        }
        else if(((ay==5) && gun >= 22) || ((ay == 6)&&(gun<=22)))
        {
            System.out.println("İkizler Burcusunuz.");
        }
        else if(((ay==6) && gun >= 23) || ((ay == 7)&&(gun<=22)))
        {
            System.out.println("Yengeç Burcusunuz.");
        }
        else if(((ay==7) && gun >= 23) || ((ay == 8)&&(gun<=22)))
        {
            System.out.println("Aslan Burcusunuz.");
        }
        else if(((ay==8) && gun >= 23) || ((ay == 9)&&(gun<=22)))
        {
            System.out.println("Başak Burcusunuz.");
        }
        else if(((ay==9) && gun >= 23) || ((ay == 10)&&(gun<=22)))
        {
            System.out.println("Terazi Burcusunuz.");
        }
        else if(((ay==10) && gun >= 23) || ((ay == 11)&&(gun<=21)))
        {
            System.out.println("Akrep Burcusunuz.");
        }
        else if(((ay==11) && gun >= 22) || ((ay == 12)&&(gun<=21)))
        {
            System.out.println("Yay Burcusunuz.");
        }
        else if(((ay==12) && gun >= 22) || ((ay == 1)&&(gun<=21)))
        {
            System.out.println("Oğlak Burcusunuz.");
        }
        else if(((ay==1) && gun >= 22) || ((ay == 2)&&(gun<=19)))
        {
            System.out.println("Kova Burcusunuz.");
        }
        else if(((ay==2) && gun >= 20) || ((ay == 3)&&(gun<=20)))
        {
            System.out.println("Balık Burcusunuz.");
        }


    }
}
