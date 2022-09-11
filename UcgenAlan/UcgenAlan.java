package com.company;

import java.util.Scanner;

public class UcgenAlan {

    public static void main(String[] args) {
    int s1, s2, s3;

        System.out.println("Birinci Kenarı Giriniz:");
        Scanner input = new Scanner(System.in);
        s1 = input.nextInt();

        System.out.println("İkinci Kenarı Giriniz:");
        s2 = input.nextInt();

        System.out.println("Üçüncü Kenarı Giriniz:");
        s3 = input.nextInt();

        float c = (s1+s2+s3) / 2.0f;
        double alan = Math.sqrt(c*(c-s1)*(c-s2)*(c-s3));
        System.out.println("Üçgenin Alanı: "+alan);
    }
}
