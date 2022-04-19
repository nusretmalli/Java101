package com.company;

import java.util.Scanner;

public class VucutKutle {

    public static void main(String[] args) {

        float boy, indeks;
        int kilo;

        Scanner input = new Scanner(System.in);
        System.out.println("Boyunuzu Giriniz:");
        boy = input.nextFloat();
        System.out.println("Kilonuzu Giriniz:");
        kilo = input.nextInt();

        indeks = kilo / (boy * boy);
        System.out.println("Vücut Kitle İndeksiniz: " + indeks);
    }
}
