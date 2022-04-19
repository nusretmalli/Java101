package com.company;
import java.util.Scanner;

public class Taksimetre {

    public static void main(String[] args) {

        int km, basla = 10;
        double hesap, kmbasina = 2.20;

        Scanner input = new Scanner(System.in);
        System.out.println("Kaç Km Gideceksiniz:");
        km = input.nextInt();

        hesap = basla + (km*kmbasina);

        hesap = (hesap > 20) ? (hesap) : (20);

        System.out.println("Ücretiniz: " + hesap);
    }
}
