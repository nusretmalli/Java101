package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TekSayilarinToplami {

    public static void main(String[] args) {

        int i, sum = 0;
        Scanner input = new Scanner(System.in);
        do {
        System.out.println("Bir Sayi Giriniz: ");
        i = input.nextInt();
        if(i % 2 == 1){
            System.out.println("Girdiğiniz Sayi Tek");
            break;
        }
        else if(i % 4 == 0) {
           while (i > 0) {
               if (i % 4 == 0) {
                   sum += i;
                   i -= 4;
               }
           }
            System.out.println("Sonuç: " + sum );
            sum = 0;
        }
       else {
           System.out.println("Girdiğiniz Sayi 4'e Tam Bölünmez");
       }
        }
        while (i %2 ==0 );
    }
}
